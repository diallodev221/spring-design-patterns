package com.diallodev.spring_deisgn_patterns;

import com.diallodev.spring_deisgn_patterns.singleton.SingletonA;
import com.diallodev.spring_deisgn_patterns.singleton.SingletonB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

@SpringBootTest
class SpringDesignPatternsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	SingletonB singletonB1;

	@Autowired
	SingletonB singletonB2;

	@Test
	public void testSingleton() {

		SingletonA singletonA1 = SingletonA.getInstance();
		SingletonA singletonA2 = SingletonA.getInstance();

		assertNotNull(singletonA1);
		assertNotNull(singletonA2);

		assertSame(singletonA1, singletonA2);
		assertSame(singletonB1, singletonB2);
	}
}
