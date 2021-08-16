package org.cxy.demo102.store;

import org.cxy.demo102.store.impl.CardAwardService;
import org.cxy.demo102.store.impl.CouponAwardService;
import org.cxy.demo102.store.impl.GoodsAwardService;

/**
 * Description:
 *
 *
 * </br>
 * Date: 2021/8/16 14:53
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class AwardFactory {

    public IAward getAwardService(Integer type){

        //switch or map
        if (null == type){
            return null;
        }
        if (1 == type){
            return new CouponAwardService();
        }
        if (2 == type) {
            return new GoodsAwardService();
        }
        if (3 == type){
            return new CardAwardService();
        }
        throw new RuntimeException("不可用的兑换服务类型");
    }

}
