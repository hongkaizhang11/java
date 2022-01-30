package com.huaxia.java1.homeworks;

public class ShoppingListHW {

	public static void main(String[] args) {
		// set variable dataType
		int apples, bread, oranges;
		float applePrice, breadPrice, orangePrice, totalPrice;
		// assign variables
		apples = 5;
		bread = 10;
		oranges = 11;
		applePrice = 0.5F;
		breadPrice = 2.50F;
		orangePrice = 5F;
		totalPrice = 0.00F;
		// add to totalPrice float
		totalPrice += apples * applePrice;
		totalPrice += bread * breadPrice;
		totalPrice += oranges * orangePrice;
		// assign str1
		String str1 = "The total price is $"+totalPrice+" for all that food.\nDarn those are some expensive oranges!";
		// print str1
		System.out.println(str1);
	}

}
