package com.study.s1.student;

public class StudentMain {

	public static void main(String[] args) {

		//makeStudent 호출
		//이름 번호 국어 영어 수학 출력
		
		StudentUtil su = new StudentUtil();
		
		Student stu = su.makeStudent();
		
		System.out.println("이름\t번호\t국어\t영어\t수학");
		System.out.println("====================================");
		System.out.println(stu.name+"\t"+stu.num+"\t"+stu.kor+"\t"+stu.eng+"\t"+stu.math);
		
		
	}

}
