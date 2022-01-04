package com.study.s1.student;

public class StudentMain {

	public static void main(String[] args) {

		//makeStudent 호출
		//이름 번호 국어 영어 수학 출력
		
		StudentUtil su = new StudentUtil();
		
		Student [] stus = su.makeStudents();
		
		
		System.out.println("이름\t번호\t국어\t영어\t수학");
		System.out.println("====================================");
		for(int i=0;i<stus.length;i++) 
		{
		System.out.println(stus[i].name+"\t"+stus[i].num+"\t"+stus[i].kor+"\t"+stus[i].eng+"\t"+stus[i].math+"\n");
		}
		
	}

}
