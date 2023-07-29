package com.cms.base_service.common.redis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundSetOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;


@Component
public class RedisCache {
    @Autowired
    public RedisTemplate redisTemplate;

    public Boolean ifExist(String key) {
        /*  27 */
        return this.redisTemplate.hasKey(key);
    }


    public <T> ValueOperations<String, T> setCacheObject(String key, T value) {
        /*  37 */
        ValueOperations<String, T> operation = this.redisTemplate.opsForValue();
        /*  38 */
        operation.set(key, value);
        /*  39 */
        return operation;
    }


    public Boolean updateKey(String key, long time) {
        /*  49 */
        return this.redisTemplate.expire(key, time, TimeUnit.MINUTES);
    }


    public Long getKeyExp(String key) {
        /*  58 */
        return this.redisTemplate.getExpire(key);
    }


    public <Object> ValueOperations<String, Object> setCacheObject(String key, Object value, Long timeout, TimeUnit timeUnit) {
        /*  72 */
        ValueOperations<String, Object> operation = this.redisTemplate.opsForValue();
        /*  73 */
        operation.set(key, value, timeout.longValue(), timeUnit);
        /*  74 */
        return operation;
    }


    public <T> T getCacheObject(String key) {
        /*  84 */
        ValueOperations<String, T> operation = this.redisTemplate.opsForValue();
        /*  85 */
        return (T) operation.get(key);
    }


    public void deleteObject(String key) {
        /*  94 */
        this.redisTemplate.delete(key);
    }


    public void deleteObject(Collection collection) {
        /* 103 */
        this.redisTemplate.delete(collection);
    }


    public <T> ListOperations<String, T> setCacheList(String key, List<T> dataList) {
        /* 114 */
        ListOperations<String, T> listOperation = this.redisTemplate.opsForList();
        /* 115 */
        if (null != dataList) {
            /* 116 */
            int size = dataList.size();
            /* 117 */
            for (int i = 0; i < size; i++) {
                /* 118 */
                listOperation.leftPush(key, dataList.get(i));
            }
        }
        /* 121 */
        return listOperation;
    }


    public <T> List<T> getCacheList(String key) {
        /* 131 */
        List<T> dataList = new ArrayList<>();
        /* 132 */
        ListOperations<String, T> listOperation = this.redisTemplate.opsForList();
        /* 133 */
        Long size = listOperation.size(key);

        /* 135 */
        for (int i = 0; i < size.longValue(); i++) {
            /* 136 */
            dataList.add((T) listOperation.index(key, i));
        }
        /* 138 */
        return dataList;
    }


//    public <T> BoundSetOperations<String, T> setCacheSet(String key, Set<T> dataSet) {
//        /* 149 */
//        BoundSetOperations<String, T> setOperation = this.redisTemplate.boundSetOps(key);
//        /* 150 */
//        Iterator<T> it = dataSet.iterator();
//        /* 151 */
//        while (it.hasNext()) {
//            /* 152 */
//            setOperation.add(new Object[]{it.next()});
//        }
//        /* 154 */
//        return setOperation;
//    }


    public <T> Set<T> getCacheSet(String key) {
        /* 164 */
        Set<T> dataSet = new HashSet<>();
        /* 165 */
        BoundSetOperations<String, T> operation = this.redisTemplate.boundSetOps(key);
        /* 166 */
        dataSet = operation.members();
        /* 167 */
        return dataSet;
    }


    public <T> HashOperations<String, String, T> setCacheMap(String key, Map<String, T> dataMap) {
        /* 178 */
        HashOperations<String, String, T> hashOperations = this.redisTemplate.opsForHash();
        /* 179 */
        if (null != dataMap) {
            /* 180 */
            for (Map.Entry<String, T> entry : dataMap.entrySet()) {
                /* 181 */
                hashOperations.put(key, entry.getKey(), entry.getValue());
            }
        }
        /* 184 */
        return hashOperations;
    }


    public <T> Map<String, T> getCacheMap(String key) {
        /* 194 */
        Map<String, T> map = this.redisTemplate.opsForHash().entries(key);
        /* 195 */
        return map;
    }


    public Collection<String> keys(String pattern) {
        /* 205 */
        return this.redisTemplate.keys(pattern);
    }
}


/* Location:              C:\Users\Administrator\Desktop\cms-cloud-service.jar!\BOOT-INF\classes\com\cms\base_service\common\redis\RedisCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */