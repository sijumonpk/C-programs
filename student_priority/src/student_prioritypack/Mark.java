package student_prioritypack;

import java.util.Scanner;

public class Mark {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int n,i;
		System.out.println("Enter the number of students");
		n = sc.nextInt();	
		int arr[] = new int[n];
		for(i=0;i< n; i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("The priority of marks is");
        int temp = 0;
        for(i=0;i<n;i++)
        {
        	for(int j=i;j<n;j++)
        	{
        		if(arr[i]<arr[j])
        		{
        	    temp = arr[i];
        	    arr[i]=arr[j];
        	    arr[j]=temp;
        		}
        	}
        	
        }
		
        for(i=0;i<n;i++)
    	{
    	System.out.println(arr[i]);
    	}
	}	
}
