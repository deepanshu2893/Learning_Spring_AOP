package com.DeepanshuPanwar.learningspringaop.aopexample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
    public void logMethodCall(JoinPoint joinPoint){
        logger.info("Before Aspect - Method is called - {}", joinPoint);
        // Logic - What ?
    }
}
