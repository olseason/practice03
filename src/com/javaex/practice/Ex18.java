package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		int x = num;
		int y;
		int i;
		
		for(i=0; i<num; i++) {
			for(y=x; y>0; y--) {
				System.out.print("*");
			}
			x--;
			if (x<=1) {
				for (i=0; i<num+1; i++) {
					for (y=0; y<i; y++) {
							System.out.print("*");
					}System.out.println();
				}
			}
			System.out.println();
		}
		
		sc.close();

	}

}
