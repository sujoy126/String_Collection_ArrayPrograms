package com.stringProgms;
//WAP to find the longest Palindromic Substring within a string.

import org.testng.annotations.Test;

public class LongestPalindrome {
	@Test
	public void m1() {
		String str = "mom dad anna teacher";
		String st1[] =str.split(" ");
		String st ="";
		
		for(int i=0; i< st1.length; i++) {
			
			
		}
		
		for(int i=0; i< st1.length; i++) {
			if(st1[i].length()>st.length()) {
				st = st+ st1[i];
			}
		
		}
	}
	
	@Test
	public void longestPalindrome() 
	{
		String s="mam bob hannah level noyttreret contact";
		String[] words  =s.split(" ");
		String lp="";
		
		for(String word:words)
		{
			String sb = new StringBuffer(word).reverse().toString();
			if(sb.equals(word) && sb.length()>lp.length()){
				lp=sb;
				
			}
		}
	
		System.out.println(lp);
	}
}


