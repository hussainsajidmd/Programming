package array;

import java.util.Scanner;

public class RevEle {
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
		System.out.println("Before reverse: ");
		for(int i=0;i<length;i++) {
			System.out.println("arr["+i+"]----->"+arr[i]);
		}
		System.out.println("After reverse: ");
		for(int i=0;i<arr.length/2;i++) {
			int t = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}
		for(int i=0;i<length;i++) {
			System.out.println("arr["+i+"]----->"+arr[i]);
		}
		
}
}