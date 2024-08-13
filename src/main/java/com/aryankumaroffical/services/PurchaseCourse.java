package com.aryankumaroffical.services;

import com.aryankumaroffical.courses.Course;

public class PurchaseCourse {

	@SuppressWarnings("unused")
	private Course course;

	public boolean proceedWithCourse(Course course) {
		return course.coursePurchased();
	}

}
