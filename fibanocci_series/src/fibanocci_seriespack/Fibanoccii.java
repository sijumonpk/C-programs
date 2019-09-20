package fibanocci_seriespack;

import java.util.Scanner;

public class Fibanoccii {

	public static void main(String[] args) 
	{
		int n,i,first=0,second=1,series;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.print(first+" ");
		System.out.print(second+" ");
		for(i = 0;i<=n;i++)
		{
		 	series = first+second;
		 	first = second;
		 	second = series;
		 	System.out.print(series+" ");
		}
		

	}

}
