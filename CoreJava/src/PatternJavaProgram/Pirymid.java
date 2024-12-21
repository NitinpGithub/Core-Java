package PatternJavaProgram;

public class Pirymid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=7;
		int space=6;
		int star=1;
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			
			space--;
			star+=2;
			System.out.println();
		}

	}

}
