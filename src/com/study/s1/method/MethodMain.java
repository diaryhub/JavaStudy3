package com.study.s1.method;

import java.util.Scanner;

public class MethodMain {

	public static void main(String[] args) {
		
		
		System.out.println("MethodMain Start");
		
		
		ReturnStudy rs = new ReturnStudy();
		
		rs.test1();
		
		rs.test2();
		
		System.out.println(rs.test2());
		

		System.out.println(rs.test3());
		
		Scanner sc = rs.test4();
		
		
		
		System.out.println("MethodMain Finish");
		
	}

}
