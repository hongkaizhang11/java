package com.huaxia.java1.homeworks.LoopHW;

public class LoopHW04 {

	public static void main(String[] args) {
		int n = 4; // use 4 for HW here
		int x = 0;
		for (int i = -n; i <= n; ++i) {
			x = (n + 1) - java.lang.Math.abs(i);
			for (int j = 1; j <= x; ++j) {
				System.out.print("* "); // this is what is printed
			}
			System.out.println();
		}

	}

}