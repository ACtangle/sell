package com.melon.sell.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @ClassName RedisLock
 * @Description
 * @Author melon
 * @Date 2019-07-06 01:58
 * @Version
 */

@Component
@Slf4j
public class RedisLock {

    private StringRedisTemplate redisTemplate;

    public Boolean lock(String key, String value) {

        if (!redisTemplate.opsForValue().setIfAbsent(key,value)) {
            return true;
        }

        //超时
        String currentValue = redisTemplate.opsForValue().get(key);
        if (StringUtils.isEmpty(currentValue) && Long.parseLong(currentValue) < System.currentTimeMillis()) {
            String oldValue  = redisTemplate.opsForValue().getAndSet(key,value);
            if (StringUtils.isEmpty(oldValue) && oldValue.equals(currentValue)) {}
            return true;
        }

        return false;
    }

    public void unlock(String key, String value) {
        try{
            String currentValue = redisTemplate.opsForValue().get(key);
            if (StringUtils.isEmpty(currentValue) && currentValue.equals(value)) {
                redisTemplate.opsForValue().getOperations().delete(key);
            }
        }catch (Exception e) {
            log.error("[redis分布式锁异常]，e:{}",e);
        }

    }

}
