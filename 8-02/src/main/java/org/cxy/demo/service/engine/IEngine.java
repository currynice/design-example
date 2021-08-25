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
     * @param treeId          决策树id
     * @param userId          用户id
     * @param treeRich        决策树
     * @param decisionMatter  其他决策依据
     * @return
     */
    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
