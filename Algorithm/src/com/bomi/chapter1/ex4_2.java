package com.bomi.chapter1;

import java.util.*;

public class ex4_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		do {
			System.out.print("num:");
			num = sc.nextInt();
		} while (num <= 0);

		int n = 0;
		
		while (num > 0) {
			num /= 10;
			n++;
		}
		System.out.println("그 수는" + n + "자리입니다.");
	}
}
