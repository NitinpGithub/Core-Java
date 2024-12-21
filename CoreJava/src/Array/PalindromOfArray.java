package Array;

import java.util.Arrays;

public class PalindromOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,2,1};
		int arr1[] = new int[arr.length];
		int size=arr.length-1;
		for(int i=arr.length-1;i>=0;i--)
		{
			
			arr1[size-i]=arr[i];
			
		}
		
		//System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.equals(arr, arr1));

	}

}
