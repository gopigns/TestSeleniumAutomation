package clientInterfaces;

import java.awt.AWTException;
import java.io.IOException;

import automationBLClasses.TRHubAutomation;

public class TRHubAutomationClient {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
		TRHubAutomation newTRHub = new TRHubAutomation();
		//newTRHub.automationOfManageSAFEAccountF();
		//TRHubAutomation.automationOfManagingWindows();
		//TRHubAutomation.alertPopupWorkflowAutomation();
		//TRHubAutomation.automationOfHandlingDBoxes();
		//TRHubAutomation.automationOfHandlingDBoxesUsingAdvncaActiok();
		//TRHubAutomation.automationOfManageSAFEAccountAdncaeOptionsF();
		newTRHub.automationOfManageSAFEAccountAdncaeOptionsF();

	}

}
