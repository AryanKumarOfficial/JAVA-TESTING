package com.aryankumaroffical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestBeforeAfter {

	TestBeforeAfter() {
		System.out.println("Test obj is created before the test method is invocked!");
	}

	@BeforeAll
	void beforeAll() {
		System.out.println("Before all tests");
	}

	@AfterAll
	void afterAll() {
		System.out.println("after all tests");
	}

	Shapes shapes;

	@BeforeEach
	void init() {
		shapes = new Shapes();
		System.out.println("Before test");
	}

	@Test
	void testComputeSquareArea() {
		assertEquals(78.5, shapes.computeCircleArea(5));
		System.out.println("actual test");
	}

	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shapes.computeCircleArea(5));
		System.out.println("actual test");

	}

	@AfterEach
	void destroy() {
		System.out.println("after test");
	}

}
