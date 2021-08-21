package org.cxy.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * rules :
 *   man,age < 25 : 小哥哥专属优惠卷
 *   man age >= 25: 男士专属优惠卷
 *
 *   woman,age < 25 : 小姐姐专属优惠卷
 *   woman age >= 25: 女士专属优惠卷
 */
public class EngineController {

    private Logger logger = LoggerFactory.getLogger(EngineController.class);


    /**
     *  营销引擎 逻辑执行
     * @param userId    用户ID （暂时没什么关系）
     * @param gender   用户性别
     * @param age  用户年龄
     * @return    营销结果
     */
    public String process(final String userId, final String gender, final int age) {

        logger.info("ifelse实现方式判断用户获得的优惠卷。userId：{} gender：{} age：{}", userId, gender, age);

        if ("man".equals(gender)) {
            if (age < 25) {
                return "年轻男士专属优惠卷";
            } else  {
                return "商务男士专属优惠卷";
            }
        }

        if ("woman".equals(gender)) {
            if (age < 25) {
                return "小姐姐专属优惠卷";
            } else  {
                return "女士专属优惠卷";
            }
        }

        return null;

    }


}
