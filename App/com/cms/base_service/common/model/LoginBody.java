package com.cms.base_service.common.model;

import javax.validation.constraints.NotNull;

public class LoginBody {
    private String code;
    private String uuid;

    /*  6 */
    public void setCode(String code) {
        this.code = code;
    }

    @NotNull(message = "用户名信息不允许为空")
    private String username;
    @NotNull(message = "密码信息不允许为空")
    private String password;
    private String reMess;

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setReMess(String reMess) {
        this.reMess = reMess;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.base_service.common.model.LoginBody)) return false;
        com.cms.base_service.common.model.LoginBody other = (com.cms.base_service.common.model.LoginBody) o;
        if (!other.canEqual(this)) return false;
        Object this$code = getCode(), other$code = other.getCode();
        if ((this$code == null) ? (other$code != null) : !this$code.equals(other$code)) return false;
        Object this$uuid = getUuid(), other$uuid = other.getUuid();
        if ((this$uuid == null) ? (other$uuid != null) : !this$uuid.equals(other$uuid)) return false;
        Object this$username = getUsername(), other$username = other.getUsername();
        if ((this$username == null) ? (other$username != null) : !this$username.equals(other$username)) return false;
        Object this$password = getPassword(), other$password = other.getPassword();
        if ((this$password == null) ? (other$password != null) : !this$password.equals(other$password)) return false;
        Object this$reMess = getReMess(), other$reMess = other.getReMess();
        return !((this$reMess == null) ? (other$reMess != null) : !this$reMess.equals(other$reMess));
    }

    protected boolean canEqual(Object other) {
        return other instanceof com.cms.base_service.common.model.LoginBody;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $code = getCode();
        result = result * 59 + (($code == null) ? 43 : $code.hashCode());
        Object $uuid = getUuid();
        result = result * 59 + (($uuid == null) ? 43 : $uuid.hashCode());
        Object $username = getUsername();
        result = result * 59 + (($username == null) ? 43 : $username.hashCode());
        Object $password = getPassword();
        result = result * 59 + (($password == null) ? 43 : $password.hashCode());
        Object $reMess = getReMess();
        return result * 59 + (($reMess == null) ? 43 : $reMess.hashCode());
    }
    @Override
    public String toString() {
        return "LoginBody(code=" + getCode() + ", uuid=" + getUuid() + ", username=" + getUsername() + ", password=" + getPassword() + ", reMess=" + getReMess() + ")";
    }


    public String getCode() {
        /* 11 */
        return this.code;
    }

    public String getUuid() {
        /* 15 */
        return this.uuid;
    }


    public String getUsername() {
        /* 20 */
        return this.username;
    }


    public String getPassword() {
        /* 25 */
        return this.password;
    }

    public String getReMess() {
        /* 27 */
        return this.reMess;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\LoginBody.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */