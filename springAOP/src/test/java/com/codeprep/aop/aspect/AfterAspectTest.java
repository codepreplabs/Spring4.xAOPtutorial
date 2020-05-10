package com.codeprep.aop.aspect;

import com.codeprep.aop.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.fail;

@SpringBootTest
public class AfterAspectTest {

    @Autowired
    private Person person;

    @Test
    public void testAfterAdvice(){
        person.afterAspect();
    }
}
