package String;

public class RemoveDigitFromString {

	public static void main(String[] args) {


		String s = "hjsdhasbhb15454hkgjvh232";
		String str = "";
		String digit = "";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='a'||s.charAt(i)>='z'||s.charAt(i)>='A'||s.charAt(i)>='Z')
			{
				str+=s.charAt(i);
			}
			else
			{
				digit+=s.charAt(i);
			}
		}
		System.out.println(str);
		System.out.println(digit);

	}

}
