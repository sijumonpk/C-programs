package jumbled_letterpack;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) 
	
	{
		int n,i;
		long fact=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number alphabets in your name");
		n = sc.nextInt();
		
		for(i = 1;i<=n;i++)
		{
			fact=i*fact;
		}
		
		long z =fact;;
		System.out.println("The number of combination is  "+z);

	}

}
