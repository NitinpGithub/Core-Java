package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_
{

	public static void main(String[] args) 
	{
		
		/*
		 
		 Methods - 
		 	> add() -- add(indexNumber,Value)
		 	> size()
		 	> remove()
		 	> contains()
		 	> clear()
		 	> indexOf()
		 	> isEmpty()
		 	> set()
		 	
		 
		 */
		
		List<String> l1 = new ArrayList<>();
		
		l1.add("Hello");
		l1.add("World");
		System.out.println(l1);
		
		l1.add(0,"Fello");
		System.out.println(l1);
		
		System.out.println(l1.get(0));
		
		l1.remove(0);
		System.out.println(l1);
		
		l1.set(1, "Apple");
		System.out.println(l1);
		
		l1.size(); // return size
		
		l1.isEmpty(); // return true
		
		l1.contains("Apple"); // return true/false
		System.out.println(l1.contains("Apple"));
		
		l1.indexOf("Apple"); // return index
		System.out.println(l1.indexOf("Apple"));
		
		l1.clear();
	}

}
