package com.study.s1.student;

import java.util.Scanner;

public class StudentUtil {

	public Student makeStudent() {

		// 키보드로부터 이름 번호 국어 영어 수학 입력
		// 입력받은 값을 리턴
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();

		System.out.print("이름 입력:");
		stu.name = sc.next();

		System.out.print("번호 입력:");
		stu.num = sc.nextInt();

		System.out.print("국어 점수 입력:");
		stu.kor = sc.nextInt();

		System.out.print("영어 점수 입력:");
		stu.eng = sc.nextInt();

		System.out.print("수학 점수 입력:");
		stu.math = sc.nextInt();

		sc.close();

		return stu;

	}

	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);

		System.out.print("학생 수 입력:");

		int count = sc.nextInt();

		Student[] stus = new Student[count];

		for (int i = 0; i < stus.length; i++) {

			stus[i] = new Student();

			System.out.print("이름 입력:");
			stus[i].name = sc.next();

			System.out.print("번호 입력:");
			stus[i].num = sc.nextInt();

			System.out.print("국어 점수 입력:");
			stus[i].kor = sc.nextInt();

			System.out.print("영어 점수 입력:");
			stus[i].eng = sc.nextInt();

			System.out.print("수학 점수 입력:");
			stus[i].math = sc.nextInt();

		}

		return stus;
	}

	public Student search(Student[] stus) {

		Scanner sc = new Scanner(System.in);
		// 학생 번호 입력
		// 입력받은 번호와 일치하는 학생 탐색
		// 리턴
		System.out.println("학생 번호 입력:");

		int num = sc.nextInt();

		Student stu = new Student();

		boolean exit = true;
		while (exit) {
			for (int i = 0; i < stus.length; i++) {

				if (num == stus[i].num) {

					System.out.println("찾았습니다.");
					
					stu = stus[i];

					exit = false;

					break;
				
				}
				
			}

			if (exit) {
				System.out.println("재입력");
			}
		}
		return stu;

	}

}
