package org.cxy.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PopOrderService {

    private Logger logger = LoggerFactory.getLogger(PopOrderService.class);

    public boolean isFirstOrder(String uId) {
        logger.info("目的：查询用户的POP订单是否为首单：{}", uId);
        return true;
    }

}
