package com.npw.testscripts.gap;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.npw.lib.RA.NavigateTo;
import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Messages;
import com.om.framework.lib.Utilities;
import com.om.framework.pageObjects.GapPageObject;
import com.om.framework.reporting.Reporting;

public class TC_007_MedicalAidPage_Validations_InvalidValuesEntered extends BaseTest {

	private static boolean bStatus;
	private static Map<String, String> objMap;
	private static String TestData_path_GAP = "TestData/TestData.xls";
	private static String sheetName = "GAP";
	private static String TestCaseName = "TC_007_MedicalAidPage_Validations_InvalidValuesEntered";

	@Test
	public static void GetAllDetailsFromResidentialPage()
			throws IOException, HeadlessException, AWTException, InterruptedException {
		Reporting.Functionality = "New Public Web-GAP";
		Reporting.Testcasename = "Get all validations from the Medical Aid Page when invalid values are entered in Text fields";
		objMap = Utilities.readTestData((Utilities.getProjectPath() + TestData_path_GAP), sheetName, TestCaseName);

		// add a function to dynamically pick up the class name and add it as a test
		// case name.
		try {
			//			bStatus = NavigateTo.hoverAndClickHeaderMenu(objMap);
			//			if (!bStatus) {
			//				Reporting.logResults("Fail", "Navigate to the Medical gap cover page",
			//						"Issue in hoverAndClickHeaderMenu method due to " + Messages.errorMsg);
			//				return;
			//			}
			//			Reporting.logResults("Pass", "Navigate to the Medical gap cover page", "Navigated to medical cover page.");
			//			
			//			// Select Plan 
			//			bStatus = GapPageObject.selectPlan(objMap);
			//			if (!bStatus) {
			//				Reporting.logResults("Fail", "Select Medical gap Plan",
			//						"Issue in selectPlan method due to " + Messages.errorMsg);
			//				return;
			//			}
			//			Reporting.logResults("Pass", "Select Medical gap Plan", "Selected medical gap plan.");
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "CLicked on Continue button");
			bStatus = GapPageObject.greateDecisionStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in Decision page.",
						"Unable to enter the details.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in Decision page.",
					"Succesfully entered the details in decision page.");

			// Enter get to know better step details
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "CLicked on Continue button");
			bStatus = GapPageObject.getToKnowBetterStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in get To know better page.",
						"Unable to enter the details.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in get To know better page.",
					"Succesfully entered the details in get To know better page.");
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");

			// Enter details on where do you live page
			bStatus = GapPageObject.whereDoYouLiveStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in where do you live page",
						"Unable to enter the details.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in where do you live page",
					"Succesfully entered the details in where do you live page");
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
			Thread.sleep(1000);
bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");

			// Enter details on Medical Aid page
			bStatus = GapPageObject.medicalAidDetails(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in medical cover page",
						"Unable to enter the details.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in medical cover page",
					"Succesfully entered the details in where do you live page");

			// Get all validations
			bStatus = GapPageObject.getAllValidationMessages("MedicalAidDetailsPage");
			if (!bStatus) {
				Reporting.logResults("Fail", "Get all validations on medical Aid Details step.",
						"Unable to get all validations on  medical Aid Details Page due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Get all validations on medical Aid Details step.",
					"All validations successfully matched on medical Aid Details Step");

		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults("Fail", "Something happened with the testcase", "Failed");
		}
	}

}
