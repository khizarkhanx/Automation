package javaprograms;

import java.util.Scanner;

public class Cal2_Demo {
	int a,b,c;
		public void sub()
		{
			Scanner sc= new Scanner (System.in);	
			System.out.println("Please enter the two input");
			a= sc.nextInt();
			b= sc.nextInt();
			c= a-b;
			System.out.println("Substraction result"+ c);
					}
		public static void main(String[] args) 
		{
		
			Cal2_Demo ob= new Cal2_Demo();
			ob.sub();
		}

}


