package com.cms.base_service.exception;

import java.util.Arrays;

import org.apache.tomcat.util.http.fileupload.FileUploadException;


public class InvalidExtensionException
        extends FileUploadException {
    private static final long serialVersionUID = 1L;
    private String[] allowedExtension;
    private String extension;
    private String filename;

    public InvalidExtensionException(String[] allowedExtension, String extension, String filename) {
        /* 21 */
        super("文件[" + filename + "]后缀[" + extension + "]不正确，请上传" + Arrays.toString((Object[]) allowedExtension) + "格式");
        /* 22 */
        this.allowedExtension = allowedExtension;
        /* 23 */
        this.extension = extension;
        /* 24 */
        this.filename = filename;
    }


    public String[] getAllowedExtension() {
        /* 29 */
        return this.allowedExtension;
    }


    public String getExtension() {
        /* 34 */
        return this.extension;
    }


    public String getFilename() {
        /* 39 */
        return this.filename;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\exception\InvalidExtensionException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */