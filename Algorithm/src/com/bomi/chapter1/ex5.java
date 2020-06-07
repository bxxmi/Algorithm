package com.bomi.chapter1;

import java.util.*;

public class ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("2자리의 정수를 입력하세요");
		int n;

		do {
			System.out.println("n:");
			n = sc.nextInt();
		} while (n < 10 || n > 99);
		System.out.println("변수 n의 값은" + n + "이(가) 되었습니다.");
	}
}
