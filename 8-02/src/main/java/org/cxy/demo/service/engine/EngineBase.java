package org.cxy.demo.service.engine;



import org.cxy.demo.model.aggregates.TreeRich;
import org.cxy.demo.model.vo.EngineResult;
import org.cxy.demo.model.vo.TreeNode;
import org.cxy.demo.model.vo.TreeRoot;
import org.cxy.demo.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Map;


public abstract class EngineBase extends EngineConfig implements IEngine {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);


    /**
     * 执行流程供外部实现
     * @param treeId
     * @param userId
     * @param treeRich
     * @param decisionMatter
     * @return
     */
    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);


    /**
     * 在 决策树中 找到结果节点
     * @param treeRich
     * @param treeId
     * @param userId
     * @param decisionMatter
     * @return
     */
    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();

        // 编号对应关系
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();


        // 根节点ID
        Long rootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNodeInfo = treeNodeMap.get(rootNodeId);
        //节点类型[NodeType]；1子叶、2结果
        while (treeNodeInfo.getNodeType().equals(1)) {
            String ruleKey = treeNodeInfo.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNodeInfo.getTreeNodeLinkList());
            treeNodeInfo = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId：{} treeId：{} treeNode：{} ruleKey：{} matterValue：{}", treeRoot.getTreeName(), userId, treeId, treeNodeInfo.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNodeInfo;
    }

}
