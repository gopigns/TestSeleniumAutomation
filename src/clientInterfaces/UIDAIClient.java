package clientInterfaces;

import java.awt.AWTException;
import java.io.IOException;

import automationBLClasses.UIDAIAutomation;

public class UIDAIClient {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		
		//UIDAIAutomation.searchWorkflowAutomation();
		//UIDAIAutomation.automationOfManagingWindows();
		UIDAIAutomation.alertPopupWorkflowAutomation();
		//UIDAIAutomation.mouseKeyBoardWorkflowAutomation();
		//UIDAIAutomation.searchWorkflowAutomationUsingAUIAPI();
		//UIDAIAutomation.automationOfDragAndDropEvent();
		//UIDAIAutomation.automationOfHandlingDBoxes();
	}

}
