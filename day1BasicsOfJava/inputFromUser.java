package day1BasicsOfJava;

/*Take percentage from user:
 * if >90 then print grade A
 * if between 80 to 90 then grade B
 * if less than 80 then grade c*/

import java.util.*;

public class inputFromUser {

		public static void main(String [] a)
		{
			System.out.println("Hello User");
			
			int percentage;
			
			System.out.println("Please enter your percentage to check your grade: ");
			
			Scanner sc = new Scanner(System.in);
			percentage = sc.nextInt();
			
			System.out.println("Your percentage is: " + percentage);
			
			//checking grade:
			if (percentage > 90)
			{
				System.out.println("Your grade is: A");
			}
			else if (percentage > 80 && percentage <= 90)
			{
				System.out.println("Your grade is: B");
			}
			else
			{
				System.out.println("Your grade is: C");
			}
			
		}
}
