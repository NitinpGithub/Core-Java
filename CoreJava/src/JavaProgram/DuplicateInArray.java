package JavaProgram;

public class DuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,6,5,1,4,7,8,3,2,3};
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length-1;j++)
			{
				if(arr[i]==arr[j]&&i!=j)
				{
					System.out.println(arr[i]);
				}
			}
		}

	}

}
