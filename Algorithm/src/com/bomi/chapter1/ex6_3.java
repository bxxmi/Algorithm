package com.bomi.chapter1;

import java.util.*;

public class ex6_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 : ");

		int dan = sc.nextInt();

		for (int i = 1; i <= dan; i++) {
			for (int j = 1; j <= dan; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
