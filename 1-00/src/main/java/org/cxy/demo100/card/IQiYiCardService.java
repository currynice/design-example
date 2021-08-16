package org.cxy.demo100.card;

/**
 * 模拟发放 爱奇艺会员卡服务
 */
public class IQiYiCardService {

    /**
     * 发放爱奇艺兑换码
     * @param bindMobileNumber
     * @param cardId
     */
    public void grantToken(String bindMobileNumber, String cardId) {
        System.out.println("模拟发放爱奇艺会员卡一张：" + bindMobileNumber + "，" + cardId);
    }

}
