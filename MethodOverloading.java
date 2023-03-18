import java.util.*;

public class MethodOverloading{

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
 
 	System.out.println("enter 1-for circle, 2- for square, 3- for triangle");
 	int n= sc.nextInt();

 	switch (n){
    	case 1:
    	System.out.println("circle it is enter radius");
 		double r = sc.nextDouble();

 		double ans= meth(r);
 		System.out.println(ans);
 		break;

 		case 2:
    	System.out.println("square it is enter length");
 		int l = sc.nextInt();

 		meth(l);
 		double ans1= meth(l);
 		System.out.println(ans1);

 		break;

 		case 3:
    	System.out.println("triangle it is enter b and h");
 		double b = sc.nextDouble();
 		double h = sc.nextDouble();
		meth(b,h);
		double ans2= meth(b,h);
 		System.out.println(ans2);


 		break;
 	}
}
public static double meth(double r){
	return 3.14*(r*r);
}
public static int meth(int l){
	return l*l;
}
public static double meth(double b, double h){
	return 1/2*b*h;
}
}