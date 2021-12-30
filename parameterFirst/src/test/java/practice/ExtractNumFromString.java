package practice;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtractNumFromString {
	
	
	
	@Test
	public void getNum()
	{
	
WebDriverManager.chromedriver().setup();
	
	ChromeOptions option=new ChromeOptions();
	option.addArguments("--disable-notifications");
	
	WebDriver driver =new ChromeDriver(option);
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
	
	driver.get("file:///C:/Users/HP/OneDrive/Desktop/country.html");

	String text=  driver.findElement(By.tagName("p")).getText();
	
	Select select =new Select(driver.findElement(By.id("country")));
List<WebElement> list	=select.getOptions();
	System.out.println(" country size "+list.size());
for (WebElement webElement : list) {
	System.out.println(" country name "+webElement.getText());
}
	
	String arr[]=text.split(" ");
	int count=0;
	for (String s : arr) {
		count++;
		
		if(count==5)
		{
			int a=Integer.parseInt(s);
			System.out.println("your salary is "+s+" counter is "+count);
			System.out.println(" count 5 value is "+a);
			
		}
		
	}
	
	System.out.println(" string is "+text);
	}
}
