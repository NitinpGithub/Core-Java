package String;

public class AnagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "listen";
		String s2 = "silenk";
		
		int counter=0;
		int finalCount=0;
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				counter=0;
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						counter++;
					}
				}
				if(counter==1)
				{
					finalCount++;
				}
			}
			
			if(finalCount==s1.length())
			{
				System.out.println("Anagram");
			}
			
			else
			{
				System.out.println("String Not Anagram..!!!");
			}
			
		}
		
		else
		{
			System.out.println("String Not Anagram..!!!");
		}
	}

}
