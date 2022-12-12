package com.project.demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class treemap {
	public static void main(String[]args) {
		Map<Integer, String> str=new TreeMap<Integer, String>();
		str.put(2, "kumar");
		str.put(4, "madhu");
		str.put(1, "pavan");
		str.put(3, "naveen");
		str.put(5, "karthi");
		str.put(5, "karthi");
		str.put(6, null);
		System.out.println(str.size());
		System.out.println(str.hashCode());
		System.out.println(str);
		
	}

}
