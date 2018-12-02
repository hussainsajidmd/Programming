package array;

import java.util.Scanner;

public class FirstSecBig {
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
		int flarge=arr[0]; 
		int slarge=arr[1];  
		
		for(int i=1;i<length;i++) {
			if(arr[i]>flarge) {
				slarge=flarge;
				flarge=arr[i];
			}
			if(arr[i]<slarge) {
				slarge=arr[i];
			}
		}
		System.out.println("Smallest number is "+flarge+".");
		System.out.println("Largest number is "+slarge+".");
		
}
}
