package com.Percentage;
import java.util.Scanner;
public class Results {

	public static void main(String[] args)
	{
		int Maths,Computers,English,Hindi,Science;
		float total,percentage;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Marks of Below Subjects :");
		Maths=sc.nextInt();
		Computers=sc.nextInt();
		English=sc.nextInt();
		Hindi=sc.nextInt();
		Science=sc.nextInt();
	
		total=Maths+Computers+English+Hindi+Science;
		percentage=(total/500)*100;
		 
		System.out.println("Total Marks: " +total);
		System.out.println("Percentage: "+percentage);
		
		if(percentage>=90)
		{
			System.out.println("You got A Grade");
		}
		else if(percentage>=75)
		{
			System.out.println("You got B Grade");
		}
		else if(percentage>=60)
		{
			System.out.println("You got C Grade");
		}
		else if(percentage>=50)
		{
			System.out.println("You got D Grade");
		}	
		else if(percentage>=35)
		{
			System.out.println("You got E Grade");
		}
		else 
	  {
		System.out.println("Sorry!! You are Fail");
	  }
	
  }
}
