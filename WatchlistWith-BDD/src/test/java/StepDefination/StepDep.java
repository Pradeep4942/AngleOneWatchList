package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import PageObjectModule.LoginPage;
import PageObjectModule.LoginPage2;
import PageObjectModule.LoginPage3;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDep 
{
public	WebDriver driver ;
public	LoginPage login1;
 public       LoginPage2 login2;
public  LoginPage3 login3;
	
	@SuppressWarnings("deprecation")
	@Given("User can lauch the chrome browser")
	public void user_can_lauch_the_chrome_browser() throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver",
				"C:\\chrome\\chromedriver_win32\\chromedriver.exe");
		
	  driver = new ChromeDriver();  
	  driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	  driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);
	 // Thread.sleep(6000);
	  
	  login1 = new LoginPage(driver);
	  login2 = new LoginPage2(driver);
	  login3 = new LoginPage3(driver);
	  
	  
	}

	
	@When("User Open the AngleBroking login webpage URL. {string}")
	public void user_open_the_angle_broking_login_webpage_url(String URL)
	{
		
	   driver.get(URL);
	}

	@Then("Passing the UserID {string} and Password {string}")
	public void passing_the_user_id_and_password(String UserName, String PassWord) 
	{
		login1.userid(UserName);
		login1.password(PassWord);
	}

	@Then("Click on signin button")
	public void click_on_signin_button() throws InterruptedException 
	{
	    login1.singin();
	   
	}

	@Then("Open the Hidden division popup and close it")
	public void open_the_hidden_division_popup_and_close_it() throws InterruptedException
	{
		login2.closepopup();  
	}

	@Then("Click on Watch list Icon")
	public void click_on_watch_list_icon() throws InterruptedException
	{
	    login3.ClickOnWatchlist();
	}

	@Then("Select all watch list")
	public void select_all_watch_list()
	{
	    login3.HandlingWatchlist();
	}

	@Then("close the browser")
	public void close_the_browser()
	{
	   driver.close();
	}
   
}
