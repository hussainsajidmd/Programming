package array;

import java.util.Scanner;

public class OccPosition {
	public static int occPos(int arr[], int ele, int occ) {  
		int count=0;
		int i;
		for(i=0;i<arr.length;i++) 
		{
			if(arr[i]==ele) {
				count++;
			}

			if(count==occ) {
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
		System.out.println("\nEnter the number for which you want the index: ");
		int ele=input.nextInt();
		System.out.println("\nEnter the occurence value: ");
		int occ=input.nextInt();
		int in = occPos(arr, ele, occ);
		System.out.println("\nYour number with "+occ+" occurence found at index "+in);

	}

}
