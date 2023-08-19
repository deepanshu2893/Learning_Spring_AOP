package com.DeepanshuPanwar.learningspringaop.aopexample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointCutConfig {

    @Pointcut("execution(* com.DeepanshuPanwar.learningspringaop.aopexample.*.*.*(..))")
    public void businessAndDataPackageConfig(){
    }
    @Pointcut("execution(* com.DeepanshuPanwar.learningspringaop.aopexample.business.*.*(..))")
    public void businessPackageConfig(){
    }
    @Pointcut("execution(* com.DeepanshuPanwar.learningspringaop.aopexample.data.*.*(..))")
    public void dataPackageConfig(){
    }

    @Pointcut("bean(*Service*)")
    public void allPackageConfigUsingBean(){

    }

    @Pointcut("@annotation(com.DeepanshuPanwar.learningspringaop.aopexample.annotations.TrackTime)")
public void trackTimeAnnotation(){

    }
}
