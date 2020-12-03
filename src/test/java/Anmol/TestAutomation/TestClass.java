package Anmol.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
// import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

	public static WebDriver driver;

	@BeforeMethod
	public void lanuchDriver() {
		System.setProperty("webdriver.chrome.driver", "/usr/bin/google-chrome");
		// System.setProperty("webdriver.gecko.driver",
		// "D:\\GeckoDriver\\geckodriver-v0.28.0-win64\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void Test1() {
		
		driver.navigate().to("http://aisqa.dhanushinfotech.com/");
		driver.manage().window().maximize();
		System.out.println("Test1 Title is : " + driver.getTitle());
	}

	@Test
	public void Test2() {
		
		driver.get("http://aisqa.dhanushinfotech.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin@anmol.com");
		driver.findElement(By.id("password")).sendKeys("98765");
		driver.findElement(By.tagName("button")).click();

		String url = driver.getCurrentUrl();
		if (url.equals("http://aisqa.dhanushinfotech.com/")) {
			System.out.println("Login Successful: Passed");
		} else {
			System.out.println("Login Unsuccesful: Failed");
		}
		System.out.println("Test2 Title is : " + driver.getTitle());
	}

	/*
	 * @AfterMethod public void quit() { driver.close(); }
	 */
}

/*
 * public static void main(String [] args) { TestClass t= new TestClass();
 * t.lanuchDriver(); t.Test1(); t.Test2(); }
 */
