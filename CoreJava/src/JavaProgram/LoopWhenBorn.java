package JavaProgram;

import java.util.Scanner;

public class LoopWhenBorn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=3;i++)
		{
			System.out.println(
					"Enter your Birth Number accordingly like 1 for january and 12 for December");
			
			Scanner s = new Scanner(System.in);
			int birthMonth = s.nextInt();
			String season = "";
			
			if(birthMonth>=1 && birthMonth<=4)
			{
				season = "Winter";
			}
			
			if(birthMonth>=5 && birthMonth<=8)
			{
				season = "Spring";
			}
			
			if(birthMonth>=8 && birthMonth<=12)
			{
				season = "Summer";
			}
			
			System.out.println(season);
		}
		
		

	}

}
