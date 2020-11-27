package com.javastudio.tutorial.spring.aspect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
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
        LOGGER.info("Before service call: " + printJson(joinPoint));

    }

    private String printJson(JoinPoint joinPoint) {
        ObjectMapper mapper = new ObjectMapper();
        ObjectNode root = mapper.createObjectNode();

        root.put("joinPoint", joinPoint.toString());
        root.put("joinPointShortString", joinPoint.toShortString());
        root.put("joinPointLongString", joinPoint.toLongString());
        root.put("target", joinPoint.getTarget().getClass().getName());
        root.put("kind", joinPoint.getKind());
        root.put("this", joinPoint.getThis().toString());
        root.put("signature", joinPoint.getSignature().toLongString());
        root.put("sourceLocation", joinPoint.getSourceLocation().toString());

        /*
        ObjectNode sourceLocationNode = mapper.createObjectNode();
        sourceLocationNode.put("fileName", joinPoint.getSourceLocation().getFileName());
        sourceLocationNode.put("line", joinPoint.getSourceLocation().getLine());
        sourceLocationNode.put("withinType", joinPoint.getSourceLocation().getWithinType().getName());
         */

        try {
            String jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(root);
            return jsonString;
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    @Around("execution (* com.javastudio.tutorial.spring.api.ProductService.findById(..))")
    public Object logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        LOGGER.info("in around before " + proceedingJoinPoint);
        Object result = null;
        try {
            result = proceedingJoinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException("Throwing Custom business exception from around");
        } finally {
        }
        LOGGER.info("in around after " + proceedingJoinPoint + " with result is " + result);
        return result;
    }
}
