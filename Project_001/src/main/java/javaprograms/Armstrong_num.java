package javaprograms;

import java.util.Scanner;

public class Armstrong_num {
	
	public void getArm(int num) {
		
		int temp, count=0;
		temp = num;
		
		for (;temp>0;) {
			
			count++;
			temp= temp/10;
		}
		
		System.out.println("No. of digits are: "+count);
		
		int temp1 = num;
		int sum = 0;
		
		for (;temp1>0;) {
			
			int rem, mul=1;
			
			rem= temp1%10;
			
			for (int i=1; i<=count;i++) {
				
				mul = mul*rem;
			}
			
			sum = sum + mul;
			temp1=temp1/10;
			
		}
		
		if (num == sum) {
			System.out.println("This is an Armstrong Number: "+sum);
		}
		else {
			System.out.println("This is not an Armstrong Number"+sum);
		}
	}

	
	public static void main(String[] args) {
		
		Armstrong_num ob = new Armstrong_num();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		ob.getArm(num);
		sc.close();
		
	}
}
