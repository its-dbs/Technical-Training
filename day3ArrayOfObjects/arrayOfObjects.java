package day3ArrayOfObjects;

import day2GetterNSetterMethods.Employee;
import java.util.*;

public class arrayOfObjects {
	
	public static  void main(String [] a)
	{
		Scanner sc = new Scanner(System.in);
		
		Employee e1[] = new Employee[10];
		
		//Creating 3 new employee objects
		for(int i=0; i<3; i++)
		{
			e1[i] = new Employee();
		}
		
		//creating a for loop to take employee details
		for(int j=0; j<3; j++)
		{
			
			System.out.println("Enter your name: ");
			e1[j].setEmpName(sc.nextLine());
			
			System.out.println("Enter your email id: ");
			e1[j].setEmpEmail(sc.nextLine());
			
			
			System.out.println("Enter your salary: ");
			e1[j].setEmpSalary(sc.nextInt());
			sc.nextLine();
			
		}
		
		//creating a for loop to print details
		for(int k=0; k<3; k++)
		{
			System.out.println(e1[k]);
		}
	}

}
