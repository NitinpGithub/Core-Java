package JavaProgram;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10;
		int b=21;
		int add=0;
		
		do
		{
			add = 0;
			Scanner s = new Scanner(System.in);
			a = s.nextInt();
			b = s.nextInt();
			add = a+b;
			if(add==30)
			{
				System.out.println(add);
			}
			else
			{
				System.out.println("try again");
			}
		}while(add!=30);
	}

}
