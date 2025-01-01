package String;

public class IfStringContainSubString {

	public static void main(String[] args) {
		String s1 = "Hello my name is nitin";
		String s2 = "nitin";
		
//		if(s1.contains(s2))
//		{
//			System.out.println("contain");
//		}
//		else
//		{
//			System.out.println("Not contain");
//		}
		
		String ch[] = s1.split(" ");
		
		for(int i=0;i<ch.length;i++)
		{	
			if(s2.equals(ch[i]))
			{
				System.out.println(s1.indexOf(i));
			}
		}
		
		

	}

}
