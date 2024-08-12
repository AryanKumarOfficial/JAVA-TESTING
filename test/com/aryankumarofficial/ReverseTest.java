package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	Reverse reverse = new Reverse();
	@Test
	void testReverse_OneWord() {
		assertEquals("nayra",reverse.reverseString("aryan"));
	}
	
	
	@Test
	void testReverse_MultipleWord() {
		assertEquals("tnempoleveD kcatS lluF avaJ",reverse.reverseString("Java Full Stack Development"));
		
	}

}
