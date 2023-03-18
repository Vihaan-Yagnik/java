import java.util.*;

public class RateOfInterest{

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);

		System.out.println("principale amount: ");
		double p=sc.nextInt();

		System.out.println("rate: ");
		double r=sc.nextInt();

		System.out.println(" time: ");
		double t=sc.nextInt();

		double a = in(p,r,t);
		System.out.println("ans: " + a);
		
	}

	public static double in(double p, double r, double t){
		double ans=(p*r*t)/100;
		return ans;
	}
}