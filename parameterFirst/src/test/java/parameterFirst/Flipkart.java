package parameterFirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Flipkart {

	
	
@Test(dataProvider = "getData" ,dataProviderClass = DataProvideDemo.class)
public void dis(int a,int b )
{
	{
		System.out.println(a +" "+b);
	}

	
	


		
		
		


		}
	
	


	
	
}
