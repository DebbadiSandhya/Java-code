package selenium.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderAnnot {

	@DataProvider(name="data1")
	
	public Object[][] method1()
	{
		return new Object[][]{{21},{11},{15}};
	}
@Test(dataProvider="data1")
public void testcase1(int value)
{
	int sum=value+100;
	System.out.println(sum);
	
}
	
}
