package com.zeaho.spring.config;

import com.zeaho.spring.service.TranslateService;
import com.zeaho.spring.service.impl.TranslateServiceImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author LuZhong
 */
@Configuration
@ConditionalOnClass(TranslateService.class)
@EnableConfigurationProperties(YouDaoTranslateProperties.class)
public class YouDaoTranslateAutoConfiguration {
    @Resource
    private YouDaoTranslateProperties youDaoTranslateProperties;

    @Bean
    @ConditionalOnMissingBean(TranslateService.class)
    public TranslateService translateService() {
        return new TranslateServiceImpl(youDaoTranslateProperties);
    }
}
