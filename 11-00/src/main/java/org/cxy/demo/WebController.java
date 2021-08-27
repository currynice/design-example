package org.cxy.demo;

import java.util.Date;

/**
 * Description:   </br>
 * Date: 2021/8/27 11:18
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class WebController {

    public Activity queryActivityInfo(Long id) {
        // 模拟从接口中获取活动信息
        Activity activity = new Activity();
        activity.setId(id);
        activity.setName("图书嗨乐");
        activity.setDesc("图书优惠券分享激励活动第二期");
        activity.setStartTime(new Date());
        activity.setStopTime(new Date());
        activity.setStock(new Stock(1000,1));
        return activity;
    }


}
