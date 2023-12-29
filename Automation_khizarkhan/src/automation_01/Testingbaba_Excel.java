package automation_01;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testingbaba_Excel 
{
	
	public String getDataExcel(String path, int sheetno, int row, int col)
	{
		
		String value="";
		
		try
		{
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet = wb.getSheetAt(sheetno);
			value = sheet.getRow(row).getCell(col).getStringCellValue();
		}
		
		catch(Exception e) 
		{
			System.out.println("Error in getDataExcel");
		}
		
		return value;	
		
	}
	
	
	public static void main(String[] args) 
	{
		String filepath= "C:\\Users\\kkhan46\\eclipse-workspace\\Automation_khizarkhan\\testdata\\Name address etc.xlsx";
		
		Testingbaba_Excel ob = new Testingbaba_Excel();
		
		String value = ob.getDataExcel(filepath, 0, 0, 1);
		System.out.println(value);
		String value1 = ob.getDataExcel(filepath, 0, 1, 1);
		System.out.println(value1);
		String value2 = ob.getDataExcel(filepath, 0, 2, 1);
		System.out.println(value2);
		String value3 = ob.getDataExcel(filepath, 0, 3, 1);
		System.out.println(value3);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.testingbaba.com/old/");
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		driver.findElement(By.xpath("//*[@href=\"#tab_1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"fullname1\"]")).sendKeys(value);
		driver.findElement(By.xpath("//*[@id=\"fullemail1\"]")).sendKeys(value1);
		driver.findElement(By.xpath("//*[@id=\"fulladdresh1\"]")).sendKeys(value2);
		driver.findElement(By.xpath("//*[@id=\"paddresh1\"]")).sendKeys(value3);
		driver.findElement(By.xpath("//*[@id=\"tab_1\"]/div/div[1]/form/input[3]")).click();
		
		driver.findElement(By.xpath("//*[@href=\"#tab_2\"]")).click();
		WebElement frame_ele = driver.findElement(By.xpath("//*[@id=\"tab_2\"]/div/iframe"));
		driver.switchTo().frame(frame_ele);
		driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).click();
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//*[@href=\"#tab_3\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		
		driver.findElement(By.xpath("//*[@href=\"#tab_4\"]")).click();
		WebElement frame_ele1 = driver.findElement(By.xpath("//*[@id=\"tab_4\"]/div/iframe"));
		driver.switchTo().frame(frame_ele1);
		driver.findElement(By.xpath("//*[@pattern=\"^[a-zA-Z][\\sa-zA-Z]{2,32}\"]")).sendKeys(value);
		driver.findElement(By.xpath("//*[@pattern=\"[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$\"]")).sendKeys(value1);
		driver.findElement(By.xpath("//*[@class=\"btn btn-success save-btn\"]")).click();
		driver.switchTo().defaultContent();
	}

}
