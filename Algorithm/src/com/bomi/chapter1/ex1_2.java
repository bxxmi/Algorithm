package com.bomi.chapter1;

import java.util.*;

// 세 값의 최솟값
public class ex1_2 {

	static int min3(int a, int b, int c) {
		int min = a;

		if (b < min) {
			min = b;
		}

		if (c < min) {
			min = c;
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

		System.out.println("최솟값은" + min3(a, b, c) + "입니다.");
	}
}
