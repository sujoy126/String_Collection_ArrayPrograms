package com.stringProgms;

//17.	WAP to find the frequency of each and every word in a given String

import org.testng.annotations.Test;

public class FrequencyOfWord {
	@Test
	public void m1() {
		String str = "frequency of word word ";
		String st[] = str.split(" ");
		
		for(int i=0; i< st.length; i++) {
			int count=0;
			for(int j=0; j<st.length; j++) {
				if(st[i].equals(st[j]) && i>j) {
					break;
				}
				if(st[i].equals(st[j])) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(st[i]+" "+count);
			}
		}	
	}
	
	// need solve this program something wrong in the below program
	@Test 
	public void m2() {
		String str = "frequency of word word ";
		String st[] = str.split(" ");
		
		for(String s1: st) {
			int count=0;
			for(String s2: st) {
				if(s1.equals(s2) ) {
					count++;
				}
			}
			if(count>0) {
			System.out.println(s1+" : "+ count);
			}
		}
		}
		
	}


