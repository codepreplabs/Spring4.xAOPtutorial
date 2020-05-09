package com.codeprep.aop.person;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Person implements User {

    private static final Logger logger = LoggerFactory.getLogger(Person.class);

    public void beforeAspect(){
            logger.info("method executed after the aspect!");
    }
}
