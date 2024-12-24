package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;

public class HashMap_ {

	public static void main(String[] args) {

		HashMap<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "D");
		map.put(3, "T");
		map.put(4, "H");
		map.put(5, "E");
		map.put(6, "K");
		map.put(7, "B");
		System.out.println(map);
		
		
		map.forEach((key,value)->
		{
			System.out.println(key+" "+value);
			
		});
		
		

	}

}
