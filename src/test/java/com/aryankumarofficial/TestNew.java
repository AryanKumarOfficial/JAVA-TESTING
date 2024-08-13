package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestNew {

	Shapes shape = new Shapes();

	@Test
	void testComputeSquareArea() {
//		 if the test case passes then only it fails
		assertNotEquals(5764, shape.computeSquareArea(24));
	}

	@Test
	void testComputeSquareArea_WithMessage() {
		assertNotEquals(576, shape.computeSquareArea(24), "Message to the dev if test case fails");

	}

	@Test
	void testComputeSquareArea_Supplier() {
		assertNotEquals(576, shape.computeSquareArea(24), () -> "Message to the dev if test case fails");

	}

}
