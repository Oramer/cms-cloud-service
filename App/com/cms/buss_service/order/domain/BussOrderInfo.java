 package com.cms.buss_service.order.domain;
 
 import com.cms.buss_service.order.domain.BaseOrder;
 

 
 
 
 public class BussOrderInfo
   extends BaseOrder
 {
   private Integer queryType;
   private String cdFlag;
   private String roleSet;
   private String userName;
   private String stationName;
   private String orderUser;
   
   public void setQueryType(Integer queryType) {
/* 20 */     this.queryType = queryType;
   }
   public void setCdFlag(String cdFlag) {
       this.cdFlag = cdFlag;
   }
   public void setRoleSet(String roleSet) {
       this.roleSet = roleSet;
   }
   public void setUserName(String userName) {
       this.userName = userName;
   } public void setStationName(String stationName) {
       this.stationName = stationName;
   } public void setOrderUser(String orderUser) {
       this.orderUser = orderUser;
   }
   @Override
    public boolean equals(Object o) {
       if (o == this)
           return true;
       if (!(o instanceof com.cms.buss_service.order.domain.BussOrderInfo))
           return false;
       com.cms.buss_service.order.domain.BussOrderInfo other = (com.cms.buss_service.order.domain.BussOrderInfo)o;
       if (!other.canEqual(this))
           return false;
       Object this$queryType = getQueryType(), other$queryType = other.getQueryType();
       if ((this$queryType == null) ? (other$queryType != null) : !this$queryType.equals(other$queryType))
           return false;
       Object this$cdFlag = getCdFlag(), other$cdFlag = other.getCdFlag();
       if ((this$cdFlag == null) ? (other$cdFlag != null) : !this$cdFlag.equals(other$cdFlag))
           return false;
       Object this$roleSet = getRoleSet(), other$roleSet = other.getRoleSet();
       if ((this$roleSet == null) ? (other$roleSet != null) : !this$roleSet.equals(other$roleSet))
           return false;
       Object this$userName = getUserName(), other$userName = other.getUserName();
       if ((this$userName == null) ? (other$userName != null) : !this$userName.equals(other$userName))
           return false;
       Object this$stationName = getStationName(), other$stationName = other.getStationName();
       if ((this$stationName == null) ? (other$stationName != null) : !this$stationName.equals(other$stationName))
           return false;
       Object this$orderUser = getOrderUser(), other$orderUser = other.getOrderUser();
       return !((this$orderUser == null) ? (other$orderUser != null) : !this$orderUser.equals(other$orderUser));
   }
        @Override
       protected boolean canEqual(Object other) {
           return other instanceof com.cms.buss_service.order.domain.BussOrderInfo;
       }
       @Override
       public int hashCode() {
           int PRIME = 59;
           int result = 1;
           Object $queryType = getQueryType();
           result = result * 59 + (($queryType == null) ? 43 : $queryType.hashCode());
           Object $cdFlag = getCdFlag();
           result = result * 59 + (($cdFlag == null) ? 43 : $cdFlag.hashCode());
           Object $roleSet = getRoleSet();
           result = result * 59 + (($roleSet == null) ? 43 : $roleSet.hashCode());
           Object $userName = getUserName();
           result = result * 59 + (($userName == null) ? 43 : $userName.hashCode());
           Object $stationName = getStationName(); result = result * 59 + (($stationName == null) ? 43 : $stationName.hashCode());
           Object $orderUser = getOrderUser();
           return result * 59 + (($orderUser == null) ? 43 : $orderUser.hashCode());
       }
        @Override
       public String toString() {
            return "BussOrderInfo(queryType=" + getQueryType() + ", cdFlag=" + getCdFlag() + ", roleSet=" + getRoleSet() + ", userName=" + getUserName() + ", stationName=" + getStationName() + ", orderUser=" + getOrderUser() + ")";
       }

   
   public Integer getQueryType() {
/* 24 */
       return this.queryType;
   }
   public String getCdFlag() {
/* 26 */
       return this.cdFlag;
   }
   public String getRoleSet() {
/* 28 */     return this.roleSet;
   }
   public String getUserName() {
/* 30 */     return this.userName;
   }
   public String getStationName() {
       return this.stationName;
   }
   public String getOrderUser() {
     return this.orderUser;
   }
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\order\domain\BussOrderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */