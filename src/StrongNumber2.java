import java.util.Scanner;

public class StrongNumber2 {
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
		for(int i=1;i<=num;i++) {
		int n=i;
		int rem,sum=0;
		int temp=n;
		while(n>0) {
			rem=n%10;
			sum=sum+factorial(rem);
			n=n/10;
		}
		if(sum==temp) {
			System.out.print(temp+" ");
		}
		}
	}
}


