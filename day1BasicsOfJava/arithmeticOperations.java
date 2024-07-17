package day1BasicsOfJava;

public class arithmeticOperations {

	public static void main(String[] args) {
		int no1, no2;
		no1 = 3;
		no2 = 34;
		
		int sub = no2 - no1;
		int add = no1 + no2;
		int mul = no1 * no2;
		
		//type casting example
		float div = (float) no2 / no1;
		
		//print the answers:

		System.out.println("Subtraction: " +sub);
		System.out.println("Addition: " +add);
		System.out.println("Multiplication: " +mul);
		System.out.println("Division: " +div);
		

	}

}
