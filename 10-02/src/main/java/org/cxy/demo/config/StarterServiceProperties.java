package org.cxy.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 获得配置信息
 */
@ConfigurationProperties("door")
public class StarterServiceProperties {

    private String userStr;

    private boolean enabled;

    public String getUserStr() {
        return userStr;
    }

    public void setUserStr(String userStr) {
        this.userStr = userStr;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
