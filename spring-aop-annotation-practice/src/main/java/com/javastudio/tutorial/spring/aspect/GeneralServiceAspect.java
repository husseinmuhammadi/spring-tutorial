package com.javastudio.tutorial.spring.aspect;

import com.javastudio.tutorial.spring.service.GeneralServiceBase;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GeneralServiceAspect {

    public static final Logger LOGGER = LoggerFactory.getLogger(GeneralServiceAspect.class);

    @Before("execution(* com.javastudio.tutorial.spring.service.GeneralServiceBase+.*(..))")
    public void logBeforeEachServiceCall(JoinPoint joinPoint) {
        LOGGER.info("Before service call");
        LOGGER.info("{}", joinPoint.getTarget());
    }

}
