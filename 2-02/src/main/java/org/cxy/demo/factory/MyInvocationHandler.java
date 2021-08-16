package org.cxy.demo.factory;

import org.cxy.demo.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:   </br>
 * Date: 2021/8/16 16:47
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class MyInvocationHandler implements InvocationHandler {

    private ICacheAdapter cacheAdapter;

    public MyInvocationHandler(ICacheAdapter cacheAdapter) {
        this.cacheAdapter = cacheAdapter;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
