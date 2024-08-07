package com.stringProgms;
//22.	 WAP to replace a specified character with another character.

import org.testng.annotations.Test;

public class ReplaceCharactor {
	@Test
	public void m1() {
		String str = "apple is ppppppp";
		String st =  str.replace('p', 'b');
		System.out.println(st);
	}

}
