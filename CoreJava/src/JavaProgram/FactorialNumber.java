package JavaProgram;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Number...!!!");
		int number = s.nextInt();
		int fact = 1;
		int number2=number;
		for(int i=1;i<=number;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
				

	}

}
