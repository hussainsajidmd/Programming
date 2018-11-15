package stars;

import java.util.Scanner;

public class DownRight {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=num-i;j++) 
			{
					System.out.print("*");
			}
			System.out.println();
		}

	}

}
