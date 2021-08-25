package org.cxy.demo;

import org.example.demo.HandlerInterceptor;

/**
 * Description: 装饰器，实现了对 HandlerInterceptor的继承（实现继承）  </br>
 * Date: 2021/8/25 14:01
 *
 * @author :cxy </br>
 * @version : 1.0 </br>
 */
public abstract class SsoDecorator implements HandlerInterceptor {


    private HandlerInterceptor handlerInterceptor;

    public SsoDecorator() {
    }

    /**
     * 通过 构造函数的方式设置 实际使用的 handlerInterceptor
     * @param handlerInterceptor
     */
    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request,response,handler);
    }
}
