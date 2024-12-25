package JavaProgram;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 Set<Integer> set = new HashSet<>();
		
		for(int a:arr)
		{
			set.add(a);
		}
		
		System.out.println(set.toString());
		
		*/
		
		int arr[] = {1,1,2,3,4,5,6,7,5,3,7,8,6,5,4,3,2,3,4,1};
		int arr2[] = new int[arr.length];
		int index=0;
		
		for(int i=0;i<arr.length;i++)
		{
			boolean b=false;
		
			for(int j=0;j<index;j++)
			{
				if(arr[i]==arr2[j])
				{
					b=true;
					break;
				}
			}
			if(b==false)
			{
				arr2[index]=arr[i];
				index++;
			}
		}
		
		for(int i=0;i<index;i++)
		{
			System.out.println(arr2[i]);
		}


	}

}
