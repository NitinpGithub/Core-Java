package JavaProgram;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Pick Day from 1-7...!!!");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = s.next().charAt(0);
		int a = s.nextInt();

		switch (a) {
		case 1: {
			System.out.println("Sunday");
			break;
		}
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
		case 4: {
			System.out.println("Webnesday");
			break;
		}
		case 5: {
			System.out.println("Thursday");
			break;
		}
		case 6: {
			System.out.println("Friday");
			break;
		}
		default: {
			System.out.println("You couldnt choose value from 1-7..!!!");
			break;
		}
		case 7: {
			System.out.println("Saturday");
			break;
		}

		}

	}

}
