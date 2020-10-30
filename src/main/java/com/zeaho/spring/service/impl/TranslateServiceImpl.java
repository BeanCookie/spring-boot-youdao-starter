package com.zeaho.spring.service.impl;

import com.zeaho.spring.config.YouDaoTranslateProperties;
import com.zeaho.spring.service.TranslateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author LuZhong
 */
public class TranslateServiceImpl implements TranslateService {
    private final Logger logger = LoggerFactory.getLogger(TranslateServiceImpl.class);
    private final YouDaoTranslateProperties youDaoTranslateProperties;

    public TranslateServiceImpl(YouDaoTranslateProperties youDaoTranslateProperties) {
        this.youDaoTranslateProperties = youDaoTranslateProperties;
    }
    @Override
    public String translate(String text) {
        logger.info("{} {} {}", youDaoTranslateProperties.getAppKey(), youDaoTranslateProperties.getAppSecret(), youDaoTranslateProperties.getYoudaoUrl());
        return String.format("translate: %s", text);
    }
}
