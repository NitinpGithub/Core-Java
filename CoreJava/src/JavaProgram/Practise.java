package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Practise {

	public static void main(String[] args)
	{
		String s = "length";
		String s1 = "kkjjlnhh";
		String s2 = "";
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<s1.length();j++)
			{
				String str=Character.toString(s.charAt(i));
				if(s1.contains(s2))
				{
					s2+=str;
				}
			}
			
		}
		System.out.println(s2);
	}
}
