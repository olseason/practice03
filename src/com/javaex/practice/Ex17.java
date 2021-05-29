package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int x = num;
		
		for(int i=0; i<num; i++) {
			for(int y=x; y>0; y--) {
				System.out.print("*");
			}
			x--;
			System.out.println();
		}
		
		
		
		
		
		
		
		
		sc.close();
		
		
	}

}
