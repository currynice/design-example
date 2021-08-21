package org.cxy.demo.service.engine.impl;


import org.cxy.demo.model.aggregates.TreeRich;
import org.cxy.demo.model.vo.EngineResult;
import org.cxy.demo.model.vo.TreeNode;
import org.cxy.demo.service.engine.EngineBase;
import java.util.Map;

public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
