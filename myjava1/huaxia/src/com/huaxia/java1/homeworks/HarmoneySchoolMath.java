package com.huaxia.java1.homeworks;

//only do 10
//donut do 80 like that other guy

public class HarmoneySchoolMath {

	public static void main(String[] args) {
		//1
		int a = 2020, b=20;
		String won = String.format("Problem 1: %d minus %d equals %d" ,a,b,a-b);
		System.out.println(won);
		//2
		int c = 494, d = 118;
		String too = String.format("Problem 2: %d plus %d equals %d" ,c,d,c+d);
		System.out.println(too);
		//3
		int e = 1296;
		String f = "Error";
		String tree = String.format("Problem 3: The tens digit of %d is %d", e,f);
		System.out.println(tree);
		//4
		int g = 60, h = 5;
		String phor = String.format("Problem 4: %d divided by %d equals %d", g,h,g/h);
		System.out.println(phor);
		//5
		int i = 14, j = 50;
		String phive = String.format("Problem 5: %d times %d equals %d", i,j,i*j);
		System.out.println(phive);
		//6
		int k = 66, l = 4;
		int kl = k % l;
		String sicks = String.format("Problem 6: %d modulo %d equals %d", k,l,kl);
		System.out.println(sicks);
		//7
		int m = 14, n = 3;
		String sevin = String.format("Problem 7: %d times %d equals %d", m,n, m*n);
		System.out.println(sevin);
		//8
		int o = 8, p = 11, q = 8;
		String ate = String.format("Problem 8: %d times %d plus %d equals %d", o,p,q, o*p+q);
		System.out.println(ate);
		//9
		int r = 53, s = 12, t = 28, u = 7;
		String nyne = String.format("Problem 9: %d plus %d plus %d plus %d equals %d" ,r,s,t,u,r+s+t+u);
		System.out.println(nyne);
		//10
		System.out.println("I have no idea how to solve this one");
		//11
		int v = 1987;
		String alevin = String.format("Problem 11: %d rounded to the nearest 10 without rounding up equals %d",v,10*(v/10));
		System.out.println(alevin);

	}
}