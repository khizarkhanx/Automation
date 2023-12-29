package javaprograms;

import java.util.Scanner;

public class Area_cal {
	Scanner sc = new Scanner(System.in);
	double area;
	int len, wid, side, radius, height, base;
	
	public void getArea(int option){
		
		
		
		switch (option) {
		
		case 1 :
		{
			System.out.println("Enter the lenght");
			int len = sc.nextInt();
			System.out.println("Enter the width");
			int wid = sc.nextInt();
			area = len * wid;
		System.out.println("Area of rectangular = "+ area);
		break;
		}
		
		case 2:
		{
			System.out.println("Enter the side");
			int side = sc.nextInt();
			area = side*side;
			System.out.println("Area of square = "+ area);
			break;
		}
		
		case 3:
		{
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			area = 3.14 * (radius*radius);
			System.out.println("Area of circle = "+ area);
			break;
			
		}
		
		case 4:
		{
			System.out.println("Enter the Height");
			int height = sc.nextInt();
			System.out.println("Enter the base");
			int base  = sc.nextInt();
			area = 0.5 * (height*base);
			System.out.println("Area of triangle = "+ area);
			break;
			
		}
		
		case 5:
		{
			System.out.println("Enter the radius");
			int radius = sc.nextInt();
			area = 4* 3.14 * (radius*radius);
			System.out.println("Area of sphere = "+ area);
			break;
			
		}
		
		
		}
		
		
	}

	
	public static void main(String[] args) {
		
		Area_cal ob = new Area_cal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1: for Rectangular area \n Enter 2: for Square area \n Enter 3: for Circle area \n Enter 4: for Triangle area \n Enter 5: for Sphere area");
		int option = sc.nextInt();
		ob.getArea(option);
		sc.close();
		
	}
}
