package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "aaaaaabbbbbbbcccccddddddeeeeeeefffff";
		String str="";
		String str1="";
		
		for(int i=0;i<s.length();i++)
		{
			if(str.indexOf(s.charAt(i))==-1)
			{
				str+=s.charAt(i);
			}
			else
			{
				str1+=s.charAt(i);
			}
		}
		System.out.println(str1);

	}

}
