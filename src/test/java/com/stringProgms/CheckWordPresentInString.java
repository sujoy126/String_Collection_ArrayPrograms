package com.stringProgms;
//18.	WAP to check the given word is present inside a given String or not

import org.testng.annotations.Test;

public class CheckWordPresentInString {
	@Test
	public void m1() {
		String str = "burn your potential jai";
		String st1= "jai";
		String st2[] = str.split(" ");
		for(int i=0; i<st2.length; i++) {
				if(st2[i].equals(st1)) {
					System.out.println(st1+" : is  preasent");
					return;
				}
			}
					System.out.println(st1+" : is not present");
					return;
				
			
		}
	

}
