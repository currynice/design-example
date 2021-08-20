package org.cxy.demo.pay.channel;

import org.cxy.demo.pay.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.math.BigDecimal;



public abstract class Pay {

    protected Logger logger = LoggerFactory.getLogger(Pay.class);

    //组合支付模式
    protected IPayMode payMode;

    /**
     * 构造函数中引入 支付模式
     * @param payMode
     */
    public Pay(IPayMode payMode) {
        this.payMode = payMode;
    }

    /**
     * 交易动作
     * @param uId
     * @param tradeId
     * @param amount
     * @return
     */
    public abstract String transfer(String uId, String tradeId, BigDecimal amount);

}
