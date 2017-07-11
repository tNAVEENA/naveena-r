package guvi;

import java.util.Scanner;

public class EscapeQ {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
		System.out.print("Enter departure city <'Q' or 'q' to exit>: ");
		String input = sc.next();

		if(!(input.equals('q')) || !(input.equals('Q'))){
		
		}
		else{
		System.exit(0);
		}
	}

	}
}
