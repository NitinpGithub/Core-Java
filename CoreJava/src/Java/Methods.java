package Java;

public class Methods 
{
	/*
	 Method is a block of code which is run when we call it.
	 We can pass data, known as parameter to the method.
	 Method is also known as Function.
	 
	 If we create static method then we don't need object of that class 
	 to call the static method. static method belong to the main class
	 
	 while if we create a non-static method then we need object of that class
	 to call non static method. non static method belong to the object of that class
	 
	 */
	
	// non static method
	public void m1()
	{
		System.out.println("from non static method m1()");
	}
	
	// static method
	static void m2()
	{
		System.out.println("from static method m2()");
	}

	// Parameterized method with return value
	public static int add(int a)
	{
		int b=2;
		return a+b;
	}
	
	// Method overloading - Multiple method with same name but different parameter
	
	public static int add(int a, int b)
	{
		int sum=0;
		sum=a+b;
		return sum;
	}
	
	// Recursive Method - Method calling itself called as Recursive method
	// Print 1-10 number without using loop ( Using Recursive Method )
	
	public void addition(int a)
	{
		if(a<=10)
		{
			
			System.out.println(a);
			a++;
			addition(a);
		}
		
	}
	public static void main(String[] args)
	{
		Methods m = new Methods();
		
//		m.m1();
//		m2();
		
		m.addition(1);

	}

}
