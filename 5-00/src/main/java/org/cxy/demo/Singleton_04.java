package org.cxy.demo;

/**
 * Description: 内部类（线程安全）
 *
 *  既保证了线程安全，懒加载，不加锁
 *
 *   由JVM 保证线程安全
 *
 * </br>
 * Date: 2021/8/18 15:35
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class Singleton_04 {


    private static class SingletonHolder{

        private static Singleton_04 instance = new Singleton_04();
    }

    private Singleton_04(){

    }


    public static Singleton_04 getInstance(){
        return SingletonHolder.instance;
    }


}
