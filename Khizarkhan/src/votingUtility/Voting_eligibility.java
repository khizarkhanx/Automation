package votingUtility;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import net.bytebuddy.implementation.EqualsMethod;

public class Voting_eligibility {
	
	Scanner sc = new Scanner (System.in);
	String doc;
	String name;
	long mobile;
	int age;
	int choice;
	int votechoice;
	
	public void eligible()
	{
	

			System.out.println("Enter your name");
		 name = sc.nextLine();
		System.out.println("Enter your moblile number");
		 mobile = sc.nextLong();
		System.out.println("Enter your age");
		 age = sc.nextInt();
		
		try {
			
			if (age >= 18)
			{
				return;
			}
			else
			{
				throw new Exception ("You are not eligible for vote");
			}
		}
		catch (Exception e)
		
		{
			System.out.println("Please try again");
			
			main(null);
		}
		
	
	}
	
	public String getchoice()
	{
		
		
		
		
		
		System.out.println("Enter- \n1 for Aadhar card  \n2 for Pan Card");
		 choice = sc.nextInt();
		
		try 
		{
			if (choice ==1)
			{
				System.out.println("Enter your Aadhar card number");
				doc = sc.next();
				
			}
			else if (choice==2) 
			{
				System.out.println("Enter your Pan card number");
				doc= sc.next();
				
			}
			else
			{
				throw new Exception ("Invalid input");
			}
		}
		catch( Exception e)
		{
			System.out.println("Please try again");
			getchoice();
		}
		return doc;
		
	}

	public void getvoteParty ()
	{
		
		
		
		
		System.out.println("1 for Congress \n2 for BJP \n3 for AAP \n4 for NOTA");
		 votechoice = sc.nextInt();
		
		try 
		{
			if (votechoice ==1)
			{
				System.out.println("You successfully vote for Congress");
				
			}
			else if (votechoice==2) 
			{
				System.out.println("You successfully vote for BJP");
				
			}
			else if (votechoice==3) 
			{
				System.out.println("You successfully vote for AAP");
				
			}
			else if (votechoice==4) 
			{
				System.out.println("You successfully vote to NOTA");
				
			}
			else
			{
				throw new Exception ("Invalid input");
			}
		}
		catch( Exception e)
		{
			System.out.println("Please try again");
			getvoteParty();
		}
		
	}
	
public String getdata(String path, int sheetno, int row, int col ) {
		
		String value= "";
		try {
			
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value= sheet.getRow(row).getCell(col).getStringCellValue();
		}
		
		catch(Exception e) {
			
			System.out.println("There is an error in getdata"+e);
		}
		
		return value;
		
	}

		public void printrecipt() {
			
			System.out.println("********RECIPT***********");
			System.out.println("Name: "+name);
			System.out.println("Mobile Number: "+mobile);
			System.out.println("Age: "+age);
			System.out.println("Aadhar or Pan Card Number: "+doc);
			System.out.println("1 for Congress \n2 for BJP \n3 for AAP \n4 for NOTA");
			System.out.println("You vote for: "+votechoice);
	
			}

 
	public static void main(String[] args) {
		
		String filepath = "C:\\Users\\kkhan46\\eclipse-workspace\\Khizarkhan\\testdata\\aadhar_pan_data.xlsx";
		
		Voting_eligibility ob = new Voting_eligibility();
		
		ob.eligible();

		//ob.getchoice();
		ob.getvoteParty();
		
		String doc=(ob.getchoice());
		String value="";
		ArrayList<String> data = new ArrayList<String>();
		boolean flag = false;
		
		for (int i =0; i<20; i++)
		{
		data.add(ob.getdata(filepath, 0, i, 0));
		
		
		//System.out.println(value);
		}
		
		for (int i =0; i<20; i++)
		{
		data.add(ob.getdata(filepath, 0, i, 1));
		
		
		//System.out.println(value);
		}
		
		try {
		
		for (String check: data)
		{
		if (check.equals(doc))
		{
			flag = true;
			break;
		}
		}
		
		if (flag == true)
		{
			System.out.println("Valid aadhar number");
		}
		else
		{
			throw new Exception("Invalid aadhar number");
		}
		}
		catch(Exception e)
		{
			System.out.println("Try again");
			main(null);
		}
		
		ob.printrecipt();
	}
	
	
	}

