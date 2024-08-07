package com.stringProgms;

//19.	WAP to check whether the given String is Anagram or not

import java.util.Arrays;

import org.testng.annotations.Test;

public class AnagrmProg {
	@Test
	public void m1() {
		String st1 ="silent";
		String st2 ="liste";
		
		char ch1[] = st1.toCharArray();
		char ch2[] = st2.toCharArray();
		
		 Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)) {
			System.out.println(st1+" is an anagram");
			return;
		}
		else
			System.out.println(st1+" is not an anagram");
		return;
		
		
	}

}
