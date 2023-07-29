package failedtestcases;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
 // create class to implement IRetryAnalyzer
// for repetitive execution of failed test cases
public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int limit = 3;

	@Override
	public boolean retry(ITestResult result) {
		if (count < limit) {
			count++;
			return true;
		}
		return false;
	}

}
