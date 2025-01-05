package OOPs;

interface i1
{
	static public void m1()
	{
		System.out.println("static from m1()");
	}
}
interface i2 extends i1
{
	
}

class c1  
{
	
}
class c2 extends c1 implements i1,i2 
{
	
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Interface is used to achive abstraction in java as well as multiple inheritance
		 Interface could have only abstract method and by default variable is public static and final
		 
		 Class vs Interface
		 
		 Class - We can create Object of class
		 		 A class can contain concrete (method with implementation ) method
		 		 We can use public,private and protected access modifier
		 		 
		 Interface - We cant create Object of interface
		 			 Interface can contain only abstract method
		 			 can use only public access modifier
		 			 
		 Note - One class can extend another class
		 		One class can implement interface
		 		One interface can extend another interface
		 */

	}

}
