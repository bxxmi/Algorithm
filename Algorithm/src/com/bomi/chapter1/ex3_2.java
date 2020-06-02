package com.bomi.chapter1;

import java.util.*;

public class ex3_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n의값:");
		int n = sc.nextInt();

		int sum = (1 + n) * (n/2);

		System.out.print("합:" + sum);
	}
}
