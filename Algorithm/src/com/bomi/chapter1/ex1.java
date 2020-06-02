package com.bomi.chapter1;

import java.util.*;

// 세 값의 최댓값
public class ex1 {

	public static void main(String[] args) {
		System.out.println("세 정수의 최댓값을 구합니다.");

		Scanner sc = new Scanner(System.in);

		System.out.print("a의 값:");
		int a = sc.nextInt();

		System.out.print("b의 값:");
		int b = sc.nextInt();

		System.out.print("c의 값:");
		int c = sc.nextInt();

		int max = 0;

		if (a > max) {
			max = a;
		}

		if (b > a) {
			max = b;
		}

		if (c > b) {
			max = c;
		}

		System.out.println("최댓값은" + max + "입니다.");
	}
}
