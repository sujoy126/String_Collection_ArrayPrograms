package com.stringProgms;
//21.	WAP to compare two strings lexicographically.
// (Two strings are lexicographically equal if they are the same length 
// and contain the same characters in the same positions)


import org.testng.annotations.Test;

public class Laxicographically {
	@Test
	public void m1() {
		String st1 ="java is a program";
		String st2 ="java is a program";
		if(st1.length()==st2.length() && st1.equals(st2) ) {
			System.out.println(st1+" is a laxicographically");
		}
		else
			System.out.println(st1+" : is not a laxicographically");
		
	}
	@Test
	public void usingCompareTo() {
		
		String s1="java";
		String s2="Java";
	    int lexographic = s1.compareTo(s2);
	 //   System.out.println(lexographic);
	    if(lexographic>0)
	    {
	    	System.out.println(s1+" is greater than  "+s2);
	    }
	    else if(lexographic<0)
	    {
		System.out.println(s1+" is less than "+s2);
		}
	    else if(lexographic==0)
	    {
	    	System.out.println(s1+" is equals to "+s2 +" and both string are lexographic  ");
	    }
	
	}

}
