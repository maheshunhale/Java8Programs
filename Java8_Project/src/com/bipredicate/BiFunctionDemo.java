package com.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class BiFunctionDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> l = new ArrayList<>();
		
		BiFunction<String,Integer,Student> f = (name,roll) -> new Student(name,roll);
		
		l.add(f.apply("Mahesh", 1));
		l.add(f.apply("Ruchita",2));
		l.add(f.apply("Taksh", 3));
		
		Consumer<Student> c = s-> {
			System.out.println("Student Name:"+s.getName());
			System.out.println("Student Rollno:"+s.getRollno());
			System.out.println();
		};
		
		Consumer<List<Student>> c1 = list-> {
			for(Student s: list) {
				System.out.println("Student Name:"+s.getName());
				System.out.println("Student Rollno:"+s.getRollno());
				System.out.println();
			}
		
		};
		
		c1.accept(l);
	}

}
