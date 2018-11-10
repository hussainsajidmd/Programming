package numbers;
import java.util.Scanner;
/*
 * Enetered number is perfect number or not.
 */
public class PerfectNumber1 {
	static void isPerfect(int n) {
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
			sum=sum+i;
		}
		}
			if(sum==n) {
				System.out.println(n+" is a perfect number.");
			}
			else {
				System.out.println(n+" is not a perfect number.");
			}
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number to see if it is a perfect number.");
		int num=input.nextInt();
		isPerfect(num);
		input.close();

	}

}
