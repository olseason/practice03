package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		
		System.out.println("while문 ");                    // index=0 
		                                                   // index=1
		int index = 0;                                     // index=2
		while (index < 3) {
			System.out.println("index= " + index);
			index++;
		}
		
		System.out.println("for문 ");                      // order=0
		                                                   // order=1
		for (int order=0; order<3; order++) {              // order=2
			System.out.println("order= " + order);
		}
		
		
	}

}
