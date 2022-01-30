package com.huaxia.java1;

//only do 10
//donut do 80 like that other guy

public class HarmonySkoool {

	public static void main(String[] args) {
		//1
		int a = 2020, b=20;
		String won = String.format("%d minus %d equals %d" ,a,b,a-b);
		System.out.println(won);
		//2
		int c = 494, d = 118;
		String too = String.format("%d plus %d equals %d" ,c,d,c+d);
		System.out.println(too);
		//3
		int e = 1296, f = 9;
		String tree = String.format("The tens digit of %d is %d", e,f);
		System.out.println(tree);
		//4
		int g = 60, h = 5;
		String phor = String.format("%d divided by %d equals %d", g,h,g/h);
		System.out.println(phor);
		//5
		int i = 14, j = 50;
		String phive = String.format("%d times %d equals %d", i,j,i*j);
		System.out.println(phive);
		//6 I don't know how this makes sense but it works
		int k = 66, l = 4;
		float kl = k-l*(k/l);
		String sicks = String.format("%d modulo %d equals %.0f", k,l,kl);
		System.out.println(sicks);
		//7
		int m = 14, n = 3;
		String sevin = String.format("%d times %d equals %d", m,n, m*n);
		System.out.println(sevin);
		//8
		int o = 8, p = 11, q = 8;
		String ate = String.format("%d times %d plus %d equals %d", o,p,q, o*p+q);
		System.out.println(ate);
		//9
		int r = 53, s = 12, t = 28, u = 7;
		String nyne = String.format("%d plus %d plus %d plus %d equals %d" ,r,s,t,u,r+s+t+u);
		System.out.println(nyne);
		//10 no!!!
		//11
		int v = 1987;
		String alevin = String.format("%d rounded to the nearest 10 without rounding up equals %d",v,10*(v/10));
		System.out.println(alevin);

	}
}