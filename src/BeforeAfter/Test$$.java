package BeforeAfter;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test$$ {
	WebDriver driver;

	@BeforeClass
	public void startBrowser() throws InterruptedException {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("https://gmail.com/");
    Thread.sleep(3000);
	}


	@BeforeMethod
	public void login() throws InterruptedException
	{
		
		driver.findElement(By.id("identifierId")).sendKeys("imanandkumar9891");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		  Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("7631883767",Keys.ENTER);
		  Thread.sleep(3000);
	}
	@Test
	public void FisrTest() throws InterruptedException{
		driver.findElement(By.partialLinkText("Inbox")).click();
		  Thread.sleep(3000);
	}
	@AfterMethod
	public void Firstclose(){
		driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		
	}
	@AfterClass
	public void closeBrowser() {
	driver.close();
		}
}
