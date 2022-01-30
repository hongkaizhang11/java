package com.huaxia.hongkai;

public class IfElse {
	public static void main(String[] args) {
		int hour = 20;
//		// if-else statement
//		if (hour < 18) {
//			System.out.println("Good day!");
//		} else {
//			System.out.println("Good evening!");
//		}
//		// if-else if-else
		if (hour < 12) {
			System.out.println("Good morning!");
		} else if (hour >= 12 && hour < 18) {
			System.out.println("Good afternoon!");
		} else {
			System.out.println("Good evening!");
		}
		
		String result = (hour<18)?"Good day.":"Good evening.";
		System.out.println(result);
	}
}
