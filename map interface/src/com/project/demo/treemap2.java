package com.project.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class treemap2 {
	public static void main(String[]args) {
		Map<Integer, Integer> numbers=new HashMap<Integer, Integer>();
		numbers.put(1, 66);
		numbers.put(4, 76);
		numbers.put(2, 56);
		numbers.put(3, 90);
		numbers.put(5, 56);
		//System.out.println(numbers);
		for(Map.Entry<Integer, Integer> itr:numbers.entrySet()){
			//System.out.println(itr);
			System.out.println("key="+itr.getKey()+"values="+itr.getValue());
			
		}

}}
