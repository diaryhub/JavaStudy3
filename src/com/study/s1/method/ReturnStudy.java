package com.study.s1.method;

import java.util.Random;
import java.util.Scanner;

public class ReturnStudy {

	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수 선언]){}
	public void test1() {

		System.out.println("void는 리턴이 없을 때 사용");

	}

	public int test2() {

		Random rd = new Random();

		int num = rd.nextInt();

		return num;
	}

	public String test3() {
		Scanner sc = new Scanner(System.in);
		// 키보드로부터 이름 입력 받고 리턴
		System.out.print("이름 입력:");
		
		String name = sc.next();

		return name;
	}
	
	public Scanner test4() {
		Scanner sc = new Scanner(System.in);
		
		return sc;
	}
}
