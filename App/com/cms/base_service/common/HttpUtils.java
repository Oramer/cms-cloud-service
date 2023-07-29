package com.cms.base_service.common;

import com.cms.base_service.common.utils.StringUtils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HttpUtils {
    /*  37 */   private static final Logger log = LoggerFactory.getLogger(com.cms.base_service.common.HttpUtils.class);


    public static String sendGet(String url) {
        /*  46 */
        return sendGet(url, "");
    }


    public static String sendGet(String url, String param) {
        /*  57 */
        return sendGet(url, param, "UTF-8");
    }


    public static String sendGet(String url, Map<String, String> parameters) {
        /*  70 */
        String result = "";
        /*  71 */
        BufferedReader in = null;
        /*  72 */
        StringBuffer sb = new StringBuffer();
        /*  73 */
        String params = "";
        try {
            /*  75 */
            if (parameters != null && parameters.size() > 0) {


                /*  78 */
                if (parameters.size() == 1) {
                    /*  79 */
                    for (String name : parameters.keySet()) {
                        /*  80 */
                        sb.append(name).append("=").append(URLEncoder.encode(parameters.get(name), "UTF-8"));
                    }
                    /*  82 */
                    params = sb.toString();
                } else {
                    /*  84 */
                    for (String name : parameters.keySet()) {
                        /*  85 */
                        sb.append(name).append("=").append(URLEncoder.encode(parameters.get(name), "UTF-8"))
/*  86 */.append("&");
                    }
                    /*  88 */
                    String temp_params = sb.toString();
                    /*  89 */
                    params = temp_params.substring(0, temp_params.length() - 1);
                }
            } else {
                /*  92 */
                params = "";
            }
            /*  94 */
            String full_url = "";
            /*  95 */
            if (StringUtils.isNotEmpty(params)) {
                /*  96 */
                full_url = url + "?" + params;
            } else {
                /*  98 */
                full_url = url;
            }


            /* 102 */
            URL connURL = new URL(full_url);

            /* 104 */
            HttpURLConnection httpConn = (HttpURLConnection) connURL.openConnection();

            /* 106 */
            httpConn.setRequestProperty("Accept", "*/*");
            /* 107 */
            httpConn.setRequestProperty("Connection", "Keep-Alive");
            /* 108 */
            httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");

            /* 110 */
            httpConn.connect();

            /* 112 */
            Map<String, List<String>> headers = httpConn.getHeaderFields();





            /* 118 */
            in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));

            String line;
            /* 121 */
            while ((line = in.readLine()) != null) {
                /* 122 */
                result = result + line;
            }
            /* 124 */
        } catch (Exception e) {
            /* 125 */
            e.printStackTrace();
        } finally {
            try {
                /* 128 */
                if (in != null) {
                    /* 129 */
                    in.close();
                }
                /* 131 */
            } catch (IOException ex) {
                /* 132 */
                ex.printStackTrace();
            }
        }
        /* 135 */
        return result;
    }


    public static String sendGet(String url, String param, String contentType) {
        /* 147 */
        StringBuilder result = new StringBuilder();
        /* 148 */
        BufferedReader in = null;
        try {
            /* 150 */
            String urlNameString = StringUtils.isNotEmpty(param) ? (url + "?" + param) : url;
            /* 151 */
            log.info("sendGet - {}", urlNameString);
            /* 152 */
            URL realUrl = new URL(urlNameString);
            /* 153 */
            URLConnection connection = realUrl.openConnection();
            /* 154 */
            connection.setRequestProperty("accept", "*/*");
            /* 155 */
            connection.setRequestProperty("connection", "Keep-Alive");
            /* 156 */
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            /* 157 */
            connection.connect();
            /* 158 */
            in = new BufferedReader(new InputStreamReader(connection.getInputStream(), contentType));
            String line;
            /* 160 */
            while ((line = in.readLine()) != null) {
                /* 161 */
                result.append(line);
            }
            /* 163 */
            log.info("recv - {}", result);
            /* 164 */
        } catch (ConnectException e) {
            /* 165 */
            log.error("调用HttpUtils.sendGet ConnectException, url=" + url + ",param=" + param, e);
            /* 166 */
        } catch (SocketTimeoutException e) {
            /* 167 */
            log.error("调用HttpUtils.sendGet SocketTimeoutException, url=" + url + ",param=" + param, e);
            /* 168 */
        } catch (IOException e) {
            /* 169 */
            log.error("调用HttpUtils.sendGet IOException, url=" + url + ",param=" + param, e);
            /* 170 */
        } catch (Exception e) {
            /* 171 */
            log.error("调用HttpsUtil.sendGet Exception, url=" + url + ",param=" + param, e);
        } finally {
            try {
                /* 174 */
                if (in != null) {
                    /* 175 */
                    in.close();
                }
                /* 177 */
            } catch (Exception ex) {
                /* 178 */
                log.error("调用in.close Exception, url=" + url + ",param=" + param, ex);
            }
        }
        /* 181 */
        return result.toString();
    }


    public static String sendPost(String url, String param) {
        /* 192 */
        PrintWriter out = null;
        /* 193 */
        BufferedReader in = null;
        /* 194 */
        StringBuilder result = new StringBuilder();
        try {
            /* 196 */
            log.info("sendPost - {}", url);
            /* 197 */
            URL realUrl = new URL(url);
            /* 198 */
            URLConnection conn = realUrl.openConnection();
            /* 199 */
            conn.setRequestProperty("accept", "*/*");
            /* 200 */
            conn.setRequestProperty("connection", "Keep-Alive");
            /* 201 */
            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            /* 202 */
            conn.setRequestProperty("Accept-Charset", "utf-8");
            /* 203 */
            conn.setRequestProperty("contentType", "utf-8");
            /* 204 */
            conn.setDoOutput(true);
            /* 205 */
            conn.setDoInput(true);
            /* 206 */
            out = new PrintWriter(conn.getOutputStream());
            /* 207 */
            out.print(param);
            /* 208 */
            out.flush();
            /* 209 */
            in = new BufferedReader(new InputStreamReader(conn.getInputStream(), StandardCharsets.UTF_8));
            String line;
            /* 211 */
            while ((line = in.readLine()) != null) {
                /* 212 */
                result.append(line);
            }
            /* 214 */
            log.info("recv - {}", result);
            /* 215 */
        } catch (ConnectException e) {
            /* 216 */
            log.error("调用HttpUtils.sendPost ConnectException, url=" + url + ",param=" + param, e);
            /* 217 */
        } catch (SocketTimeoutException e) {
            /* 218 */
            log.error("调用HttpUtils.sendPost SocketTimeoutException, url=" + url + ",param=" + param, e);
            /* 219 */
        } catch (IOException e) {
            /* 220 */
            log.error("调用HttpUtils.sendPost IOException, url=" + url + ",param=" + param, e);
            /* 221 */
        } catch (Exception e) {
            /* 222 */
            log.error("调用HttpsUtil.sendPost Exception, url=" + url + ",param=" + param, e);
        } finally {
            try {
                /* 225 */
                if (out != null) {
                    /* 226 */
                    out.close();
                }
                /* 228 */
                if (in != null) {
                    /* 229 */
                    in.close();
                }
                /* 231 */
            } catch (IOException ex) {
                /* 232 */
                log.error("调用in.close Exception, url=" + url + ",param=" + param, ex);
            }
        }
        /* 235 */
        return result.toString();
    }

