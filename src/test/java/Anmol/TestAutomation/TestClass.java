package Anmol.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	public static WebDriver driver;

	@BeforeMethod
	public void lanuchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1() {
		driver.navigate().to("http://aisqa.dhanushinfotech.com/");
		System.out.println("Test1 Title is : " + driver.getTitle());
	}
	@Test
	public void Test2() {
		driver.navigate().to("http://aisqa.dhanushinfotech.com/");
		System.out.println("Test2 Title is : " + driver.getTitle());
	}
	@Test
	public void Test3() {
		driver.manage().window().fullscreen();
		driver.get("http://aisqa.dhanushinfotech.com/");
		driver.manage().window().fullscreen();
		driver.findElement(By.id("username")).sendKeys("admin@anmol.com");
		driver.findElement(By.id("password")).sendKeys("98765");
		driver.findElement(By.tagName("button")).click();
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		if (url.equals("http://aisqa.dhanushinfotech.com/")) {
			System.out.println("Login Successful: Passed");
		} else {
			System.out.println("Login Unsuccesful: Failed");
		}
		System.out.println("Test3 Title is : " + driver.getTitle());
	}
	 // @AfterMethod
	// public void quit()
	// {
	 //  driver.quit();
	// }
}
