package com.bomi.chapter1;

import java.util.*;

// while문 사용 반복
public class ex2 {

	public static void main(String[] args) {
		System.out.println("1부터 n까지의 합을 구합니다.");

		Scanner sc = new Scanner(System.in);

		System.out.print("n의 값:");
		int n = sc.nextInt();

		// 합이 저장될 변수 생성
		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1부터" + n + "까지의 합은" + sum + "입니다.");
	}
}
