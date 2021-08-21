package org.cxy.demo.service.logic;

import org.cxy.demo.model.vo.TreeNodeLink;
import java.util.List;
import java.util.Map;

/**
 * 基本的决策链实现
 */
public abstract class BaseLogic implements LogicFilter {


    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {
        for (TreeNodeLink nodeLine : treeNodeLinkList) {
            if (decisionLogic(matterValue, nodeLine)){
                return nodeLine.getNodeIdTo();
            }
        }
        return 0L;
    }

    //todo 提供决策值
    @Override
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);


    /**
     * 逻辑决策
     * @param matterValue  待对比项
     * @param nodeLink     决策树
     * @return
     */
    private boolean decisionLogic(String matterValue, TreeNodeLink nodeLink) {
        switch (nodeLink.getRuleLimitType()) {
            case EQUALS:
                return matterValue.equals(nodeLink.getRuleLimitValue());
            case GT:
                return Double.parseDouble(matterValue) > Double.parseDouble(nodeLink.getRuleLimitValue());
            case LT:
                return Double.parseDouble(matterValue) < Double.parseDouble(nodeLink.getRuleLimitValue());
            case EGT:
                return Double.parseDouble(matterValue) >= Double.parseDouble(nodeLink.getRuleLimitValue());
            case ELZ:
                return Double.parseDouble(matterValue) <= Double.parseDouble(nodeLink.getRuleLimitValue());
//            case ENUM:
//                 return false;  //todo
            default:
                return false;
        }
    }

}
