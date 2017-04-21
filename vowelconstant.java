package srm;
import java.util.Scanner;

public class vowelconstant {
public static void main(String[]args){
	char ch;
	Scanner scan=new Scanner(System.in);
	System.out.print("enter a character:");
	ch=scan.next().charAt(0);
	if(ch=='a'||ch=='A'||ch=='E'||ch=='e'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U');
	{
		System.out.print("it is vowel");
		
	}
	else
	{
		System.out.print("it is constant");
	}
}
}
