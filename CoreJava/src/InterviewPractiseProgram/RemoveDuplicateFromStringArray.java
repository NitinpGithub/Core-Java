package InterviewPractiseProgram;

public class RemoveDuplicateFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[] = {"aaa","ccc","vvv","aaa","bbb","hhh","fff","ddd","sss","vvv","bbb","hhh"};
		String s="";
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(!s.contains(arr[i]))
			{
				s=s+arr[i]+" ";
			}
		}
		System.out.println(s);

	}

}
