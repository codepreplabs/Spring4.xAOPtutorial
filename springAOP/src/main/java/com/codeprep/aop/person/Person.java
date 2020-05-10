package com.codeprep.aop.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Person implements User {

    private static final Logger LOG = LoggerFactory.getLogger(Person.class);

    public void beforeAspect(){
            LOG.info("method executed after the aspect!");
    }
    
    public void afterAspect(){
        LOG.info("executing afterAspect method");
    }
}
