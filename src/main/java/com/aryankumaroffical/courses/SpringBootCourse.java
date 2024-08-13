package com.aryankumaroffical.courses;

public class SpringBootCourse implements Course {
	
	@Override
	public boolean coursePurchased() {
		System.out.println("SpringBoot course purchased");
		return true;
	}

}
