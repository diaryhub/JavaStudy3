package com.study.s1.student;

import java.util.Scanner;

public class StudentUtil {
	
	public Student makeStudent(){
		
		//키보드로부터 이름 번호 국어 영어 수학 입력 
		//입력받은 값을 리턴
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		System.out.print("이름 입력:");
		stu.name=sc.next();
		
		System.out.print("번호 입력:");
		stu.num=sc.nextInt();
		
		System.out.print("국어 점수 입력:");
		stu.kor=sc.nextInt();
		
		System.out.print("영어 점수 입력:");
		stu.eng=sc.nextInt();
		
		System.out.print("수학 점수 입력:");
		stu.math=sc.nextInt();
		
		sc.close();
		
		return stu;
		
	}
	

}
