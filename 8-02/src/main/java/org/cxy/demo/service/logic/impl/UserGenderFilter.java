package org.cxy.demo.service.logic.impl;


import org.cxy.demo.service.logic.BaseLogic;
import java.util.Map;


/**
 * 供性别节点集成 todo
 */
public class UserGenderFilter extends BaseLogic {


    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("gender");
    }

}
