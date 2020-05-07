package com.codeprep.aop;

import com.codeprep.aop.person.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Autowired
	private Person person;

	@Test
	void contextLoads() {
		person.findById();
	}

}
