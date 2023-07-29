package com.cms.base_service.common.model;

import java.math.BigDecimal;







































public class Constants
{
  public static final String PASS_OR_ACCOUNT_NOT_MATCH = "【登录异常】:用户名或密码不正确";
  public static final String NO_USER_FOUND = "【登录异常】:当前账户信息不存在";
  public static final String CAPTCH_CODE_ERROR = "【登录异常】:验证码错误";
  public static final String NO_LOGIN_CONFIRM = "【鉴权异常】:登录信息已过期或尚未登录";
  public static final String NO_AUTH_CONFIRM = "【鉴权异常】:当前无此权限--|";
  public static final String LOGIN_SUCCESS = "【登录成功】:login success";
  public static final String NO_ALLOW_OPER = "【非法操作】:超级管理员用户不允许操作";
  public static final String CAPTCHA_CODE_KEY = "captcha_codes:";
  public static final String TEMP_USER_P = "user:temp:pwd";
  public static final String NULL_VALUE = "null";
  public static final String UNDEFINED_VALUE = "undefined";
  public static final String SUPER_ADMIN_PK = "1128558726395985919,1128558726395985918";
/*  57 */   public static final Long DEFAULT_SUPER_ADMIN_FOR_STATION = Long.valueOf(2L);




/*  62 */   public static final Long SYSTEM_ADMIN_STATION_ID = Long.valueOf(1L);


  public static final long CAPTCHA_EXPIRATION = 2L;


  public static final String JWT_SECERT = "nicaiwoshishui";


  public static final long TOKEN_EXP_TIME = 86400000L;


  public static final String GBK = "GBK";


  public static final String SYS_DICT_KEY = "sys:dict";


  public static final String LAYOUT = "Layout";


  public static final String PARENT_VIEW = "ParentView";


  public static final String INNER_LINK = "InnerLink";


  public static final String YES = "Y";


  public static final String TOKEN = "token";

  public static final String UTF8 = "UTF-8";

  public static final String NULLSTR = "null";

  public static final String EMPTYSTR = "undefined";

/* 100 */   public static final BigDecimal DEFAULT_CLIMB_FREE = new BigDecimal(2);
/* 101 */   public static final BigDecimal USER_SHARE_TD = new BigDecimal(0.005D);
/* 102 */   public static final BigDecimal SYSTEM_DEFAULT_TD = new BigDecimal(0.01D);
/* 103 */   public static final BigDecimal SYSTEM_DEFAULT_PT_KD = new BigDecimal(0.004D);
/* 104 */   public static final BigDecimal SYSTEM_YT_MONEY = new BigDecimal(0.05D);
  public static final String PD_ORDER = "PO";
  public static final String TD_ORDER = "TO";
  public static final String BD_ORDER = "BO";
  public static final String TT_ORDER = "BK";
/* 109 */   public static final BigDecimal ORDER_TRANSFER_PAY = new BigDecimal(3.0D);
/* 110 */   public static final BigDecimal ORDER_TRANSFER_PAY_SOURCE = new BigDecimal(2.0D);
/* 111 */   public static final BigDecimal ORDER_TRANSFER_PAY_PT = new BigDecimal(1.0D);






/* 118 */   public static String Login_USER_REFRESH_KEY = "login_refresh_token:";




  public static final String NOT_UNIQUE = "1";




  public static final String DEPT_NORMAL = "0";



  public static final String DEPT_DISABLE = "1";



  public static final String YES_FRAME = "0";



  public static final String NO_FRAME = "1";



  public static final String TYPE_DIR = "M";



  public static final String TYPE_MENU = "C";



  public static final String UNIQUE = "0";



  public static final String HTTP = "http://";



  public static final String HTTPS = "https://";



  public static final String TOKEN_PARAM_NAME = "Authorization";



  public static final String SYS_CONFIG_KEY = "system_config:";



  public static final String USE_QRCODE_YN = "use_login_qrcode";



  public static final String Login_USER_KEY = "sys_login_user:";



/* 180 */   public static final Integer BUSSINESS_SUCCESS_CODE = Integer.valueOf(200);



/* 184 */   public static final Integer LOGIN_EXCEPTION_CODE = Integer.valueOf(401);



/* 188 */   public static final Integer BUSSINESS_EXCEPTION_CODE = Integer.valueOf(409);




  public static final String DICT_NAME = "SYSTEM_DICT:";




  public static final String LOOKUP_RMI = "rmi://";



  public static final String LOOKUP_LDAP = "ldap://";



/* 206 */   public static final String[] JOB_ERROR_STR = new String[] { "java.net.URL", "javax.naming.InitialContext", "org.yaml.snakeyaml", "org.springframework.jndi" };
  public static final String FAIL = "204";
  public static final String SUCCESS = "200";
  public static final String RESOURCE_PREFIX = "/profile";
  public static final String FIRST_INDEX = "first";
  public static final String SECOND_INDEX = "second";
  public static final String THIRD_INDEX = "third";
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\model\Constants.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */