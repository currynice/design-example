package org.cxy.demo;

import org.cxy.demo.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.ArrayList;
import java.util.List;

public class HelloWorldController {

    public UserInfo queryUserInfo(@RequestParam String userId) {

        // 简陋的白名单拦截实现
        List<String> userList = new ArrayList<>();
        userList.add("1001");
        userList.add("aaaa");
        userList.add("ccc");
        if (!userList.contains(userId)) {
            return new UserInfo("1111", "非白名单, 拦截！");
        }

        return new UserInfo("cxy:" + userId, 19, "南京");
    }

}
