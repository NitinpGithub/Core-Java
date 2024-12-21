package Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enyter size of an Array...!!!");
		int size = s.nextInt();
		int arr1[] = new int[size];
		for(int i=0;i<arr1.length;i++)
		{
			System.out.println("Enter value of arr1["+ i +"]");
			arr1[i]=s.nextInt();
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");
		}
		

	}

}
