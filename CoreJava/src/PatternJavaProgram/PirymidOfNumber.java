package PatternJavaProgram;

public class PirymidOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int row=7;
		int space=6;
		
		for(int i=1;i<row;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			
			for(int l=i-1;l>=1;l--)
			{
				System.out.print(l);
			}
			
			space--;
			System.out.println();
		}


	}

}
