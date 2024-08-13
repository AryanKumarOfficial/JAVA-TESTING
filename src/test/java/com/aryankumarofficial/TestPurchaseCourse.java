package com.aryankumarofficial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.aryankumaroffical.courses.JavaCourse;
import com.aryankumaroffical.services.PurchaseCourse;

class TestPurchaseCourse {

	@Test
	void testProceedWithCourse() {
		PurchaseCourse pc = new PurchaseCourse();
		boolean status = pc.proceedWithCourse(new JavaCourse());
//		assertTrue(status);
		assertFalse(status);
	}

}
