package org.cxy.demo.service.engine.impl;


import org.cxy.demo.model.aggregates.TreeRich;
import org.cxy.demo.model.vo.EngineResult;
import org.cxy.demo.model.vo.TreeNode;
import org.cxy.demo.service.engine.EngineBase;
import java.util.Map;
public class TreeEngineHandle extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {

//        treeId:10001__userId:Oli09pLkdjh__decisionMatter:org.cxy.demo.model.aggregates.TreeRich@4c15e7fd09:37:42.954 [main] INFO  o.cxy.demo.service.engine.EngineBase - 决策树引擎=>规则决策树 userId：Oli09pLkdjh treeId：10001 treeNode：11 ruleKey：userGender matterValue：man

        System.out.printf("treeId:%s__userId:%s__decisionMatter:%s",treeId,userId, treeRich, decisionMatter);
        // 决策流程
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        // 决策结果
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }

}
