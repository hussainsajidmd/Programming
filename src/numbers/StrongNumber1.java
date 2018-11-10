package numbers;
import java.util.Scanner;

public class StrongNumber1 {
	static int factorial(int n) {
		int t=n; 
		int fact=1;
		while(n>0) {
			fact=fact*n;
			n--;
		}
		return fact;	
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		int temp=num;
		int rem,sum=0;
		while(num>0) {
			rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		if(sum==temp) {
			System.out.println(temp+" is a strong number.");
		}
		else {
			System.out.println(temp+" is not a strong number.");
		}
	}
}
