package com.aryankumarofficial;

import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseTest {

	@Test
	public void test() {
		Reverse reverse = new Reverse();
		
		
		assertEquals("avaj", reverse.reverseString("java"));
	}

}
