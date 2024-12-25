package Array;

public class SmallestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,5,7,9,7,101,6,8,9,6,200,0};
		int min = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}	
		}
		System.out.println(min);
	}

}
