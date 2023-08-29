package com.cms.base_service.common.utils.file;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ArrayUtils;
import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.framework.config.CmsConfig;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;


public class FileUtils
{
/*  29 */   public static String FILENAME_PATTERN = "[a-zA-Z0-9_\\-\\|\\.\\u4e00-\\u9fa5]+";







  
  public static void writeBytes(String filePath, OutputStream os) throws IOException {
/*  39 */     FileInputStream fis = null;
    try {
/*  41 */       File file = new File(filePath);
/*  42 */       if (!file.exists()) {
/*  43 */         throw new FileNotFoundException(filePath);
      }
/*  45 */       fis = new FileInputStream(file);
/*  46 */       byte[] b = new byte[1024];
      int length;
/*  48 */       while ((length = fis.read(b)) > 0) {
/*  49 */         os.write(b, 0, length);
      }
/*  51 */     } catch (IOException e) {
/*  52 */       throw e;
    } finally {
/*  54 */       IOUtils.close(os);
/*  55 */       IOUtils.close(fis);
    } 
  }







  
  public static String writeImportBytes(byte[] data) throws IOException {
/*  67 */     return writeBytes(data, CmsConfig.getImportPath());
  }








  
  public static String writeBytes(byte[] data, String uploadDir) throws IOException {
/*  79 */     FileOutputStream fos = null;
/*  80 */     String pathName = "";
    try {
/*  82 */       String extension = getFileExtendName(data);
/*  83 */       pathName = DateUtils.datePath() + "/" + IdUtils.get() + "." + extension;
/*  84 */       File file = FileUploadUtils.getAbsoluteFile(uploadDir, pathName);
/*  85 */       fos = new FileOutputStream(file);
/*  86 */       fos.write(data);
    } finally {
/*  88 */       IOUtils.close(fos);
    } 
/*  90 */     return FileUploadUtils.getPathFileName(uploadDir, pathName);
  }






  
  public static boolean deleteFile(String filePath) {
/* 100 */     boolean flag = false;
/* 101 */     File file = new File(filePath);
    
/* 103 */     if (file.isFile() && file.exists()) {
/* 104 */       file.delete();
/* 105 */       flag = true;
    } 
/* 107 */     return flag;
  }






  
  public static boolean isValidFilename(String filename) {
/* 117 */     return filename.matches(FILENAME_PATTERN);
  }







  
  public static boolean checkAllowDownload(String resource) {
/* 128 */     if (StringUtils.contains(resource, "..")) {
/* 129 */       return false;
    }

    
/* 133 */     if (ArrayUtils.contains((Object[]) MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION, FileTypeUtils.getFileType(resource))) {
/* 134 */       return true;
    }

    
/* 138 */     return false;
  }







  
  public static String setFileDownloadHeader(HttpServletRequest request, String fileName) throws UnsupportedEncodingException {
/* 149 */     String agent = request.getHeader("USER-AGENT");
/* 150 */     String filename = fileName;
/* 151 */     if (agent.contains("MSIE")) {
      
/* 153 */       filename = URLEncoder.encode(filename, "utf-8");
/* 154 */       filename = filename.replace("+", " ");
/* 155 */     } else if (agent.contains("Firefox")) {
      
/* 157 */       filename = new String(fileName.getBytes(), "ISO8859-1");
/* 158 */     } else if (agent.contains("Chrome")) {
      
/* 160 */       filename = URLEncoder.encode(filename, "utf-8");
    } else {
      
/* 163 */       filename = URLEncoder.encode(filename, "utf-8");
    } 
/* 165 */     return filename;
  }






  
  public static void setAttachmentResponseHeader(HttpServletResponse response, String realFileName) throws UnsupportedEncodingException {
/* 175 */     String percentEncodedFileName = percentEncode(realFileName);
    
/* 177 */     StringBuilder contentDispositionValue = new StringBuilder();
/* 178 */     contentDispositionValue.append("attachment; filename=")
/* 179 */       .append(percentEncodedFileName)
/* 180 */       .append(";")
/* 181 */       .append("filename*=")
/* 182 */       .append("utf-8''")
/* 183 */       .append(percentEncodedFileName);
    
/* 185 */     response.addHeader("Access-Control-Expose-Headers", "Content-Disposition,download-filename");
/* 186 */     response.setHeader("Content-disposition", contentDispositionValue.toString());
/* 187 */     response.setHeader("download-filename", percentEncodedFileName);
  }






  
  public static String percentEncode(String s) throws UnsupportedEncodingException {
/* 197 */     String encode = URLEncoder.encode(s, StandardCharsets.UTF_8.toString());
/* 198 */     return encode.replaceAll("\\+", "%20");
  }






  
  public static String getFileExtendName(byte[] photoByte) {
/* 208 */     String strFileExtendName = "jpg";
/* 209 */     if (photoByte[0] == 71 && photoByte[1] == 73 && photoByte[2] == 70 && photoByte[3] == 56 && (photoByte[4] == 55 || photoByte[4] == 57) && photoByte[5] == 97) {
      
/* 211 */       strFileExtendName = "gif";
/* 212 */     } else if (photoByte[6] == 74 && photoByte[7] == 70 && photoByte[8] == 73 && photoByte[9] == 70) {
/* 213 */       strFileExtendName = "jpg";
/* 214 */     } else if (photoByte[0] == 66 && photoByte[1] == 77) {
/* 215 */       strFileExtendName = "bmp";
/* 216 */     } else if (photoByte[1] == 80 && photoByte[2] == 78 && photoByte[3] == 71) {
/* 217 */       strFileExtendName = "png";
    } 
/* 219 */     return strFileExtendName;
  }






  
  public static String getName(String fileName) {
/* 229 */     if (fileName == null) {
/* 230 */       return null;
    }
/* 232 */     int lastUnixPos = fileName.lastIndexOf('/');
/* 233 */     int lastWindowsPos = fileName.lastIndexOf('\\');
/* 234 */     int index = Math.max(lastUnixPos, lastWindowsPos);
/* 235 */     return fileName.substring(index + 1);
  }






  
  public static String getNameNotSuffix(String fileName) {
/* 245 */     if (fileName == null) {
/* 246 */       return null;
    }
/* 248 */     String baseName = FilenameUtils.getBaseName(fileName);
/* 249 */     return baseName;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\file\FileUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */