package com.bomi.chapter1;

import java.util.*;

public class ex4_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("a:");
		int a = sc.nextInt();

		int b;

		// tip1. 일단 while(true)을 사용해 계속 반복하게 해라
		while (true) {
			System.out.print("b:");
			b = sc.nextInt();

			// tip2. 조건에 부합할 때 빠져나오게 해라
			if (b > a) {
				break;
			}
			System.out.println("a보다 큰 값을 입력하세요");
		}
		System.out.println("b-a는" + (b - a) + "입니다");
	}
}
