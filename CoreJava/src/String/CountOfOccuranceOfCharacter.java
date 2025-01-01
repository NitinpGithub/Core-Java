package String;

import java.util.HashMap;
import java.util.Map;

public class CountOfOccuranceOfCharacter {

	public static void main(String[] args) {
		
		String s = "aaabbbcccdddeeefffgggh1";
		
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		map.forEach((key,value) ->
		{
			System.out.println(key+"  -  "+value );
		}
		);
	}

}
