package JavaProgram;

public class PalindromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=12345;
		int n2=n1;
		int rev=0;;
		int n3;
		while(n1>0)
		{
			n3=n1%10;
			rev=rev*10+n3;
			n1=n1/10;	
		}
		if(rev==n2)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not palindrom");
		}

	}

}
