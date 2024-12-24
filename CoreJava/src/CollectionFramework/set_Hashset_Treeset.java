package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class set_Hashset_Treeset {

	public static void main(String[] args) {
		
		/*
		 add();
		 size();
		 clear();
		 isEmpty();
		 indexOf();
		 remove();
		 contains();
		 
		 Same methods for TreeSet
		 
		 */
		Set<Integer> s1 = new HashSet<>();
		s1.add(1);
		s1.add(6);
		s1.add(4);
		s1.add(3);
		s1.add(5);
		s1.add(2);
		s1.add(2);
		System.out.println(s1);
		
		Iterator<Integer> itr = s1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		Set<Integer> t1 = new TreeSet<>();
		t1.add(1);
		t1.add(6);
		t1.add(4);
		t1.add(3);
		t1.add(5);
		t1.add(2);
		t1.add(2);
		System.out.println(t1);
		

	}

}
