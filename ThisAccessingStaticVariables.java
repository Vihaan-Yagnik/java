//1. Write a program in Java to demonstrate use of this keyword
//. Check whether this can access the Static variables of the class or not.

public class ThisAccessingStaticVariables{
	public static void main(String[] args) {
		Lol l = new Lol(2,3);
		System.out.println(l.smthn);
		System.out.println(l.check);
	}
}
class Lol{
	int smthn;
	static int check;

	public Lol(int smthn, int check){
		this.smthn=smthn;
		this.check= check;
	}
}