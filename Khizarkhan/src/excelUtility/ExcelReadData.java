package excelUtility;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadData {
	
	public String getreadData(String path, int sheetno, int col, int row) 
	{
		
		String value ="";
		
		try 
		{
			
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(row).getCell(col).getStringCellValue();
		}
		
		catch(Exception e)
		{
			
			System.out.println("Issue in get read data"+e);
		}
		
		return value;
	}

	
	public static void main(String[] args) {
		
		String filepath = "C:\\Users\\kkhan46\\eclipse-workspace\\Khizarkhan\\testdata\\testdata_khizar.xlsx";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sheet, row and column");
		
		ExcelReadData ob = new ExcelReadData();
		String value= ob.getreadData(filepath, sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println(value);
		sc.close();
	}
}
