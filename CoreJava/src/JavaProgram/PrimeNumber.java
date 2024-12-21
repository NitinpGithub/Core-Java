package JavaProgram;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int count=0;
		
//		for(int i=1;i<=n;i++)
//		{
//			if(n%i==0)
//			{
//				count++;
//			}
//		}
		
		for(int i=2;i<=n;i++)
		{
			count=0;
			
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
//			else
//			{
//				System.out.println("Not Prime - "+i);
//			}
			
		}
		

	}

}
