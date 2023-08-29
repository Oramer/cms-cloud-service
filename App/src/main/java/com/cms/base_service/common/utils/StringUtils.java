package com.cms.base_service.common.utils;

import org.springframework.util.AntPathMatcher;

import java.util.*;


public class StringUtils
        extends org.apache.commons.lang3.StringUtils {
    private static final String NULLSTR = "";
    private static final char SEPARATOR = '_';

    public static <T> T nvl(T value, T defaultValue) {
        /*  36 */
        return (value != null) ? value : defaultValue;
    }


    public static boolean isEmpty(Collection<?> coll) {
        /*  46 */
        return (isNull(coll) || coll.isEmpty());
    }


    public static boolean isNotEmpty(Collection<?> coll) {
        /*  56 */
        return !isEmpty(coll);
    }


    public static boolean isEmpty(Object[] objects) {
        /*  66 */
        return (isNull(objects) || objects.length == 0);
    }


    public static boolean isNotEmpty(Object[] objects) {
        /*  76 */
        return !isEmpty(objects);
    }


    public static boolean isEmpty(Map<?, ?> map) {
        /*  86 */
        return (isNull(map) || map.isEmpty());
    }


    public static boolean isNotEmpty(Map<?, ?> map) {
        /*  96 */
        return !isEmpty(map);
    }


    public static boolean isEmpty(String str) {
        /* 106 */
        return (isNull(str) || "".equals(str.trim()));
    }


    public static boolean isNotEmpty(String str) {
        /* 116 */
        return !isEmpty(str);
    }


    public static boolean isNull(Object object) {
        /* 126 */
        return (object == null);
    }


    public static boolean isNotNull(Object object) {
        /* 136 */
        return !isNull(object);
    }


    public static boolean isArray(Object object) {
        /* 146 */
        return (isNotNull(object) && object.getClass().isArray());
    }


    public static String trim(String str) {
        /* 153 */
        return (str == null) ? "" : str.trim();
    }


    public static String substring(String str, int start) {
        /* 164 */
        if (str == null) {
            /* 165 */
            return "";
        }

        /* 168 */
        if (start < 0) {
            /* 169 */
            start = str.length() + start;
        }

        /* 172 */
        if (start < 0) {
            /* 173 */
            start = 0;
        }
        /* 175 */
        if (start > str.length()) {
            /* 176 */
            return "";
        }

        /* 179 */
        return str.substring(start);
    }


    public static String substring(String str, int start, int end) {
        /* 191 */
        if (str == null) {
            /* 192 */
            return "";
        }

        /* 195 */
        if (end < 0) {
            /* 196 */
            end = str.length() + end;
        }
        /* 198 */
        if (start < 0) {
            /* 199 */
            start = str.length() + start;
        }

        /* 202 */
        if (end > str.length()) {
            /* 203 */
            end = str.length();
        }

        /* 206 */
        if (start > end) {
            /* 207 */
            return "";
        }

        /* 210 */
        if (start < 0) {
            /* 211 */
            start = 0;
        }
        /* 213 */
        if (end < 0) {
            /* 214 */
            end = 0;
        }

        /* 217 */
        return str.substring(start, end);
    }


    public static String format(String template, Object... params) {
        /* 234 */
        if (isEmpty(params) || isEmpty(template)) {
            /* 235 */
            return template;
        }
        /* 237 */
        return StrFormatter.format(template, params);
    }


    public static boolean ishttp(String link) {
        /* 247 */
        return startsWithAny(link, new CharSequence[]{"http://", "https://"});
    }


    public static final Set<String> str2Set(String str, String sep) {
        /* 258 */
        return new HashSet<>(str2List(str, sep, true, false));
    }


    public static final List<String> str2List(String str, String sep, boolean filterBlank, boolean trim) {
        /* 271 */
        List<String> list = new ArrayList<>();
        /* 272 */
        if (isEmpty(str)) {
            /* 273 */
            return list;
        }


        /* 277 */
        if (filterBlank && isBlank(str)) {
            /* 278 */
            return list;
        }
        /* 280 */
        String[] split = str.split(sep);
        /* 281 */
        for (String string : split) {
            /* 282 */
            if (!filterBlank || !isBlank(string)) {


                /* 285 */
                if (trim) {
                    /* 286 */
                    string = string.trim();
                }
                /* 288 */
                list.add(string);
            }
        }
        /* 291 */
        return list;
    }


    public static boolean containsAnyIgnoreCase(CharSequence cs, CharSequence... searchCharSequences) {
        /* 302 */
        if (isEmpty(cs) || isEmpty((Object[]) searchCharSequences)) {
            /* 303 */
            return false;
        }
        /* 305 */
        for (CharSequence testStr : searchCharSequences) {
            /* 306 */
            if (containsIgnoreCase(cs, testStr)) {
                /* 307 */
                return true;
            }
        }
        /* 310 */
        return false;
    }


    public static String toUnderScoreCase(String str) {
        /* 317 */
        if (str == null) {
            /* 318 */
            return null;
        }
        /* 320 */
        StringBuilder sb = new StringBuilder();

        /* 322 */
        boolean preCharIsUpperCase = true;

        /* 324 */
        boolean curreCharIsUpperCase = true;

        /* 326 */
        boolean nexteCharIsUpperCase = true;
        /* 327 */
        for (int i = 0; i < str.length(); i++) {
            /* 328 */
            char c = str.charAt(i);
            /* 329 */
            if (i > 0) {
                /* 330 */
                preCharIsUpperCase = Character.isUpperCase(str.charAt(i - 1));
            } else {
                /* 332 */
                preCharIsUpperCase = false;
            }

            /* 335 */
            curreCharIsUpperCase = Character.isUpperCase(c);

            /* 337 */
            if (i < str.length() - 1) {
                /* 338 */
                nexteCharIsUpperCase = Character.isUpperCase(str.charAt(i + 1));
            }

            /* 341 */
            if (preCharIsUpperCase && curreCharIsUpperCase && !nexteCharIsUpperCase) {
                /* 342 */
                sb.append('_');
                /* 343 */
            } else if (i != 0 && !preCharIsUpperCase && curreCharIsUpperCase) {
                /* 344 */
                sb.append('_');
            }
            /* 346 */
            sb.append(Character.toLowerCase(c));
        }

        /* 349 */
        return sb.toString();
    }


    public static boolean inStringIgnoreCase(String str, String... strs) {
        /* 360 */
        if (str != null && strs != null) {
            /* 361 */
            for (String s : strs) {
                /* 362 */
                if (str.equalsIgnoreCase(trim(s))) {
                    /* 363 */
                    return true;
                }
            }
        }
        /* 367 */
        return false;
    }


    public static String convertToCamelCase(String name) {
        /* 377 */
        StringBuilder result = new StringBuilder();

        /* 379 */
        if (name == null || name.isEmpty()) {
            /* 381 */
            return "";
        }
        /* 382 */
        if (!name.contains("_")) {
            /* 384 */
            return name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        /* 387 */
        String[] camels = name.split("_");
        /* 388 */
        for (String camel : camels) {

            /* 390 */
            if (!camel.isEmpty()) {



                /* 394 */
                result.append(camel.substring(0, 1).toUpperCase());
                /* 395 */
                result.append(camel.substring(1).toLowerCase());
            }
            /* 397 */
        }
        return result.toString();
    }


    public static String toCamelCase(String s) {
        /* 404 */
        if (s == null) {
            /* 405 */
            return null;
        }
        /* 407 */
        s = s.toLowerCase();
        /* 408 */
        StringBuilder sb = new StringBuilder(s.length());
        /* 409 */
        boolean upperCase = false;
        /* 410 */
        for (int i = 0; i < s.length(); i++) {
            /* 411 */
            char c = s.charAt(i);

            /* 413 */
            if (c == '_') {
                /* 414 */
                upperCase = true;
                /* 415 */
            } else if (upperCase) {
                /* 416 */
                sb.append(Character.toUpperCase(c));
                /* 417 */
                upperCase = false;
            } else {
                /* 419 */
                sb.append(c);
            }
        }
        /* 422 */
        return sb.toString();
    }


    public static boolean matches(String str, List<String> strs) {
        /* 433 */
        if (isEmpty(str) || isEmpty(strs)) {
            /* 434 */
            return false;
        }
        /* 436 */
        for (String pattern : strs) {
            /* 437 */
            if (isMatch(pattern, str)) {
                /* 438 */
                return true;
            }
        }
        /* 441 */
        return false;
    }


    public static boolean isMatch(String pattern, String url) {
        /* 455 */
        AntPathMatcher matcher = new AntPathMatcher();
        /* 456 */
        return matcher.match(pattern, url);
    }


    public static <T> T cast(Object obj) {
        /* 461 */
        return (T) obj;
    }


    public static final String padl(Number num, int size) {
        /* 472 */
        return padl(num.toString(), size, '0');
    }


    public static final String padl(String s, int size, char c) {
        /* 484 */
        StringBuilder sb = new StringBuilder(size);
        /* 485 */
        if (s != null) {
            /* 486 */
            int len = s.length();
            /* 487 */
            if (s.length() <= size) {
                /* 488 */
                for (int i = size - len; i > 0; i--) {
                    /* 489 */
                    sb.append(c);
                }
                /* 491 */
                sb.append(s);
            } else {
                /* 493 */
                return s.substring(len - size, len);
            }
        } else {
            /* 496 */
            for (int i = size; i > 0; i--) {
                /* 497 */
                sb.append(c);
            }
        }
        /* 500 */
        return sb.toString();
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\StringUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */