package org.cxy.demo.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Description: 抽象工厂代理类   </br>
 * Date: 2021/8/16 16:42
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class MyProxy {


    /**
     * 运行时创建一个动态代理类 及其实例对象 ,实现给定接口interfaceClass的新类（也称“动态代理类”）及其实例（对象）,代理的是接口(Interfaces)
     * @param interfaceClass
     * @param cacheAdapter
     * @param <T>
     * @return
     * @throws Exception
     */
    public static <T> T getProxy(Class<T> interfaceClass, ICacheAdapter cacheAdapter) throws Exception {
        InvocationHandler handler = new MyInvocationHandler(cacheAdapter);
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Class<?>[] classes = interfaceClass.getInterfaces();

        // 类加载器 , proxyClass 的实现接口（这里是 interface org.cxy.demo.CacheService ） , InvocationHandler
        Object proxy = Proxy.newProxyInstance(classLoader, new Class[]{classes[0]}, handler);
        return (T)proxy;
    }
}
