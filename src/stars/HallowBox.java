package stars;

import java.util.Scanner;

public class HallowBox {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		
		for(int i=1;i<=num;i++) //2
		{
			for(int j=1;j<=num;j++) 
			{
				if(i==1||i==num||j==1||j==num)
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



