package com.javastudio.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public enum SpringApplication {
    INSTANCE;

    public void getContext(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }
}
