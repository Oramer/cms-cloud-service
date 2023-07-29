package com.cms.base_service.common.oss;

import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.CompleteMultipartUploadRequest;
import com.aliyun.oss.model.CompleteMultipartUploadResult;
import com.aliyun.oss.model.InitiateMultipartUploadRequest;
import com.aliyun.oss.model.InitiateMultipartUploadResult;
import com.aliyun.oss.model.PartETag;
import com.aliyun.oss.model.UploadPartRequest;
import com.aliyun.oss.model.UploadPartResult;
import com.cms.base_service.common.model.RestResult;
import com.cms.base_service.common.oss.MulFileToFileUtil;
import com.cms.base_service.common.oss.OssConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Component
public class OssUtils
{
  public OSSClient getOSSClientInstance() {
/*  31 */     if (ossClient == null) {
/*  32 */       ossClient = new OSSClient(this.ossConfig.getEndpoint(), this.ossConfig.getAssectkey(), this.ossConfig.getAssectsecret());
    }
/*  34 */     return ossClient;
  }


  @Autowired
  public OssConfig ossConfig;

  private static OSSClient ossClient;

  public RestResult deleteFile(String filePath) {
/*  44 */     OSSClient ossClient = getOSSClientInstance();
    try {
/*  46 */       String key = filePath.substring(filePath.lastIndexOf(".com") + 5);
/*  47 */       boolean exist = ossClient.doesObjectExist(this.ossConfig.getBucketname(), key);
/*  48 */       if (!exist) {
/*  49 */         return RestResult.fail().setMsg("文件不存在，已删除该信息！");
      }

/*  52 */       ossClient.deleteObject(this.ossConfig.getBucketname(), key);

/*  54 */       return RestResult.ok();

    }
/*  57 */     catch (Exception e) {
/*  58 */       return RestResult.fail().setMsg("删除失败！");
    }
  }









  public RestResult uploadFile(@RequestParam MultipartFile file, String type) throws IOException {
/*  71 */     if (file != null && file.getSize() > 314572800L) {
/*  72 */       return RestResult.fail().setMsg("附件size最大为300M！");
    }
/*  74 */     if (file.getSize() > 20971520L) {
/*  75 */       return RestResult.ok().setData(uploadFile2(MulFileToFileUtil.multipartFileToFile(file), type));
    }

/*  78 */     OSSClient ossClient = getOSSClientInstance();

/*  80 */     String key = file.getOriginalFilename();
/*  81 */     if (StringUtils.isNotBlank(type)) {
/*  82 */       key = type + "/" + key;
    }
/*  84 */     String filePath = "https://" + this.ossConfig.getBucketname() + "." + this.ossConfig.getEndpoint() + "/" + key;
    try {
/*  86 */       ossClient.putObject(this.ossConfig.getBucketname(), key, file.getInputStream());
/*  87 */       return RestResult.ok().setData(filePath);
/*  88 */     } catch (Exception e) {
/*  89 */       return RestResult.fail().setMsg(e.getMessage());
    }
  }









  public String uploadFile2(File file, String type) throws IOException {
/* 102 */     String objectName = file.getName();
/* 103 */     if (StringUtils.isNotBlank(type)) {
/* 104 */       objectName = type + "/" + objectName;
    }


/* 108 */     OSSClient ossClient = new OSSClient(this.ossConfig.getEndpoint(), this.ossConfig.getAssectkey(), this.ossConfig.getAssectsecret());


/* 111 */     InitiateMultipartUploadRequest request = new InitiateMultipartUploadRequest(this.ossConfig.getBucketname(), objectName);







/* 119 */     InitiateMultipartUploadResult upresult = ossClient.initiateMultipartUpload(request);

/* 121 */     String uploadId = upresult.getUploadId();


/* 124 */     List<PartETag> partETags = new ArrayList<>();

/* 126 */     long partSize = 5242880L;
/* 127 */     long fileLength = file.length();
/* 128 */     int partCount = (int)(fileLength / 5242880L);
/* 129 */     if (fileLength % 5242880L != 0L) {
/* 130 */       partCount++;
    }

/* 133 */     for (int i = 0; i < partCount; i++) {
/* 134 */       long startPos = i * 5242880L;
/* 135 */       long curPartSize = (i + 1 == partCount) ? (fileLength - startPos) : 5242880L;
/* 136 */       InputStream instream = new FileInputStream(file);

/* 138 */       instream.skip(startPos);
/* 139 */       UploadPartRequest uploadPartRequest = new UploadPartRequest();
/* 140 */       uploadPartRequest.setBucketName(this.ossConfig.getBucketname());
/* 141 */       uploadPartRequest.setKey(objectName);
/* 142 */       uploadPartRequest.setUploadId(uploadId);
/* 143 */       uploadPartRequest.setInputStream(instream);

/* 145 */       uploadPartRequest.setPartSize(curPartSize);

/* 147 */       uploadPartRequest.setPartNumber(i + 1);

/* 149 */       UploadPartResult uploadPartResult = ossClient.uploadPart(uploadPartRequest);

/* 151 */       partETags.add(uploadPartResult.getPartETag());
    }





/* 158 */     CompleteMultipartUploadRequest completeMultipartUploadRequest = new CompleteMultipartUploadRequest(this.ossConfig.getBucketname(), objectName, uploadId, partETags);





/* 164 */     CompleteMultipartUploadResult completeMultipartUploadResult = ossClient.completeMultipartUpload(completeMultipartUploadRequest);


/* 167 */     ossClient.shutdown();
/* 168 */     String location = completeMultipartUploadResult.getLocation();
/* 169 */     return location;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\oss\OssUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */