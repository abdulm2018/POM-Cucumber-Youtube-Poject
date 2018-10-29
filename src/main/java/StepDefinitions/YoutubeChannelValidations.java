package StepDefinitions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Utils.BrowserUtility;
import Utils.PropertiesFileReader;
import come.testautomation.PageObjects.YoutubeChannelPage;
import come.testautomation.PageObjects.YoutubeResultsPage;
import come.testautomation.PageObjects.YoutubeSearchPage;

public class YoutubeChannelValidations {
	
	public static WebDriver driver;
	PropertiesFileReader obj= new PropertiesFileReader();
	
	@Given("^OPEN Chrome browser with URL$")
	public void open_Chrome_browser_with_URL() throws Throwable {
		
		Properties properties=obj.getProperty();
		
		BrowserUtility.OpenBrowser(driver, properties.getProperty("browser.name"), properties.getProperty("browser.baseURL"));
		
//		System.setProperty("webdriver.chrome.driver", "");
//		driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get(url);
//		Thread.sleep(5000);
//	   
	}

	@When("^Search selenium tutorial$")
	public void search_selenium_tutorial() throws Throwable {
		
		new YoutubeSearchPage(driver).NavigateToResultPage();
	 
	}

	@When("^Click on channel name$")
	public void click_on_channel_name() throws Throwable {
		
		new YoutubeResultsPage(driver).NavigateToChannelName();
	   
	}

	@Then("^Validate channel name$")
	public void validate_channel_name() throws Throwable {
		
		String expectedChannelName="Selenium Java TestNG Tutorials - Bakkappa N - Youtube";
		String actualChannelName=new YoutubeChannelPage(driver).getTitile();
		Assert.assertEquals(actualChannelName, expectedChannelName,"Channel names are not matching");
		
	  
	}



}
