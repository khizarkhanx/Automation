package orangeTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baselibrary.baseLibrary;
import orangeWebpages.orange_page;

public class orangehrm_test extends baseLibrary 
{

	orange_page aa;
	
	@BeforeTest
	public void launchurl()
	{
		LaunchUrl();
		aa = new orange_page();
		
	}
	
	@Test (priority = 1)
	public void loginPageuser()
	{
		aa.loginpageuser();
	}
	
	@Test (priority = 2)
	public void loginPass()
	{
		aa.loginpagepass();
	}
	
	@Test (priority = 3)
	public void loginSub()
	{
		aa.loginpagesubmit();
	}
}
