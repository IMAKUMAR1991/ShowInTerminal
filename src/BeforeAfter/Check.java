package BeforeAfter;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Check {

	@BeforeClass
	public void startBrowser() {
		System.out.println("@BeforeClass");

	}

	@BeforeMethod
	public void login() {
		System.out.println("@BeforeMethod");
                                                         
	}

	@Test
	public void FisrTest() {
		System.out.println("@Test");

	}

	@AfterMethod
	public void Firstclose() {
		System.out.println("@AfterMethod");

	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("@AfterClass");

	}

}
