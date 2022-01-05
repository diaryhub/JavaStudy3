package com.study.s1.student;

public class StudentView {

	public void viewMessage(String message) {

		System.out.println("====================");
		System.out.println(message);
		System.out.println("====================");
	
	}
	
	
	public void viewStudent(Student stu) {
		
		System.out.println("이름:"+stu.name);
		System.out.println("번호:"+stu.num);
		System.out.println("국어:"+stu.kor);
		System.out.println("영어:"+stu.eng);
		System.out.println("수학:"+stu.math);
		
	}
	public void viewStudents(Student [] stus, int count) {
		for(int i=0;i<count;i++) {
		System.out.println("이름:"+stus[i].name);
		System.out.println("번호:"+stus[i].num);
		System.out.println("국어:"+stus[i].kor);
		System.out.println("영어:"+stus[i].eng);
		System.out.println("수학:"+stus[i].math);
		}
	}
	
}
