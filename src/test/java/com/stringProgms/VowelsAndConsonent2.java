package com.stringProgms;

//2.	WAP to print the vowels and consonants in a given String

import org.testng.annotations.Test;

public class VowelsAndConsonent2 {
	@Test
	public void vowelsAndCon() {
		String str ="burn your potential";
		String vowels ="";
		String consonents ="";
		
		for(int i=0; i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch=='A' ||ch=='a' ||ch=='E' ||ch=='e' ||ch=='I' ||ch=='i' ||ch=='O' ||ch=='o' ||ch=='U' ||ch=='u') {
				vowels += ch+" "; 
			}
			else
				consonents += ch+" ";
		}
		System.out.println("vowels are : "+vowels);
		System.out.println("consonents are : "+ consonents);	
	}
	
	@Test
	public void anotherApporch() {
		String str ="the wonderful of science";
		String vowels ="";
		String consonents ="";
		
		char characters[] = str.toCharArray();
		for(char ch: characters) {
			if(ch=='A' ||ch=='a' ||ch=='E' ||ch=='e' ||ch=='I' ||ch=='i' ||ch=='O' ||ch=='o' ||ch=='U' ||ch=='u') {
				vowels += ch+" "; 
			}
			else
				consonents += ch+" ";
		}
		System.out.println("vowels are : "+vowels);
		System.out.println("consonents are : "+ consonents);	
			
		
		
	}

}
