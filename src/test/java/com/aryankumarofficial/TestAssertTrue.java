package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestAssertTrue {

	@Test
	void test() {
//		String str  ="Junit";
//		assertTrue(str.equals("Junit"));

		String str = "Junit5";
		assertFalse(str.length() < 5);
	}

}
