package com.stringProgms;
//6.	WAP to check whether the given the String is Palindrome or not

import org.testng.annotations.Test;

public class Palendromprog6 {
	@Test
	public void palendromP(){
		String str ="anna";
		
		String rev ="";
		for(int i=str.length()-1; i>=0; i--) {
			char ch = str.charAt(i);
			rev = rev +ch;
		}
		if(str.equals(rev)) {
			System.out.println(str+" is a palendrom number");
		}
		else
			System.out.println(str+" is not a palendrom number");
	}

}
