import java.util.Scanner;
/*
 * Fibonacci series upto the entered value.
 */

public class Fibonacci1 {
	static void fibonacci(int n) {
		int term1=0; int term2=1;
		while(term1<=n) {
			System.out.print(term1+" ");
			int sum=term1+term2;
			term1=term2;
			term2=sum;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value upto which you want the fibonacci series. ");
		int num=input.nextInt();
		fibonacci(num);
		input.close();

	}

}
