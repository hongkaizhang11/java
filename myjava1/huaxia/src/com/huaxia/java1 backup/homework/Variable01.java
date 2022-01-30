package com.huaxia.hongkai.homework;
/**
 * refer to homeworks: variable01.md
 * 
 * @author Hongkai
 *
 */
public class Variable01 {
	
	/* Assign 'bankAmount' float
	 * Assign 'str1' string to string including 'bankAmount' float
	 * Assign rest of variables
	 * Assign 'str2' and 'str3'
	 * Print all three strings
	 */
	
	public static void main(String[] args) {
		// set variable dataType
		float bankAmount, withdrawOne, withdrawTwo, withdrawThree, totalWithdrawal;
		// assign bankAmount
		bankAmount = 100;
		// assign str1
	    String str1 = "Your starting bank amount was $" + bankAmount;
		// assign these variables
	    withdrawOne = 25;
	    withdrawTwo = 30;
	    withdrawThree = 15;
	    totalWithdrawal = withdrawOne + withdrawTwo + withdrawThree;
	    bankAmount -= totalWithdrawal;
	    // assign str2 and str3
	    String str2 = "Your total withdrawal is $" + totalWithdrawal;
	    String str3 = "Your current bank amount is $" + bankAmount;
	    // print str1,str2,str3
	    System.out.println(str1);
	    System.out.println(str2);
	    System.out.println(str3);
	}
}
