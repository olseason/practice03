package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		int num = sc.nextInt();
		int jak = num%2;
		int result = 0;
		
		if ( jak == 0 ) {
			for(int x=1; x<=num; x++) {
				if (x % 2 == 0) {
					result = result + x;
				}
			}
		}
		
		if ( jak % 2 != 0 ) {
			for(int x=1; x<=num; x++) {
				if (x % 2 != 0) {
					result = result + x;
				}
			}
		
		}	
		System.out.println("결과값: " + result );
		
		sc.close();	

	}

}
