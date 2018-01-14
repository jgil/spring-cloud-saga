package com.everis.saga.monitor;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MonitorAspect {
    @Around("@annotation(com.everis.saga.SagaStep)")
    public Object monitorEndpoint(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("Started !!!!");
        Object proceed = joinPoint.proceed();
        System.out.println("Completed !!!!");
        return proceed;
    }
}
