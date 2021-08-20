package org.cxy.demo.pay.mode;

public interface IPayMode {

    /**
     * 支付模式校验
     * @param uId
     * @return
     */
    boolean security(String uId);

}
