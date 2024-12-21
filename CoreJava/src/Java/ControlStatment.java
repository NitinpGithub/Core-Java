package Java;

public class ControlStatment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	if
		 	else
		 	if-else
		 	switch
		 	
		 	loop
		 		- for
		 		- while
		 		- do-while
		 */
		
		
		 
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		
		
		int j=1;
		do
		{
			System.out.println(j);
			j++;
		}while(j<11);
		
		
		
		int k=10;
		
		switch(k)
		{
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("None");
		}
		

	}

}
