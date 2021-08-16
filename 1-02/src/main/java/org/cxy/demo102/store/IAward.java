package org.cxy.demo102.store;

import java.util.Map;

/**
 * Description:   </br>
 * Date: 2021/8/16 14:50
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface IAward {


    /**
     * 发奖接口
     *
     * 无论是实物，自身虚拟（优惠卷） 还是第三方奖品，都通过此接口 规范入参 出参
     *
     * @param uId           用户唯一ID
     * @param awardNumber   奖品编号；sku、couponNumber、cardId
     * @param bizId         业务ID，防重复 (优惠卷需要)
     * @param extMap        扩展信息
     * @throws Exception
     */
    void sendAward(String uId, String awardNumber, String bizId,
                       Map<String, String> extMap) throws Exception;


}
