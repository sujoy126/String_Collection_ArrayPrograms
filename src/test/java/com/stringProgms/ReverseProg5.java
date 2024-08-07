package com.stringProgms;
//5.	WAP to reverse a String

import org.testng.annotations.Test;

public class ReverseProg5 {
	@Test
	public void reverseProgram() {
		String str = "letter";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}
	@Test
	public void m1() {
		String str = "belive";
		String s ="";
		char ch[]= str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			s = s+ch[i];
		}
		System.out.println(s);
	}

}
