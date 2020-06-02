package com.bomi.chapter1;

import java.util.*;

// 네 값의 최댓값
public class ex1_1 {

	static int max4(int a, int b, int c, int d) {

		int max = 0;

		if (a > max) {
			max = a;
		}

		if (b > max) {
			max = b;
		}

		if (c > max) {
			max = c;
		}

		if (d > max) {
			max = d;
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a:");
		int a = sc.nextInt();

		System.out.print("b:");
		int b = sc.nextInt();

		System.out.print("c:");
		int c = sc.nextInt();

		System.out.print("d:");
		int d = sc.nextInt();

		System.out.println("최댓값은:" + max4(a, b, c, d) + "입니다.");
	}
}
