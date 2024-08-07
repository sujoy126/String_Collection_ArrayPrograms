package com.arraysprogs;
//4.	WAP to find the average of the elements in a given Array

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class AverageOfElement_4 {
	@Test
	public void m1() {
		int ary[] = { 2, 4, 13 };
		double sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum = sum + ary[i];
		}
		double avg = sum / ary.length;
		System.out.println(avg);

	}

// using Map
	@Test
	public void m2() {
		// Example array
		int[] ary = { 7, 6, 3, 2, 4, 5, 0, 5, 24, 6, 2, 4, 4, 4, 5, 5, 6, 66, 6, 5, 5, 4, 4, 3, 9, 2, 5, 6, 4, 6, 7 };

		// Create a map from array indices to values
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ary.length; i++) {
			map.put(i, ary[i]);
		}
		System.out.println(map);

		// Calculate the sum and average manually
		double sum = 0;
		int count = 0;
		for (Integer value : map.values()) {
			sum += value;
			count++;
		}

		double average;
		if (count != 0) {
			average = sum / count;
		} else {
			average = 0;
		}

		// Print result
		System.out.println("The average is: " + average);
	}

	@Test
	public void m3() {
		// Example array
		Integer[] array = { 1, 2, 3, 4, 5 };

		// Convert array to List using Arrays.asList
		List<Integer> list = Arrays.asList(array);

		// Calculate sum of elements using Collections
		double sum = 0;
		for (int num : list) {
			sum += num;
		}

		// Calculate average
		double average = sum / list.size();

		// Print result
		System.out.println("The average is: " + average);
	}

	@Test
	public void m4() {
		int ary[] = { 1, 2, 3, 5, 5 };

		List<Integer> li = new ArrayList<>();
		for (int i : ary) {
			li.add(i);
		}

		double sum = 0;
		for (int num : li) {
			sum = sum + num;
		}
		double avg = sum / li.size();

		System.out.println(avg);

	}

	// using Map
	@Test
	public void m5() {
		// Example array
		int[] ary = { -1, -4, 'A' };

		// Create a map from array indices to values
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < ary.length; i++) {
			map.put(i, ary[i]);
		}
		System.out.println(map);

		// Calculate the sum and average manually
		double sum = 0;
		int count = 0;
		for (int value : map.values()) {
			sum += value;
			count++;
			System.out.println("value " + value);
			System.out.println("count" + count);
		}

		double average;
		average = sum / map.size();
		System.out.println(average);

		if (count != 0) {
			average = sum / count;
		} else {
			average = 0;
		}

		// Print result
		System.out.println("The average is: " + average);
	}

	@Test
	public void m9() {

		Map<String, Integer> m = new HashMap();
				m.put("sujoy", 25);
				m.put("mandol", 27);
				m.put("pavan", 24);
				m.getOrDefault("pavan", 99);
		
				
		
				System.out.println(m);

	}

}
