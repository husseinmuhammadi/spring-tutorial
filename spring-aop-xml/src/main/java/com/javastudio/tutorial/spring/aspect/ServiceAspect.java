package com.javastudio.tutorial.spring.aspect;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAspect.class);

    public void logBeforeService() {
        LOGGER.info("---> Before Service Method");
    }

    public void logAfterService() {
        LOGGER.info("---> After Service Method");
    }
}
