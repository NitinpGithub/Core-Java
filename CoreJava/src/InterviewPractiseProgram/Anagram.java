package InterviewPractiseProgram;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String s1="listen";
		String s2="silett";
		String s3="";
		int count=0;
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram");
		}
		else
		{
			for(int i=0;i<s1.length();i++)
			{
				count=0;
				for(int j=0;j<s2.length();j++)
				{
					if(s1.charAt(i)==s2.charAt(j))
					{
						count++;
					}
				}
				if(count==1)
				{
					s3=s3+s1.charAt(i);
				}
			}
		}
		if(s3.length()==s1.length())
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not Anagram");
		}

	}

}
