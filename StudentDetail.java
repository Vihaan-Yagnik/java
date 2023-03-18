//5. Write a class program with following specifications:
//Class Name: Student
//Data Members: Enrollment_No, Student_Name, Semester, CPI and SPI
//Member Functions: GetStudentDetails () and DisplayStudentDetails ().


import java.util.*;
public class StudentDetail{
	public static void main(String[] args) {
		Student em1 = new Student();
		em1.GetStudentDetails();
		em1.DisplayStudentDetails();
	}
}
class Student{
	int Enrollment_No;
	String Student_Name;
	int Semester;
	double Cpi;
	double Spi;

	public void GetStudentDetails(){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enrollment_No: ");
		Enrollment_No= sc.nextInt();

		sc.nextLine();
		System.out.print("name: ");
		Student_Name= sc.nextLine();

		sc.nextLine();
		System.out.print("Semester: ");
		Semester= sc.nextInt();

		System.out.print("Cpi: ");
		Cpi= sc.nextDouble();

		System.out.print("Spi: ");
		Spi= sc.nextDouble();
	}

	public void DisplayStudentDetails(){
		System.out.println(Enrollment_No);
		System.out.println(Student_Name);
		System.out.println(Semester);
		System.out.println(Cpi);
		System.out.println(Spi);
	}
}
