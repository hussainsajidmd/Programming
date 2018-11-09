import java.util.Scanner;

public class Reverse {
	static int reverse(int n) {
		int t=n;
		int rem, rev=0;
		while(n>0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		int r=reverse(num);
		System.out.println("Reverse of "+num+" is "+r+".");
		input.close();
	}
}
