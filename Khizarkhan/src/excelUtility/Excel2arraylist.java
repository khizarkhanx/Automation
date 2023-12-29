package excelUtility;

import java.io.FileInputStream;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel2arraylist {
	
	public String getdata(String path, int sheetno, int row, int col) {
		
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
	
	public static void main(String[] args) {
		
		Excel2arraylist ob = new Excel2arraylist();
		String path = "C:\\Users\\kkhan46\\eclipse-workspace\\Khizarkhan\\testdata\\arraylist_testdata.xlsx";
		
		ArrayList<String> data = new ArrayList<String>();
		
		for (int i=0; i<10; i++) {
			
			data.add(ob.getdata(path, 0, i, 0));
		}
		
		for (String paste: data) {
			
			System.out.println(paste);
		}
		
	}

}
