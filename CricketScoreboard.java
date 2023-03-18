import java.util.*;
public class CricketScoreboard{
		public static void main(String[] args) {
        int trun=0,wicket=0;

        Scanner sc=new Scanner(System.in);
        int a[][]= new int[10][10];
        for(int j=1;j<=10;j++){
        	System.out.println(j+"\tover");
        	for(int i=1;i<=6;i++){
		        System.out.println("enter "+i+" ball run: ");
				a[i][j]=sc.nextInt();
				if(a[i][j]==-1){
					i=i-1;
					trun+=1;
				}
				else if(a[i][j]==-2){
					wicket++;
				}
				else if(a[i][j]==-3){
					while(a[i][j]==-3||a[i][j]==-1){
					if(a[i][j]==-1)	{
					a[i][j]=1;
					i--;
				}
					else{
					System.out.print("enter run:");
					trun++;
					a[i][j]= sc.nextInt();}}
				}
				trun+=a[i][j];

		        }
		        System.out.println(j+ "  over run= "+trun);
		        System.out.println(j+ "  over wicket= "+wicket);

		    }
				System.out.println(trun);
				System.out.println(wicket);
			}
		}
