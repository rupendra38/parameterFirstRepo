package parameterFirst;

import org.testng.annotations.DataProvider;

public class DataProvideDemo {

	@DataProvider
	public Object[][] getData()
	{
		Object data[][]=new Object[2][2];
		data[0][0]=10;

		data[0][1]=20;

		data[1][0]=60;

		data[1][1]=80;
		return data;
		
	
}

}
