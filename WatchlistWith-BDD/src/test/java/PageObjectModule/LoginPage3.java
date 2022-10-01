package PageObjectModule;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage3 
{
	@FindBy(xpath = "//a[@class='watchlistA']")private WebElement ClickWatchlist ;
	@FindBy(xpath = "//tr[@class='ui-sortable-handle']")private  List <WebElement>   Watchlist;
	
	public LoginPage3(WebDriver driver)
	{
        PageFactory.initElements(driver, this);
	}
	
	public void ClickOnWatchlist() throws InterruptedException
	{Thread.sleep(7000);
		ClickWatchlist.click();
	}
	
	public void HandlingWatchlist ()
	{
		for ( WebElement list:Watchlist)
		{
			System.out.println(list.getText());
		}
	}
	

}
