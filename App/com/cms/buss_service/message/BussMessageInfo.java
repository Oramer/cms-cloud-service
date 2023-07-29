package com.cms.buss_service.message;

import com.cms.base_service.annotation.Excel;
import com.cms.base_service.common.model.BaseEntity;

public class BussMessageInfo extends BaseEntity {
    private static final long serialVersionUID = 1L;
    private Long pk;
    @Excel(name = "消息类型(1订单消息 2退款消息 )")
    private Integer messageType;
    @Excel(name = "消息头")
    private String messageTitle;
    @Excel(name = "消息体")
    private String messageContent;
    @Excel(name = "接收人")
    private String reciver;
    @Excel(name = "发送人")
    private String sender;
    @Excel(name = "是否已读")
    private Long isRead;
    @Excel(name = "业务主键")
    private String bussinessId;

    /*  12 */
    public void setPk(Long pk) {
        this.pk = pk;
    }

    @Excel(name = "业务主键")
    private String no1;
    @Excel(name = "业务主键")
    private String no2;
    @Excel(name = "业务主键")
    private String no3;
    @Excel(name = "业务主键")
    private String no4;
    @Excel(name = "业务主键")
    private String no5;
    @Excel(name = "业务主键")
    private String no6;
    @Excel(name = "业务主键")
    private String no7;
    @Excel(name = "业务主键")
    private String no8;
    @Excel(name = "业务主键")
    private String no9;
    @Excel(name = "业务主键")
    private String no10;

