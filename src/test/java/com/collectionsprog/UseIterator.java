package com.collectionsprog;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.Test;

public class UseIterator {
	@Test
	public void remove_numbers_less_than_10( ) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it = numbers.iterator();
	   
	    while(it.hasNext()) {
	      Integer i = it.next();
	      if(i < 10) {
	        it.remove();
	      }
	    }
	    System.out.println(numbers);
	}

}
