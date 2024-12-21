package PatternJavaProgram;

public class PascleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int row=5;
		int space=4;
		int num=1;
		
		for(int i=0;i<row;i++)
		{
			num=1;
			
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<=i;k++)
			{
				System.out.print(num+" ");
				num = num*(i-k)/(k+1);
			}
			space--;
			System.out.println();
		}

	}

}
