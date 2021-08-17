package org.cxy.demo;

import java.math.BigDecimal;

/**
 * Description: 物料  </br>
 * Date: 2021/8/17 14:37
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface Matter {


    /**
     *  种类
     * @return
     */
    String scene();

    /**
     * 品牌
     * @return
     */
    String brand() ;

    /**
     * 型号
     */
    String model();

    /**
     * 每平米价格
     * @return
     */
    BigDecimal price();

    /**
     * 描述
     * @return
     */
    String desc();
}
