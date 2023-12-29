package automation_01;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Excel 
{
	
	public String getReadAuto(String path,int sheetno, int col, int row)
	{
		String value= "";
		
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(row).getCell(col).getStringCellValue();
		}
		catch(Exception e)
		{
			System.out.println("Issue in getReadAuto");
		}
		
		return value;
	}

	public static void main(String[] args) 
	{
		String filepath = "C:\\Users\\kkhan46\\eclipse-workspace\\Automation_khizarkhan\\testdata\\Name address etc.xlsx";
		Automation_Excel ob = new Automation_Excel();
		
		String value1 = ob.getReadAuto(filepath, 0, 1, 4);
		//System.out.println(value1);
		String value2 = ob.getReadAuto(filepath, 0, 1, 5);
		String value3 = ob.getReadAuto(filepath, 0, 1, 0);
		String value4 = ob.getReadAuto(filepath, 0, 1, 2);
		String value5 = ob.getReadAuto(filepath, 0, 1, 3);
		
		WebDriver driver = new ChromeDriver();
		/*
		 * driver.get("https://www.testingbaba.com/old/");
		 * driver.manage().window().maximize();
		 * driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).
		 * click();
		 * driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")
		 * ).click(); driver.findElement(By.xpath(
		 * "//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		 * driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[1]")).click();
		 * driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys(value1);
		 */
		
		
		  driver.get("https://www.saucedemo.com/");
		  driver.manage().window().maximize(); 
		  WebElement name=driver.findElement(By.xpath("//*[@id=\"user-name\"]")); 
		  name.isDisplayed();
		  name.isEnabled(); 
		  name.sendKeys(value1);
		  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(value2);
		  driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(value3);
		  driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(value4);
		  driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(value5);
		  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"finish\"]")).click();
		  
		 
	}
}
