package parameterFirst;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ParaDemo {

	

@Test(dataProvider = "dp")
public void add(int a, int b)
{
System.out.println(a +" "+b);	
}
	

@Test(dataProvider ="dp")
public void multi(int a, int b)
{
	System.out.println(a*b);
	
}
	

	@DataProvider(name = "dp")
	public Object[][] getData(Method m)
	{
		Object [][] data=null;
		
		
		
		switch (m.getName())
		{
		case "add": 
			data=new Object[][] {{10,20},{20,30}};
		
			break;
			
		case "multi":
			data=new Object[][] {{5,12},{31,10}};
			break;
		
		
	}
		return data;
}

}