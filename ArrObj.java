/*. Create a class “Student” that would contain enrolment No, name, and gender and marks as instance 
variables and count as static variable which stores the count of the
objects; constructors and display(). Implement constructors to initialize instance variables.*/

import java.util.*;
public class ArrObj{
	public static void main(String[] args) {
				Scanner sc =new Scanner (System.in);
				Scanner s =new Scanner (System.in);


		System.out.println("enter number of student : ");
		int n = sc.nextInt();
		Student[] s1 = new Student[n];

		for(int i=0;i<n;i++){
			s1[i] = new Student();
			s1[i].enRollNo = 101 + i;
			System.out.println("enter name");
			s1[i].name = s.nextLine();
			System.out.println("enter gender");
			s1[i].gender = s.nextLine();
			System.out.println("enter marks");
			s1[i].marks = sc.nextInt();

		}

		for (int i =0;i<n ;i++){
			s1[i].display();
	}
}

}

class Student{
	int enRollNo;
	String name;
	String gender;
	int marks; 
	static int count = 0;

	Student(){
		enRollNo = 0;
		name = "lol";
		gender = "m";
		marks = 0;
		count++;
	}

	Student(int en,String n, String g,int m){
		enRollNo = en;
		name = n;
		gender = g;
		marks = m;
		count++;
	}
	public void display(){
		System.out.println(enRollNo + " "+ name + " " +gender +" "+marks +" "+count);
	}

}