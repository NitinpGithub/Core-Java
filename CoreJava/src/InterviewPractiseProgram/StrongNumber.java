package InterviewPractiseProgram;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a= 153;
		int b=a;
		int sum=0;
		
		int length = (Integer.toString(a)).length();
		while(a>0)
		{
			int res=a%10;
			int c = 1;
			 for(int i=0;i<length;i++)
			 {
				 c=c*res;
			 }
			 a=a/10;
			 sum=sum+c;
		}
		
		if(sum==b)
		{
			System.out.println("Armstrong number");
		}
		

	}

}
