package resumepack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student {

	public static void main(String[] args) throws IOException {
	{
	  
	  String name;
	  String age;
	  String degree;
	  String branch;
	  String contact_number;
	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	  
	  
      System.out.println("Enter your Name");
	  name = br.readLine();
	  System.out.println("Enter your Age");
	  age = br.readLine();
	  System.out.println("Enter your Degree");
	  degree = br.readLine();
	  System.out.println("Enter your Branch");
	  branch = br.readLine();
	  System.out.println("Enter your contact number");
	  contact_number = br.readLine();
	  
	  
		System.out.println("Name      :  "+name);
		System.out.println("Age       :  "+age);
		System.out.println("Degree    :  "+degree);
		System.out.println("Branch    :  "+branch);
		System.out.println("Contact No:  "+contact_number);
 }
}
}