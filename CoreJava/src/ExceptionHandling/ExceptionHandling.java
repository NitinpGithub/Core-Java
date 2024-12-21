package ExceptionHandling;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		/*
		 * Exception - Exception mean abnormal condition
		   Exception is an event that can disrupt the normal flow of the program, it is an object which thown at runtime 
			
		 Exception handling is the powerful mechanism in java that can handle runtime error so 
		 that normal flow of the application can be maintained
		 
		 Types - 
		 1) Checked
		 2) Unchecked
		 3) Error
		 
		 Keyword - 
		  1) try     - we can place exception code inside try block and we cant use try block alon
		  		       The try block must followed by catch or finally
		  2) catch   - by using catch block we can handle exception, we can use catch block after try block
		  3) finally - we can put necessary code of the program inside finally block, finally block is executed 
		  			   weather exception handle or not
		  4) throw   - The throw keyword is use to throw an exception
		  5) throws  - The throws keyword is use to declare an exception
		  
		 Exceptions - 
		 
		 	1) ArthematicException
		 	2) ArrayIndexOutOfBoundException
		 	3) NullPointerException
		 	4) FileNotFoundException
		 	5) IOException
		 	6) ClassNotFoundException
		 	7) NoSuchFileException
		 */
		
		int i=10;
		int div = 0;
		try
		{
			div = i/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception happen");
		}
		finally
		{
			System.out.println("from finally");
		}
		
		
		
		

	}

}
