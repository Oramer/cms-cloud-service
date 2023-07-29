package com.cms.base_service.common.utils;





public final class Base64
{
  private static final int BASELENGTH = 128;
  private static final int LOOKUPLENGTH = 64;
  private static final int TWENTYFOURBITGROUP = 24;
  private static final int EIGHTBIT = 8;
  private static final int SIXTEENBIT = 16;
  private static final int FOURBYTE = 4;
  private static final int SIGN = -128;
  private static final char PAD = '=';
/*  17 */   private static final byte[] base64Alphabet = new byte[128];
/*  18 */   private static final char[] lookUpBase64Alphabet = new char[64];
  static {
    int i;
/*  21 */     for (i = 0; i < 128; i++) {
/*  22 */       base64Alphabet[i] = -1;
    }
/*  24 */     for (i = 90; i >= 65; i--) {
/*  25 */       base64Alphabet[i] = (byte)(i - 65);
    }
/*  27 */     for (i = 122; i >= 97; i--) {
/*  28 */       base64Alphabet[i] = (byte)(i - 97 + 26);
    }

/*  31 */     for (i = 57; i >= 48; i--) {
/*  32 */       base64Alphabet[i] = (byte)(i - 48 + 52);
    }

/*  35 */     base64Alphabet[43] = 62;
/*  36 */     base64Alphabet[47] = 63;

/*  38 */     for (i = 0; i <= 25; i++) {
/*  39 */       lookUpBase64Alphabet[i] = (char)(65 + i);
    }
    int j;
/*  42 */     for (i = 26, j = 0; i <= 51; i++, j++) {
/*  43 */       lookUpBase64Alphabet[i] = (char)(97 + j);
    }

/*  46 */     for (i = 52, j = 0; i <= 61; i++, j++) {
/*  47 */       lookUpBase64Alphabet[i] = (char)(48 + j);
    }
/*  49 */     lookUpBase64Alphabet[62] = '+';
/*  50 */     lookUpBase64Alphabet[63] = '/';
  }

  private static boolean isWhiteSpace(char octect) {
/*  54 */     return (octect == ' ' || octect == '\r' || octect == '\n' || octect == '\t');
  }

  private static boolean isPad(char octect) {
/*  58 */     return (octect == '=');
  }

  private static boolean isData(char octect) {
/*  62 */     return (octect < '' && base64Alphabet[octect] != -1);
  }







