package org.cxy.demo100.goods;


import com.alibaba.fastjson.JSON;

/**
 * 模拟实物商品服务
 */
public class GoodsService {

    /**
     * 发放实物商品
     * @param req
     * @return
     */
    public Boolean deliverGoods(DeliverReq req) {

        System.out.println("模拟发货实物商品一个：" + JSON.toJSONString(req));

        return true;
    }

}
