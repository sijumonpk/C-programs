package examavaragepack;

import java.util.Scanner;

public class Avarage {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,temp=0,sum=0,avg;
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
			
			sum = sum+arr[i];
		}
		
		avg=sum/n;
		System.out.println("The average is "+avg);
		

	}

}
