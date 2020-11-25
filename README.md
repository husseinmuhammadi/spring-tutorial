# Spring Tutorial

Spring starts with 4 base fundamentals
- Spring Context (Spring IoC Container)
- Spring AOP
- Spring Transactions
- Spring MVC

## Spring IoC
### What Is a Spring Context?
Spring contexts are also called Spring IoC containers, which are responsible for instantiating, configuring, and assembling beans by reading configuration metadata from XML, Java annotations, and/or Java code in the configuration files.

## Spring AOP
### Some Common Phrases in Aspect Oriented Programming
#### What is advice, joinpoint or pointcut?
1. An important term in AOP is **advice**. It is the action taken by an **aspect** at a particular join-point.
2. **Joinpoint** is a point of execution of the program, such as the execution of a method or the handling of an exception. In Spring AOP, a joinpoint always represents a method execution.
3. **Pointcut** is a predicate or expression that matches join points.
4. **Advice** is associated with a pointcut expression and runs at any join point matched by the pointcut.
Spring uses the AspectJ pointcut expression language by default.
![Spring AOP](https://howtodoinjava.com/wp-content/uploads/2015/01/spring-aop-diagram.jpg)

### Types of AOP Advices
1. Before advice
2. After returning advice
3. After throwing advice
4. After advice
5. Around advice

#### Old fashion (Spring AOP)
#### New fashion (Spring AspectJ)

### Create a simple project
#### Maven Dependencies
```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.2.7.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context-support</artifactId>
    <version>5.2.7.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-aop</artifactId>
    <version>5.2.7.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjrt</artifactId>
    <version>1.9.5</version>
</dependency>
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.5</version>
</dependency>
```

#### Enable AOP configuration in Spring applications