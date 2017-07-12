package guvi;

import java.util.Scanner;

public class Hunter6 {
	 public static void main(String[] args)
	 {
	  int num=0,count=0;
	  System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int[] Arr=new int[n];
	  System.out.println("ENTER THE ELEMENTS:");
	  for(int i=0;i<n;i++)
	   {
	     Arr[i]=s.nextInt();
	    }
	  for(int i=0;i<n;i++)
	    { 
	      if(count==0)
	      {
	         for(int j=i+1;j<n;j++)
	         {
	           if(Arr[i]==(Arr[j]))
	            { 
	              num=Arr[i];
	              count+=1;
	              break;
	            }
	         }
	       }
	                
	    } System.out.println("REPEATED ELEMENT:"+num); 
	 }
	} 

