package com.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.BiConsumer;

import com.bipredicate.Employee;
import com.bipredicate.Student;

public class BiConsumerDemo {

	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<>();
		
		BiFunction<String,Double,Employee> f = (name,salary) -> new Employee(name,salary);
		
		l.add(f.apply("Durga", 10000.0));
		l.add(f.apply("Sunny", 20000.0));
		l.add(f.apply("Bunny", 30000.0));
		l.add(f.apply("Chinny", 40000.0));
		
		BiConsumer<Employee,Double> c =(e,d) -> e.setSalary(e.getSalary()+d);
		
		for(Employee e:l) {
			c.accept(e, 500.0);
		}
		
		Consumer<List<Employee>> c1 = list-> {
			for(Employee s: list) {
				System.out.println("Employee Name: "+s.getName());
				System.out.println("Employee Salary: "+s.getSalary());
				System.out.println();
			}
		
		};
		
		c1.accept(l);
		
	}

}
