package org.cxy.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Singleton_00 {


    /**
     * cache 会在类初始化时 被初始化，适合仅用于被全局访问,不需要 延迟获取
     */
    public static Map<String,String> cache = new ConcurrentHashMap<>();

}
