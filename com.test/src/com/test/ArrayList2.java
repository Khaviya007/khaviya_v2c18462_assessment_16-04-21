package com.test;
import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<Student> stud=new ArrayList<Student>();
		stud.add(new Student(2,"Sam",23));
		stud.add(new Student(1,"Tom",34));
		stud.add(new Student(3,"John",21));
		System.out.println("The arraylist are:");
		for(Student s:stud)
			System.out.println("Studentid:"+s.id+" "+"Studentname:"+s.name+" "+
		"Studentage:"+s.age);
		
		ArrayList<Student> stud1=new ArrayList<Student>();
		stud1.addAll(stud);
		System.out.println("The arraylist2 are:");
		for(Student s1:stud)
			System.out.println("Studentid:"+s1.id+" "+"Studentname:"+s1.name+" "+
		"Studentage:"+s1.age);

	}

}
class Student {
	int id;
	String name;
	int age;
	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}	
}