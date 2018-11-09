import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		if(num%4==0 && num%100!=0 || num%400==0) {
			System.out.println(num+" is a leap year.");
		}
		else {
			System.out.println(num+" is not a leap year.");
		}
	}
}
