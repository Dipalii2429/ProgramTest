package Test1;

import java.util.Scanner;

public class Person {
	int age[],n;
	Scanner s;
	void getData()
	{
		s= new Scanner(System.in);
		System.out.print("Enter the number of persons: ");
		n=s.nextInt();
		age= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the age of person "+(i+1) + " :");
			age[i]= s.nextInt();
		}
	}
	
	void check()
	{
		int children=0,adults=0,senior=0;
		for(int i=0;i<n;i++)
		{
			if(age[i]<18)
			{
				children++;
			}
			else if(age[i]>=18 && age[i]<=54)
			{
				adults++;
			}
			else
			{
				senior++;
			}
		}
		System.out.println("children: "+children);
		System.out.println("Adult: "+adults);
		System.out.println("senior citizen: "+senior);
		
	}
}