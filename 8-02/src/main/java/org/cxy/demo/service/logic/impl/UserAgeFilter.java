package org.cxy.demo.service.logic.impl;


import org.cxy.demo.service.logic.BaseLogic;

import java.util.Map;


/**
 * 供年龄节点集成 todo
 */
public class UserAgeFilter extends BaseLogic {



    @Override
    public String matterValue(Long treeId, String userId, Map<String, String> decisionMatter) {
        return decisionMatter.get("age");
    }

}
