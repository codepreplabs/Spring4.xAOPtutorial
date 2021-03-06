package com.codeprep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterAspect {

    private static final Logger LOG = LoggerFactory.getLogger(AfterAspect.class);

    @After("execution(public * com.codeprep.aop.person.Person.afterAspect())")
    public void afterAspect(JoinPoint joinPoint){
        LOG.info("executed the after aspect ***** ");
    }
}
