package array;

import java.util.Scanner;

public class InsertEle {
	public static int[] insert(int[] arr, int in, int ele) {
		if((in>arr.length)||in<0) {
			System.out.println("Invalid index..");
			return arr;
		}
		else {
			int[] na=new int[arr.length+1];
			for(int i=0;i<in;i++) {
				na[i]=arr[i];
			}
			na[in]=ele;
			for(int i=in;i<arr.length;i++) {
				na[i+1]=arr[i];
			}
		
		System.out.println("Length of new array is "+na.length);
		return na;
		}
	}
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size.");
		int length=input.nextInt();
		int arr[]=new int[length];
		System.out.println("Please, enter the "+length+" element.");
		for (int i=0; i<length;i++) {
			arr[i]=input.nextInt();
		}
		System.out.println("Before inserting, all the elements are: ");
		for(int i=0;i<length;i++) {
		System.out.println("arr["+i+"]------------>"+arr[i]);
		}
		System.out.println("Enter the index on which you want to insert new element: ");
		int in=input.nextInt();
		System.out.println(in);
		System.out.println("Enter the new element: ");
		int ele=input.nextInt();
		System.out.println(ele);
		arr = insert(arr, in, ele);
		System.out.println("New array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]------------->"+arr[i]);
		}
}
}