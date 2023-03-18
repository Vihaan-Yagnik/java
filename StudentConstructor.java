import java.util.*;

public class StudentConstructor{
	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);

		Student s1 = new Student();
		Student s2 = new Student();
		s1.display();
		s2.display();

	}

}

class Student{
	int enRollNo;
	String name;
	char gender;
	int marks; 
	static int count = 0;

	Student(){
		enRollNo = 0;
		name = "lol";
		gender = 'm';
		marks = 0;
		count++;
	}

	Student(int en,String n, char g,int m){
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