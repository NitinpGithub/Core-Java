package InterviewPractiseProgram;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "nitinn";
		String p = "";
		
		
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			String l = Character.toString(ch);
			if(!p.contains(l))
			{
				p+=s.charAt(i);
			}
		}
		System.out.println(p);

	}

}
