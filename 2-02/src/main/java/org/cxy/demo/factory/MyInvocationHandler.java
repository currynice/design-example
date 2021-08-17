package org.cxy.demo.factory;

import org.cxy.demo.util.ClassLoaderUtils;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

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


    /**
     *
     * @param proxy 目标对象
     * @param method  目标方法
     * @param args     目标参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Method method2 =  ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args));
//        Object invoke = method.invoke(cacheAdapter, args);

        return ICacheAdapter.class.getMethod(method.getName(), ClassLoaderUtils.getClazzByArgs(args)).invoke(cacheAdapter, args);
    }
}
