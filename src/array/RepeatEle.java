package array;

import java.util.Scanner;

public class RepeatEle {
	public static int repeatEle(int arr[], int ele) {  
		int count=0;
		int i;
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i]==ele) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length:");
		int length=input.nextInt();
		int arr[]=new int[length];
		System.out.println("\nEnter the "+length+" elements: (Press Enter after every element)");
		for(int i=0;i<length;i++) {
			arr[i]=input.nextInt();
		}
		for(int i=0;i<length;i++) {
			System.out.println("arr["+i+"]------->"+arr[i]);
		}
		System.out.println("\nEnter the number for which you want repeated count: ");
		int ele=input.nextInt();
		int count = repeatEle(arr, ele);
		System.out.println("\n"+ele+" is repeated "+count+" times.");

	}

}
