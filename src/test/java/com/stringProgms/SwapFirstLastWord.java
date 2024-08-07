package com.stringProgms;
//14.	WAP to swap the first and last word in a given String

import org.testng.annotations.Test;

public class SwapFirstLastWord {
	@Test
	public void m1() {
		String str = "first and last kjak";
		String st[] = str.split(" ");
		
		String st3 = st[st.length-1]+" ";
		for(int i=1; i<st.length-1; i++)
		{
			st3+= st[i]+" ";
		}
	
    st3+=st[0];	
    System.out.println(st3);
	}
	
	@Test
	public void m2() {
		String str = "burn your potential and make it kinetic";
		String st[] = str.split(" ");
		
		String temp = st[0];
		st[0]= st[st.length-1];
		st[st.length-1] = temp;
		
		for(String s: st) {
			System.out.print(s+" ");
		}
	}
		
		@Test
		public void m3() {
			String str = "burn your potential and make it kinetic";
			String st[] = str.split(" ");
			
			String temp = st[0];
			st[0]= st[st.length-1];
			st[st.length-1] = temp;
			System.out.println(String.join(" ", st));
				}
		
		@Test
		public void m4() {
			String st1 = "core";
			String st2 = "java";
			st1 = st1+st2;
		    st2 = st1.substring(0, st1.length()-st2.length());
		    st1 = st1.substring(st2.length());
		    System.out.println(st1);
		    System.out.println(st2);
			
		}
	
}
