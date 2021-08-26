package org.cxy.demo.config;

/**
 * 帮助获得配置文件中的白名单
 */
public class StarterService {

    private String userStr;

    public StarterService(String userStr) {
        this.userStr = userStr;
    }

    public String[] split(String separatorChar) {
        return this.userStr.split(separatorChar);
    }

}
