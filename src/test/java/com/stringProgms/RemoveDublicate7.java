package com.stringProgms;
//7.	WAP to remove the duplicates from the given String

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

public class RemoveDublicate7 {
	@Test
	public void Dublicate() {
		String str = "sceeeeee";
		StringBuffer sb = new StringBuffer();
		Set<Character> s = new HashSet<>();
		for(int i=0; i<str.length(); i++) {
			 s.add(str.charAt(i));
		}
		for(char c: s) {
			sb.append(c);
		}
		System.out.println(sb);
	}
	
	@Test
	public void m1() {
		String st = "classs";
		char ch[] = st.toCharArray();
		StringBuilder sb = new StringBuilder();
		Set<Character> s = new LinkedHashSet<>();
		for(char c: ch) {
			s.add(c);
		}
		for(char h: s) {
			sb.append(h);
		}
		System.out.println(sb);
		
	}
	@Test
	public void m2() {
		String s1 = "gggggaaabbbbcccc";
		
		Map<Character, String> hs = new LinkedHashMap<>();

		for (int i = 0; i < s1.length(); i++) {
			
			hs.put(s1.charAt(i), null);
		}
		System.out.println(hs.keySet());
		
	}
	

}
