package org.cxy.demo;

/**
 * Description: 饿汉模式（线程安全）
 * 类加载时生成，但如果全部进行提前初始化，占用内存空间
 *
 * </br>
 * Date: 2021/8/18 15:31
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class Singleton_03 {

    private static Singleton_03 instance = new Singleton_03();

    private Singleton_03(){

    }

    public static Singleton_03 getInstance(){
        return instance;
    }
}
