import java.util.*;
class MarksArrayAndTotal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a[]= new int[8];

        for(int i=1;i<=7;i++){
        System.out.println("enter "+i+" marks: ");
		a[i]=sc.nextInt();
        }
        int t=0;
        for(int i=1;i<=7;i++){
        t=t + a[i];
        }
        System.out.println("total: "+t);
    }
}
    