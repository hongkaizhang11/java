package com.huaxia.hongkai.loopHW;


/**
 * * Write a Java program to print an American flag on the screen. Go to the editor

Expected Output

```
* * * * * * ==================================1                          
 * * * * *  ================================== 2                         
* * * * * * ==================================  3                        
 * * * * *  ==================================   4                       
* * * * * * ==================================    5                      
 * * * * *  ==================================     6                     
* * * * * * ==================================      7                    
 * * * * *  ==================================       8                   
* * * * * * ==================================        9    
==============================================         A                 
==============================================          B                
==============================================           C               
==============================================            D    
==============================================             E
==============================================              nothing here, although that would be F

```
 * @author Hongkai Z
 *YOU BETTER BE HAPPY WITH THIS!!!!!
 */

class Loop10 {
	
	String repeatItem = "";
	int repeat;
	String returnItem = "";
	
	Loop10(String rI, int r) {
		repeatItem = rI;
		repeat = r;
		for (int i = 0; i<repeat;++i) {
			returnItem += repeatItem;
		}
	}
	public String toString() { // this took forever to configure, because I had no idea what I was doing
		return returnItem;
	}

	public static void main(String[] args) {
		Loop10 str1;
		Loop10 str2;
		
		for (int j=0;j<4;++j) {
			str1 = new Loop10("* ", 6);
			str2 = new Loop10("=", 34);
			System.out.println(str1 + "" + str2);
			str1 = new Loop10("* ", 5);
			str2 = new Loop10("=", 34);
			System.out.println(" " + str1 + " " + str2);
		}
		str1 = new Loop10("* ", 6);
		str2 = new Loop10("=", 34);
		System.out.println(str1 + "" + str2);
		
		for (int j=0;j<6;++j) { // for such a long loop assignment, I only used 3 for loops!
			str1 = new Loop10("=", 46);
			System.out.println(str1);
		}
		
//		String a = "==============================================";
//		System.out.print(a.length());

	}

}
