package javaprograms;

import java.util.Scanner;

public class Calculator_Switch {
	int result ;
	
	public void getCal( int a, int b, int ch) {
	
		switch (ch) {
		
		case 1:
			{result= 	a+b;
			System.out.println("Result= "+result );
			break;
			}
		
		 
				
			case 2:
			{	result= 	a-b;
				System.out.println("Result= "+result );
				break;
			}
			
			case 3:
			{	result= 	a*b;
				System.out.println("Result= "+result );
				break;
			}
			
			case 4:
			{	result= 	a/b;
				System.out.println("Result= "+result );
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		
		Calculator_Switch ob = new Calculator_Switch();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Choose any number: 1,2,3 or 4");
		System.out.println("1 for Addition");
		System.out.println("2 for Subtraction");
		System.out.println("3 for Multiplication");
		System.out.println("4 for Division");
		int ch = sc.nextInt();
		System.out.println("Enter two inputs");
		int a = sc.nextInt();
		int b = sc.nextInt();
		ob.getCal( a, b, ch);
		sc.close();
		
		
	}

}
