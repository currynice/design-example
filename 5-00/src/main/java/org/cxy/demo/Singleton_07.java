package org.cxy.demo;

/**
 * Description: 枚举单例  </br>
 *
 * 解决了：线程安全，自由串行化，单例
 *
 * 绝对禁止了对此类进行实例化
 * 但无法应用在存在继承场景下。
 *
 * Date: 2021/8/18 16:04
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public enum Singleton_07 {

    INSTANCE;

    public void test(){
        System.out.println("xxx");
    }


    public static void main(String[] args) {
        Singleton_07.INSTANCE.test();
    }
}
