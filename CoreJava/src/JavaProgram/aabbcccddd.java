package JavaProgram;

public class aabbcccddd {
	
	public static void main(String[] args) {
		String s = "abcdefg";
		int length = s.length();
		String str = "";
		for(int i=0;i<length;i++)
		{
			for(int j=0;j<=i;j++)
			{
				str = str+s.charAt(i);
			}
		}
		System.out.println(str);
	}

}
