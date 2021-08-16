package org.cxy.demo;

import java.util.concurrent.TimeUnit;

/**
 * Description:  相较于 {@link org.cxy.demo.matter.CacheService}
 *              多了一个 redis数据源类型的参数 redisType
 *
 *              redisType: 1 -> egm
 *                         2 -> iir
 *                         其他 -> RedisUtils
 * </br>
 * Date: 2021/8/16 16:12
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface CacheWithTypeService {

    String get(final String key,int redisType);
    void set(String key, String value,int redisType);
    void set(String key, String value, long timeout, TimeUnit timeUnit,int redisType);
    void del(String key,int redisType);
}
