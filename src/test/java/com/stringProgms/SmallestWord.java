package com.stringProgms;

import org.testng.annotations.Test;

public class SmallestWord {
	@Test
	public void smallestW() {
		String str = "burn your potential and convert in Kinetic";
		String st[] =  str.split(" ");
		String s=st[0];
		for(int i=0; i< st.length; i++) {
			if(st[i].length()<s.length()) {
				s= st[i];
			}
		}
		System.out.println(s);
		
	}

}
