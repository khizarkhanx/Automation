package automation_01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankofAmerica {

	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://online2.cashpro.bankofamerica.com/cpoauthweb/cpo/#/login/public/signin");
		driver.findElement(By.xpath("//*[@id=\"companyId\"]")).sendKeys("guares03");
		driver.findElement(By.xpath("//*[@id=\"userId\"]")).sendKeys("khkhan");
		driver.findElement(By.xpath("//*[@id=\"passcode\"]")).sendKeys("2023Augs");
		driver.findElement(By.xpath("//*[@id=\"loginButton\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"NavMenu1\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"mast-header\"]/div[3]/div/div[1]/cpo-nav-bar/nav/div/cpo-vertical-sidebar-nav-bar/div/phx-sidebar/phx-sidebar-content/div/div[2]/cpo-menu-drawer/div/div[2]/div/h4/span")).click();
		
		
	}
}
