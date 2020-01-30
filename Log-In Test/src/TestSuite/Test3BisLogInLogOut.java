package TestSuite;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3BisLogInLogOut {

	@Test
	public void testURLs() throws InterruptedException{
		System.out.println("Log-In - Log Out");
		System.setProperty("webdriver.gecko.driver","C:\\ToolQA\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(3000L);
		driver.manage().window().maximize();
		String baseUrl = "https://www.hudl.com/login?forward=%2Flibrary%2F320073";

		String expectedTitle = "Log In - Hudl";
		String actualTitle = "";

		// launch Fire fox and direct it to the Base URL
		driver.get(baseUrl);

		// get the actual value of the title
		actualTitle = driver.getTitle();
		 /*
		 * compare the actual title of the page with the expected one and print
		 * the result as "Passed" or "Failed"
		 */
		if (actualTitle.contentEquals(expectedTitle)){
		    System.out.println("Log-In Test Passed!");
		} else {
		    System.out.println("Log-In Test Failed");
		}
		Thread.sleep(3000L);
		driver.findElement(By.name("username")).sendKeys("novese72@gmail.com");
		Thread.sleep(3000L);
		driver.findElement(By.name("password")).sendKeys("Novese72");
		Thread.sleep(3000L);
		driver.findElement(By.id("logIn")).click();
		Thread.sleep(3000L);
		//driver.switchTo().frame("classFrame");
		driver.findElement(By.className("hui-globaluseritem__display-name")).click();
		Thread.sleep(3000L);
		driver.findElement(By.linkText("Log Out")).click();
		Thread.sleep(3000L);

		String expectedLogOutTitle = "Log In - Hudl";
		String actualLogOutTitle = "";

		driver.get(baseUrl);
		actualLogOutTitle = driver.getTitle();
		 if (actualLogOutTitle.contentEquals(expectedLogOutTitle)){
			System.out.println("Log-Out Test Passed!");
		} else {
			System.out.println("Log-Out Test Failed");
		}
		 Thread.sleep(3000L);
		//close Fire fox
		driver.close();
		}
		}
