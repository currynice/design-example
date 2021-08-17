package org.cxy.demo;

/**
 * Description:   </br>
 * Date: 2021/8/17 15:15
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public interface IMenu {

    /**
     * 添加吊顶
     */
    IMenu appendCeiling(Matter matter);

    /**
     * 添加涂料
     */
    IMenu appendCoat(Matter matter);

    /**
     * 添加地板
     */
    IMenu appendFloor(Matter matter);

    /**
     * 添加地砖
     */
    IMenu appendTile(Matter matter);

    /**
     * 获得当前明细
     */
    String getDetail();
}
