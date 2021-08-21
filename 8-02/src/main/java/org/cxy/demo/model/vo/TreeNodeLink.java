package org.cxy.demo.model.vo;

/**
 * 规则树线信息
 */
public class TreeNodeLink {

    private Long nodeIdFrom;        //节点From
    private Long nodeIdTo;          //节点To
    private RuleLimitType ruleLimitType;  //限定类型；1:=;2:>;3:<;4:>=;5<=;6:enum[todo 枚举]
    private String ruleLimitValue;  //限定值

    public Long getNodeIdFrom() {
        return nodeIdFrom;
    }

    public void setNodeIdFrom(Long nodeIdFrom) {
        this.nodeIdFrom = nodeIdFrom;
    }

    public Long getNodeIdTo() {
        return nodeIdTo;
    }

    public void setNodeIdTo(Long nodeIdTo) {
        this.nodeIdTo = nodeIdTo;
    }

    public RuleLimitType getRuleLimitType() {
        return ruleLimitType;
    }

    public void setRuleLimitType(RuleLimitType ruleLimitType) {
        this.ruleLimitType = ruleLimitType;
    }

    public String getRuleLimitValue() {
        return ruleLimitValue;
    }

    public void setRuleLimitValue(String ruleLimitValue) {
        this.ruleLimitValue = ruleLimitValue;
    }
}
