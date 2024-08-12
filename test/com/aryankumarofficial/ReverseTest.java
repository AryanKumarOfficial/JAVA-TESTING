package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void test() {

		Reverse reverse = new Reverse();
		assertEquals("nayra", reverse.reverseString("aryan"));
		assertEquals("edoc", reverse.reverseString("code"));
		
	}

}
