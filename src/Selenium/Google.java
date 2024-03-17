package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Google
{
public static WebDriver driver;

@Test(priority = 0)
public void openBrowserANDEnterURL() throws InterruptedException
{
	driver = new ChromeDriver();
	
	Thread.sleep(5000);
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
}

@Test(priority = 1)
public void sendTextInSerachBox() throws InterruptedException
{
	Thread.sleep(3000);
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys("selenium");
}

@Test(priority = 2)
public void clickOnSearchBox() throws InterruptedException
{
	Thread.sleep(3000);
	WebElement searchBox = driver.findElement(By.name("q"));
	searchBox.sendKeys(Keys.ENTER);
	Assert.assertEquals("Mobile", "Laptop");
}

@Test(priority = 3)
public void scrollTillBottom() throws InterruptedException
{
	Thread.sleep(3000);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
}


@Test(priority = 4)
public void clickOn9Pageination() throws InterruptedException
{
	Thread.sleep(3000);
	driver.findElement(By.xpath("//tbody/tr[1]/td[10]/a[1]")).click();
	Assert.assertEquals("Mobile", "Laptop");
}

}
