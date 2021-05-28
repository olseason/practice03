package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner (System.in);	
		
	System.out.println("숫자를 입력하세요");
	int num =sc.nextInt();
		
	for (int x=1; x<=num; x++ ) {
		for (int y=0; y<x; y++ ) {
			System.out.print(x);
		}
		System.out.println("");
	}
	sc.close();	
		
	

	}

}
