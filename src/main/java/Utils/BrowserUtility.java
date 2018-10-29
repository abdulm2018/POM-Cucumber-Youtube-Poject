package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserUtility {
	public static WebDriver OpenBrowser(WebDriver driver,String browserName,String url) throws InterruptedException
	
	if (browserName.equals("Chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(5000);
		return driver;
		}else
			if(browserName.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver", "");
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
				driver.get(url);
				Thread.sleep(5000);
				return driver;	
			} else if(browserName.equals("Firefox"))
				
			{
				System.setProperty("webdriver.Firefox.driver", "");
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get(url);
				Thread.sleep(5000);
				return driver;
				
			}
				return null;
	
}

}