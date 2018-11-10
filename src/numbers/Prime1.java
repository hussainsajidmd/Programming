package numbers;
import java.util.Scanner;

public class Prime1 {
	static void isPrime(int n) {
		int count=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				break;
			}
		}
		if(count==0 && n!=1) {
			System.out.println(n+" is a prime number.");
		}
		else {
			System.out.println(n+" is not a prime number.");
		}
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		isPrime(num);
		input.close();
	}
}
