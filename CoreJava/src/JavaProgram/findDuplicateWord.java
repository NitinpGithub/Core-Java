package JavaProgram;

public class findDuplicateWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "aaa bbb ccc vvv aaa ggg hhh ddd bbb";
		String duplicate[] = s.split(" ");
		
		int count=0;
		for(int i=0;i<duplicate.length;i++)
		{
		count=1;
		
		for(int j=i+1;j<duplicate.length;j++)
		{
			if(duplicate[i].equals(duplicate[j]))
			{
				count++;
				duplicate[j]=" ";
			}
			
		}
		if(count>1 && duplicate[i]!=" ")
		{
			System.out.println(duplicate[i]);
		}
		}

	}

}
