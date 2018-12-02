package numbers;
import java.util.Scanner;


public class ArmstrongNumber {
	static int countDigit(int num) {
		int count=0;
		while(num>0) {
			count++;
			num=num/10;
		}
		return count;
	}
	
	static int pow(int r, int c) {
		int pw=1;
		while(c>0) {
			pw=pw*r;
			c--;
		}
		return pw;
	}
	
	static boolean isArmstrong(int num) {
		int arms=num;
		int sum=0;
		while(num>0) {
			int rem = num%10;
			int c = countDigit(arms);
			sum=sum+pow(rem, c);
			num=num/10;
		}
		if(arms==sum) {
			return true;
		}
		else {
			return false;
		}
	}
		

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your nmbr: ");
		int num = input.nextInt();
		
		for(int i=0; i<=num;i++) {
			boolean t = isArmstrong(i);
			if(t) {
				System.out.print(i+" ");
			}
		}
	}
}
		

	
	
