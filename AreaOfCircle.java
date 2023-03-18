//6. WAP to create Circle class with area and perimeter function to find area and perimeter of circle.


import java.util.*;
public class AreaOfCircle{
	public static void main(String[] args) {
		Circle em1 = new Circle();
		em1.getAr();
		double b=em1.area();
		System.out.print(b);

	}
}
class Circle{
	int r;

	public void getAr(){
		Scanner sc = new Scanner(System.in);

		System.out.print("radius=: ");
		r= sc.nextInt();
	}
	public double area(){
		double a = 22/7 * r *r;
		return a;
	}
}
