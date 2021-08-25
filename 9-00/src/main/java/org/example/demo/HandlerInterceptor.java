package org.example.demo;

public interface HandlerInterceptor {

    boolean preHandle(String request, String response, Object handler);

}
