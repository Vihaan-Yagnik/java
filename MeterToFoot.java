import java.util.*;
class MeterToFoot{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter number in meter");
		float a=sc.nextFloat();
        a*=3.28;
        System.out.println("foot is "+a);
    }
}