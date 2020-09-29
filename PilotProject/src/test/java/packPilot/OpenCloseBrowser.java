package packPilot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenCloseBrowser 
{
	public WebDriver driver;
	public String fn,title;
	public WebDriverWait wait;
	
	@BeforeTest
	public void OpenBrowser()
	{
		//fn="C:\\SeleniumSetup\\WebDriver\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver", fn);
		
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		driver=new ChromeDriver();  //launch ff browser
		driver.manage().window().maximize();  // maximize ff browser
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,20);		
	}
	
	@AfterTest
	public void CloseBrowser()
	{
		//driver.close();
		driver.quit();	
	}	
	public void openHomePage(String url)
	{
		driver.get(url);  //enter url, submit , wait till page load done
		title=driver.getTitle();
		System.out.println("Home Page title : " + title);
	}
}



