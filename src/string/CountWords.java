package string;

import java.util.Scanner;

public class CountWords {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the sentence to count the number of words.");
		String str=input.nextLine();
		int l=str.length();
		int count=1;
		for(int i=0;i<l-1;i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1) != ' ')
			{
				count++;
			}
		}
		System.out.println("Total number of words in the given sentence is "+count);
		
}
}