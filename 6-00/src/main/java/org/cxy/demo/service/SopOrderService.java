package org.cxy.demo.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SopOrderService {

    private Logger logger = LoggerFactory.getLogger(PopOrderService.class);



    public long queryUserOrderCount(String userId){
        logger.info("目的：查询用户的自营订单是否为首单：{}", userId);
        return 10L;
    }

}
