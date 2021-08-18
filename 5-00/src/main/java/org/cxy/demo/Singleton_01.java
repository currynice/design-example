package org.cxy.demo;

/**
 * Description: 懒汉式 (线程不安全)  </br>
 * Date: 2021/8/18 15:20
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class Singleton_01 {

    private static Singleton_01 instance;

    /**
     * 单例模式特点之一是不允许外部直接创建，因此使用private修饰
     */
    private Singleton_01(){

    }

    /**
     * 线程不安全，仅实现了延迟，不保证单例
     * @return
     */
    public static Singleton_01 getInstance(){
        if(null != instance){
            return instance;
        }
        instance = new Singleton_01();
        return instance;
    }

}
