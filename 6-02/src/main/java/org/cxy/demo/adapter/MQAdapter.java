package org.cxy.demo.adapter;

import com.alibaba.fastjson.JSON;
import org.cxy.demo.entity.RebateInfo;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/**
 * Description: 把不同类型的属性，映射成适配后的对象
 *
 * </br>
 * Date: 2021/8/19 13:13
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class MQAdapter {



    public static RebateInfo filter(String strJson, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        return filter(JSON.parseObject(strJson, Map.class), link);
    }

    public static RebateInfo filter(Map obj, Map<String, String> link) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(link.get(key));
            RebateInfo.class.getMethod("set" + key.substring(0, 1).toUpperCase() + key.substring(1), String.class).invoke(rebateInfo, val.toString());
        }
        return rebateInfo;
    }

}
