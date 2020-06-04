package com.bomi.chapter1;

import java.util.*;

public class ex3_3 {

	static int sumof(int a, int b) {
		int sum = 0;

		if (a > b) {
			for (int i = b; i <= a; i++) {
				sum += i;
			}
		} else {
			for (int i = a; i <= b; i++) {
				sum += i;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a:");
		int a = sc.nextInt();

		System.out.print("b:");
		int b = sc.nextInt();

		System.out.print(a + "부터" + b + "의 합은" + sumof(a, b) + "입니다.");
	}
}
