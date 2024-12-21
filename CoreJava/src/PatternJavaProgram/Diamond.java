package PatternJavaProgram;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int row = 13;
		int space = 6;
		int star = 1;

		for (int i = 1; i <= row; i++)
		{
			for (int j = 1; j <= space; j++)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= star; k++)
			{
				System.out.print("*");
			}
			if (i <= 6) 
			{
				space--;
				star += 2;
			}
			else 
			{
				space++;
				star -= 2;
			}
			System.out.println();
		}
	}
}
