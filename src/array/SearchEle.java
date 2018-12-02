package array;

import java.util.Scanner;

public class SearchEle {
	public static int Index(int[] arr, int ele) {
		int i;
		for(i=0;i<arr.length;i++) 
		{
		if(arr[i]==ele) 
		{
		return i;
		}
		}
		return i;
		}
	
	public static void main(String[] args) 
	{
		int arr[]={14,17,54,87,2};
		System.out.println("Please, enter the number for which you want the index.");
		Scanner input=new Scanner(System.in);
		int number=input.nextInt();
		System.out.println("Number: "+number);
		int in = Index(arr, number);
		for(int i=0;i<arr.length;i++) {
			System.out.println("arr["+i+"]------>"+arr[i]);
		}
		if(number>=0) {
			System.out.println("Your number found at index "+in);
		}
		else {
			System.out.println("Invalid.");
		}
		
}
}