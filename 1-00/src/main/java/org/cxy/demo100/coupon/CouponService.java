package org.cxy.demo100.coupon;

/**
 * 模拟优惠券服务
 */
public class CouponService {

    /**
     * 发优惠卷
     * @param uId
     * @param couponNumber
     * @param uuid
     * @return
     */
    public CouponResult sendCoupon(String uId, String couponNumber, String uuid) {
        System.out.println("模拟发放优惠券一张：" + uId + "," + couponNumber + "," + uuid);
        return new CouponResult("0000", "发放成功");
    }

}
