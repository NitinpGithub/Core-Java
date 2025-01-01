package String;

import java.util.Arrays;
import java.util.List;

public class SwapTwoWordFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "Hello my name is nitin";
		
		String w1 = "my";
		String w2 = "is";
		String arr[]=s.split(" ");
		
		List<String> l = Arrays.asList(arr);
		
		int i1=l.indexOf(w1);
		int i2 = l.indexOf(w2);
		
		String str="";
		
		for(int i=0;i<arr.length;i++)
		{
			if(i==i1)
			{
				str=str+arr[i2]+" ";
			}
			else if(i==i2)
			{
				str=str+arr[i1]+" ";
			}
			else
			{
				str=str+arr[i]+" ";
			}
		}
		System.out.println(str.trim());

	}

}
