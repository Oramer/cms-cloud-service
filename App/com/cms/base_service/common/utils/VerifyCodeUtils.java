package com.cms.base_service.common.utils;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;
import javax.imageio.ImageIO;

public class VerifyCodeUtils {
    public static final String VERIFY_CODES = "123456789ABCDEFGHJKLMNPQRSTUVWXYZ";
    /*  20 */   private static Random random = new SecureRandom();


    public static String generateVerifyCode(int verifySize) {
        /*  29 */
        return generateVerifyCode(verifySize, "123456789ABCDEFGHJKLMNPQRSTUVWXYZ");
    }


    public static String generateVerifyCode(int verifySize, String sources) {
        /*  40 */
        if (sources == null || sources.length() == 0) {
            /*  41 */
            sources = "123456789ABCDEFGHJKLMNPQRSTUVWXYZ";
        }
        /*  43 */
        int codesLen = sources.length();
        /*  44 */
        Random rand = new Random(System.currentTimeMillis());
        /*  45 */
        StringBuilder verifyCode = new StringBuilder(verifySize);
        /*  46 */
        for (int i = 0; i < verifySize; i++) {
            /*  47 */
            verifyCode.append(sources.charAt(rand.nextInt(codesLen - 1)));
        }
        /*  49 */
        return verifyCode.toString();
    }


//    public static void outputImage(int w, int h, OutputStream os, String code) throws IOException {
//        /*  62 */
//        int verifySize = code.length();
//        /*  63 */
//        BufferedImage image = new BufferedImage(w, h, 1);
//        /*  64 */
//        Random rand = new Random();
//        /*  65 */
//        Graphics2D g2 = image.createGraphics();
//        /*  66 */
//        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        /*  67 */
//        Color[] colors = new Color[5];
//        /*  68 */
//        Color[] colorSpaces = {Color.WHITE, Color.CYAN, Color.GRAY, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE, Color.PINK, Color.YELLOW};
//
//        /*  70 */
//        float[] fractions = new float[colors.length];
//        /*  71 */
//        for (int i = 0; i < colors.length; i++) {
//            /*  72 */
//            colors[i] = colorSpaces[rand.nextInt(colorSpaces.length)];
//            /*  73 */
//            fractions[i] = rand.nextFloat();
//        }
//        /*  75 */
//        Arrays.sort(fractions);
//
//        /*  77 */
//        g2.setColor(Color.GRAY);
//        /*  78 */
//        g2.fillRect(0, 0, w, h);
//
//        /*  80 */
//        Color c = getRandColor(200, 250);
//        /*  81 */
//        g2.setColor(c);
//        /*  82 */
//        g2.fillRect(0, 2, w, h - 4);
//
//
//        /*  85 */
//        Random random = new Random();
//        /*  86 */
//        g2.setColor(getRandColor(160, 200));
//        /*  87 */
//        for (int j = 0; j < 20; j++) {
//            /*  88 */
//            int x = random.nextInt(w - 1);
//            /*  89 */
//            int y = random.nextInt(h - 1);
//            /*  90 */
//            int xl = random.nextInt(6) + 1;
//            /*  91 */
//            int yl = random.nextInt(12) + 1;
//            /*  92 */
//            g2.drawLine(x, y, x + xl + 40, y + yl + 20);
//        }
//
//
//        /*  96 */
//        float yawpRate = 0.05F;
//        /*  97 */
//        int area = (int) (yawpRate * w * h);
//        /*  98 */
//        for (int k = 0; k < area; k++) {
//            /*  99 */
//            int x = random.nextInt(w);
//            /* 100 */
//            int y = random.nextInt(h);
//            /* 101 */
//            int rgb = getRandomIntColor();
//            /* 102 */
//            image.setRGB(x, y, rgb);
//        }
//
//        /* 105 */
//        shear(g2, w, h, c);
//
//        /* 107 */
//        g2.setColor(getRandColor(100, 160));
//        /* 108 */
//        int fontSize = h - 4;
//        /* 109 */
//        Font font = new Font("Algerian", 2, fontSize);
//        /* 110 */
//        g2.setFont(font);
//        /* 111 */
//        char[] chars = code.toCharArray();
//        /* 112 */
//        for (int m = 0; m < verifySize; m++) {
//            /* 113 */
//            AffineTransform affine = new AffineTransform();
//            /* 114 */
//            affine.setToRotation(0.7853981633974483D * rand.nextDouble() * (rand.nextBoolean() ? true : -1), (w / verifySize * m + fontSize / 2), (h / 2));
//
//            /* 116 */
//            g2.setTransform(affine);
//            /* 117 */
//            g2.drawChars(chars, m, 1, (w - 10) / verifySize * m + 5, h / 2 + fontSize / 2 - 10);
//        }
//
//        /* 120 */
//        g2.dispose();
//        /* 121 */
//        ImageIO.write(image, "jpg", os);
//    }

