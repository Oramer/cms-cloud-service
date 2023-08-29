/*   */
package com.cms.buss_service.weichat;

/*   */ public class MapPojo {
    /*   */   private int status;

    /*   */
    /* 5 */
    public void setStatus(int status) {
        this.status = status;
    }

    private MapResult result;

    public void setResult(MapResult result) {
        this.result = result;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof MapPojo)) return false;
        MapPojo other = (MapPojo) o;
        if (!other.canEqual(this)) return false;
        if (getStatus() != other.getStatus()) return false;
        Object this$result = getResult(), other$result = other.getResult();
        return !((this$result == null) ? (other$result != null) : !this$result.equals(other$result));
    }

    protected boolean canEqual(Object other) {
        return other instanceof MapPojo;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + getStatus();
        Object $result = getResult();
        return result * 59 + (($result == null) ? 43 : $result.hashCode());
    }

    public String toString() {
        return "MapPojo(status=" + getStatus() + ", result=" + getResult() + ")";
    }

    /*   */
    public int getStatus() {
        /* 7 */
        return this.status;
        /*   */
    }

    public MapResult getResult() {
        /* 9 */
        return this.result;
        /*   */
    }
    /*   */
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\weichat\MapPojo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */