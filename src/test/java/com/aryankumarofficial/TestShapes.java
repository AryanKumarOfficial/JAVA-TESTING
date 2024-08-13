package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class TestShapes {

	Shapes shapes = new Shapes();

	@Test
	void test() {
		assertEquals(6, 6);
	}

	@Test
	void testComputeSquareArea() {
		assertEquals(576, shapes.computeSquareArea(24));
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shapes.computeCircleArea(5),"area of circle calculation went wrong!");
	}
	
	@Test
	void testComputeCircleArea_Supplier() {
		assertEquals(78.5, shapes.computeCircleArea(5),()->"area of circle is wrongly calculated");
	}

}
