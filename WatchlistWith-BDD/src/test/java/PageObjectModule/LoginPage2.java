package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage2 
{
	@FindBy(xpath = "//button[@id='tabclose']")private WebElement Close;

	public LoginPage2(WebDriver driver )
	{
		PageFactory.initElements(driver, this);
	}
	
	public void closepopup () throws InterruptedException 
	{
		Thread.sleep(7000);
		Close.click();
	}

}
