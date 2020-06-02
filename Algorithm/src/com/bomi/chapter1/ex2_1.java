package com.bomi.chapter1;

import java.util.*;

// 변수 i값이 i+1이 됨을 출력
public class ex2_1 {

	public static void main(String[] args) {
		
		System.out.println("n의 값:");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int sum = 0;
		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println("i의값:" + i);
	}
}
