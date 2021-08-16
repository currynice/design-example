package org.cxy.demo.factory;

import java.util.concurrent.TimeUnit;

/**
 * Description: cache操作的适配接口 (规范了方法名称) </br>
 *
 *
 * 擦出了两个存在差异化的接口  EGMCacheAdapter ̵ IIRCacheAdapter  间的差异
 *
 * Date: 2021/8/16 16:40
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface ICacheAdapter {

    String get(String key);

    void set(String key, String value);

    void set(String key, String value, long timeout, TimeUnit timeUnit);

    void del(String key);


}
