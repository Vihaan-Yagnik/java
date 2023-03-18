import java.util.*;

public class ConstructorForBank{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);

		Bank s1 = new Bank();
		Bank s2 = new Bank();
		s1.get();
		s1.display();
		s2.display();

	}

}
//Bank_Account with Account_No, User_Name, Email, Account_Type and Account_Balance data members
class Bank{
	int accNo;
	String name;
	String email;
	String atype;
	int balance;
	 

	Bank(){
		accNo = 0;
		name = "lol";
		email = "lol";
		atype = "lol";
		balance = 0;
	}

	Bank(int a, String n,String e ,String t, int b){
		accNo = a;
		name = n;
		email = e;
		atype =  t;
		balance = b;
	}
	public void get(){
		Scanner sc=new Scanner (System.in);

		System.out.println("enter accno: ");
		accNo = sc.nextInt();	
		System.out.println("enter name: ");
		name = sc.next();
		System.out.println("enter email: ");
		email = sc.next();
		System.out.println("enter atype: ");
		atype = sc.next();
		System.out.println("enter balance: ");
		balance = sc.nextInt();
	}
	public void display(){
		System.out.println(accNo + " "+ name + " " +email +" "+atype +" "+balance);
	}

}