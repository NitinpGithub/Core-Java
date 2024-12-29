package Array;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6,6,7,7,7,8,8,8};
		int  reverseArray[] = new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			boolean b=false;
			
			for(int j=0;j<index;j++)
			{
				if(arr[i]==reverseArray[j])
				{
					b=true;
					break;
				}
			}
			
			if(!b)
			{
				reverseArray[index++]=arr[i];
			}
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.print(reverseArray[i]+" ");
		}
		

	}

}
