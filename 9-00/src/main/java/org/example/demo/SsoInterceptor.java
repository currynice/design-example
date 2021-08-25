package org.example.demo;



public class SsoInterceptor implements HandlerInterceptor{

    /**
     * 最基本的登录流程
     * @param request
     * @param response
     * @param handler
     * @return
     */
    public boolean preHandle(String request, String response, Object handler) {
        // 获取cookie
        String ticket = request.substring(1, 8);
        // 执行校验
        return ticket.equals("success");
    }

}
