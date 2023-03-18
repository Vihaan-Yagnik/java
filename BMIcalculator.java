import java.util.*;
class BMIcalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter weight in kg's");
		float a=sc.nextFloat();

        System.out.println("enter height in meter");
		float b=sc.nextFloat();

        float BMI=a/(b*b);

        System.out.println("BMI is "+BMI);
    }
}