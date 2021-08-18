package org.cxy.demo;

/**
 * Description: 懒汉式 (线程安全)  </br>
 * Date: 2021/8/18 15:28
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class Singleton_02 {

    private static Singleton_02 instance;


    /**
     * 单例模式特点之一是不允许外部直接创建，因此使用private修饰
     */
    private Singleton_02(){

    }


    /**
     * 线程安全，不建议使用
     * @return
     */
    public static synchronized Singleton_02 getInstance(){
        if(null != instance){
            return instance;
        }
        instance = new Singleton_02();
        return instance;
    }

}
