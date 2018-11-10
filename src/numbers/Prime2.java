package numbers;
import java.util.Scanner;

public class Prime2 {
	static void isPrime(int n) {
		int count;
		for(int i=1;i<=n;i++) {
		count=0;	
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
				count++;
				break;
			}
		}
		if(count==0 && i!=1) {
			System.out.println(i+"");
		}}
		
	}

		
	
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number.");
		int num=input.nextInt();
		isPrime(num);
		input.close();
	}
}