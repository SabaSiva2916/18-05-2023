package org.sample;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
=======

>>>>>>> bb566e3244916bdae92da6e4867fb376c68b1889

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		String str = "java programm";
		String[] split = str.split(" ");
		String output = "";
		for (String string : split) {
			for (int i = string.length() - 1; i >= 0; i--) {
				char c = string.charAt(i);
				output = output + c;
			}
			output = output + " ";
		}
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
