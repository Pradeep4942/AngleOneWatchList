package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	
	@FindBy(xpath=("//input[@id='txtUserID']"))private WebElement UN ;
	@FindBy(xpath="//input[@id='txtTradingPassword']") private WebElement Pass ;
	@FindBy(xpath="//a[@id='loginBtn']") private WebElement ClickonBtn ;
	
	WebDriver driver ;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void userid (String UserNam)
	{
		UN.sendKeys(UserNam);
	}
	
	public void password (String Password)
	{
		Pass.sendKeys(Password);
	}
	
	public void singin ()
	{
		ClickonBtn.click();
	}

}
