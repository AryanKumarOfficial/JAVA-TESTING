package com.aryankumaroffical;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestBeforeAfter {

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
