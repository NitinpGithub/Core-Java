package String;

import java.util.Arrays;

public class CharArrayToString {

	public static void main(String[] args) {
		
		char ch[] = {'a','s','d','f','g','h','j','k'};
		
		//String s = new String(ch);
		
		//String s = String.valueOf(ch);
		
//		StringBuilder s = new StringBuilder();
//		for(int i=0;i<ch.length;i++)
//		{
//			s.append(ch[i]);
//		}
		
		String s = Arrays.toString(ch);
		System.out.println(s);

	}

}
