package org.cxy.demo.service.engine;

import org.cxy.demo.model.aggregates.TreeRich;
import org.cxy.demo.model.vo.EngineResult;
import java.util.Map;


/**
 * 决策引擎接口，后续可以拓展出不同的决策引擎
 */
public interface IEngine {

    /**
     * 执行，根据入参进行判断
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter  其他依据入参
     * @return
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
