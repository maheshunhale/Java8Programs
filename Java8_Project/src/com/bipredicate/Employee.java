package com.bipredicate;

public class Employee {
	
	private int eno;
	private String name;
	private double dailyWage;
	private double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee(int eno, String name, double dailyWage) {
		super();
		this.eno = eno;
		this.name = name;
		this.dailyWage = dailyWage;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getDailyWage() {
		return dailyWage;
	}
	public void setDailyWage(double dailyWage) {
		this.dailyWage = dailyWage;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}
