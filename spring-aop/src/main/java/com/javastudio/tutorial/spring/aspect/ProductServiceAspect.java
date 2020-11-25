package com.javastudio.tutorial.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ProductServiceAspect {
    private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceAspect.class);

    @Pointcut("execution(* com.javastudio.tutorial.spring.service.ProductServiceImpl+.*(..))") // point-cut expression
    public void p() { // pointcut name
    }

    @Before("p()")
    public void logBeforeService() {
        LOGGER.info("---> Before Product Service Method");
    }
    @After("p()")
    public void logAfterService() {
        LOGGER.info("---> After Product Service Method");
    }

}
