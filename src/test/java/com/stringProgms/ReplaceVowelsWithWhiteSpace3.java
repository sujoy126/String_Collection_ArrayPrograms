package com.stringProgms;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class ReplaceVowelsWithWhiteSpace3 {
	@Test
	public void replaceTest() {
		String str = "potential";
		 char ch[] = str.toCharArray();
		//String vowles ="";
		
		for(int i=0; i< ch.length;i++) {		
			if(ch[i]=='A' ||ch[i]=='a' ||ch[i]=='E' ||ch[i]=='e' ||ch[i]=='I' ||ch[i]=='i' ||ch[i]=='O' ||ch[i]=='o' ||ch[i]=='U' ||ch[i]=='u') {
				ch[i]=' ';
			}
		}
		System.out.println(ch);
	}
	
}
