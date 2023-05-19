package org.sample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		List<String> li = new ArrayList<>();
		li.add("a");
		li.add("B");
		li.add("c");
		li.add("d");

		for (String string : li) {
			System.out.println(string);
		}

		HashMap map = new HashMap<>();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);

		Set entrySet = map.entrySet();
		for (Object object : entrySet) {
			System.out.println(object);
		}

	}
}
