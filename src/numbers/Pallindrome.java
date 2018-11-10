package numbers;
import java.util.Scanner;

public class Pallindrome {
	static void isPallindrome(int n) {
		int t=n;
		int rem,rev=0; 
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(t==rev) {
			System.out.println(t+" is a pallindrome.");
		}
		else {
			System.out.println(t+" is not a pallindrome.");
		}
		
	}

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		isPallindrome(num);
		input.close();
	}
}
