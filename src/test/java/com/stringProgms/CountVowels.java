package com.stringProgms;

import java.util.LinkedHashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class CountVowels {
	@Test
	public void occ3() {

		String str = "programming";
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (Character c : str.toCharArray()) {
			if (map.containsKey(c)) {
				int count = map.get(c) + 1;
				map.put(c, count);
			} else {
				map.put(c, 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

}
