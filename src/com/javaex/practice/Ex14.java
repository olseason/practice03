package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int result=0;	
	
	System.out.print("숫자를 입력하세요:");
	int num = sc.nextInt(); 
	
	for(int x=1; x<=num; x++) {
		result = result + x;
		System.out.println(result + "+" + result );
	}
	System.out.print("합계: " + result + num);
	
		
		
	sc.close();	

	}

}
