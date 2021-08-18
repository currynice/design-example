package org.cxy.demo;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Description: CAS AtomicReference (线程安全)  </br>
 *
 * AtomicInteger,AtomicBoolean,AtomicLong,AtomicReference 以支持并发访问的数据安全
 *
 * 基于CAS 忙等算法，依赖于底层硬件来实现，但如果没有获取到会一直处于忙等
 *
 * Date: 2021/8/18 15:54
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class Singleton_06 {

    private static final AtomicReference<Singleton_06> INSTANCE_REF = new AtomicReference<>();

    private static Singleton_06 instance;

    private Singleton_06(){

    }

    public static final Singleton_06 getInstance(){
        for(;;){
            Singleton_06 instance = INSTANCE_REF.get();
            if(null !=instance){
                return instance;
            }
            INSTANCE_REF.compareAndSet(null, new Singleton_06());
            return INSTANCE_REF.get();
        }
    }
}
