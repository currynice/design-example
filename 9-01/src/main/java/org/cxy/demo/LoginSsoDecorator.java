package org.cxy.demo;

import org.example.demo.SsoInterceptor;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Description:   </br>
 * Date: 2021/8/25 13:38
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public class LoginSsoDecorator extends SsoInterceptor {

    private static Map<String, String> authMap = new ConcurrentHashMap<String, String>();

    static {
        authMap.put("huahua", "queryUserInfo");
        authMap.put("doudou", "queryUserInfo");
    }


    @Override
    public boolean preHandle(String request, String response, Object handler) {

       if(!super.preHandle(request,response,handler)){
           return false;
       }

        String userId = request.substring(9);
        String method = authMap.get(userId);

        // 模拟校验
        return "queryUserInfo".equals(method);
    }

}
