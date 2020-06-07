package com.bomi.chapter1;

import java.util.*;

public class ex7_3 {

	static void spira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("단 수:");
		int n = sc.nextInt();

		spira(n);
	}
}
