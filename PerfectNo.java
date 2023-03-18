import java.util.*;
class PerfectNo{
      public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i,c=0;
		for(i=1;i<a;i++){
			if(a%i==0){
				c=c+i;
			}
		}
		System.out.println("number is:" +c);
		if(a==c){
			System.out.println("number is perfect");
		}
		else{
			System.out.println("number is not perfect");}
	}
}