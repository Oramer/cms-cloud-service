package com.cms.base_service.common.utils.file;

import com.cms.base_service.common.utils.DateUtils;
import com.cms.base_service.common.utils.IdUtils;
import com.cms.base_service.common.utils.StringUtils;
import com.cms.base_service.common.utils.file.MimeTypeUtils;
import com.cms.base_service.exception.BusinessException;
import com.cms.base_service.exception.InvalidExtensionException;
import com.cms.base_service.framework.config.CmsConfig;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Objects;

import org.apache.commons.io.FilenameUtils;
import org.apache.tomcat.util.http.fileupload.impl.FileSizeLimitExceededException;
import org.springframework.web.multipart.MultipartFile;


public class FileUploadUtils {
    public static final long DEFAULT_MAX_SIZE = 52428800L;
    public static final int DEFAULT_FILE_NAME_LENGTH = 100;
    /*  38 */   private static String defaultBaseDir = CmsConfig.getProfile();

    public static void setDefaultBaseDir(String defaultBaseDir) {
        /*  41 */
        com.cms.base_service.common.utils.file.FileUploadUtils.defaultBaseDir = defaultBaseDir;
    }

    public static String getDefaultBaseDir() {
        /*  45 */
        return defaultBaseDir;
    }


    public static final String upload(MultipartFile file) throws IOException {
        try {
            /*  57 */
            return upload(getDefaultBaseDir(), file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
            /*  58 */
        } catch (Exception e) {
            /*  59 */
            throw new IOException(e.getMessage(), e);
        }
    }


    public static final String upload(String baseDir, MultipartFile file) throws IOException {
        try {
            /*  73 */
            return upload(baseDir, file, MimeTypeUtils.DEFAULT_ALLOWED_EXTENSION);
            /*  74 */
        } catch (Exception e) {
            /*  75 */
            throw new IOException(e.getMessage(), e);
        }
    }


    public static final String upload(String baseDir, MultipartFile file, String[] allowedExtension) throws FileSizeLimitExceededException, IOException, InvalidExtensionException {
        /*  91 */
        int fileNamelength = ((String) Objects.<String>requireNonNull(file.getOriginalFilename())).length();
        /*  92 */
        if (fileNamelength > 100) {
            /*  93 */
            throw new BusinessException(100);
        }

        /*  96 */
        assertAllowed(file, allowedExtension);

        /*  98 */
        String fileName = extractFilename(file);

        /* 100 */
        String absPath = getAbsoluteFile(baseDir, fileName).getAbsolutePath();
        /* 101 */
        file.transferTo(Paths.get(absPath, new String[0]));
        /* 102 */
        return getPathFileName(baseDir, fileName);
    }


    public static final String extractFilename(MultipartFile file) {
        /* 109 */
        return StringUtils.format("{}/{}_{}.{}", new Object[]{DateUtils.datePath(),
/* 110 */           FilenameUtils.getBaseName(file.getOriginalFilename()), IdUtils.get(), getExtension(file)});
    }

    public static final File getAbsoluteFile(String uploadDir, String fileName) throws IOException {
        /* 114 */
        File desc = new File(uploadDir + File.separator + fileName);

        /* 116 */
        if (!desc.exists() &&
                /* 117 */       !desc.getParentFile().exists()) {
            /* 118 */
            desc.getParentFile().mkdirs();
        }

        /* 121 */
        return desc;
    }

    public static final String getPathFileName(String uploadDir, String fileName) throws IOException {
        /* 125 */
        int dirLastIndex = CmsConfig.getProfile().length() + 1;
        /* 126 */
        String currentDir = StringUtils.substring(uploadDir, dirLastIndex);
        /* 127 */
        return "/profile/" + currentDir + "/" + fileName;
    }


    public static final void assertAllowed(MultipartFile file, String[] allowedExtension) throws FileSizeLimitExceededException, InvalidExtensionException {
        /* 139 */
        long size = file.getSize();
        /* 140 */
        if (size > 52428800L) {
            /* 141 */
            throw new BusinessException("文件超出最大上传标准50");
        }

        /* 144 */
        String fileName = file.getOriginalFilename();
        /* 145 */
        String extension = getExtension(file);
        /* 146 */
        if (allowedExtension != null && !isAllowedExtension(extension, allowedExtension)) {
            /* 147 */
            if (allowedExtension == MimeTypeUtils.IMAGE_EXTENSION) {
                /* 148 */
                throw new InvalidExtensionException(allowedExtension, extension, fileName);
            }
            /* 150 */
            if (allowedExtension == MimeTypeUtils.FLASH_EXTENSION) {
                /* 151 */
                throw new InvalidExtensionException(allowedExtension, extension, fileName);
            }
            /* 153 */
            if (allowedExtension == MimeTypeUtils.MEDIA_EXTENSION) {
                /* 154 */
                throw new InvalidExtensionException(allowedExtension, extension, fileName);
            }
            /* 156 */
            if (allowedExtension == MimeTypeUtils.VIDEO_EXTENSION) {
                /* 157 */
                throw new InvalidExtensionException(allowedExtension, extension, fileName);
            }

            /* 160 */
            throw new InvalidExtensionException(allowedExtension, extension, fileName);
        }
    }


    public static final boolean isAllowedExtension(String extension, String[] allowedExtension) {
        /* 173 */
        for (String str : allowedExtension) {
            /* 174 */
            if (str.equalsIgnoreCase(extension)) {
                /* 175 */
                return true;
            }
        }
        /* 178 */
        return false;
    }


    public static final String getExtension(MultipartFile file) {
        /* 188 */
        String extension = FilenameUtils.getExtension(file.getOriginalFilename());
        /* 189 */
        if (StringUtils.isEmpty(extension)) {
            /* 190 */
            extension = MimeTypeUtils.getExtension(Objects.<String>requireNonNull(file.getContentType()));
        }
        /* 192 */
        return extension;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\file\FileUploadUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */