package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");

		System.out.print("숫자: ");
		int n01 = sc.nextInt();
		
		System.out.print("숫자: ");
		int n02 = sc.nextInt();
		
		System.out.print("숫자: ");
		int n03 = sc.nextInt();
		
		System.out.print("숫자: ");
		int n04 = sc.nextInt();
		
		System.out.print("숫자: ");
		int n05 = sc.nextInt();

		if (n01>n02 && n01>n03 && n01>n04 && n01>n05) {
			System.out.print("최대값은 " + n01 + "입니다.");
		} else if (n02>n01 && n02>n03 && n02>n04 && n02>n05) {
			System.out.print("최대값은 " + n02 + "입니다.");
		} else if (n03>n01 && n03>n02 && n03>n04 && n03>n05) {
			System.out.print("최대값은 " + n03 + "입니다.");
		} else if (n04>n01 && n04>n02 && n04>n03 && n04>n05) {
			System.out.print("최대값은 " + n04 + "입니다.");
		} else {
			System.out.print("최대값은 " + n05 + "입니다.");
		}
		
		
		sc.close();
	}

}
