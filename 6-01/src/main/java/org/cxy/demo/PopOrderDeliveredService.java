package org.cxy.demo;

import com.alibaba.fastjson.JSON;
import org.cxy.demo.message.PopOrderMq;



public class PopOrderDeliveredService {

    public void onMessage(String message) {

        PopOrderMq mq = JSON.parseObject(message, PopOrderMq.class);

        /**
         *  deal with the message
         */
        System.out.println("receive a [POPOrderDelivered] message:"+mq);
    }

}