    public void setMessageType(Integer messageType) {
        this.messageType = messageType;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public void setReciver(String reciver) {
        this.reciver = reciver;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setIsRead(Long isRead) {
        this.isRead = isRead;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId;
    }

    public void setNo1(String no1) {
        this.no1 = no1;
    }

    public void setNo2(String no2) {
        this.no2 = no2;
    }

    public void setNo3(String no3) {
        this.no3 = no3;
    }

    public void setNo4(String no4) {
        this.no4 = no4;
    }

    public void setNo5(String no5) {
        this.no5 = no5;
    }

    public void setNo6(String no6) {
        this.no6 = no6;
    }

    public void setNo7(String no7) {
        this.no7 = no7;
    }

    public void setNo8(String no8) {
        this.no8 = no8;
    }

    public void setNo9(String no9) {
        this.no9 = no9;
    }

    public void setNo10(String no10) {
        this.no10 = no10;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof com.cms.buss_service.message.BussMessageInfo)) return false;
        com.cms.buss_service.message.BussMessageInfo other = (com.cms.buss_service.message.BussMessageInfo) o;
        if (!other.canEqual(this)) return false;
        Object this$pk = getPk(), other$pk = other.getPk();
        if ((this$pk == null) ? (other$pk != null) : !this$pk.equals(other$pk)) return false;
        Object this$messageType = getMessageType(), other$messageType = other.getMessageType();
        if ((this$messageType == null) ? (other$messageType != null) : !this$messageType.equals(other$messageType))
            return false;
        Object this$messageTitle = getMessageTitle(), other$messageTitle = other.getMessageTitle();
        if ((this$messageTitle == null) ? (other$messageTitle != null) : !this$messageTitle.equals(other$messageTitle))
            return false;
        Object this$messageContent = getMessageContent(), other$messageContent = other.getMessageContent();
        if ((this$messageContent == null) ? (other$messageContent != null) : !this$messageContent.equals(other$messageContent))
            return false;
        Object this$reciver = getReciver(), other$reciver = other.getReciver();
        if ((this$reciver == null) ? (other$reciver != null) : !this$reciver.equals(other$reciver)) return false;
        Object this$sender = getSender(), other$sender = other.getSender();
        if ((this$sender == null) ? (other$sender != null) : !this$sender.equals(other$sender)) return false;
        Object this$isRead = getIsRead(), other$isRead = other.getIsRead();
        if ((this$isRead == null) ? (other$isRead != null) : !this$isRead.equals(other$isRead)) return false;
        Object this$bussinessId = getBussinessId(), other$bussinessId = other.getBussinessId();
        if ((this$bussinessId == null) ? (other$bussinessId != null) : !this$bussinessId.equals(other$bussinessId))
            return false;
        Object this$no1 = getNo1(), other$no1 = other.getNo1();
        if ((this$no1 == null) ? (other$no1 != null) : !this$no1.equals(other$no1)) return false;
        Object this$no2 = getNo2(), other$no2 = other.getNo2();
        if ((this$no2 == null) ? (other$no2 != null) : !this$no2.equals(other$no2)) return false;
        Object this$no3 = getNo3(), other$no3 = other.getNo3();
        if ((this$no3 == null) ? (other$no3 != null) : !this$no3.equals(other$no3)) return false;
        Object this$no4 = getNo4(), other$no4 = other.getNo4();
        if ((this$no4 == null) ? (other$no4 != null) : !this$no4.equals(other$no4)) return false;
        Object this$no5 = getNo5(), other$no5 = other.getNo5();
        if ((this$no5 == null) ? (other$no5 != null) : !this$no5.equals(other$no5)) return false;
        Object this$no6 = getNo6(), other$no6 = other.getNo6();
        if ((this$no6 == null) ? (other$no6 != null) : !this$no6.equals(other$no6)) return false;
        Object this$no7 = getNo7(), other$no7 = other.getNo7();
        if ((this$no7 == null) ? (other$no7 != null) : !this$no7.equals(other$no7)) return false;
        Object this$no8 = getNo8(), other$no8 = other.getNo8();
        if ((this$no8 == null) ? (other$no8 != null) : !this$no8.equals(other$no8)) return false;
        Object this$no9 = getNo9(), other$no9 = other.getNo9();
        if ((this$no9 == null) ? (other$no9 != null) : !this$no9.equals(other$no9)) return false;
        Object this$no10 = getNo10(), other$no10 = other.getNo10();
        return !((this$no10 == null) ? (other$no10 != null) : !this$no10.equals(other$no10));
    }
    @Override
    protected boolean canEqual(Object other) {
        return other instanceof com.cms.buss_service.message.BussMessageInfo;
    }
    @Override
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        Object $pk = getPk();
        result = result * 59 + (($pk == null) ? 43 : $pk.hashCode());
        Object $messageType = getMessageType();
        result = result * 59 + (($messageType == null) ? 43 : $messageType.hashCode());
        Object $messageTitle = getMessageTitle();
        result = result * 59 + (($messageTitle == null) ? 43 : $messageTitle.hashCode());
        Object $messageContent = getMessageContent();
        result = result * 59 + (($messageContent == null) ? 43 : $messageContent.hashCode());
        Object $reciver = getReciver();
        result = result * 59 + (($reciver == null) ? 43 : $reciver.hashCode());
        Object $sender = getSender();
        result = result * 59 + (($sender == null) ? 43 : $sender.hashCode());
        Object $isRead = getIsRead();
        result = result * 59 + (($isRead == null) ? 43 : $isRead.hashCode());
        Object $bussinessId = getBussinessId();
        result = result * 59 + (($bussinessId == null) ? 43 : $bussinessId.hashCode());
        Object $no1 = getNo1();
        result = result * 59 + (($no1 == null) ? 43 : $no1.hashCode());
        Object $no2 = getNo2();
        result = result * 59 + (($no2 == null) ? 43 : $no2.hashCode());
        Object $no3 = getNo3();
        result = result * 59 + (($no3 == null) ? 43 : $no3.hashCode());
        Object $no4 = getNo4();
        result = result * 59 + (($no4 == null) ? 43 : $no4.hashCode());
        Object $no5 = getNo5();
        result = result * 59 + (($no5 == null) ? 43 : $no5.hashCode());
        Object $no6 = getNo6();
        result = result * 59 + (($no6 == null) ? 43 : $no6.hashCode());
        Object $no7 = getNo7();
        result = result * 59 + (($no7 == null) ? 43 : $no7.hashCode());
        Object $no8 = getNo8();
        result = result * 59 + (($no8 == null) ? 43 : $no8.hashCode());
        Object $no9 = getNo9();
        result = result * 59 + (($no9 == null) ? 43 : $no9.hashCode());
        Object $no10 = getNo10();
        return result * 59 + (($no10 == null) ? 43 : $no10.hashCode());
    }
    @Override
    public String toString() {
        return "BussMessageInfo(pk=" + getPk() + ", messageType=" + getMessageType() + ", messageTitle=" + getMessageTitle() + ", messageContent=" + getMessageContent() + ", reciver=" + getReciver() + ", sender=" + getSender() + ", isRead=" + getIsRead() + ", bussinessId=" + getBussinessId() + ", no1=" + getNo1() + ", no2=" + getNo2() + ", no3=" + getNo3() + ", no4=" + getNo4() + ", no5=" + getNo5() + ", no6=" + getNo6() + ", no7=" + getNo7() + ", no8=" + getNo8() + ", no9=" + getNo9() + ", no10=" + getNo10() + ")";
    }


    public Long getPk() {
        /*  17 */
        return this.pk;
    }

    public Integer getMessageType() {
        /*  21 */
        return this.messageType;
    }

    public String getMessageTitle() {
        /*  25 */
        return this.messageTitle;
    }

    public String getMessageContent() {
        /*  29 */
        return this.messageContent;
    }

    public String getReciver() {
        /*  33 */
        return this.reciver;
    }

    public String getSender() {
        /*  37 */
        return this.sender;
    }

    public Long getIsRead() {
        /*  41 */
        return this.isRead;
    }

    public String getBussinessId() {
        /*  45 */
        return this.bussinessId;
    }

    public String getNo1() {
        /*  49 */
        return this.no1;
    }

    public String getNo2() {
        /*  53 */
        return this.no2;
    }

    public String getNo3() {
        /*  57 */
        return this.no3;
    }

    public String getNo4() {
        /*  61 */
        return this.no4;
    }

    public String getNo5() {
        /*  65 */
        return this.no5;
    }

    public String getNo6() {
        /*  69 */
        return this.no6;
    }

    public String getNo7() {
        /*  73 */
        return this.no7;
    }

    public String getNo8() {
        /*  77 */
        return this.no8;
    }

    public String getNo9() {
        /*  81 */
        return this.no9;
    }

    public String getNo10() {
        /*  85 */
        return this.no10;
    }

    public BussMessageInfo() {
    }

    public BussMessageInfo(Integer messageType, String messageTitle, String messageContent, String reciver) {
        /*  91 */
        this.messageType = messageType;
        /*  92 */
        this.messageTitle = messageTitle;
        /*  93 */
        this.messageContent = messageContent;
        /*  94 */
        this.reciver = reciver;
    }

    public BussMessageInfo(Integer messageType, String messageTitle, String messageContent, String reciver, String bussinessId) {
        /*  98 */
        this.messageType = messageType;
        /*  99 */
        this.messageTitle = messageTitle;
        /* 100 */
        this.messageContent = messageContent;
        /* 101 */
        this.reciver = reciver;
        /* 102 */
        this.bussinessId = bussinessId;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\message\BussMessageInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */