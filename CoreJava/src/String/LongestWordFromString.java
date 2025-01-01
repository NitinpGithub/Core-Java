package String;

public class LongestWordFromString {

	public static void main(String[] args) {
		
		String s = "Hello my name is1234567 nitin123 patil nnjjjjhgsdsjadvsd";
		String arr[]=s.split(" ");
		String s1 = "";
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>s1.length())
			{
				s1=arr[i];
			}
		}
		System.out.println(s1);

	}

}
