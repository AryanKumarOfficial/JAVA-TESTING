package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShapesTest {

	Shapes shape  =  new Shapes();
	@Test
	void testComputeSquareArea() {
		assertEquals(576,shape.computeSquareArea(24));
	}
	
	@Test
	void testComputeCircleArea() {
		assertEquals(78.5, shape.computeCircleArea(5),"area of circle calculation failed");
	}

}
