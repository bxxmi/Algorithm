package com.bomi.chapter1;

import java.util.*;

public class ex3_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n입력:");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= n; i++) {
			if (i < n) {
				System.out.print(i + "+");
				sum += i;
			} else {
				sum += i;
				System.out.println(i + "=" + sum);
			}
		}
	}
}
