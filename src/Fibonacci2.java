import java.util.Scanner;
/*
 * Fibonacci series upto the entered term.
 */
public class Fibonacci2 {
	static void fibonacci(int n) {
		int term1=0; int term2=1;
		int i=1;
		while(i<=n) {
			System.out.print(term1+" ");
			int sum=term1+term2;
			term1=term2;
			term2=sum;
			i++;
		}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the value upto which term you want the fibonacci series. ");
		int num=input.nextInt();
		fibonacci(num);
		input.close();

	}
}
