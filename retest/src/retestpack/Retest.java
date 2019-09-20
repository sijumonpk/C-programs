package retestpack;

import java.util.Scanner;

public class Retest {

	public static void main(String[] args) 
	
	{
		 Scanner sc = new Scanner(System.in);
		 int n,i,count = 0;
         System.out.println("Enter the number of students");
         n = sc.nextInt();
         int arr[] = new int[n];
         System.out.println("Enter the marks of students");
         
         for(i = 0;i < n;i++)
         {
        	 arr[i] = sc.nextInt();
         }
         for(i = 0;i < n;i++)
         {
        	if( arr[i] < 45)
        	{
               count++;        		
        	}
         }
         System.out.println("Number of students appearing for retest is "+count);
         
	}

}
