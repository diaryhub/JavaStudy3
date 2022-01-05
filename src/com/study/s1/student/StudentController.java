package com.study.s1.student;

import java.util.Scanner;

public class StudentController {

	public void start() {
		Scanner sc = new Scanner(System.in);
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		Student [] stus = new Student [0];
		boolean check = true;
		
		while (check) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 입력");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.프로그램 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				stus = su.makeStudents();
				System.out.println("입력 완료");
				break;
			case 2:
				if(stus!=null)
					sv.viewStudents(stus);
				else
					System.out.println("먼저 정보를 입력하세요.");
				break;
			case 3:
				sv.viewStudent(su.search(stus));
				break;
			case 4:
				check = false;

			}

		}

	}

}
