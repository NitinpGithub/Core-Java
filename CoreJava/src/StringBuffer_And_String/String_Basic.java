package StringBuffer_And_String;

public class String_Basic
{

	public static void main(String[] args)
	{
		/*
		 * 
		 String is immuatble class which represent sequence of character
		 
		 Methods - 
		 
		 length();
		 charAt();
		 Substring() - Substring(1) - return all character from index 1
		 Substring(1,6) - 
		 replace();
		 toLowerCase();
		 toUppercase();
		 trim(); - remove leading and trailing spaces from string
		 equals();
		 contains(); - return true/false
		 indexOf() - return int value
		 split(); - splitting string into array using delimiter
		 
		 
		 
		 */
		
		String s1 = " Hello ";
		String s2 = "World";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		String s4 = s1.replace("H", "L");
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.contains(" Lello "));
		
		String str = "Hello World";
		String str1[] = str.split(" ");
		System.out.println(str1);
		
		for(int i=0;i<str1.length;i++)
		{
			System.out.print(str1[i]+" ");
		}

	}

}
