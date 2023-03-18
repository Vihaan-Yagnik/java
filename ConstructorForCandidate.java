import java.util.*;

public class ConstructorForCandidate{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		Candidate s1 = new Candidate();
		Candidate s2 = new Candidate();
		s1.get();
		s1.display();
		s2.display();

	}

}

class Candidate{
	int C_id;
	String C_name;
	int C_weight;
	int C_height;
	int C_age; 

	Candidate(){
		C_id = 0;
		C_name = "lol";
		C_weight = 0;
		C_height = 0;
		 C_age = 0;
	}

	Candidate(int id, String n,int w ,int h, int a){
		C_id = id;
		C_name = n;
		C_weight = w;
		C_height = h;
		 C_age = a;
	}
	public void get(){
		Scanner sc=new Scanner (System.in);

		System.out.println("enter id: ");
		C_id = sc.nextInt();	
		System.out.println("enter name: ");
		C_name = sc.next();
		System.out.println("enter weight: ");
		C_weight = sc.nextInt();
		System.out.println("enter height: ");
		C_height = sc.nextInt();
		System.out.println("enter age: ");
		C_age = sc.nextInt();
	}
	public void display(){
		System.out.println(C_id + " "+ C_name + " " +C_weight +" "+C_height +" "+C_age);
	}

}