package com.aryankumaroffical.courses;

public class JavaCourse implements Course {
	@Override
	public boolean coursePurchased() {
		System.out.println("Java course purchased");
		System.out.println("It's not connecting to DB hence result in false");
		return false;
	}

}
