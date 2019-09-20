package boxingteampack;

import java.util.Scanner;

public class Boxing {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of players");
		int n,i,temp=0;
		int pos=0;
		n = sc.nextInt();
		System.out.println("Enter the number of fouls made by each player");
		int arr[] = new int[n];
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int small=arr[0];
      for(i=1;i<n;i++)
      {  
    	  if(arr[i]<small)
    	  {
    		small=arr[i];
    		pos=i;
    	  }
    		  
      }
      System.out.println("The eligible player is player no: "+ ++pos+" ("+small+"fouls)");
 }

	

}
