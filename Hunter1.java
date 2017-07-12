package guvi;

import java.util.Scanner;

public class Hunter1 {
	public static void main(String args[])
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter the String:");
			String s1=in.nextLine();
		 StringBuffer sb=new StringBuffer(s1);
		 StringBuffer s2=sb.reverse();
		 String s3=s2.toString();
		
		 if(s1.equals(s3))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
		 System.out.println("not palindrome");
		 }
		
		}
}
