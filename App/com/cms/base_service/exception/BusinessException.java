package com.cms.base_service.exception;

import com.cms.base_service.common.model.Constants;

public class BusinessException extends RuntimeException {
    private int status;

    public void setStatus(int status) {
        /*  9 */
        this.status = status;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.exception.BusinessException)) return false;
        com.cms.base_service.exception.BusinessException other = (com.cms.base_service.exception.BusinessException) o;
        return !other.canEqual(this) ? false : (!(getStatus() != other.getStatus()));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.exception.BusinessException;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        return result * 59 + getStatus();
    }

    public String toString() {
        return "BusinessException(status=" + getStatus() + ")";
    }

    public int getStatus() {
        /* 12 */
        return this.status;
    }

    public BusinessException(int status) {
        /* 15 */
        this.status = status;
    }

    public BusinessException(int status, String message) {
        /* 19 */
        super(message);
        /* 20 */
        this.status = status;
    }

    public BusinessException(String message) {
        /* 23 */
        super(message);
        /* 24 */
        this.status = Constants.BUSSINESS_EXCEPTION_CODE.intValue();
    }

    public BusinessException(int status, String message, Throwable cause) {
        /* 28 */
        super(message, cause);
        /* 29 */
        this.status = status;
    }

    public BusinessException(int status, Throwable cause) {
        /* 33 */
        super(cause);
        /* 34 */
        this.status = status;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\exception\BusinessException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */