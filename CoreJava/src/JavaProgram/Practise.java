package JavaProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Practise {

	public static void main(String[] args)
	{
		int arr[]= {2,6,8,0,5,63,9};
		ArrayList l1 = new ArrayList();
		int max=arr[0];
		int arr1[] = new int[arr.length];
		int counter=0;
		for(int i=0;i<arr.length;i++)
		{
			max=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
				else
				{
					l1.add(arr[j]);
				}
				
			}
			arr1[i]=max;
			
		}
		System.out.println(arr1[3]);
	}
}
