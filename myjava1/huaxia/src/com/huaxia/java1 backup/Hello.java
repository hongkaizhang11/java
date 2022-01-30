package com.huaxia.hongkai;

/*
 *This is my second java program
 *
 *run this program by right click > select Run As...
 *Java is OOP Oriented Programming, public, static are modifiers
 *void is a return type but main is a method doesn't return value
 *the arguments in the method in the method is the part of method signature(finger print)
 *
 * 1. contain attributes
 * 2. constructor
 * 3. methods
 * 4. representative (toString() method)
 */
class Hello { // first letter of class is UPPERCASE
	String name = "";
	int age; // by default, the age = 0

	// define constructor: a factory to create instance of Hello class
	Hello(String newName) {
		name = newName;
	}

	Hello(String name, int age) {
		this.name = name; // "this" here is the instance itself
		this.age = age;
	}
	
	void sayHello() {
		System.out.println("Hello, " + this.name);
	}
	
	public String toString() { // overloading constructor
		return "[name]=" + name + ", [age]=" + age;
	}

	// main method to run this class
	public static void main(String[] options) {
		System.out.println("Hello, World!");
//		for(int i=0; i<options.length;i++) {
//			System.out.println(options[i]);
//		}
//		String hello = "Individual";
//		for(int i=0; i<hello.length(); i++) {
//			System.out.println(hello.charAt(i));
//		}
		Hello h = new Hello("Johnny Wanted", 47); // create instance of Hello
		System.out.println(h); // call toString(): return a String that represent the instance of hello class
		h.sayHello();
		
		String s1 = "Johnny";
		String s2 = "Johnny";
		System.out.println(s1 + " " + s2);
		
		s1 = new String("Johnny");
		s2 = new String("Johnny");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
