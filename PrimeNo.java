import java.util.*;
class PrimeNo{
      public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i,count=0;
		for(i=2;i<a/2;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==0){
			System.out.println("prime");
		}
		else{
			System.out.println("not prime");
		}
	}
}