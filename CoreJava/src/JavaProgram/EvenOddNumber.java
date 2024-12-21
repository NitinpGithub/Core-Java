package JavaProgram;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = s.nextInt();
		for(int i=1;i<=number;i++)
		{
			if(i%2==0)
			{
				System.out.println(" Even Number = "+i);
			}
			else
			{
				System.out.println(" odd Number = "+i);
			}
		}

	}

}
