package com.stringProgms;
//4.	WAP to count the no. of spaces present in a given String

import org.testng.annotations.Test;

public class CountSpace4 {
	@Test
	public void spaceCountTest() {
		String str = "practice exercise Book";		
		int count=0;
		for(int i=0; i< str.length(); i++) {			
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count);
	}
	
	@Test
	public void spCunt() {
		String st = "burn your potential";
		char ch[]  = st.toCharArray();
		int count =0;
		for(char c: ch) {
			if(c==' ') {
			count++;
			}
		}
		System.out.println(count);
	}
}
