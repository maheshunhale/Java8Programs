package com.bipredicate;

import java.util.function.BiFunction;

public class BiFunctionDailyWage {

	public static void main(String[] args) {
		
		BiFunction<Employee,TimeSheet,Double> f = (e,t) -> e.getDailyWage()*t.getDays();
		
		Employee e = new Employee(101, "Mahesh Unhale", 2500);
		
		TimeSheet t = new TimeSheet(101, 24);
		
		System.out.println("Employee Monthly Salary: "+f.apply(e, t));
		
	}

}
