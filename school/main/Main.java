package com.school.main;

import com.school.School;
import com.student.Student;

public class Main {

	public static void main(String[] args) {
		School school=School.getSchoolObject("","Nellore","fshdfjajd");
		Student student=Student.getStudentObject("Bindu","A",-20,school);
		
		System.out.println(student);
		if(school==null) {
			System.out.println("invalid input");
		}

	}

}
