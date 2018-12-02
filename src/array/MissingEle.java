package array;

import java.util.Scanner;

public class MissingEle {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=input.nextInt();
		int arr[]=new int[length];
		System.out.println("\nEnter the "+length+" elements: (Press Enter after every element)");
		for(int i=0;i<length;i++) 
		{
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++)
		{
			System.out.println("arr["+i+"]------->"+arr[i]);
		}
		for(int i=0;i<length-1;i++) {
			for(int j=arr[i]+1;j<arr[i+1];j++) {
				System.out.print(j+" ");
			}
		}
	}
	}

