package packPilot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleMavenTest extends OpenCloseBrowser
{
		
	@Test
	public void GoogleSearch() throws Exception
	{
		
		openHomePage("http://google.com");
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium");
		//Thread.sleep(10000); //avoid
		WebElement btn=driver.findElement(By.name("btnK"));
		wait.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		System.out.println("Search Page Title : " + driver.getTitle());
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		System.out.println("Selenium page title : " + driver.getTitle());
		System.out.println("Page Url : " + driver.getCurrentUrl());
					
	}
	
}

//implicit wait .. invoked only elem not found
//explicit wait     WebDriverWait  ajax
