package parameterFirst;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoParameter {

	
	
	@Parameters({"data","data1"})
	
	
	
	@Test
	
	public void dis(String d,String d1)
	{
		System.out.println("name  is  "+d+" lastName is "+d1);
	}
	
	
	
	
}
