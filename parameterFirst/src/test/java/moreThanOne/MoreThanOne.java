package moreThanOne;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class MoreThanOne {
	
	@Test(dataProvider = "dp")
	public void add(int a,int b)
	{
		System.out.println("sum = "+(a+b));
	}
	
	@Test(dataProvider = "dp")
	public void square(int a,int b)
	{
		System.out.println("Square of "+a+" is ="+a*b);
	}

	@DataProvider(name = "dp")
	public Object[][] getData(Method m)
	{
		Object [][]data=null;
		
		switch (m.getName()) {
		case "add":
			data= new Object[][]{{10,20},{52,48}};
			break;
		case "square":
			data= new Object[][]{{10,41},{52,545}};
		break;

		}
		
		return data;
	}
}
