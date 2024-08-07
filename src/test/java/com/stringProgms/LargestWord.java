package com.stringProgms;

import org.testng.annotations.Test;

public class LargestWord {
	@Test
	public  void main() {
		String str = "burn your potential ";
		 String st[] = str.split(" ");
		 String s ="";
		 
		 for(int i=0; i<st.length; i++) {
			 if(st[i].length()>s.length()) {
				 s= st[i];
			 }
		 }
		 System.out.println(s+" : "+s.length());
		
	}

}
