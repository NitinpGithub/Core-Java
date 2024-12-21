package JavaProgram;

public class PreAndPostIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=10;
		int j=20;
		
	
		
	
		int c = --i + j-- + ++i + j-- + ++i + --i ;
		//     9+20+10+19+11+10
		
		// i  = 11
		// j  = 18
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(c);
		

	}

}
