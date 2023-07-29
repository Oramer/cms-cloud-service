package com.cms.system_service.system.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class SysLoginLog extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long logId;
    @Excel(name = "登录账号")
    private String loginName;
    @Excel(name = "登录IP地址")
    private String ipaddr;
    @Excel(name = "登录地点")
    private String loginLocation;

    /* 12 */
    public void setLogId(Long logId) {
        this.logId = logId;
    }

    @Excel(name = "浏览器类型")
    private String browser;
    @Excel(name = "操作系统")
    private String os;
    private String status;
    @Excel(name = "提示消息")
    private String msg;
    @Excel(name = "访问时间")
    private String loginTime;
    @Excel(name = "用户会话id")
    private String sessionId;

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.system_service.system.domain.SysLoginLog)) return false;
        com.cms.system_service.system.domain.SysLoginLog other = (com.cms.system_service.system.domain.SysLoginLog) o;
        if (!other.canEqual(this)) return false;
        Object this$logId = getLogId(), other$logId = other.getLogId();
        if ((this$logId == null) ? (other$logId != null) : !this$logId.equals(other$logId)) return false;
        Object this$loginName = getLoginName(), other$loginName = other.getLoginName();
        if ((this$loginName == null) ? (other$loginName != null) : !this$loginName.equals(other$loginName))
            return false;
        Object this$ipaddr = getIpaddr(), other$ipaddr = other.getIpaddr();
        if ((this$ipaddr == null) ? (other$ipaddr != null) : !this$ipaddr.equals(other$ipaddr)) return false;
        Object this$loginLocation = getLoginLocation(), other$loginLocation = other.getLoginLocation();
        if ((this$loginLocation == null) ? (other$loginLocation != null) : !this$loginLocation.equals(other$loginLocation))
            return false;
        Object this$browser = getBrowser(), other$browser = other.getBrowser();
        if ((this$browser == null) ? (other$browser != null) : !this$browser.equals(other$browser)) return false;
        Object this$os = getOs(), other$os = other.getOs();
        if ((this$os == null) ? (other$os != null) : !this$os.equals(other$os)) return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$msg = getMsg(), other$msg = other.getMsg();
        if ((this$msg == null) ? (other$msg != null) : !this$msg.equals(other$msg)) return false;
        Object this$loginTime = getLoginTime(), other$loginTime = other.getLoginTime();
        if ((this$loginTime == null) ? (other$loginTime != null) : !this$loginTime.equals(other$loginTime))
            return false;
        Object this$sessionId = getSessionId(), other$sessionId = other.getSessionId();
        return !((this$sessionId == null) ? (other$sessionId != null) : !this$sessionId.equals(other$sessionId));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.system_service.system.domain.SysLoginLog;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $logId = getLogId();
        result = result * 59 + (($logId == null) ? 43 : $logId.hashCode());
        Object $loginName = getLoginName();
        result = result * 59 + (($loginName == null) ? 43 : $loginName.hashCode());
        Object $ipaddr = getIpaddr();
        result = result * 59 + (($ipaddr == null) ? 43 : $ipaddr.hashCode());
        Object $loginLocation = getLoginLocation();
        result = result * 59 + (($loginLocation == null) ? 43 : $loginLocation.hashCode());
        Object $browser = getBrowser();
        result = result * 59 + (($browser == null) ? 43 : $browser.hashCode());
        Object $os = getOs();
        result = result * 59 + (($os == null) ? 43 : $os.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $msg = getMsg();
        result = result * 59 + (($msg == null) ? 43 : $msg.hashCode());
        Object $loginTime = getLoginTime();
        result = result * 59 + (($loginTime == null) ? 43 : $loginTime.hashCode());
        Object $sessionId = getSessionId();
        return result * 59 + (($sessionId == null) ? 43 : $sessionId.hashCode());
    }

    public String toString() {
        return "SysLoginLog(logId=" + getLogId() + ", loginName=" + getLoginName() + ", ipaddr=" + getIpaddr() + ", loginLocation=" + getLoginLocation() + ", browser=" + getBrowser() + ", os=" + getOs() + ", status=" + getStatus() + ", msg=" + getMsg() + ", loginTime=" + getLoginTime() + ", sessionId=" + getSessionId() + ")";
    }


    public Long getLogId() {
        /* 17 */
        return this.logId;
    }

    public String getLoginName() {
        /* 21 */
        return this.loginName;
    }

    public String getIpaddr() {
        /* 25 */
        return this.ipaddr;
    }

    public String getLoginLocation() {
        /* 29 */
        return this.loginLocation;
    }

    public String getBrowser() {
        /* 33 */
        return this.browser;
    }

    public String getOs() {
        /* 37 */
        return this.os;
    }

    public String getStatus() {
        /* 40 */
        return this.status;
    }

    public String getMsg() {
        /* 44 */
        return this.msg;
    }

    public String getLoginTime() {
        /* 48 */
        return this.loginTime;
    }

    public String getSessionId() {
        /* 52 */
        return this.sessionId;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysLoginLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */