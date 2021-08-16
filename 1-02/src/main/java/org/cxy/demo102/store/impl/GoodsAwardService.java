package org.cxy.demo102.store.impl;

import com.alibaba.fastjson.JSON;
import org.cxy.demo100.goods.DeliverReq;
import org.cxy.demo100.goods.GoodsService;
import org.cxy.demo102.store.IAward;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

/**
 * Description:   </br>
 * Date: 2021/8/16 14:51
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class GoodsAwardService implements IAward {


    private Logger logger = LoggerFactory.getLogger(GoodsAwardService.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void sendAward(String uId, String awardNumber, String bizId, Map<String, String> extMap) throws Exception {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setUserName(queryUserName(uId));
        deliverReq.setUserPhone(queryUserPhoneNumber(uId));
        deliverReq.setSku(awardNumber);
        deliverReq.setOrderId(bizId);
        deliverReq.setConsigneeUserName(extMap.get("consigneeUserName"));
        deliverReq.setConsigneeUserPhone(extMap.get("consigneeUserPhone"));
        deliverReq.setConsigneeUserAddress(extMap.get("consigneeUserAddress"));

        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, awardNumber, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", isSuccess);

        if (!isSuccess) throw new RuntimeException("实物商品发放失败");
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }

}
