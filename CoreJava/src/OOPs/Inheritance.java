package OOPs;

class empSal
{
	String empaname;
	int sal = 10000;
}

class empBonus extends empSal
{
	int bonus = 2000;
}

public class Inheritance {

	public static void main(String[] args) 
	{
		/*
		 The process of aquiring properties and behavior of a parent class to the child class 
		 is called as Inheritance
		 
		 Parent class also called as Super class in java and Sub child class is also called sub class in java
		 
		  The process of aquiring properties and behavior of a Super class to the Sub class 
		 is called as Inheritance
		 
		 Advantages of Inheritance
		 1) Cod Re-usability
		 2) Data hiding
		 3) Overriding
		 
		 Disadvantages of Inheritance
		 1) Inherited functions work slower than normal function as there is indirection.

		 2) Improper use of inheritance may lead to wrong solutions.

		 3) Often, data members in the base class are left unused which may lead to memory wastage.

		 4) Inheritance increases the coupling between base class and derived class. 
		 	A change in base class will affect all the child classes.
		 
		 Types of inheritance - 
		 1) Single level - minimum or maximum 2 classes ( one is super and another is sub )
		 
		 2) Multilevel - more than 3 classes ( class V1, class V2 extends V1, class v3 extends V2)
		  
		 3) Multiple level - Means there is 2 Super class and 1 sub class, This is not possible in java
		 					 Because there are diamond ambiguity problem and constructor chaining problem
		 					 
		 4) Hierarchical level - There is 1 super class and multiple sub class, used in abstraction
		 5) Hybrid level
		 
		 
		 */
		
		empBonus b = new empBonus();
		System.out.println(b.sal);
		System.out.println(b.bonus);

	}

}
