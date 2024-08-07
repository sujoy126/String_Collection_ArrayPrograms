package com.arraysprogs;
//5.	WAP to copy one Array elements to another Array in the reverse order

import org.testng.annotations.Test;

public class ReverseOrderProg_5 {
	@Test
	public void m1() {
		int a[] = {9,8,7,6,5};
		int b[] = new int[a.length];
		
		for(int i=0; i<a.length; i++) {
			b[i] = a[a.length-1-i];
		}
		for(int j : b) {
			System.out.println(j);
		}
	}

}
