package com.huaxia.java1.homeworks.LoopHW;

public class LoopHW02 {

	public static void main(String[] args) {
		for (int i = 2; i <= 10; i++) {
			float j = (float) 1 / i;
			String str = String.format("%.2f", j);
			System.out.println(str);
		}
	}
}
