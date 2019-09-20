package tollgatepack;

import java.util.Scanner;

public class Toll {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,count=0,count2=0;
		System.out.println("Enter the number of vehicles");
		n = sc.nextInt();
		System.out.println("Enter the fare collected for each vehicles");
		int arr[] = new int[n];
		{
			for(i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
				if(arr[i]<50 && arr[i]>0)
				{
					count++;
				}
				else if(arr[i]>50)
				{
					count2++;
				}
			}
			System.out.println("Number of heavy vehicles "+count2+" and the number of light weight vehicles is "+count);
		}

	}

}
