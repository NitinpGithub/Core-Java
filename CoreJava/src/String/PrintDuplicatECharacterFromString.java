package String;

public class PrintDuplicatECharacterFromString {

	public static void main(String[] args) {
		String s = "aaabbbcccddd";
		String dupChar = "";
		String dupChar1 = "";

		for (int i = 0; i < s.length(); i++)
		{
			if (dupChar.indexOf(s.charAt(i)) == -1)
			{
				dupChar+=s.charAt(i);
				
			}
			else
			{
				dupChar1+=s.charAt(i);
			}
		}
		System.out.println(dupChar1);

	}

}
