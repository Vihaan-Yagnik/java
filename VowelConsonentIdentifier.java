import java.util.*;
public class VowelConsonentIdentifier{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter character:");
	char a=sc.next().charAt(0);
    if(a == 'a' || a== 'i' || a=='e' || a=='o' || a=='u')
    {
        System.out.println("vowel");
    }
    else
    {
         System.out.println("cosonent");
    }
}
}