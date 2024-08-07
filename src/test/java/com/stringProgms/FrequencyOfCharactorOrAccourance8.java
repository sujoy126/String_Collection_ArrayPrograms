package com.stringProgms;
//8.	WAP to find the frequency of character in a given String 

import org.testng.annotations.Test;

public class FrequencyOfCharactorOrAccourance8 {
	@Test
	public void m1() {
		String str = "anna kln  ak";
		
		for(int i=0; i<str.length(); i++) {
			int count=0;
			char ch1 = str.charAt(i);
			for(int j=0; j<str.length(); j++) {
				char ch2 = str.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" : "+ count);
			}
		}
	}
		@Test
		public void m2() {
			String str = "mom";
			for(int i=0; i<str.length(); i++) {
				
				int count=0;
				for(int j=0; j<str.length(); j++) {
					if(str.charAt(i)== str.charAt(j) && i>j) {
						break;
					}
				 if(str.charAt(i)==str.charAt(j)) {
						count++;
					}
				}
				if(count>0) {
					System.out.println(str.charAt(i)+" "+ count);
				}
				}
			}
		@Test
		public void m3() {
			String str ="abcd abcd class";
				
				for(int i=0; i<str.length(); i++) {
					int count= 0;
					char ch1 =str.charAt(i);
					
					if(ch1!=' ') {
						
				 for(int j=0;j<str.length(); j++) {
					 char ch2= str.charAt(j);
					 if(ch1==ch2 && i>j) {
						 break;
					 }
					 else if(ch1==ch2) {
						 count++;
					 }
				 }
				 if(count>0) {
					 System.out.println(ch1+" : "+count);
				 }
				}
			}
			
		}
		
	

}
