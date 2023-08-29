package com.cms.system_service.system.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

import java.util.Arrays;
import java.util.Date;

public class SysOperLog extends BaseEntity {
    private static final long serialVersionUID = 1L;
    @Excel(name = "操作序号")
    private Long operId;
    @Excel(name = "操作模块")
    private String title;
    @Excel(name = "业务类型")
    private String businessType;
    private Integer[] businessTypes;
    @Excel(name = "请求方法")
    private String method;
    @Excel(name = "请求方式")
    private String requestMethod;
    @Excel(name = "操作类别")
    private Integer operatorType;
    @Excel(name = "操作人员")
    /*   9 */ private String operName;

    public void setOperId(Long operId) {
        this.operId = operId;
    }

    @Excel(name = "部门名称")
    private String deptName;
    @Excel(name = "请求地址")
    private String operUrl;
    @Excel(name = "操作地址")
    private String operIp;
    @Excel(name = "操作地点")
    private String operLocation;
    @Excel(name = "请求参数")
    private String operParam;
    @Excel(name = "返回参数")
    private String jsonResult;
    @Excel(name = "状态")
    private Integer status;
    @Excel(name = "错误消息")
    private String errorMsg;
    @Excel(name = "操作时间")
    private Date operTime;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public void setBusinessTypes(Integer[] businessTypes) {
        this.businessTypes = businessTypes;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    public void setOperLocation(String operLocation) {
        this.operLocation = operLocation;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public void setOperTime(Date operTime) {
        this.operTime = operTime;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysOperLog)) return false;
        SysOperLog other = (SysOperLog) o;
        if (!other.canEqual(this)) return false;
        Object this$operId = getOperId(), other$operId = other.getOperId();
        if ((this$operId == null) ? (other$operId != null) : !this$operId.equals(other$operId)) return false;
        Object this$title = getTitle(), other$title = other.getTitle();
        if ((this$title == null) ? (other$title != null) : !this$title.equals(other$title)) return false;
        Object this$businessType = getBusinessType(), other$businessType = other.getBusinessType();
        if ((this$businessType == null) ? (other$businessType != null) : !this$businessType.equals(other$businessType))
            return false;
        if (!Arrays.deepEquals((Object[]) getBusinessTypes(), (Object[]) other.getBusinessTypes())) return false;
        Object this$method = getMethod(), other$method = other.getMethod();
        if ((this$method == null) ? (other$method != null) : !this$method.equals(other$method)) return false;
        Object this$requestMethod = getRequestMethod(), other$requestMethod = other.getRequestMethod();
        if ((this$requestMethod == null) ? (other$requestMethod != null) : !this$requestMethod.equals(other$requestMethod))
            return false;
        Object this$operatorType = getOperatorType(), other$operatorType = other.getOperatorType();
        if ((this$operatorType == null) ? (other$operatorType != null) : !this$operatorType.equals(other$operatorType))
            return false;
        Object this$operName = getOperName(), other$operName = other.getOperName();
        if ((this$operName == null) ? (other$operName != null) : !this$operName.equals(other$operName)) return false;
        Object this$deptName = getDeptName(), other$deptName = other.getDeptName();
        if ((this$deptName == null) ? (other$deptName != null) : !this$deptName.equals(other$deptName)) return false;
        Object this$operUrl = getOperUrl(), other$operUrl = other.getOperUrl();
        if ((this$operUrl == null) ? (other$operUrl != null) : !this$operUrl.equals(other$operUrl)) return false;
        Object this$operIp = getOperIp(), other$operIp = other.getOperIp();
        if ((this$operIp == null) ? (other$operIp != null) : !this$operIp.equals(other$operIp)) return false;
        Object this$operLocation = getOperLocation(), other$operLocation = other.getOperLocation();
        if ((this$operLocation == null) ? (other$operLocation != null) : !this$operLocation.equals(other$operLocation))
            return false;
        Object this$operParam = getOperParam(), other$operParam = other.getOperParam();
        if ((this$operParam == null) ? (other$operParam != null) : !this$operParam.equals(other$operParam))
            return false;
        Object this$jsonResult = getJsonResult(), other$jsonResult = other.getJsonResult();
        if ((this$jsonResult == null) ? (other$jsonResult != null) : !this$jsonResult.equals(other$jsonResult))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$errorMsg = getErrorMsg(), other$errorMsg = other.getErrorMsg();
        if ((this$errorMsg == null) ? (other$errorMsg != null) : !this$errorMsg.equals(other$errorMsg)) return false;
        Object this$operTime = getOperTime(), other$operTime = other.getOperTime();
        return !((this$operTime == null) ? (other$operTime != null) : !this$operTime.equals(other$operTime));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof SysOperLog;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $operId = getOperId();
        result = result * 59 + (($operId == null) ? 43 : $operId.hashCode());
        Object $title = getTitle();
        result = result * 59 + (($title == null) ? 43 : $title.hashCode());
        Object $businessType = getBusinessType();
        result = result * 59 + (($businessType == null) ? 43 : $businessType.hashCode());
        result = result * 59 + Arrays.deepHashCode((Object[]) getBusinessTypes());
        Object $method = getMethod();
        result = result * 59 + (($method == null) ? 43 : $method.hashCode());
        Object $requestMethod = getRequestMethod();
        result = result * 59 + (($requestMethod == null) ? 43 : $requestMethod.hashCode());
        Object $operatorType = getOperatorType();
        result = result * 59 + (($operatorType == null) ? 43 : $operatorType.hashCode());
        Object $operName = getOperName();
        result = result * 59 + (($operName == null) ? 43 : $operName.hashCode());
        Object $deptName = getDeptName();
        result = result * 59 + (($deptName == null) ? 43 : $deptName.hashCode());
        Object $operUrl = getOperUrl();
        result = result * 59 + (($operUrl == null) ? 43 : $operUrl.hashCode());
        Object $operIp = getOperIp();
        result = result * 59 + (($operIp == null) ? 43 : $operIp.hashCode());
        Object $operLocation = getOperLocation();
        result = result * 59 + (($operLocation == null) ? 43 : $operLocation.hashCode());
        Object $operParam = getOperParam();
        result = result * 59 + (($operParam == null) ? 43 : $operParam.hashCode());
        Object $jsonResult = getJsonResult();
        result = result * 59 + (($jsonResult == null) ? 43 : $jsonResult.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $errorMsg = getErrorMsg();
        result = result * 59 + (($errorMsg == null) ? 43 : $errorMsg.hashCode());
        Object $operTime = getOperTime();
        return result * 59 + (($operTime == null) ? 43 : $operTime.hashCode());
    }
    @Override
    public String toString() {
        return "SysOperLog(operId=" + getOperId() + ", title=" + getTitle() + ", businessType=" + getBusinessType() + ", businessTypes=" + Arrays.deepToString((Object[]) getBusinessTypes()) + ", method=" + getMethod() + ", requestMethod=" + getRequestMethod() + ", operatorType=" + getOperatorType() + ", operName=" + getOperName() + ", deptName=" + getDeptName() + ", operUrl=" + getOperUrl() + ", operIp=" + getOperIp() + ", operLocation=" + getOperLocation() + ", operParam=" + getOperParam() + ", jsonResult=" + getJsonResult() + ", status=" + getStatus() + ", errorMsg=" + getErrorMsg() + ", operTime=" + getOperTime() + ")";
    }


    public Long getOperId() {
        /*  17 */
        return this.operId;
    }


    public String getTitle() {
        /*  23 */
        return this.title;
    }


    public String getBusinessType() {
        /*  29 */
        return this.businessType;
    }


    public Integer[] getBusinessTypes() {
        /*  34 */
        return this.businessTypes;
    }


    public String getMethod() {
        /*  40 */
        return this.method;
    }


    public String getRequestMethod() {
        /*  46 */
        return this.requestMethod;
    }


    public Integer getOperatorType() {
        /*  52 */
        return this.operatorType;
    }


    public String getOperName() {
        /*  58 */
        return this.operName;
    }


    public String getDeptName() {
        /*  64 */
        return this.deptName;
    }


    public String getOperUrl() {
        /*  70 */
        return this.operUrl;
    }


    public String getOperIp() {
        /*  76 */
        return this.operIp;
    }


    public String getOperLocation() {
        /*  82 */
        return this.operLocation;
    }


    public String getOperParam() {
        /*  88 */
        return this.operParam;
    }


    public String getJsonResult() {
        /*  94 */
        return this.jsonResult;
    }


    public Integer getStatus() {
        /* 100 */
        return this.status;
    }


    public String getErrorMsg() {
        /* 106 */
        return this.errorMsg;
    }


    public Date getOperTime() {
        /* 112 */
        return this.operTime;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysOperLog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */