package com.stringProgms;
//16.	WAP to reverse each and every word in a given String

import org.testng.annotations.Test;

public class ReverseEachAndEveryWord {
	@Test
	public void m1() {
		String str = "reverse each and every word";
		char ch[] = str.toCharArray();
		String st = "";
		for(int i=ch.length-1; i>=0; i--) {
			st = st+ch[i];
		}
		System.out.println(st);
	}

}
