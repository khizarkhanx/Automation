package baselibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseLibrary {
	
	public static WebDriver driver;
	
	public void LaunchUrl()
	{
		String path = "C:\\Users\\kkhan46\\eclipse-workspace\\OrangeHRM\\drivers\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", path);
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	    
		
	}

}
