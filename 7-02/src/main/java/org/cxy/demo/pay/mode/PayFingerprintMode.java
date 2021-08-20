package org.cxy.demo.pay.mode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

public class PayFingerprintMode implements IPayMode{

    protected Logger logger = LoggerFactory.getLogger(PayCypher.class);

    public boolean security(String uId) {
        logger.info("指纹支付，风控校验指纹信息");
        return (new Random().nextDouble()) > 0.5D;
    }


}
