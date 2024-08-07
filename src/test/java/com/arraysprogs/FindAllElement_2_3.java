package com.arraysprogs;
//2.	WAP to print the elements present in an Array using for loop

import org.testng.annotations.Test;

public class FindAllElement_2_3 {
	@Test
	public void m1() {
		int ary[]= {4,6,8,1,2,5};
		for(int i=0; i<ary.length; i++) {
			System.out.println(ary[i]);
		}
	}
	
//3.	WAP to print the elements present in an Array using for each loop
	@Test
	public void m2() {
		char ary[]= {'a','b','c','d'};
		for(char i: ary) {
			System.out.println(i);
		}
	}

}
