package com.codeprep.aop.aspect;

import com.codeprep.aop.io.ResultDTO;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturningAspect {

    private static final Logger LOG = LoggerFactory.getLogger(AfterReturningAspect.class);

    @AfterReturning(value = "execution(public * com.codeprep.aop.person.Person.afterReturning*(*))", returning = "result")
    public void afterReturningAspect(JoinPoint joinPoint, ResultDTO result){
        LOG.info("inside the after returning advice! with value {}", result.getValue());
    }
}
