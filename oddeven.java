package bas;
import java.util.*;
public class oddeven { 
public static void main(String args[]){
	int num;

	Scanner input=new Scanner(System.in);
	System.out.println("enter an integer no:");
	num=input.nextInt();
	if(num%2==0)
		System.out.println("given no is even no:");
	else
		System.out.println("given no is odd no:");
			
}

}
