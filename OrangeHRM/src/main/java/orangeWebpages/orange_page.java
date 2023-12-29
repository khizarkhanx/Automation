package orangeWebpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baselibrary.baseLibrary;

public class orange_page extends baseLibrary {
	
	public orange_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//*[@placeholder='username']")
	private WebElement username;
	
	@FindBy (xpath = "//*[@name=\"password\"]")
	private WebElement password;
	
	@FindBy (xpath = "//*[@class=\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\"]")
	private WebElement submit;
	
	public void loginpageuser()
	{
		username.click();
		username.clear();
		username.sendKeys("Admin");
	}
	
	public void loginpagepass()
	{
		password.click();
		password.clear();
		password.sendKeys("admin123");
	}
	
	public void loginpagesubmit()
	{
		submit.click();
	}

}
