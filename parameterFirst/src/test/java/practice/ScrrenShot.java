package practice;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrrenShot {
@Test

public void getScreen() throws IOException {
	
	WebDriverManager.chromedriver().setup();

	ChromeOptions option = new ChromeOptions();
	option.addArguments("--disable-notifications");

	WebDriver driver = new ChromeDriver(option);

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(200, TimeUnit.SECONDS);
	
	
	driver.get("https://www.google.co.in/");
	
	List<WebElement> links= driver.findElements(By.tagName("a"));

	for(int i=0;i<links.size();i++)
	{
		
		String url=links.get(i).getAttribute("href");
		openLink(url);
	}
	
	
}

public void openLink(String url2) throws IOException
{
	URL url =new URL(url2);
	
	           HttpURLConnection http= (HttpURLConnection)     url.openConnection();
	           
	           http.setConnectTimeout(10000);
	           
	           http.connect();
	           
	           if(http.getResponseCode()==200)
	           {
	        	   
	        	   System.out.println(" url is valid "+url2+" "+url2 +" "+http.getResponseMessage());
	           }
}
	
}
