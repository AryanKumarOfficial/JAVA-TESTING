package com.aryankumaroffical.courses;

public class JunitCourse implements Course {
	@Override
	public boolean coursePurchased() {
		System.out.println("Junit course purchased");
		return true;
	}

}
