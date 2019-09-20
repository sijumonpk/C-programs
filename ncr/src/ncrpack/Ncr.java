package ncrpack;

import java.util.Scanner;

public class Ncr {
	long fact = 1;
    int limit ;
	public static void main(String[] args) 
	{
		int n,r;
		long result1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n ");
		n = sc.nextInt();
		System.out.println("Enter the value of r ");
		r = sc.nextInt();
		Ncr obj = new Ncr();
		result1=obj.fact(n);
		long result2 = obj.fact(r);
		long result3 = obj.fact(n-r);
		///obj.fact(r)*obj.fact(n-r);
		long result=result1/(result2*result3);
		System.out.println("The NCR factor for given values is "+result);
		
      
	}

	long fact(int limit) {
		fact=1;
	    for(int i = 1; i <= limit; i++)
	    {
	  	  fact = fact * i;
	    }
	    return fact;
	}
	
}
