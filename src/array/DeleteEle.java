package array;

import java.util.Scanner;

public class DeleteEle {
	public static int[] delete(int[] arr, int in) {
		if((in>arr.length)||in<0) {
			System.out.println("Invalid index..");
			return arr;
		}
		else {   
			int[] na=new int[arr.length-1];    
			for(int i=0;i<in;i++) {   
				na[i]=arr[i];
			}
			for(int i=in;i<arr.length-1;i++) {  
				na[i]=arr[i+1];
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
		System.out.println("Before deleting, all the elements are: ");
		for(int i=0;i<length;i++) {
		System.out.println("arr["+i+"]------------>"+arr[i]);
		}
		System.out.println("Enter the index for which you want to delete the element: ");
		int in=input.nextInt();
		System.out.println(in);
		arr = delete(arr, in);
		System.out.println("After deleting, all the elements are:");
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]------------->"+arr[i]);
		}
}
}
