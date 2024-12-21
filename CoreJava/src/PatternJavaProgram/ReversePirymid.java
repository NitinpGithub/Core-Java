package PatternJavaProgram;

public class ReversePirymid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=7;
		int space=0;
		int star=13;
		
		for(int k=1;k<=row;k++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=star;i++)
			{
				System.out.print("*");
			}
			space++;
			star-=2;
			System.out.println();
		}
		

	}

}
