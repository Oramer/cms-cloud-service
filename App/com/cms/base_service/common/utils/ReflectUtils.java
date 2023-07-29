package com.cms.base_service.common.utils;

import com.cms.base_service.common.utils.Convert;
import com.cms.base_service.common.utils.DateUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.Validate;
import org.apache.poi.ss.usermodel.DateUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class ReflectUtils {
    private static final String SETTER_PREFIX = "set";
    private static final String GETTER_PREFIX = "get";
    private static final String CGLIB_CLASS_SEPARATOR = "$$";
    /*  25 */   private static Logger logger = LoggerFactory.getLogger(com.cms.base_service.common.utils.ReflectUtils.class);


    public static <E> E invokeGetter(Object obj, String propertyName) {
        /*  33 */
        Object object = obj;
        /*  34 */
        for (String name : StringUtils.split(propertyName, ".")) {
            /*  35 */
            String getterMethodName = "get" + StringUtils.capitalize(name);
            /*  36 */
            object = invokeMethod(object, getterMethodName, new Class[0], new Object[0]);
        }
        /*  38 */
        return (E) object;
    }


    public static <E> void invokeSetter(Object obj, String propertyName, E value) {
        /*  46 */
        Object object = obj;
        /*  47 */
        String[] names = StringUtils.split(propertyName, ".");
        /*  48 */
        for (int i = 0; i < names.length; i++) {
            /*  49 */
            if (i < names.length - 1) {
                /*  50 */
                String getterMethodName = "get" + StringUtils.capitalize(names[i]);
                /*  51 */
                object = invokeMethod(object, getterMethodName, new Class[0], new Object[0]);
            } else {
                /*  53 */
                String setterMethodName = "set" + StringUtils.capitalize(names[i]);
                /*  54 */
                invokeMethodByName(object, setterMethodName, new Object[]{value});
            }
        }
    }


    public static <E> E getFieldValue(Object obj, String fieldName) {
        /*  64 */
        Field field = getAccessibleField(obj, fieldName);
        /*  65 */
        if (field == null) {
            /*  66 */
            logger.debug("在 [" + obj.getClass() + "] 中，没有找到 [" + fieldName + "] 字段 ");
            /*  67 */
            return null;
        }
        /*  69 */
        E result = null;
        try {
            /*  71 */
            result = (E) field.get(obj);
            /*  72 */
        } catch (IllegalAccessException e) {
            /*  73 */
            logger.error("不可能抛出的异常{}", e.getMessage());
        }
        /*  75 */
        return result;
    }


    public static <E> void setFieldValue(Object obj, String fieldName, E value) {
        /*  82 */
        Field field = getAccessibleField(obj, fieldName);
        /*  83 */
        if (field == null) {

            /*  85 */
            logger.debug("在 [" + obj.getClass() + "] 中，没有找到 [" + fieldName + "] 字段 ");
            return;
        }
        try {
            /*  89 */
            field.set(obj, value);
            /*  90 */
        } catch (IllegalAccessException e) {
            /*  91 */
            logger.error("不可能抛出的异常: {}", e.getMessage());
        }
    }


    public static <E> E invokeMethod(Object obj, String methodName, Class<?>[] parameterTypes, Object[] args) {
        /* 103 */
        if (obj == null || methodName == null) {
            /* 104 */
            return null;
        }
        /* 106 */
        Method method = getAccessibleMethod(obj, methodName, parameterTypes);
        /* 107 */
        if (method == null) {
            /* 108 */
            logger.debug("在 [" + obj.getClass() + "] 中，没有找到 [" + methodName + "] 方法 ");
            /* 109 */
            return null;
        }
        try {
            /* 112 */
            return (E) method.invoke(obj, args);
            /* 113 */
        } catch (Exception e) {
            /* 114 */
            String msg = "method: " + method + ", obj: " + obj + ", args: " + args + "";
            /* 115 */
            throw convertReflectionExceptionToUnchecked(msg, e);
        }
    }


    public static <E> E invokeMethodByName(Object obj, String methodName, Object[] args) {
        /* 126 */
        Method method = getAccessibleMethodByName(obj, methodName, args.length);
        /* 127 */
        if (method == null) {

            /* 129 */
            logger.debug("在 [" + obj.getClass() + "] 中，没有找到 [" + methodName + "] 方法 ");
            /* 130 */
            return null;
        }

        try {
            /* 134 */
            Class<?>[] cs = method.getParameterTypes();
            /* 135 */
            for (int i = 0; i < cs.length; i++) {
                /* 136 */
                if (args[i] != null && !args[i].getClass().equals(cs[i])) {
                    /* 137 */
                    if (cs[i] == String.class) {
                        /* 138 */
                        args[i] = Convert.toStr(args[i]);
                        /* 139 */
                        if (StringUtils.endsWith((String) args[i], ".0")) {
                            /* 140 */
                            args[i] = StringUtils.substringBefore((String) args[i], ".0");
                        }
                        /* 142 */
                    } else if (cs[i] == Integer.class) {
                        /* 143 */
                        args[i] = Convert.toInt(args[i]);
                        /* 144 */
                    } else if (cs[i] == Long.class) {
                        /* 145 */
                        args[i] = Convert.toLong(args[i]);
                        /* 146 */
                    } else if (cs[i] == Double.class) {
                        /* 147 */
                        args[i] = Convert.toDouble(args[i]);
                        /* 148 */
                    } else if (cs[i] == Float.class) {
                        /* 149 */
                        args[i] = Convert.toFloat(args[i]);
                        /* 150 */
                    } else if (cs[i] == Date.class) {
                        /* 151 */
                        if (args[i] instanceof String) {
                            /* 152 */
                            args[i] = DateUtils.parseDate(args[i]);
                        } else {
                            /* 154 */
                            args[i] = DateUtil.getJavaDate(((Double) args[i]).doubleValue());
                        }
                        /* 156 */
                    } else if (cs[i] == boolean.class || cs[i] == Boolean.class) {
                        /* 157 */
                        args[i] = Convert.toBool(args[i]);
                    }
                }
            }
            /* 161 */
            return (E) method.invoke(obj, args);
            /* 162 */
        } catch (Exception e) {
            /* 163 */
            String msg = "method: " + method + ", obj: " + obj + ", args: " + args + "";
            /* 164 */
            throw convertReflectionExceptionToUnchecked(msg, e);
        }
    }


    public static Field getAccessibleField(Object obj, String fieldName) {
        /* 174 */
        if (obj == null) {
            /* 175 */
            return null;
        }
        /* 177 */
        Validate.notBlank(fieldName, "fieldName can't be blank", new Object[0]);
        /* 178 */
        for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                /* 180 */
                Field field = superClass.getDeclaredField(fieldName);
                /* 181 */
                makeAccessible(field);
                /* 182 */
                return field;
                /* 183 */
            } catch (NoSuchFieldException e) {
            }
        }


        /* 187 */
        return null;
    }


    public static Method getAccessibleMethod(Object obj, String methodName, Class<?>... parameterTypes) {
        /* 199 */
        if (obj == null) {
            /* 200 */
            return null;
        }
        /* 202 */
        Validate.notBlank(methodName, "methodName can't be blank", new Object[0]);
        /* 203 */
        for (Class<?> searchType = obj.getClass(); searchType != Object.class; searchType = searchType.getSuperclass()) {
            try {
                /* 205 */
                Method method = searchType.getDeclaredMethod(methodName, parameterTypes);
                /* 206 */
                makeAccessible(method);
                /* 207 */
                return method;
                /* 208 */
            } catch (NoSuchMethodException e) {
            }
        }


        /* 212 */
        return null;
    }


    public static Method getAccessibleMethodByName(Object obj, String methodName, int argsNum) {
        /* 223 */
        if (obj == null) {
            /* 224 */
            return null;
        }
        /* 226 */
        Validate.notBlank(methodName, "methodName can't be blank", new Object[0]);
        /* 227 */
        for (Class<?> searchType = obj.getClass(); searchType != Object.class; searchType = searchType.getSuperclass()) {
            /* 228 */
            Method[] methods = searchType.getDeclaredMethods();
            /* 229 */
            for (Method method : methods) {
                /* 230 */
                if (method.getName().equals(methodName) && (method.getParameterTypes()).length == argsNum) {
                    /* 231 */
                    makeAccessible(method);
                    /* 232 */
                    return method;
                }
            }
        }
        /* 236 */
        return null;
    }


    public static void makeAccessible(Method method) {
        /* 243 */
        if ((!Modifier.isPublic(method.getModifiers()) || !Modifier.isPublic(method.getDeclaringClass().getModifiers())) &&
                /* 244 */       !method.isAccessible()) {
            /* 245 */
            method.setAccessible(true);
        }
    }


    public static void makeAccessible(Field field) {
        /* 253 */
        if ((!Modifier.isPublic(field.getModifiers()) || !Modifier.isPublic(field.getDeclaringClass().getModifiers()) ||
                /* 254 */       Modifier.isFinal(field.getModifiers())) && !field.isAccessible()) {
            /* 255 */
            field.setAccessible(true);
        }
    }


    public static <T> Class<T> getClassGenricType(Class clazz) {
        /* 265 */
        return getClassGenricType(clazz, 0);
    }


    public static Class getClassGenricType(Class clazz, int index) {
        /* 273 */
        Type genType = clazz.getGenericSuperclass();

        /* 275 */
        if (!(genType instanceof ParameterizedType)) {
            /* 276 */
            logger.debug(clazz.getSimpleName() + "'s superclass not ParameterizedType");
            /* 277 */
            return Object.class;
        }

        /* 280 */
        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

        /* 282 */
        if (index >= params.length || index < 0) {
            /* 283 */
            logger.debug("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: " + params.length);

            /* 285 */
            return Object.class;
        }
        /* 287 */
        if (!(params[index] instanceof Class)) {
            /* 288 */
            logger.debug(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
            /* 289 */
            return Object.class;
        }

        /* 292 */
        return (Class) params[index];
    }

    public static Class<?> getUserClass(Object instance) {
        /* 296 */
        if (instance == null) {
            /* 297 */
            throw new RuntimeException("Instance must not be null");
        }
        /* 299 */
        Class<?> clazz = instance.getClass();
        /* 300 */
        if (clazz != null && clazz.getName().contains("$$")) {
            /* 301 */
            Class<?> superClass = clazz.getSuperclass();
            /* 302 */
            if (superClass != null && !Object.class.equals(superClass)) {
                /* 303 */
                return superClass;
            }
        }
        /* 306 */
        return clazz;
    }


    public static RuntimeException convertReflectionExceptionToUnchecked(String msg, Exception e) {
        /* 314 */
        if (e instanceof IllegalAccessException || e instanceof IllegalArgumentException || e instanceof NoSuchMethodException) {
            /* 316 */
            return new IllegalArgumentException(msg, e);
        }
        /* 317 */
        if (e instanceof InvocationTargetException) {
            /* 318 */
            return new RuntimeException(msg, ((InvocationTargetException) e).getTargetException());
        }
        /* 320 */
        return new RuntimeException(msg, e);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\commo\\utils\ReflectUtils.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */