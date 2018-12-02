package array;

import java.util.Scanner;

public class SmallestLarge {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=input.nextInt();
		int arr[]=new int[length];
		System.out.println("Enter the "+length+" elements: (Press Enter after every element)");
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			System.out.println("arr["+i+"]------->"+arr[i]);
		}
		int large=arr[0];
		int small=arr[0];
		
		for(int i=1;i<length;i++) {
			if(arr[i]>large) {
				large=arr[i];
			}
			if(arr[i]<small) {
				small=arr[i];
			}
		}
		System.out.println("Smallest number is "+small+".");
		System.out.println("Largest number is "+large+".");
		
}
}
