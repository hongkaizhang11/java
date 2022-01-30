package com.huaxia.hongkai;

public class DataType {

	public static void main(String[] args) {
		// Primitive Data Type
		boolean flag = true; // true, false
		byte myByte = 127; // 8 bits, -128 ~ 127 number range (total of 256 numbers)
		char c = 65; // ASCII:American Standard Code for Information Interchange
//		short myShort = 11;
		int a = 2147483647; // int is data type of integer, -2147483648 ~ 2147483647 number range
//		long l = 12354535135131351L; // put L or l on the end
		float x = 129.3F; // f or F on the end
		double y = 12.3;
//		x = (float)y; // cast: assign large value to smaller data types
		myByte = (byte)x;
		System.out.println(flag);
		System.out.println(c);
		System.out.println(myByte);
		System.out.println(a + x + y + myByte);//?why output a double
		
		//String is Java defined data type
		String name = "Johnny"; // name is an instance of String
		System.out.println(name);
		System.out.println(name instanceof String);
		
		// User defined data type, Print is a user defined data type
		Print p = new Print();
//		Hello h = new Hello();
		System.out.println(p instanceof Print);
		System.out.println(p.add(4, a));
		String[] myStringArray = {"a", "b"};
		Hello.main(myStringArray);
//		short x1 = (short)Print.sub(12, 3); // dangerous for putting large value to smaller container
//		System.out.println("12 - 3 = " + x);
	}
}