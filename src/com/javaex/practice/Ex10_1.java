package com.javaex.practice;

import java.util.Scanner;

public class Ex10_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num= 0;
		
		System.out.println("숫자를 입력하세요");
		
		for(int i=0; i<5; i++) {
			
			System.out.print("숫자: "); 
			
			int number = sc.nextInt();
			
			if (number > num) {
				num = number;
			}
		}
		
		System.out.println("최대값은" + num + "입니다.");         //최대값은 뭘 집어넣어도 0으로 나온다... 
	                                                              //문제해결- (태그 혼동) 
		
		sc.close();

	}

}
