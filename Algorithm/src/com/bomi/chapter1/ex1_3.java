package com.bomi.chapter1;

import java.util.*;

// 네 값의 최솟값
public class ex1_3 {

	static int min4(int a, int b, int c, int d) {
		int min = a;

		if (b < min) {
			min = b;
		}

		if (c < min) {
			min = c;
		}

		if (d < min) {
			min = d;
		}

		return min;
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

		System.out.println("최소값은" + min4(a, b, c, d) + "입니다.");
	}

}
