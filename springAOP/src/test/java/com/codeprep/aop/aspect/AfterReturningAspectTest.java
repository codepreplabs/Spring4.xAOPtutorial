package com.codeprep.aop.aspect;

import com.codeprep.aop.person.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class AfterReturningAspectTest {

    @Autowired
    Person person;

    @Test
    public void testAfterReturningAdvice(){
        Assertions.assertTrue(person.afterReturningAspect(Boolean.TRUE).getValue());
    }
}
