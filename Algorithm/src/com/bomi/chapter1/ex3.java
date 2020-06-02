package com.bomi.chapter1;

import java.util.*;

// for문 반복
public class ex3 {

	public static void main(String[] args) {

		System.out.println("1부터 n까지의 합을 구합니다.");

		Scanner sc = new Scanner(System.in);
		System.out.print("n의값:");
		int n = sc.nextInt();

		int sum = 0;

		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다");
	}
}