    private static Color getRandColor(int fc, int bc) {
        /* 125 */
        if (fc > 255)
            /* 126 */ fc = 255;
        /* 127 */
        if (bc > 255)
            /* 128 */ bc = 255;
        /* 129 */
        int r = fc + random.nextInt(bc - fc);
        /* 130 */
        int g = fc + random.nextInt(bc - fc);
        /* 131 */
        int b = fc + random.nextInt(bc - fc);
        /* 132 */
        return new Color(r, g, b);
    }

    private static int getRandomIntColor() {
        /* 136 */
        int[] rgb = getRandomRgb();
        /* 137 */
        int color = 0;
        /* 138 */
        for (int c : rgb) {
            /* 139 */
            color <<= 8;
            /* 140 */
            color |= c;
        }
        /* 142 */
        return color;
    }

    private static int[] getRandomRgb() {
        /* 146 */
        int[] rgb = new int[3];
        /* 147 */
        for (int i = 0; i < 3; i++) {
            /* 148 */
            rgb[i] = random.nextInt(255);
        }
        /* 150 */
        return rgb;
    }

    private static void shear(Graphics g, int w1, int h1, Color color) {
        /* 154 */
        shearX(g, w1, h1, color);
        /* 155 */
        shearY(g, w1, h1, color);
    }


    private static void shearX(Graphics g, int w1, int h1, Color color) {
        /* 160 */
        int period = random.nextInt(2);

        /* 162 */
        boolean borderGap = true;
        /* 163 */
        int frames = 1;
        /* 164 */
        int phase = random.nextInt(2);

        /* 166 */
        for (int i = 0; i < h1; i++) {

            /* 168 */
            double d = (period >> 1) * Math.sin(i / period + 6.283185307179586D * phase / frames);
            /* 169 */
            g.copyArea(0, i, w1, 1, (int) d, 0);
            /* 170 */
            if (borderGap) {
                /* 171 */
                g.setColor(color);
                /* 172 */
                g.drawLine((int) d, i, 0, i);
                /* 173 */
                g.drawLine((int) d + w1, i, w1, i);
            }
        }
    }


    private static void shearY(Graphics g, int w1, int h1, Color color) {
        /* 181 */
        int period = random.nextInt(40) + 10;

        /* 183 */
        boolean borderGap = true;
        /* 184 */
        int frames = 20;
        /* 185 */
        int phase = 7;
        /* 186 */
        for (int i = 0; i < w1; i++) {

            /* 188 */
            double d = (period >> 1) * Math.sin(i / period + 6.283185307179586D * phase / frames);
            /* 189 */
            g.copyArea(i, 0, 1, h1, 0, (int) d);
            /* 190 */
            if (borderGap) {
                /* 191 */
                g.setColor(color);
                /* 192 */
                g.drawLine(i, (int) d, i, 0);
                /* 193 */
                g.drawLine(i, (int) d + h1, i, h1);
            }
        }
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\VerifyCodeUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */