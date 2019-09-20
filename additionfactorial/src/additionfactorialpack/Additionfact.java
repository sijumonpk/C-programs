package additionfactorialpack;

import java.util.Scanner;

public class Additionfact {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n,i,sum=0;
		do{
			System.out.println("Enter a number");
		n = sc.nextInt();
		if(n > 0)
		{
		for(i=0;i<=n;i++)
		{
			sum = sum+i;
		}
		System.out.println(sum);
		}}while(n<0);
		


}}
