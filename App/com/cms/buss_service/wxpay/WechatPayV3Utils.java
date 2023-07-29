package com.cms.buss_service.wxpay;
import com.alibaba.fastjson.JSONObject;
import com.wechat.pay.contrib.apache.httpclient.Credentials;
import com.wechat.pay.contrib.apache.httpclient.Validator;
import com.wechat.pay.contrib.apache.httpclient.WechatPayHttpClientBuilder;
import com.wechat.pay.contrib.apache.httpclient.auth.PrivateKeySigner;
import com.wechat.pay.contrib.apache.httpclient.auth.Signer;
import com.wechat.pay.contrib.apache.httpclient.auth.Verifier;
import com.wechat.pay.contrib.apache.httpclient.auth.WechatPay2Credentials;
import com.wechat.pay.contrib.apache.httpclient.auth.WechatPay2Validator;
import com.wechat.pay.contrib.apache.httpclient.cert.CertificatesManager;
import com.wechat.pay.contrib.apache.httpclient.notification.Notification;
import com.wechat.pay.contrib.apache.httpclient.notification.NotificationHandler;
import com.wechat.pay.contrib.apache.httpclient.notification.NotificationRequest;
import com.wechat.pay.contrib.apache.httpclient.notification.Request;
import com.wechat.pay.contrib.apache.httpclient.util.PemUtil;
import java.io.BufferedReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.PrivateKey;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@Component
public class WechatPayV3Utils {
/*  39 */   protected final Logger logger = LoggerFactory.getLogger(getClass());


  
  private PrivateKey merchantPrivateKey;

  
  private Verifier verifier;

  
  private CloseableHttpClient httpClient;


  
  private void setMerchantPrivateKey() throws Exception {
/*  54 */     ClassPathResource classPathResource = new ClassPathResource("cert/apiclient_key.pem");
/*  55 */     InputStream certStream = classPathResource.getInputStream();
    
/*  57 */     this.merchantPrivateKey = PemUtil.loadPrivateKey(certStream);
  }







  
  private void setVerifier() throws Exception {
/*  68 */     if (this.merchantPrivateKey == null) {
/*  69 */       setMerchantPrivateKey();
    }
    
/*  72 */     CertificatesManager certificatesManager = CertificatesManager.getInstance();
    
/*  74 */     certificatesManager.putMerchant("1636136569", (Credentials)new WechatPay2Credentials("1636136569", (Signer)new PrivateKeySigner("30B67200176DFE83F4917D95B3968A040999C30C", this.merchantPrivateKey)), "A0312021_gaodunhu_xingxuezhangOK"
        
/*  76 */         .getBytes(StandardCharsets.UTF_8));


    
/*  80 */     this.verifier = certificatesManager.getVerifier("1636136569");
  }





  
  private void setHttpClient() throws Exception {
/*  89 */     if (this.verifier == null) {
/*  90 */       setVerifier();
    }

    
/*  94 */     WechatPayHttpClientBuilder builder = WechatPayHttpClientBuilder.create().withMerchant("1636136569", "30B67200176DFE83F4917D95B3968A040999C30C", this.merchantPrivateKey).withValidator((Validator)new WechatPay2Validator(this.verifier));

    
/*  97 */     this.httpClient = builder.build();
  }







  
  public JSONObject sendPost(String url, JSONObject params) {
    try {
/* 109 */       if (this.httpClient == null) {
/* 110 */         setHttpClient();
      }
/* 112 */       HttpPost httpPost = new HttpPost(url);
/* 113 */       httpPost.addHeader("Accept", "application/json");
/* 114 */       httpPost.addHeader("Content-type", "application/json; charset=utf-8");
/* 115 */       httpPost.setEntity((HttpEntity)new StringEntity(params.toJSONString(), StandardCharsets.UTF_8));
/* 116 */       CloseableHttpResponse response = this.httpClient.execute((HttpUriRequest)httpPost);
/* 117 */       String bodyAsString = EntityUtils.toString(response.getEntity());
/* 118 */       this.logger.info("微信返回的内容：" + bodyAsString);
/* 119 */       if (StringUtils.isEmpty(bodyAsString)) {
/* 120 */         return null;
      }
/* 122 */       return JSONObject.parseObject(bodyAsString);
/* 123 */     } catch (Exception e) {
/* 124 */       this.logger.error("微信支付V3请求失败");
/* 125 */       e.printStackTrace();
/* 126 */       return null;
    } 
  }






  
  public JSONObject sendGet(String url) {
    try {
/* 138 */       if (this.httpClient == null) {
/* 139 */         setHttpClient();
      }
/* 141 */       URIBuilder uriBuilder = new URIBuilder(url);
/* 142 */       HttpGet httpGet = new HttpGet(uriBuilder.build());
/* 143 */       httpGet.addHeader("Accept", "application/json");
/* 144 */       CloseableHttpResponse response = this.httpClient.execute((HttpUriRequest)httpGet);
/* 145 */       String bodyAsString = EntityUtils.toString(response.getEntity());
/* 146 */       this.logger.info("微信返回的内容：" + bodyAsString);
/* 147 */       if (StringUtils.isEmpty(bodyAsString)) {
/* 148 */         return null;
      }
/* 150 */       return JSONObject.parseObject(bodyAsString);
/* 151 */     } catch (Exception e) {
/* 152 */       this.logger.error("微信支付V3请求失败");
/* 153 */       e.printStackTrace();
/* 154 */       return null;
    } 
  }






  
  public JSONObject getCallbackData(HttpServletRequest request) {
    try {
/* 166 */       if (this.verifier == null) {
/* 167 */         setVerifier();
      }
/* 169 */       String wechatPaySerial = request.getHeader("Wechatpay-Serial");
/* 170 */       String nonce = request.getHeader("Wechatpay-Nonce");
/* 171 */       String timestamp = request.getHeader("Wechatpay-Timestamp");
/* 172 */       String signature = request.getHeader("Wechatpay-Signature");
      
/* 174 */       BufferedReader reader = request.getReader();
      
/* 176 */       StringBuilder inputString = new StringBuilder(); String line;
/* 177 */       while ((line = reader.readLine()) != null) {
/* 178 */         inputString.append(line);
      }
/* 180 */       String body = inputString.toString();
/* 181 */       reader.close();





      
/* 188 */       NotificationRequest res = (new NotificationRequest.Builder()).withSerialNumber(wechatPaySerial).withNonce(nonce).withTimestamp(timestamp).withSignature(signature).withBody(body).build();
/* 189 */       NotificationHandler handler = new NotificationHandler(this.verifier, "A0312021_gaodunhu_xingxuezhangOK".getBytes(StandardCharsets.UTF_8));
      
/* 191 */       Notification notification = handler.parse((Request)res);
/* 192 */       this.logger.info("回调通知数据：" + notification.toString());
      
/* 194 */       String decryptData = notification.getDecryptData();
/* 195 */       this.logger.info("回调解析数据：" + decryptData);
/* 196 */       if (StringUtils.isEmpty(decryptData)) {
/* 197 */         return null;
      }
/* 199 */       return JSONObject.parseObject(decryptData);
/* 200 */     } catch (Exception e) {
/* 201 */       this.logger.error("微信支付V3回调失败");
/* 202 */       e.printStackTrace();
/* 203 */       return null;
    } 
  }






  
  public String signRSA(String message) {
    try {
/* 215 */       if (this.merchantPrivateKey == null) {
/* 216 */         setMerchantPrivateKey();
      }
/* 218 */       PrivateKeySigner privateKeySigner = new PrivateKeySigner("30B67200176DFE83F4917D95B3968A040999C30C", this.merchantPrivateKey);
/* 219 */       Signer.SignatureResult signature = privateKeySigner.sign(message.getBytes(StandardCharsets.UTF_8));
/* 220 */       return signature.getSign();
/* 221 */     } catch (Exception e) {
/* 222 */       e.printStackTrace();
/* 223 */       return "";
    } 
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\buss_service\wxpay\WechatPayV3Utils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */