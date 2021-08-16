package org.cxy.demo102.store.impl;

import com.alibaba.fastjson.JSON;
import org.cxy.demo100.coupon.CouponResult;
import org.cxy.demo100.coupon.CouponService;
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
public class CouponAwardService implements IAward {


    private Logger logger = LoggerFactory.getLogger(CouponAwardService.class);

    private CouponService couponService = new CouponService();


    @Override
    public void sendAward(String uId, String awardNumber, String bizId, Map<String, String> extMap) throws Exception {

        CouponResult couponResult = couponService.sendCoupon(uId, awardNumber, bizId);
        logger.info("请求参数[优惠券] => uId：{} awardNumber：{} bizId：{} extMap：{}", uId, awardNumber, bizId, JSON.toJSON(extMap));
        logger.info("测试结果[优惠券]：{}", JSON.toJSON(couponResult));
        if (!"0000".equals(couponResult.getCode())) throw new RuntimeException(couponResult.getInfo());
    }
}
