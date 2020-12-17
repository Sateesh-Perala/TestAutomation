package Anmol.TestAutomation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
// import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static WebDriver driver;

	@BeforeMethod
	public void lanuchDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
/*
	@Test
	public void Test1() { // Test1: Opening Website

		driver.navigate().to("https://dev.dhanushsamvaad.com/");
		driver.manage().window().maximize();
		System.out.println("Test1 Title is : " + driver.getTitle());
	}
*/
	@Test
	public void Test1() { // Test2: Entering Username and password and click on sign in button
		// System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--use-fake-ui-for-media-stream");// allowing the microphone alert window
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();

		driver.get("https://dev.dhanushsamvaad.com/");
		driver.manage().window().maximize();
		String new1 = driver.getWindowHandle();
		driver.switchTo().window(new1);
		driver.findElement(By.id("username")).sendKeys("tests@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("SamvaadDev@321");
		driver.findElement(By.xpath("/html/body/app-root/app-login/div[1]/div/div/form/div[3]/div[2]/div/button")).click();

		String new2 = driver.getWindowHandle();
		driver.switchTo().window(new2);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/app-root/app-schedule/section/div/div/div/div/div[2]/div/form/div/div[4]/button[2]")).click();
		String new3 = driver.getWindowHandle();
		driver.switchTo().window(new3);
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[1]/form/div/div[1]/div[2]/input")).sendKeys("Session1");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath("//*[@id=\"myModal\"]/div/div/form/div[2]/button[2]"));
		js.executeScript("arguments[0].scrollIntoView();", element);
		element.click();
		driver.get(driver.getCurrentUrl());
		WebElement welement = driver.findElement(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr/td[8]/button"));
		welement.click();
		// driver.get(driver.getCurrentUrl());
		//String new4 = driver.getWindowHandle();
	//	driver.switchTo().window(new4);
	//	String new5 = driver.getWindowHandle();
		//driver.findElement(By.id("username")).sendKeys("testing1");
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(1));
				driver.findElement(By.xpath("/html/body/app-root/app-video-room/div[1]/div/div/form/div[3]/div[2]/div/button")).click();
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				String new4 = driver.getWindowHandle();
				driver.switchTo().window(new4);
				driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
				String new5 = driver.getWindowHandle();
				driver.switchTo().window(new5);
				
			//	driver.findElement(By.xpath("//*[@id=\"tippy-82\"]/span[1]/i")).click();
				
	}

	/*
	 * //driver.switchTo().window(childwindow);
	 * driver.findElement(By.linkText("Meetings")).click(); // driver.switchTo(). //
	 * driver = new ChromeDriver(); // driver.manage().window().maximize(); //
	 * driver.navigate().to("https://dev.dhanushsamvaad.com/samvaad/schedule"); //
	 * driver.findElement(By.linkText("Meetings")).click(); // String newWindow =
	 * driver.getWindowHandle(); // driver.switchTo().window(newWindow);
	 * 
	 * // driver.findElement(By.xpath(
	 * "//*[@id=\"navbarsExampleDefaultnav\"]/ul/li[2]/a")).isEnabled(); //
	 * driver.switchTo().window(child_window); driver.findElement(By.xpath(
	 * "/html/body/app-root/app-schedule/section/div/div/div/div/div[2]/div/form/div/div[4]/button[2]"
	 * )).click(); // ']")).click(); // driver.findElement(By.xpath( //
	 * "//html/body/app-root/app-schedule/section/div/div/div/div/div[2]/div/form/div/div[4]/button[2]"
	 * )) // .click();
	 * 
	 * } /*
	 * 
	 * @Test public void Test3() {
	 * driver.get("https://dev.dhanushsamvaad.com/samvaad/schedule");
	 * driver.findElement(By.xpath("//*[@id=\"header-bg\"]/nav/button")).click();
	 * 
	 * driver.findElement(By.xpath(
	 * "//html/body/app-root/app-schedule/section/div/div/div/div/div[2]/div/form/div/div[4]/button[2]"
	 * )).click(); }
	 */

	// driver.get("https://dev.dhanushsamvaad.com/samvaad/schedule");
	/*
	 * String url1 = driver.getCurrentUrl(); if
	 * (url1.equals("https://dev.dhanushsamvaad.com/samvaad/schedule")) {
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"navbarsExampleDefaultnav\"]/ul/li[2]/a")).click();
	 * 
	 * System.out.println("Login Successful: Passed"); } else {
	 * System.out.println("Login Unsuccesful: Failed"); }
	 * 
	 * System.out.println("Test2 Title is : "+driver.getTitle());
	 * 
	 * }
	 */

	/*
	 * @AfterMethod public void quit() { driver.close(); }
	 */
	public static void main(String[] args) throws InterruptedException {
		
		TestClass t = new TestClass();
		t.lanuchDriver();

		t.Test1();
		
	}
}
