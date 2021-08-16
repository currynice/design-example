package org.cxy.demo;


import org.cxy.demo.matter.RedisUtils;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * 默认使用  RedisUtils </br>
 * Date: 2021/8/16 16:22
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class CacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    public String get(String key) {
        return redisUtils.get(key);
    }

    public void set(String key, String value) {
        redisUtils.set(key, value);
    }

    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key, value, timeout, timeUnit);
    }

    public void del(String key) {
        redisUtils.del(key);
    }
}
