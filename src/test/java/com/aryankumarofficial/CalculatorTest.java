package com.aryankumarofficial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
		int output =calculator.divide(10, 5);
		int expectedResult = 2;
		assertEquals(expectedResult,output);
	}

}
