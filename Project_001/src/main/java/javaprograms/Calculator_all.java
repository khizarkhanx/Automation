package javaprograms;

import java.util.Scanner;

public class Calculator_all {
	
	int a,b,c;
	
	Scanner  sc = new Scanner(System.in);
	
	public void add()
	
	{
		System.out.println("Please enter two inputs for addition");
		a= sc.nextInt();
		b= sc.nextInt();
		c= a+b;
		System.out.println("Addition result="+ c);
		
	}
	
	public void sub()
	
	{
		System.out.println("Please enter two inputs for Substraction");
		a= sc.nextInt();
		b= sc.nextInt();
		c= a-b;
		System.out.println("Sub result="+ c);
	}
	
	public void mul()
	
	{
		System.out.println("Please enter two inputs for Multiplication");
		a= sc.nextInt();
		b= sc.nextInt();
		c= a*b;
		System.out.println("Mul result="+ c);
	}
	
	public void div()
	
	{
		System.out.println("Please enter two inputs for division");
		a= sc.nextInt();
		b= sc.nextInt();
		c= a/b;
		System.out.println("Div result="+ c);
	}
	
	
	
	public static void main(String[] args) {
		
		Calculator_all ob = new Calculator_all();
		ob.add();
		ob.sub();
		ob.mul();
		ob.div();
		
	}
	

}
