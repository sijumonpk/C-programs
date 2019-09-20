package armstrong_numberpack;
import java.util.Scanner;
public class Armstrong {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number,last;
		int sum = 0;
		
		
        System.out.println("Enter a Number");
        number = sc.nextInt();
        int temp = number;
        for(int i = 1;i<=3;i++)
        {
        	last = number%10;
        	sum =(int) (sum+ Math.pow(last,3));
        	number = number/10;
        } 
      
        if(sum == temp)
        	System.out.println("It is armstrong number");
        else
        	System.out.println("Number is not armstrong");
        
        
	}

}
