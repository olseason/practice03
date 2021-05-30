package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		System.out.println("========================");
		System.out.println("[ 숫자맞추기 게임 시작 ]");
		System.out.println("========================");

		int user;
		int num = (int)(Math.random() * 100) + 1;
		String YN;

		while ( num != 0 ) {
			System.out.print(">>");
			user = sc.nextInt();
			if ( num > user ) {
				System.out.println("더 높게");
				continue;
			} else if ( num < user ) {
				System.out.println("더 낮게");
				continue;
			} else {
				System.out.println("맞았습니다");
				System.out.print("게임을 종료 하시겠습니까?(y/n) >> ");
				// sc.nextLine();
				YN = sc.next(); // YN = sc.nextLine();
				if ( YN.equals("y") ) {
					break;
				} else if ( YN.equals("n") ) {
					continue;
				}

			}
		}
		System.out.println("========================");
		System.out.println("[ 숫자맞추기 게임 종료 ]");
		System.out.println("========================");

		sc.close();
		

	}

}
