 package com.cms.buss_service.wxpay;



















 public class WechatUrlConstants
 {
   private static final String PUB_WX_HOST = "https://api.mch.weixin.qq.com";
   private static final String HOST_NAME = "https://www.allinkwater.com/wxapi";
   public static final String CODE_2_SESSION = "https://api.weixin.qq.com/sns/jscode2session";
   public static final String PAY_V3_JSAPI = "https://api.mch.weixin.qq.com/v3/pay/transactions/jsapi";
   public static final String PAY_V3_REFUND = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds";
   public static final String PAY_V3_QUERY_OUT = "https://api.mch.weixin.qq.com/v3/pay/transactions/out-trade-no/%s?mchid=%s";
   public static final String PAY_V3_QUERY_REFUND = "https://api.mch.weixin.qq.com/v3/refund/domestic/refunds/%s";
   public static final String PAY_V3_TRANSFER_ORDER = "https://api.mch.weixin.qq.com/v3/transfer/batches";
   public static final String PAY_V3_NOTIFY = "https://www.allinkwater.com/wxapi/api/wechatPay/v3/wechatPayNotify";
/* 32 */   public static final Object PAY_V3_NOTIFY_YJ = "https://www.allinkwater.com/wxapi/api/wechatPay/v3/yjNotify";
   public static final String PAY_V3_REFUND_NOTIFY = "https://www.allinkwater.com/wxapi/api/wechatPay/v3/wechatRefundNotify";
   public static final String ORDER_TYPE_PD = "1";
   public static final String ORDER_TYPE_BU = "2";
   public static final String ORDER_TYPE_TICKET = "3";
   public static final String ORDER_TYPE_RECHARGE = "4";
 }


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\WechatUrlConstants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */