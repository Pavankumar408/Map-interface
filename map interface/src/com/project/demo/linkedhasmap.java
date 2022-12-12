package com.project.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class linkedhasmap {
public static void main(String[]args) {
	Map<Integer, String> names=new HashMap<Integer, String>();
	names.put(3, "pavan");
	names.put(5, "kumar");
	names.put(2, "naveen");
	names.put(1, "karthi");
	names.put(4, "sekar");
	System.out.println(names.size());
	System.out.println(names.containsKey(3));
	//System.out.println(names);
	for(Map.Entry<Integer, String> str:names.entrySet()){
	//	System.out.println(str);
		System.out.println("key="+str.getKey()+ "values="+str.getValue());
		System.out.println("using iterator method");
		Iterator<Entry<Integer, String>> str1=names.entrySet().iterator();
		while(str1.hasNext()) {
			System.out.println(str1.next());
		}
	}
}
}
