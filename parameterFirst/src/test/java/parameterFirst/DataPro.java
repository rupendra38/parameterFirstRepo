package parameterFirst;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

	

//	
//	
//	@Test(dataProvider = "getData")
//	public void access(int a, int b )
//	{
//		System.out.println(a +" "+b);
//	}
//	
	
	
	@Test(dataProvider = "getData" ,dataProviderClass = DataProvideDemo.class)
	public void msg(int a,int b)
	
	{
		System.out.println(a +" "+b);
	}
	
	
	

//	@DataProvider
//	public Object[][] getData()
//	{
//		Object data[][]=new Object[2][2];
//		data[0][0]=10;
//
//		data[0][1]=20;
//
//		data[1][0]=60;
//
//		data[1][1]=80;
//		return data;
//		
//	
//}
}
