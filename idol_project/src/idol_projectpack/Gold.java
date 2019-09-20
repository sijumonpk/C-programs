package idol_projectpack;

import java.util.Scanner;

public class Gold {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,i,count=0,count2=0,count3=0;
		int total=0;
		System.out.println("Enter the kgs of gold");
		n = sc.nextInt();
		while(n>0) {
			
			total=total+n;
			n=n/5;
			
		}
		
		System.out.println("Number of Sculptors can be made is "+total);

	}

}
