package com.bomi.chapter1;

import java.util.*;

public class ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형 출력하세요");

		System.out.print("몇 단 삼각형입니까?");
		int dan = sc.nextInt();

		for (int i = 1; i <= dan; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
