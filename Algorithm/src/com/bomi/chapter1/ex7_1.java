package com.bomi.chapter1;

import java.util.*;

public class ex7_1 {

	// 왼쪽 아래
	static void triangleLB(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 왼쪽 위
	static void triangleLU(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j > i) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	// 오른쪽 위
	static void triangleRU(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (n - i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// 오른쪽 아래
	static void triangleRB(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (j > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;

		do {
			System.out.print("단:");
			n = sc.nextInt();
		} while (n <= 0);

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형");
		triangleLB(n);

		System.out.println("왼쪽 위가 직각인 이등변 삼각형");
		triangleLU(n);

		System.out.println("오른쪽 위가 직각인 이등변 삼각형");
		triangleRU(n);

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형");
		triangleRB(n);
	}
}
