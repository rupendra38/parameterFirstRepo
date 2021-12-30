package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParaDemo {

	@Test
	public void getPara() throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(option);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
		
		
		//driver.get("https://www.softwaretestingmaterial.com/selenium-interview-questions/");
		
		
	
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("rupendras32@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("monu#452010");
		
		driver.findElement(By.name("login")).click();

		String title = driver.findElement(By.xpath("//span[text()='Rupendra Singh Rajawat']")).getText();

		if (title.equalsIgnoreCase("Rupendra Singh Rajawat")) {

			System.out.println(" login successfull ");
			Thread.sleep(5000);

			JavascriptExecutor js=(JavascriptExecutor)driver;
	         js.executeScript("scrollBy(0,5000)");
			
			
			
			driver.findElement(By.xpath("//div[@aria-label='Account' and @role='button']")).click();
			driver.findElement(By.xpath("//span[text()='Log Out']")).click();
			System.out.println("logout done");
			driver.close();

		} else {
			System.out.println("try again later");
		}

	}

}
