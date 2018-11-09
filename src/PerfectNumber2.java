import java.util.Scanner;

public class PerfectNumber2 {
	static boolean isPerfect(int n) {
		int sum=0;
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
			sum=sum+i;
		}
		}
			if(sum==n) {
				return true;
			}
			else {
				return false;
			}
	}
			
		

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number upto which you want the perfect number.");
		int num=input.nextInt();
		for(int s=1; s<=num;s++) {
			if(isPerfect(s)) {
				System.out.print(s+" ");
			}
		}
		input.close();

	}
	}
