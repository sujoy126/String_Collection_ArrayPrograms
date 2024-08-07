package com.stringProgms;
//15.	WAP to reverse the words in a given String without reversing the words themselves

import org.testng.annotations.Test;

public class ReverseWordWithoutReversingThemSelf {
	@Test
	public void m1() {
		String str = "belive in yourself to do someting";
		String st[] = str.split(" ");
		String s="";
		for(int i=st.length-1; i>=0; i--) {
			s = s+st[i]+" ";
		}
		System.out.println(s);
	}
}
