package org.sample;



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

		System.out.println("Reverse of given word :" + output);
	}
}
