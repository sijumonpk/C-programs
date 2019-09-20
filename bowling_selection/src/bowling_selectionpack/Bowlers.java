package bowling_selectionpack;

import java.util.Scanner;

public class Bowlers {

	public static void main(String[] args) 
	
	{   Scanner sc = new Scanner(System.in);
		int n,i,count=0;
		float over,eco;
		System.out.println("Enter the number of bowlers");
		n = sc.nextInt();
		double arr[] = new double[n];
		System.out.println("Enter the runs conceded by the bowlers");
		for(i = 0;i<n;i++)
		{
			arr[i] = sc.nextDouble();
		}
		System.out.println("Enter the number of balls for each bowler");
		
		double arr2[] = new double[n];
		for(i = 0;i<n;i++)
		{
			arr2[i]=sc.nextDouble();
			
		}
		double arr3[] = new double[n];
		for(i=0;i<n;i++)
		{
			arr3[i] = arr2[i]/6;
			
		}
		double result[] = new double[n];
		double sum=0;
		for(i=0;i<n;i++)
		{
		  
		  result[i]=arr[i]/arr3[i];	
		  
		}
		
		System.out.println("Economy of the bowlers is ");
		
		for(i=0;i<n;i++)
		{   double x=result[i];
			System.out.println(x);
		}
		for(i=0;i<n;i++)
		{
			sum=sum+result[i];
			
		}
		eco =(float) (sum/n);
		System.out.println("The overall economy of the teanm is "+eco);
	    
		for(i=0;i<n;i++)
		{
		  if(result[i]<eco)
		  {
			  count++;
		  }
		}
		System.out.println("The number of bowlers eligibleare "+count);
	}

}
