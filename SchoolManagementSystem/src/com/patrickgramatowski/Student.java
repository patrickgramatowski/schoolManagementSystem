package com.patrickgramatowski;

/*
 * This class track student's fees
 * track them and store information about.
 */


public class Student {

	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * @param id - unique id for the student;
	 * @param name - name of the student;
	 * @param grade - grade of the student;
	 * feesPaid - fees paid by the student, init is 0; 
	 * feesTotal - is a 30,000$ for every student;
	 */
	
	public Student(int id, String name, int grade) {
		
		this.id = id;
		this.name = name;
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30000;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public void setFeesPaid(int feesPaid) {
		this.feesPaid += feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}

	public void setFeesTotal(int feesTotal) {
		this.feesTotal = feesTotal;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void updateFeesPaid(int fees) {
		feesPaid += fees;
	}
	
}
