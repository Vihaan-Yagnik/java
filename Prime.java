import java.util.*;

public class Prime{

	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);

		int n = sc.nextInt();

		int a = prime(n);
		if(a==1){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	}

	public static int prime(int n){
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				return 0;
			}
		}
		return 1;
	}
}