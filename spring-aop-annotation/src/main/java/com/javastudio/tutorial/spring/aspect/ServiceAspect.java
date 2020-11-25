package com.javastudio.tutorial.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ServiceAspect.class);

    @Before("execution(* com.javastudio.tutorial.spring.service.ProductServiceImpl+.*(..))") // point-cut expression
    public void logBeforeProductServiceImpl() {
        LOGGER.info("---> Before Product Service Impl Method");
    }

    @After("execution(* com.javastudio.tutorial.spring.api.ProductService+.*(..))") // point-cut expression
    public void logAfterProductService() {
        LOGGER.info("---> After Product Service Method");
    }

    @After("execution(* com.javastudio.tutorial.spring.service.GeneralServiceBase+.*(..))") // point-cut expression
    public void logAfterGeneralServiceBase() {
        LOGGER.info("---> After General Service Method");
    }
}

