package com.huaxia.hongkai.loopHW;

public class LoopHW07 {

	public static void main(String[] args) {
		int n = 5; // number in middle
		n -= 1;
		for (int i = -n; i <= n; ++i) {
			int abs_i = java.lang.Math.abs(i); // calculates absolute of i ~~ outputting with this ugly variable
			for (int v = abs_i; v >= 1; --v) {
				System.out.print(" ");
			}
			for (int j = n - abs_i; j >= 1; --j) {
				System.out.print(n - abs_i + 1 + " ");
			}
			System.out.println(n - abs_i + 1);
		}

	}

}
