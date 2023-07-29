// package com.cms.system_service;
//
// import java.awt.image.BufferedImage;
// import java.io.File;
// import java.io.FilenameFilter;
// import java.io.InputStream;
// import java.util.Arrays;
// import java.util.HashSet;
// import java.util.Set;
// import javax.imageio.ImageIO;
// import org.springframework.web.multipart.MultipartFile;
//
//
//
//
//
// public class ThumbnailUtil
// {
///* 19 */   public static String[] ratios = new String[] { "low", "medium", "high" };
//
///* 21 */   public static String orgForm = "orgForm";
//
//   public static Builder<File> of(File... files) {
///* 24 */     Iterable<File> iter = Arrays.asList(files);
///* 25 */     return new Builder(iter, null);
//   }
//
//   public static Builde<BufferedImage> of(BufferedImage... images) {
///* 29 */     return new Builder(Arrays.asList(images), null);
//   }
//
//   public static Builder<InputStream> of(InputStream... inputStreams) {
///* 33 */     return new Builder(Arrays.asList(inputStreams), null);
//   }
//
//   public static Builder<MultipartFile> of(MultipartFile... multipartFiles) {
///* 37 */     return new Builder(Arrays.asList(multipartFiles), null);
//   }
//
//   public static FilenameFilter readFilter() {
///* 41 */     String[] readFormats = ImageIO.getReaderFormatNames();
///* 42 */     Set<String> readFormatSet = new HashSet<>(Arrays.asList(readFormats));
///* 43 */     String[] writeFormats = ImageIO.getWriterFormatNames();
///* 44 */     return (FilenameFilter)new Object(readFormatSet);
//   }
// }
//
//
///* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\ThumbnailUtil.class
// * Java compiler version: 8 (52.0)
// * JD-Core Version:       1.1.3
// */