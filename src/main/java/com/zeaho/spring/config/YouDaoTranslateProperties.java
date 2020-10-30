package com.zeaho.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author lzzz
 */
@ConfigurationProperties("youdao")
public class YouDaoTranslateProperties {
    private String appKey;
    private String appSecret;
    private String youdaoUrl;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getYoudaoUrl() {
        return youdaoUrl;
    }

    public void setYoudaoUrl(String youdaoUrl) {
        this.youdaoUrl = youdaoUrl;
    }
}
