
package largestno;
import java.util.Scanner;
public class largestno {
	public static void main(String[] args)
	{
	int a,b,c;
	Scanner s=new Scanner(System.in);
	System.out.println("enter any three no:");
	 a=s.nextInt();
	 b=s.nextInt();
	 c=s.nextInt();

	if(a>b&&a>c)
	{
		System.out.println("largest no : "+a);
		
	}
	else if(b>a&&b>c)
{
	System.out.println("largest no: "+b);
	
}
	else
{
	System.out.println("largest no: "+c);
}
}
}
