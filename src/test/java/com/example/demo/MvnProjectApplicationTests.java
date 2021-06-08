package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MvnProjectApplicationTests {

	@Test
	void checkTrue() {
		assertTrue(Application.shouldReturnTrue());
	}

	@Test
	void isHello() {
		assertEquals("hello", Application.sayHello());
	}

}
