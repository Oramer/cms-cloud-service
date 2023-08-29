package com.cms.system_service.system.domain;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class SysNotice extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Integer noticeId;
    @Excel(name = "公告标题")
    private String noticeTitle;
    private String noticeType;
    @Excel(name = "公告内容")
    private String noticeContent;
    private String status;

    public void setNoticeId(Integer noticeId) {
        /* 17 */
        this.noticeId = noticeId;
    }

    @Excel(name = "公告附件")
    private String noticeEnclosure;
    private String ud1;
    private String ud2;
    private String ud3;
    private String ud4;
    private String ud5;

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setNoticeEnclosure(String noticeEnclosure) {
        this.noticeEnclosure = noticeEnclosure;
    }

    public void setUd1(String ud1) {
        this.ud1 = ud1;
    }

    public void setUd2(String ud2) {
        this.ud2 = ud2;
    }

    public void setUd3(String ud3) {
        this.ud3 = ud3;
    }

    public void setUd4(String ud4) {
        this.ud4 = ud4;
    }

    public void setUd5(String ud5) {
        this.ud5 = ud5;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof SysNotice)) return false;
        SysNotice other = (SysNotice) o;
        if (!other.canEqual(this)) return false;
        Object this$noticeId = getNoticeId(), other$noticeId = other.getNoticeId();
        if ((this$noticeId == null) ? (other$noticeId != null) : !this$noticeId.equals(other$noticeId)) return false;
        Object this$noticeTitle = getNoticeTitle(), other$noticeTitle = other.getNoticeTitle();
        if ((this$noticeTitle == null) ? (other$noticeTitle != null) : !this$noticeTitle.equals(other$noticeTitle))
            return false;
        Object this$noticeType = getNoticeType(), other$noticeType = other.getNoticeType();
        if ((this$noticeType == null) ? (other$noticeType != null) : !this$noticeType.equals(other$noticeType))
            return false;
        Object this$noticeContent = getNoticeContent(), other$noticeContent = other.getNoticeContent();
        if ((this$noticeContent == null) ? (other$noticeContent != null) : !this$noticeContent.equals(other$noticeContent))
            return false;
        Object this$status = getStatus(), other$status = other.getStatus();
        if ((this$status == null) ? (other$status != null) : !this$status.equals(other$status)) return false;
        Object this$noticeEnclosure = getNoticeEnclosure(), other$noticeEnclosure = other.getNoticeEnclosure();
        if ((this$noticeEnclosure == null) ? (other$noticeEnclosure != null) : !this$noticeEnclosure.equals(other$noticeEnclosure))
            return false;
        Object this$ud1 = getUd1(), other$ud1 = other.getUd1();
        if ((this$ud1 == null) ? (other$ud1 != null) : !this$ud1.equals(other$ud1)) return false;
        Object this$ud2 = getUd2(), other$ud2 = other.getUd2();
        if ((this$ud2 == null) ? (other$ud2 != null) : !this$ud2.equals(other$ud2)) return false;
        Object this$ud3 = getUd3(), other$ud3 = other.getUd3();
        if ((this$ud3 == null) ? (other$ud3 != null) : !this$ud3.equals(other$ud3)) return false;
        Object this$ud4 = getUd4(), other$ud4 = other.getUd4();
        if ((this$ud4 == null) ? (other$ud4 != null) : !this$ud4.equals(other$ud4)) return false;
        Object this$ud5 = getUd5(), other$ud5 = other.getUd5();
        return !((this$ud5 == null) ? (other$ud5 != null) : !this$ud5.equals(other$ud5));
    }

    protected boolean canEqual(Object other) {
        return other instanceof SysNotice;
    }

    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $noticeId = getNoticeId();
        result = result * 59 + (($noticeId == null) ? 43 : $noticeId.hashCode());
        Object $noticeTitle = getNoticeTitle();
        result = result * 59 + (($noticeTitle == null) ? 43 : $noticeTitle.hashCode());
        Object $noticeType = getNoticeType();
        result = result * 59 + (($noticeType == null) ? 43 : $noticeType.hashCode());
        Object $noticeContent = getNoticeContent();
        result = result * 59 + (($noticeContent == null) ? 43 : $noticeContent.hashCode());
        Object $status = getStatus();
        result = result * 59 + (($status == null) ? 43 : $status.hashCode());
        Object $noticeEnclosure = getNoticeEnclosure();
        result = result * 59 + (($noticeEnclosure == null) ? 43 : $noticeEnclosure.hashCode());
        Object $ud1 = getUd1();
        result = result * 59 + (($ud1 == null) ? 43 : $ud1.hashCode());
        Object $ud2 = getUd2();
        result = result * 59 + (($ud2 == null) ? 43 : $ud2.hashCode());
        Object $ud3 = getUd3();
        result = result * 59 + (($ud3 == null) ? 43 : $ud3.hashCode());
        Object $ud4 = getUd4();
        result = result * 59 + (($ud4 == null) ? 43 : $ud4.hashCode());
        Object $ud5 = getUd5();
        return result * 59 + (($ud5 == null) ? 43 : $ud5.hashCode());
    }

    public String toString() {
        return "SysNotice(noticeId=" + getNoticeId() + ", noticeTitle=" + getNoticeTitle() + ", noticeType=" + getNoticeType() + ", noticeContent=" + getNoticeContent() + ", status=" + getStatus() + ", noticeEnclosure=" + getNoticeEnclosure() + ", ud1=" + getUd1() + ", ud2=" + getUd2() + ", ud3=" + getUd3() + ", ud4=" + getUd4() + ", ud5=" + getUd5() + ")";
    }


    public Integer getNoticeId() {
        /* 24 */
        return this.noticeId;
    }


    public String getNoticeTitle() {
        /* 30 */
        return this.noticeTitle;
    }


    public String getNoticeType() {
        /* 35 */
        return this.noticeType;
    }


    public String getNoticeContent() {
        /* 41 */
        return this.noticeContent;
    }


    public String getStatus() {
        /* 46 */
        return this.status;
    }


    public String getNoticeEnclosure() {
        /* 52 */
        return this.noticeEnclosure;
    }


    public String getUd1() {
        /* 57 */
        return this.ud1;
    }


    public String getUd2() {
        /* 62 */
        return this.ud2;
    }


    public String getUd3() {
        /* 67 */
        return this.ud3;
    }


    public String getUd4() {
        /* 72 */
        return this.ud4;
    }


    public String getUd5() {
        /* 77 */
        return this.ud5;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\system\domain\SysNotice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */