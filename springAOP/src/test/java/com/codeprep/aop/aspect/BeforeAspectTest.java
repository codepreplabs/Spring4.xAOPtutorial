package com.codeprep.aop.aspect;

import com.codeprep.aop.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeforeAspectTest {

    @Autowired
    private Person person;

    @Test
    void testBeforeAspect() {
        person.findById();
    }
}
