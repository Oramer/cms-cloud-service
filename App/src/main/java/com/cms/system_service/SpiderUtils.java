package com.cms.system_service;


import org.apache.commons.lang3.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;

public class SpiderUtils {
    /*  26 */   protected static final Logger logger = LoggerFactory.getLogger(SpiderUtils.class);


    public static String getSourceFormHtml(String url, String encodeing) {
        /*  36 */
        URL ur = null;
        /*  37 */
        InputStreamReader reader = null;
        /*  38 */
        StringBuffer sb = null;
        try {
            /*  40 */
            ur = new URL(url);

            /*  42 */
            URLConnection coon = ur.openConnection();

            /*  44 */
            reader = new InputStreamReader(coon.getInputStream(), encodeing);

            /*  46 */
            BufferedReader read = new BufferedReader(reader);

            /*  48 */
            sb = new StringBuffer();
            String temp;
            /*  50 */
            while ((temp = read.readLine()) != null) {
                /*  51 */
                sb.append(temp).append("\n");
            }
        }
        /*  54 */ catch (Exception e) {
            /*  55 */
            e.printStackTrace();
        } finally {
            /*  57 */
            if (reader != null) {
                try {
                    /*  59 */
                    reader.close();
                    /*  60 */
                } catch (IOException e) {
                    /*  61 */
                    e.printStackTrace();
                }
            }
        }
        /*  65 */
        return (sb != null) ? sb.toString() : "";
    }


    public static void getMeiTu(String url) {
        /*  74 */
        String html = getSourceFormHtml(url, "UTF-8");
        /*  75 */
        if (StringUtils.isNotBlank(html)) {
            /*  76 */
            Document doc = Jsoup.parse(html);
            /*  77 */
            Elements select = doc.select("img[src]");
            /*  78 */
            List<String> ss = new ArrayList<>();
            /*  79 */
            for (Element element : select) {
                /*  80 */
                String attr = element.attr("src");
                /*  81 */
                ss.add(attr);
                /*  82 */
                if (attr.startsWith("http")) ;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        /*  91 */
//        String source = "C:\\uploadPath\\upload\\20230314";
//        /*  92 */
//        String traget = "C:\\uploadPath\\upload\\20230314";
//        /*  93 */
//        ThumbnailUtil.of((new File(source)).listFiles(ThumbnailUtil.readFilter())).scale(1.0D).outputQuality(0.9D)
///*  94 */.outputFormat(ThumbnailUtil.orgForm).toFiles(new File(traget), "");
    }


    public static void downloadPicture(String urlList, int index, String prefix) {
        /* 100 */
        URL url = null;
        /* 101 */
        int imageNumber = 0;

        try {
            /* 104 */
            url = new URL(urlList);

            /* 106 */
            DataInputStream dataInputStream = new DataInputStream(url.openStream());
            /* 107 */
            String prex = urlList.substring(urlList.lastIndexOf("."));
            /* 108 */
            String imageName = "E:/dwp/";

            /* 110 */
            imageName = imageName + prefix + index + prex;
            /* 111 */
            File file = new File(imageName);
            /* 112 */
            long length1 = file.length();

            /* 114 */
            FileOutputStream fileOutputStream = new FileOutputStream(file);

            /* 116 */
            ByteArrayOutputStream output = new ByteArrayOutputStream();

            /* 118 */
            byte[] buffer = new byte[4096];

            int length;
            /* 121 */
            while ((length = dataInputStream.read(buffer)) > 0) {
                /* 122 */
                output.write(buffer, 0, length);
            }
            /* 124 */
            byte[] context = output.toByteArray();
            /* 125 */
            fileOutputStream.write(output.toByteArray());
            /* 126 */
            dataInputStream.close();
            /* 127 */
            fileOutputStream.close();
            /* 128 */
        } catch (MalformedURLException e) {
            /* 129 */
            e.printStackTrace();
            /* 130 */
        } catch (IOException e) {
            /* 131 */
            e.printStackTrace();
        }
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\system_service\SpiderUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */