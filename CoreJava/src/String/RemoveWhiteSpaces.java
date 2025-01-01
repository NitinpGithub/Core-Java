package String;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		
		String s = "bhgvavga habahbsahsba b sahsbahsba bhsabsa sb as asas as";
		//System.out.println(s.replace(" ", ""));
		String s1 = "";
		
		for(int i=0;i<s.length();i++)
		{
			
			if(s.charAt(i)!=' ')
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);

	}

}
