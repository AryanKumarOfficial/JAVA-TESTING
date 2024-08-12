package com.aryankumarofficial;

public class Reverse {
	public String reverseString(String str) {
		char [] charArray = str.toCharArray();
		int left =0;
		int right = charArray.length-1;
		while(left<right) {
			// swap character at left and right position
			char temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right] = temp;
			left++;
			right--;
		}
		
		return new String(charArray);
	}

}
