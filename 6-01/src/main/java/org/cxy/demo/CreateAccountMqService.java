package org.cxy.demo;

import com.alibaba.fastjson.JSON;
import org.cxy.demo.message.CreateAccountMq;


/**
 * 接收到 {@link CreateAccountMq} 消息后的实现
 */
public class CreateAccountMqService {

    public void onMessage(String message) {

        CreateAccountMq mq = JSON.parseObject(message, CreateAccountMq.class);

        /**
         *  deal with the message
         */
        System.out.println("receive a [CreateAccount] message:"+mq);
    }

}
