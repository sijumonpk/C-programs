package physicaltrainerpack;

import java.util.Scanner;

public class Hight {

	public static void main(String[] args) 
	
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		n = sc.nextInt();
		System.out.println("Enter the heights of students");
		double arr[] = new double[n];
		for(int i = 0;i<n;i++)
		{
			arr[i] = sc.nextDouble();
		}
		System.out.println("Hieght in order");
		double temp=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
				temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				
			}
			
			System.out.println(arr[i]);
			
		}
     
	}

}
