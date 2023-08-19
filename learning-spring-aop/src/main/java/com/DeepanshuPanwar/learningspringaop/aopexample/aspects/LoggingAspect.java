package com.DeepanshuPanwar.learningspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

//Configuration
//AOP
@Configuration
@Aspect
public class LoggingAspect {

    private Logger logger = LoggerFactory.getLogger(getClass());

    //PointCut - When ?

    @Before("execution(* com.DeepanshuPanwar.learningspringaop.aopexample.*.*.*(..))")
    public void logMethodCallBeforeExecution(JoinPoint joinPoint) {
        logger.info("Before Aspect - Method is called - {} is called with arguments: {}", joinPoint, joinPoint.getArgs());
    }

    @After("execution(* com.DeepanshuPanwar.learningspringaop.aopexample.*.*.*(..))")
    public void logMethodCallAfterExecution(JoinPoint joinPoint) {
        logger.info("After Aspect - Method is called - {} has executed", joinPoint);
    }

    @AfterThrowing(
            pointcut = "execution(* com.DeepanshuPanwar.learningspringaop.aopexample.*.*.*(..))",
            throwing = "exception")
    public void logMethodCallAfterException(JoinPoint joinPoint, Exception exception) {
        logger.info("AfterThrowing Aspect - {} has thrown an exception {}", joinPoint, exception);
    }

    @AfterReturning(
            pointcut = "execution(* com.DeepanshuPanwar.learningspringaop.aopexample.*.*.*(..))",
            returning = "resultValue")
    public void logMethodCallAfterReturning(JoinPoint joinPoint, Object resultValue) {
        logger.info("AfterReturning Aspect - {} has returned {}", joinPoint, resultValue);
    }

}
