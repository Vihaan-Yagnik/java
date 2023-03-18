/*3. Create a class Rectangle that would contain length and width as an instance 
variable and count as a static variable. Define constructors 
[constructor overloading (default,
parameterized and copy)] to initialize variables of objects. 
Define methods to find area and to display variables value
 of objects which are created. [Note: define initializer
block, static initializer block and the static
 variable and method. Also demonstrate the sequence of execution
  of initializer block and static initialize block]*/




import java.util.*;
public class AllConstructorsWithRectangle{
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(3,5);
		Rectangle r1 = new Rectangle(r);


		System.out.println(r.width);
		System.out.println(r.height);
		r.getArea();


		System.out.println(r1.width);
		System.out.println(r1.height);
		r1.getArea();

	}
}
class Rectangle{
	int height;
	int width;

	Rectangle(){
		width = 0;
		height = 0;
	}
	Rectangle(int height, int width){
		this.width = width;
		this.height = height;
	}
	Rectangle(Rectangle r){
		this.width = r.width;
		this.height = r.height;

		System.out.println("this is copy constructor");
	}


	void getArea(){
		int area = (height*height)+(width*width);
		System.out.println("area is " +area);
	}
}