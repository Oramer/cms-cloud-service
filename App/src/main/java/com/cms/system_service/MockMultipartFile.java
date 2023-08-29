package com.cms.system_service;

import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;









public class MockMultipartFile
  implements MultipartFile
{
  private final String name;
  private String originalFilename;
  private String contentType;
  private final byte[] content;
  
  public MockMultipartFile(String name, byte[] content) {
/*  27 */     this(name, "", null, content);
  }







  
  public MockMultipartFile(String name, InputStream contentStream) throws IOException {
/*  38 */     this(name, "", null, FileCopyUtils.copyToByteArray(contentStream));
  }








  
  public MockMultipartFile(String name, String originalFilename, String contentType, byte[] content) {
/*  50 */     this.name = name;
/*  51 */     this.originalFilename = (originalFilename != null) ? originalFilename : "";
/*  52 */     this.contentType = contentType;
/*  53 */     this.content = (content != null) ? content : new byte[0];
  }











  
  public MockMultipartFile(String name, String originalFilename, String contentType, InputStream contentStream) throws IOException {
/*  68 */     this(name, originalFilename, contentType, FileCopyUtils.copyToByteArray(contentStream));
  }

  
  public String getName() {
/*  73 */     return this.name;
  }

  
  public String getOriginalFilename() {
/*  78 */     return this.originalFilename;
  }

  
  public String getContentType() {
/*  83 */     return this.contentType;
  }

  
  public boolean isEmpty() {
/*  88 */     return (this.content.length == 0);
  }

  
  public long getSize() {
/*  93 */     return this.content.length;
  }

  
  public byte[] getBytes() throws IOException {
/*  98 */     return this.content;
  }

  
  public InputStream getInputStream() throws IOException {
/* 103 */     return new ByteArrayInputStream(this.content);
  }

  
  public void transferTo(File dest) throws IOException, IllegalStateException {
/* 108 */     FileCopyUtils.copy(this.content, dest);
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\MockMultipartFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */