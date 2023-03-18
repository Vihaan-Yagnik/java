import java.util.*;
public class AngleAndHypotenusOfTriangle{
	public static void main(String[] args) {
		pythagoreanTheorum pt = new pythagoreanTheorum();
		Scanner sc = new Scanner(System.in);

		pt.h = sc.nextDouble();
		pt.d= sc.nextDouble();

		pt.getAngle();
		pt.gethypotenus();

	}
}
class pythagoreanTheorum{
	double h;
	double d;

	void gethypotenus(){
		double gh = Math.sqrt((h*h)+(d*d));
		System.out.println(gh);
	}

	void getAngle(){
		double ga = Math.atan(h/d);
		System.out.println(ga);
	}

}