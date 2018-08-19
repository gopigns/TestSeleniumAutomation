package cleintInterfaces22;

import java.io.IOException;

import automationBLClases22.SafeRejistration;
import automationBLClasses.TRHubAutomation1;

public class TRAutomationClient {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		//SafeRejistration safeworklfow = new SafeRejistration();
		//safeworklfow.automationCreationFloe();
		
		
		TRHubAutomation1  test1 = new TRHubAutomation1();
		//test1.automationOfCreateSAFEAccountFlow(); 
	//	test1.automationOfManageSAFEAccountFlow();
	//	test1.automationOfManagingPopUpWindows();
		//test1.alertPopupWorkflowAutomation();
		test1.automationOfCreateSAFEAccountFlowUsingAUIAPI();
		
		
		

	}

}
