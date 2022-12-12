package com.project.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hashmap {
	public static void main(String[]args) {
		Map<Integer, String> names=new LinkedHashMap<Integer, String>();
		names.put(4, "pavan");
		names.put(2, "kumar");
		names.put(1, "karthi");
		names.put(6, "naveen");
		names.put(3, "sekar");
		names.put(5, "srini");
		//System.out.println(names);
		for(Map.Entry<Integer, String> str:names.entrySet()) {
		//	System.out.println(str);
			System.out.println("key="   +str.getKey()+"value="    +str.getValue());
			Iterator<Entry<Integer, String>> str1=names.entrySet().iterator();
			while(str1.hasNext()) {
				System.out.println(str1.next());
			}
		}
	}

}
