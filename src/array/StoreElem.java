package array;

import java.util.Scanner;

public class StoreElem {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size.");
		int length=input.nextInt();
		int arr[]=new int[length];
		System.out.println("Please, enter the "+length+" element.");
		for(int i=0;i<length;i++)
		{
			arr[i]=input.nextInt();
		}
		for(int j=0;j<length;j++)
		{
			System.out.println("arr["+j+"] is "+arr[j]);
		}

	}
}
