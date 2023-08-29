package com.cms.base_service.exception;

public class ParamsValidityException
        extends RuntimeException {
    private String msg;

    public String toString() {
        /*  8 */
        return "ParamsValidityException(msg=" + getMsg() + ")";
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $msg = getMsg();
        return result * 59 + (($msg == null) ? 43 : $msg.hashCode());
    }

    protected boolean canEqual(Object other) {
        return other instanceof ParamsValidityException;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof ParamsValidityException)) return false;
        ParamsValidityException other = (ParamsValidityException) o;
        if (!other.canEqual(this)) return false;
        Object this$msg = getMsg(), other$msg = other.getMsg();
        return !((this$msg == null) ? (other$msg != null) : !this$msg.equals(other$msg));
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        /* 10 */
        return this.msg;
    }

    public ParamsValidityException(String msg) {
        /* 13 */
        super(msg);
        /* 14 */
        this.msg = msg;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\exception\ParamsValidityException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */