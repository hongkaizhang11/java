package com.huaxia.java1.homeworks;

public class PrePostDemo {
	public static void main(String[] args){
        int i = 3;
        i++;
        System.out.println(i);    // "4"
        ++i;                     
        System.out.println(i);    // "5"
        System.out.println(++i);  // "6"
        System.out.println(i++);  // "6"
/* Because the ++ operator is behind the variable, 
 * the program will print i before adding 1 to the variable.
 * 
 * 
 */
        System.out.println(i);    // "7"
    }
}
