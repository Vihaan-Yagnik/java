import java.util.*;
class Calculator{
      public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		String c=sc.next();
		switch(c){
			case("+"):
				System.out.println("number is :"+(a+b));
				break;
		
			case("-"):
				System.out.println("number is :"+(a-b));
				break;

			case("/"):
				System.out.println("number is :"+(a/b));
				break;
	
			case("*"):
				System.out.println("number is :"+(a*b));
				break;
}
}