package org.cxy.demo.service.logic;



import org.cxy.demo.model.vo.TreeNodeLink;
import java.util.List;
import java.util.Map;

/**
 * 定义决策 Filter
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     *
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return 下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLineInfoList);

    /**
     * 获取 决策结果
     *
     * @param decisionMatter 决策物料
     * @return 决策结果
     */
    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

}
