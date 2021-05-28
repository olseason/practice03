package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
	int x, y;                                // **
	                                         // **
	for (x=0; x<4; x++) {                    // **
		for (y=0; y<2; y++) {                // **
			System.out.print("*"); 
		}                                    // x(가로축)가 0부터 시작해, 4보다 작아 돌고 돌아서 0,1,2,3 네번을 돌고 종료 
		System.out.println("");              // y(세로축)가 0부터 시작해, 2보다 작아 돌고 돌아서 0,1 두번을 돌고 종료 
	}	
		
		
	}
}
