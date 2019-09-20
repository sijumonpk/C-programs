package mathteacherpack;

import java.util.Scanner;

public class Result {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,sum = 0;
		System.out.println("Enter a number");
		n = sc.nextInt();
		System.out.print("The divisors of the number are ");
		for(i=1;i <= n;i++)
		{
			if(n%i == 0)
			{
				System.out.print(i+" ");
				 sum = sum+i;
			}
		}
		System.out.println();
		System.out.println("The sum of the divisors are  "+sum);
        
	}

}
