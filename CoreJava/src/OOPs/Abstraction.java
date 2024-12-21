package OOPs;

abstract class abs
{
	abstract public void m1();
	
	public void m2()
	{
		System.out.println("from abstract m2()");
	}
}

abstract class abs1 extends abs
{
	public void m1()
	{
		
	}
}
public class Abstraction {

	public static void main(String[] args) {
		/*
		 Hiding lover level details and show only related and essential details
		 We can achieve Abstraction using abstract keyword
		 
		 Abstract Method - Method prefix with abstract keyword known as abstract method
		 				   Abstract method doesent hav method implementation ( method body)
		 				   Abstract method must end with semicolon
		 				   
		 Concrete Method - Method with implementation is called concrete method
		 
		 Abstract class - Class prefix with abstract keyword known as abstract class
		 
		 Note - If class contain abstract method then class should be made as abstract class or when we Inherit abstract method
		 			that time we have to make class as abstract class
		 		Abstract class can contain only Abstract method or only concrete method or both abstract as well as concrete method
		 		Abstract class have constructor but we cant create object of abstract class since it is incomplete class
		 		We canr make static method as abstract it generate compile time error
		 		
		 */

	}

}
