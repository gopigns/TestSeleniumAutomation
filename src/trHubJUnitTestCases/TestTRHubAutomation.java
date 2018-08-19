package trHubJUnitTestCases;
/*
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;*/

import org.testng.Assert;
import org.testng.annotations.Test;

import automationBLClasses.TRHubAutomation;

public class TestTRHubAutomation {

	//instance level object 
	TRHubAutomation testingthhub = new TRHubAutomation();
	/*@Test
	public void automationOfManageSAFEAccountF() {
	// Invoking a variable
		
		int expectedSafeAccountnumber = 12345;
		int actualSageAccountnumber;
		
		// Invoking a test case method
		actualSageAccountnumber = testingthhub.automationOfManageSAFEAccountF();
		org.junit.Assert.assertEquals(expectedSafeAccountnumber, actualSageAccountnumber);

	}*/
	
	@Test
	public void automationOfManageSAFEAccountF1() {
	// Invoking a variable
		
		String  expectedSafeAccountnumber = "Success";
		String  actualSageAccountnumber;
		
		// Invoking a test case method
		actualSageAccountnumber = testingthhub.automationOfManageSAFEAccountF();
		Assert.assertEquals(actualSageAccountnumber, expectedSafeAccountnumber);
		
		
		
	
	}

}
