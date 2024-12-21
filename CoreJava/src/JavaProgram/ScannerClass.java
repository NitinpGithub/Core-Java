package JavaProgram;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		String str = s.next();
		char ch = s.next().charAt(0);
		System.out.println(str);
		System.out.println(ch);

	}

}
