package selenium.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Analyzer implements IRetryAnalyzer {

	int count=0;
	int retry_count=2; //retry will happen for the 2 times 
	@Override
	public boolean retry(ITestResult result) {

		if(count<retry_count)
		{
			count++;
			return true;

		}
		return false;

	}
	
}
