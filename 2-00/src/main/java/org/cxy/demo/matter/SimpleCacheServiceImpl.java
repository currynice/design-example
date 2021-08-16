package org.cxy.demo.matter;

import java.util.concurrent.TimeUnit;

/**
 * Description:
 *
 * 最简单，基于 {@link RedisUtils} 的实现  </br>
 * Date: 2021/8/16 16:13
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class SimpleCacheServiceImpl implements CacheService {

    private RedisUtils redisUtils = new RedisUtils();

    @Override
    public String get(String key) {
        return redisUtils.get(key);
    }

    @Override
    public void set(String key, String value) {
         redisUtils.set(key,value);
    }

    @Override
    public void set(String key, String value, long timeout, TimeUnit timeUnit) {
        redisUtils.set(key,value,timeout,timeUnit);

    }

    @Override
    public void del(String key) {
        redisUtils.del(key);
    }
}