//    public static String sendSSLPost(String url, String param) {
//        /* 239 */
//        StringBuilder result = new StringBuilder();
//        /* 240 */
//        String urlNameString = url + "?" + param;
//        try {
//            /* 242 */
//            log.info("sendSSLPost - {}", urlNameString);
//            /* 243 */
//            SSLContext sc = SSLContext.getInstance("SSL");
//            /* 244 */
//            sc.init(null, new TrustManager[]{(TrustManager) new TrustAnyTrustManager(null)}, new SecureRandom());
//            /* 245 */
//            URL console = new URL(urlNameString);
//            /* 246 */
//            HttpsURLConnection conn = (HttpsURLConnection) console.openConnection();
//            /* 247 */
//            conn.setRequestProperty("accept", "*/*");
//            /* 248 */
//            conn.setRequestProperty("connection", "Keep-Alive");
//            /* 249 */
//            conn.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
//            /* 250 */
//            conn.setRequestProperty("Accept-Charset", "utf-8");
//            /* 251 */
//            conn.setRequestProperty("contentType", "utf-8");
//            /* 252 */
//            conn.setDoOutput(true);
//            /* 253 */
//            conn.setDoInput(true);
//
//            /* 255 */
//            conn.setSSLSocketFactory(sc.getSocketFactory());
//            /* 256 */
//            conn.setHostnameVerifier((HostnameVerifier) new TrustAnyHostnameVerifier(null));
//            /* 257 */
//            conn.connect();
//            /* 258 */
//            InputStream is = conn.getInputStream();
//            /* 259 */
//            BufferedReader br = new BufferedReader(new InputStreamReader(is));
//            /* 260 */
//            String ret = "";
//            /* 261 */
//            while ((ret = br.readLine()) != null) {
//                /* 262 */
//                if (ret != null && !"".equals(ret.trim())) {
//                    /* 263 */
//                    result.append(new String(ret.getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8));
//                }
//            }
//            /* 266 */
//            log.info("recv - {}", result);
//            /* 267 */
//            conn.disconnect();
//            /* 268 */
//            br.close();
//            /* 269 */
//        } catch (ConnectException e) {
//            /* 270 */
//            log.error("调用HttpUtils.sendSSLPost ConnectException, url=" + url + ",param=" + param, e);
//            /* 271 */
//        } catch (SocketTimeoutException e) {
//            /* 272 */
//            log.error("调用HttpUtils.sendSSLPost SocketTimeoutException, url=" + url + ",param=" + param, e);
//            /* 273 */
//        } catch (IOException e) {
//            /* 274 */
//            log.error("调用HttpUtils.sendSSLPost IOException, url=" + url + ",param=" + param, e);
//            /* 275 */
//        } catch (Exception e) {
//            /* 276 */
//            log.error("调用HttpsUtil.sendSSLPost Exception, url=" + url + ",param=" + param, e);
//        }
//        /* 278 */
//        return result.toString();
//    }

    public static ByteArrayInputStream sendPostByte(String URL, String json) {
        /* 282 */
        InputStream inputStream = null;
        /* 283 */
        ByteArrayInputStream byteArrayInputStream = null;

        /* 285 */
        CloseableHttpClient httpclient = HttpClients.createDefault();

        /* 287 */
        HttpPost httppost = new HttpPost(URL);
        /* 288 */
        httppost.addHeader("Content-type", "application/json; charset=utf-8");
        /* 289 */
        httppost.setHeader("Accept", "application/json");
        try {
            /* 291 */
            StringEntity s = new StringEntity(json, Charset.forName("UTF-8"));
            /* 292 */
            s.setContentEncoding("UTF-8");
            /* 293 */
            httppost.setEntity((HttpEntity) s);
            /* 294 */
            CloseableHttpResponse closeableHttpResponse = httpclient.execute((HttpUriRequest) httppost);
            /* 295 */
            if (closeableHttpResponse.getStatusLine().getStatusCode() == 200) {

                /* 297 */
                HttpEntity entity = closeableHttpResponse.getEntity();
                /* 298 */
                inputStream = entity.getContent();
                /* 299 */
                ByteArrayOutputStream outStream = new ByteArrayOutputStream();

                /* 301 */
                byte[] buffer = new byte[1024];

                /* 303 */
                int len = 0;

                /* 305 */
                while ((len = inputStream.read(buffer)) != -1) {
                    /* 307 */
                    outStream.write(buffer, 0, len);
                }

                /* 310 */
                inputStream.close();

                /* 312 */
                byteArrayInputStream = new ByteArrayInputStream(outStream.toByteArray());
            }
            /* 314 */
        } catch (Exception e) {
            /* 315 */
            e.printStackTrace();
        } finally {

            try {
                /* 319 */
                httpclient.close();
                /* 320 */
            } catch (IOException e) {
                /* 321 */
                e.printStackTrace();
            }
        }
        /* 324 */
        return byteArrayInputStream;
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\HttpUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */