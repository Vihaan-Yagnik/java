import java.util.*;

public class Fibonacci{

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);


		System.out.println("enter n: ");
		int n = sc.nextInt();

		fib(n);

}
public static void fib(int n){
	int i;

		for(i=0;i<n;i++){
			int ans = i+(i-1);

			System.out.print(ans+",");
}
}}
