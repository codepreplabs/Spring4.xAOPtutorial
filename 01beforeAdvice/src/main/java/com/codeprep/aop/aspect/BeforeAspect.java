package com.codeprep.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BeforeAspect {

    private static final Logger logger = LoggerFactory.getLogger(BeforeAspect.class);

    @Before("execution(public * com.codeprep.aop.person.Person.findById())")
    public void beforeFindById(JoinPoint joinPoint){
        logger.info("executed the before aspect ***** ");
    }
}
