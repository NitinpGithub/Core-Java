package Array;

import java.util.Arrays;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,2,3,4,5,6,7,8,9};
		int arr1[] ={1,2,3,4,5,6,7,8,9};
		if(Arrays.equals(arr, arr1))
		{
			System.out.println("true");
		}
		int rev[] = new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);	
		}
		
		

	}

}
