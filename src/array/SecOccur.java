package array;

import java.util.Scanner;

public class SecOccur {
	public static int secOcc(int arr[], int ele) {  
		int count=0;
		int i;
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i]==ele) {
				count++;
			}

			if(count==2) {
				break;
			}

		}
		return i;
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
		System.out.println("\nEnter the number for which you want the index of second occurence: ");
		int ele=input.nextInt();
		int in = secOcc(arr, ele);
		System.out.println("\nSecond occurence came at index "+in);

	}

}
