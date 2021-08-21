package org.cxy.demo.service.engine;


import org.cxy.demo.service.logic.LogicFilter;
import org.cxy.demo.service.logic.impl.UserAgeFilter;
import org.cxy.demo.service.logic.impl.UserGenderFilter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 引擎配置 ，决策服务节点的数据源 ,继承即可使用此数据源
 */
public class EngineConfig {


    static Map<String, LogicFilter> logicFilterMap;

    static {
        logicFilterMap = new ConcurrentHashMap<>();
        logicFilterMap.put("userAge", new UserAgeFilter());
        logicFilterMap.put("userGender", new UserGenderFilter());
    }

    public Map<String, LogicFilter> getLogicFilterMap() {
        return logicFilterMap;
    }

    public void setLogicFilterMap(Map<String, LogicFilter> logicFilterMap_) {

        logicFilterMap = logicFilterMap_;
    }

}
