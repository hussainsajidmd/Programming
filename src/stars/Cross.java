package stars;

import java.util.Scanner;

public class Cross {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		
		for(int i=1;i<=num;i++) 
		{
			for(int j=1;j<=num;j++) 
			{
				if(j==i||j==(num-i)+1)
				{
					System.out.print("*");
				}
				else 
				{
				System.out.print(" ");
				}
			}
			System.out.println();
		}

	}


}
