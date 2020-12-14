package com.patrickgramatowski;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Teacher tom = new Teacher(1, "Tom", 200);
		Teacher john = new Teacher(2, "John", 500);
		Teacher mickey = new Teacher(3, "Mickey", 200);

		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(tom);
		teacherList.add(john);
		teacherList.add(mickey);
		
		
		Student jim = new Student(1, "Jim", 4);
		Student tim = new Student(2, "Tim", 3);
		Student sam = new Student(3, "Sam", 2);
		
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(jim);
		studentList.add(tim);
		studentList.add(sam);
		
		School ghs = new School(teacherList, studentList);
		 
		jim.setFeesPaid(200);
		jim.setFeesPaid(300);
		sam.setFeesPaid(700);
		//System.out.println(jim.getFeesPaid());
		
		int moneySpent = 0;
		int moneyEarned = 0;
		
		
		for(Teacher i : teacherList) {
			moneySpent += i.getSalary();
		}
		
		for(Student i : studentList) {
			moneyEarned += i.getFeesPaid();
		}
		
		
		ghs.updateTotalMoneyEarned(moneyEarned);
		ghs.updateTotalMoneySpent(moneySpent);
		
		System.out.println("GHS has spent: " + ghs.getTotalMoneySpent() + "$");
		System.out.println("GHS has earned: " + ghs.getTotalMoneyEarned() + "$");
		System.out.println("Bilans: " + ghs.bilans(moneySpent, moneyEarned) + "$");
		
		
	}
	
}