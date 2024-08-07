package com.stringProgms;

import org.testng.annotations.Test;

public class FindSubString {
	@Test
	public void m1() {
		String str ="java is programing language";
		String st1 ="ava";
		if(str.contains(st1)) {
			System.out.println(st1+" is present in the given string ");
		}
		else
			System.out.println(st1+" is not present in the given string");		
	}

}
