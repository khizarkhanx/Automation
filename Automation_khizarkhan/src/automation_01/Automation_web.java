package automation_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_web {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver .get("https://www.testingbaba.com/old/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"myModal2\"]/div/div/div[1]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[5]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"elements-accordion\"]/div[1]/div[1]/h2/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"myCheck\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mylaptop\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mydesktop\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[3]")).click();
		//driver.findElement(By.xpath("//*[@id=\"yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"v-pills-tab\"]/a[1]")).click();
		
		WebElement name = driver.findElement(By.id("fullname1"));
		name.isDisplayed();
		name.isEnabled();
		name.sendKeys("Khizar Khan");
		
		WebElement email = driver.findElement(By.id("fullemail1"));
		email.isDisplayed();
		email.isEnabled();
		email.sendKeys("kfdjidfie@gmail.com");
		
		WebElement cadd = driver.findElement(By.id("fulladdresh1"));
		cadd.isDisplayed();
		cadd.isEnabled();
		cadd.sendKeys("sdkjfjskf dfdsojf jdslijfoeij dsofjsdf 37624 df");
		
		WebElement padd = driver.findElement(By.id("paddresh1"));
		padd.isDisplayed();
		padd.isEnabled();
		padd.sendKeys("sdlfjieufh difuhisafh  fdihshfi f sdifhdsi434 4343 jf");
		
	}

}