  public static String encode(byte[] binaryData) {
/*  72 */     if (binaryData == null) {
/*  73 */       return null;
    }

/*  76 */     int lengthDataBits = binaryData.length * 8;
/*  77 */     if (lengthDataBits == 0) {
/*  78 */       return "";
    }

/*  81 */     int fewerThan24bits = lengthDataBits % 24;
/*  82 */     int numberTriplets = lengthDataBits / 24;
/*  83 */     int numberQuartet = (fewerThan24bits != 0) ? (numberTriplets + 1) : numberTriplets;
/*  84 */     char[] encodedData = null;

/*  86 */     encodedData = new char[numberQuartet * 4];

/*  88 */     byte k = 0, l = 0, b1 = 0, b2 = 0, b3 = 0;

/*  90 */     int encodedIndex = 0;
/*  91 */     int dataIndex = 0;

/*  93 */     for (int i = 0; i < numberTriplets; i++) {
/*  94 */       b1 = binaryData[dataIndex++];
/*  95 */       b2 = binaryData[dataIndex++];
/*  96 */       b3 = binaryData[dataIndex++];

/*  98 */       l = (byte)(b2 & 0xF);
/*  99 */       k = (byte)(b1 & 0x3);

/* 101 */       byte val1 = ((b1 & Byte.MIN_VALUE) == 0) ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 102 */       byte val2 = ((b2 & Byte.MIN_VALUE) == 0) ? (byte)(b2 >> 4) : (byte)(b2 >> 4 ^ 0xF0);
/* 103 */       byte val3 = ((b3 & Byte.MIN_VALUE) == 0) ? (byte)(b3 >> 6) : (byte)(b3 >> 6 ^ 0xFC);

/* 105 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[val1];
/* 106 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[val2 | k << 4];
/* 107 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[l << 2 | val3];
/* 108 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[b3 & 0x3F];
    }


/* 112 */     if (fewerThan24bits == 8) {
/* 113 */       b1 = binaryData[dataIndex];
/* 114 */       k = (byte)(b1 & 0x3);
/* 115 */       byte val1 = ((b1 & Byte.MIN_VALUE) == 0) ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 116 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[val1];
/* 117 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[k << 4];
/* 118 */       encodedData[encodedIndex++] = '=';
/* 119 */       encodedData[encodedIndex++] = '=';
/* 120 */     } else if (fewerThan24bits == 16) {
/* 121 */       b1 = binaryData[dataIndex];
/* 122 */       b2 = binaryData[dataIndex + 1];
/* 123 */       l = (byte)(b2 & 0xF);
/* 124 */       k = (byte)(b1 & 0x3);

/* 126 */       byte val1 = ((b1 & Byte.MIN_VALUE) == 0) ? (byte)(b1 >> 2) : (byte)(b1 >> 2 ^ 0xC0);
/* 127 */       byte val2 = ((b2 & Byte.MIN_VALUE) == 0) ? (byte)(b2 >> 4) : (byte)(b2 >> 4 ^ 0xF0);

/* 129 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[val1];
/* 130 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[val2 | k << 4];
/* 131 */       encodedData[encodedIndex++] = lookUpBase64Alphabet[l << 2];
/* 132 */       encodedData[encodedIndex++] = '=';
    }
/* 134 */     return new String(encodedData);
  }







  public static byte[] decode(String encoded) {
/* 144 */     if (encoded == null) {
/* 145 */       return null;
    }

/* 148 */     char[] base64Data = encoded.toCharArray();

/* 150 */     int len = removeWhiteSpace(base64Data);

/* 152 */     if (len % 4 != 0) {
/* 153 */       return null;
    }

/* 156 */     int numberQuadruple = len / 4;

/* 158 */     if (numberQuadruple == 0) {
/* 159 */       return new byte[0];
    }

/* 162 */     byte[] decodedData = null;
/* 163 */     byte b1 = 0, b2 = 0, b3 = 0, b4 = 0;
/* 164 */     char d1 = Character.MIN_VALUE, d2 = Character.MIN_VALUE, d3 = Character.MIN_VALUE, d4 = Character.MIN_VALUE;

/* 166 */     int i = 0;
/* 167 */     int encodedIndex = 0;
/* 168 */     int dataIndex = 0;
/* 169 */     decodedData = new byte[numberQuadruple * 3];

/* 171 */     for (; i < numberQuadruple - 1; i++) {

/* 173 */       if (!isData(d1 = base64Data[dataIndex++]) || !isData(d2 = base64Data[dataIndex++]) || 
/* 174 */         !isData(d3 = base64Data[dataIndex++]) || !isData(d4 = base64Data[dataIndex++])) {
/* 175 */         return null;
      }

/* 178 */       b1 = base64Alphabet[d1];
/* 179 */       b2 = base64Alphabet[d2];
/* 180 */       b3 = base64Alphabet[d3];
/* 181 */       b4 = base64Alphabet[d4];

/* 183 */       decodedData[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4);
/* 184 */       decodedData[encodedIndex++] = (byte)((b2 & 0xF) << 4 | b3 >> 2 & 0xF);
/* 185 */       decodedData[encodedIndex++] = (byte)(b3 << 6 | b4);
    }

/* 188 */     if (!isData(d1 = base64Data[dataIndex++]) || !isData(d2 = base64Data[dataIndex++])) {
/* 189 */       return null;
    }

/* 192 */     b1 = base64Alphabet[d1];
/* 193 */     b2 = base64Alphabet[d2];

/* 195 */     d3 = base64Data[dataIndex++];
/* 196 */     d4 = base64Data[dataIndex++];
/* 197 */     if (!isData(d3) || !isData(d4)) {
/* 198 */       if (isPad(d3) && isPad(d4)) {
/* 199 */         if ((b2 & 0xF) != 0)
        {
/* 201 */           return null;
        }
/* 203 */         byte[] tmp = new byte[i * 3 + 1];
/* 204 */         System.arraycopy(decodedData, 0, tmp, 0, i * 3);
/* 205 */         tmp[encodedIndex] = (byte)(b1 << 2 | b2 >> 4);
/* 206 */         return tmp;
/* 207 */       }  if (!isPad(d3) && isPad(d4)) {
/* 208 */         b3 = base64Alphabet[d3];
/* 209 */         if ((b3 & 0x3) != 0)
        {
/* 211 */           return null;
        }
/* 213 */         byte[] tmp = new byte[i * 3 + 2];
/* 214 */         System.arraycopy(decodedData, 0, tmp, 0, i * 3);
/* 215 */         tmp[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4);
/* 216 */         tmp[encodedIndex] = (byte)((b2 & 0xF) << 4 | b3 >> 2 & 0xF);
/* 217 */         return tmp;
      }
/* 219 */       return null;
    }

/* 222 */     b3 = base64Alphabet[d3];
/* 223 */     b4 = base64Alphabet[d4];
/* 224 */     decodedData[encodedIndex++] = (byte)(b1 << 2 | b2 >> 4);
/* 225 */     decodedData[encodedIndex++] = (byte)((b2 & 0xF) << 4 | b3 >> 2 & 0xF);
/* 226 */     decodedData[encodedIndex++] = (byte)(b3 << 6 | b4);


/* 229 */     return decodedData;
  }







  private static int removeWhiteSpace(char[] data) {
/* 239 */     if (data == null) {
/* 240 */       return 0;
    }


/* 244 */     int newSize = 0;
/* 245 */     int len = data.length;
/* 246 */     for (int i = 0; i < len; i++) {
/* 247 */       if (!isWhiteSpace(data[i])) {
/* 248 */         data[newSize++] = data[i];
      }
    }
/* 251 */     return newSize;
  }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\Base64.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */