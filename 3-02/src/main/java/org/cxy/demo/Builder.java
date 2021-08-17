package org.cxy.demo;

import org.cxy.demo.ceiling.LevelOneCeiling;
import org.cxy.demo.ceiling.LevelTwoCeiling;
import org.cxy.demo.coat.DuluxCoat;
import org.cxy.demo.coat.LiBangCoat;
import org.cxy.demo.floor.ShengXiangFloor;
import org.cxy.demo.tile.DongPengTile;
import org.cxy.demo.tile.MarcoPoloTile;


/**
 * 预设如下基础套餐
 */
public class Builder {


    public static IMenu levelOne(Double area) {
        return new DecorationPackageMenu(area, "豪华欧式")
                .appendCeiling(new LevelTwoCeiling())    // 吊顶，二级顶
                .appendCoat(new DuluxCoat())             // 涂料，多乐士
                .appendFloor(new ShengXiangFloor());     // 地板，圣象
    }

    public static IMenu levelTwo(Double area){
        return new DecorationPackageMenu(area, "轻奢田园")
                .appendCeiling(new LevelTwoCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new MarcoPoloTile());       // 地砖，马可波罗
    }

    public static IMenu levelThree(Double area){
        return new DecorationPackageMenu(area, "现代简约")
                .appendCeiling(new LevelOneCeiling())   // 吊顶，二级顶
                .appendCoat(new LiBangCoat())           // 涂料，立邦
                .appendTile(new DongPengTile());        // 地砖，东鹏
    }

}
