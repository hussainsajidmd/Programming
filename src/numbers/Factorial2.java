package numbers;
import java.util.Scanner;

public class Factorial2 {
	static void factorial(int n) {
		int t=n;
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		System.out.println(t+"!------->"+fact);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to get its factorial value.");
		int num=input.nextInt();
		for(int i=1; i<=num;i++) {
			factorial(i);
		}
		input.close();
	}
}
