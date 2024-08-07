package com.stringProgms;
//13.	WAP to remove the white spaces from a given String

import org.testng.annotations.Test;

public class RemoveSpace {
	@Test
	public void m1() {
		String str = " class  mate    ";
		String st = str.replace(" ", "");
		System.out.println(st);		
	}
	@Test
	public void m2() {
		String str = "Remove White space from String ";
		String st[]= str.split(" ");
		for(int i=0; i<st.length; i++) {
			System.out.print(st[i]);
		}
	}
	@Test
	public void m3() {
		String str = "    Remove White   space from String    ";
		char ch[] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(char c: ch) {
			if(!Character.isWhitespace(c)) {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}

}
