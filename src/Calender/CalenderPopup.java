package Calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalenderPopup {
	WebDriver driver;

	@BeforeClass
	public void Openbrowse() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterClass
	public void closeBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void nevigateMakeMYtrip() {
		driver.navigate().to("https://www.makemytrip.com");
	}

	@Test
	public void city() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();
		Thread.sleep(3000);
		List<WebElement> lst = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/div/p/span[1]"));
		String aspMsg = "Ahmedabad";
		int count = 0;
		for (int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i).getText());
		}
		for (int j = 0; j < lst.size(); j++) {
			String s2 = lst.get(j).getText();
			// System.out.println(s2);
			if (s2.contains(aspMsg)) {
				System.out.println("===============the value    " + s2);

				break;
			}
			count++;
			if (count == lst.size()) {
				System.out.println("value is not found");
			}
		}
		System.out.println(count);

	}

	@Test
	public void calander() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='hp-widget__sfrom']")).click();

		Thread.sleep(3000);

		WebElement wbe = driver.findElement(By.xpath(
				"//div[@ class='locationFilter autocomplete_from']/ul/li/div/p/span[1][contains (text(),'Ahmedabad')]"));
		//     "//div[@ class='locationFilter autocomplete_from']//span[1][contains (text(),'Ahmedabad')]"
		System.out.println(wbe.getText());
		wbe.click();
	}

	@Test
	public void calenderPopup() {
		driver.findElement(By.xpath("//input[@mt-id='departDate']")).click();

	}

}
