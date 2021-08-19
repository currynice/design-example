package org.cxy.demo;

import com.alibaba.fastjson.JSON;
import org.cxy.demo.message.SopOrderMq;


/**
 * 自营
 */
public class SopOrderMqService {

    public void onMessage(String message) {

        SopOrderMq mq = JSON.parseObject(message, SopOrderMq.class);

        /**
         *  deal with the message
         */
        System.out.println("receive a [SopOrderMq] message:"+mq);
    }

}
