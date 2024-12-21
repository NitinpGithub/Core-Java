package JavaProgram;

public class Fibnocii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//0,1,1,2,3,5,8,13
		int add=0;
		int n1=0;
		int n2=1;
		System.out.println(n1);
		System.out.println(n2);
		int number=10;
		for(int i=2;i<=number;i++)
		{
			add=n1+n2;
			System.out.println(add);
			n1=n2;
			n2=add;
		}

	}

}
