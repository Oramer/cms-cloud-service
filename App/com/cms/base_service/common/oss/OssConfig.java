package com.cms.base_service.common.oss;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "oss")
public class OssConfig {
    private String assectkey;
    private String assectsecret;

    /*  7 */
    public void setAssectkey(String assectkey) {
        this.assectkey = assectkey;
    }

    private String endpoint;
    private String bucketname;

    public void setAssectsecret(String assectsecret) {
        this.assectsecret = assectsecret;
    }

    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public void setBucketname(String bucketname) {
        this.bucketname = bucketname;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.oss.OssConfig)) return false;
        com.cms.base_service.common.oss.OssConfig other = (com.cms.base_service.common.oss.OssConfig) o;
        if (!other.canEqual(this)) return false;
        Object this$assectkey = getAssectkey(), other$assectkey = other.getAssectkey();
        if ((this$assectkey == null) ? (other$assectkey != null) : !this$assectkey.equals(other$assectkey))
            return false;
        Object this$assectsecret = getAssectsecret(), other$assectsecret = other.getAssectsecret();
        if ((this$assectsecret == null) ? (other$assectsecret != null) : !this$assectsecret.equals(other$assectsecret))
            return false;
        Object this$endpoint = getEndpoint(), other$endpoint = other.getEndpoint();
        if ((this$endpoint == null) ? (other$endpoint != null) : !this$endpoint.equals(other$endpoint)) return false;
        Object this$bucketname = getBucketname(), other$bucketname = other.getBucketname();
        return !((this$bucketname == null) ? (other$bucketname != null) : !this$bucketname.equals(other$bucketname));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.oss.OssConfig;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $assectkey = getAssectkey();
        result = result * 59 + (($assectkey == null) ? 43 : $assectkey.hashCode());
        Object $assectsecret = getAssectsecret();
        result = result * 59 + (($assectsecret == null) ? 43 : $assectsecret.hashCode());
        Object $endpoint = getEndpoint();
        result = result * 59 + (($endpoint == null) ? 43 : $endpoint.hashCode());
        Object $bucketname = getBucketname();
        return result * 59 + (($bucketname == null) ? 43 : $bucketname.hashCode());
    }
    @Override
    public String toString() {
        return "OssConfig(assectkey=" + getAssectkey() + ", assectsecret=" + getAssectsecret() + ", endpoint=" + getEndpoint() + ", bucketname=" + getBucketname() + ")";
    }


    public String getAssectkey() {
        /* 14 */
        return this.assectkey;
    }

    public String getAssectsecret() {
        /* 18 */
        return this.assectsecret;
    }

    public String getEndpoint() {
        /* 22 */
        return this.endpoint;
    }

    public String getBucketname() {
        /* 26 */
        return this.bucketname;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\oss\OssConfig.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */