package leapyear;
import java.util.Scanner;
public class leapyear {
	public static void main(String[] args)
	{
	int year;
	Scanner s=new Scanner(System.in);
			System.out.println("enter an year:");
			year=s.nextInt();
	if(year%4 == 0)
	{	System.out.println("given year is leap year");
	
	}
	else
	{
		System.out.println("given year is not a leap year");
	}
	
	}

}
