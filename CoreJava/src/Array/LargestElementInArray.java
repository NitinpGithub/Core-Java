package Array;

public class LargestElementInArray {

	public static void main(String[] args) {
	
		int arr[] = {1,3,5,7,9,7,101,6,8,9,6,200};
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}	
		}
		System.out.println(max);
	}

}
