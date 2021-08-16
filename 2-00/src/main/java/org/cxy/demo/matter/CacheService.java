package org.cxy.demo.matter;

import java.util.concurrent.TimeUnit;

/**
 * Description:   </br>
 * Date: 2021/8/16 16:12
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface CacheService {

    String get(final String key);
    void set(String key, String value);
    void set(String key, String value, long timeout, TimeUnit timeUnit);
    void del(String key);
}
