import java.util.*;
public class AreaToDiameter{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter area:");
		float a=sc.nextFloat();


        double d=Math.sqrt((a/3.14));

        System.out.println("diameter is "+(d*2));
    }
}