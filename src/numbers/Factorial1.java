package numbers;
import java.util.Scanner;
/*
 * Factorial of a entered value.
 */

public class Factorial1 {
	static void factorial(int n) {
		int t=n;
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println("The factorial value of "+t+" is "+fact+".");
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to get its factorial value.");
		int num=input.nextInt();
		factorial(num);
		input.close();

	}

}
