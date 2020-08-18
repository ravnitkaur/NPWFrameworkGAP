package com.npw.testscripts.gap;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.npw.lib.GAP.GapNavigation;
import com.npw.lib.RA.CommonFunc;
import com.npw.lib.RA.NavigateTo;
import com.npw.locators.LocatorsGap;
import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Elements;
import com.om.framework.lib.Messages;
import com.om.framework.lib.Utilities;
import com.om.framework.lib.Wait;
import com.om.framework.pageObjects.GapPageObject;
import com.om.framework.reporting.Reporting;

public class TC_001_PositiveFlow extends BaseTest {
	private static boolean bStatus;
	private static Map<String, String> objMap;
	private static String TestData_path_GAP = "TestData/TestData.xls";
	private static String sheetName = "GAP";
	private static String TestCaseName = "TC_001_PositiveFlow";

	@Test
	public static void submitApp() throws IOException, HeadlessException, AWTException, InterruptedException {
		Reporting.Functionality ="New Public Web-GAP";
		Reporting.Testcasename = "Submit full GAP application";

		try {

			// Get data from Excel sheet
			objMap = Utilities.readTestData((Utilities.getProjectPath() + TestData_path_GAP), sheetName, TestCaseName);
     
			// Navigate to the GAP APP
//						bStatus = NavigateTo.hoverAndClickHeaderMenu(objMap);
//						if (!bStatus) {
//							Reporting.logResults("Fail", "Navigate to the Medical gap cover page",
//									"Issue in hoverAndClickHeaderMenu method due to " + Messages.errorMsg);
//							return;
//						}
//						Reporting.logResults("Pass", "Navigate to the Medical gap cover page", "Navigated to medical cover page.");
//						
//						// Select Plan 
//						bStatus = GapPageObject.selectPlan(objMap);
//						if (!bStatus) {
//							Reporting.logResults("Fail", "Select Medical gap Plan",
//									"Issue in selectPlan method due to " + Messages.errorMsg);
//							return;
//						}
//						Reporting.logResults("Pass", "Select Medical gap Plan", "Selected medical gap plan.");

			// Enter decision page details
			Thread.sleep(1000);
			//bStatus = GapPageObject.clickOnAdvancedButton("Continue");
			bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
			bStatus = GapPageObject.greateDecisionStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter the details in Decision page.",
						"Unable to enter the details.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter the details in Decision page.",
					"Succesfully entered the details in decision page.");

			// Enter get to know better step details
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
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "CLicked on Continue button");
			bStatus = GapPageObject.getToKnowBetterStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in get To know better page.",
						"Unable to enter the details.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in get To know better page.",
					"Succesfully entered the details in get To know better page.");
			bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
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
			Thread.sleep(1000);
			bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");

			// Enter details on Payment details page
			bStatus = GapPageObject.paymentDetails(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Added details on payment page",
						"Unable to add details on payment page" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Add details on payment page", "Added details on payment button");
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
						"Unable to click on the Continue button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");

			// Click on Terms and conditions check box on confirmation page
			GapPageObject.confirmationPage();
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on Terms and conditions check box.",
						"Unable to click on the T and C checkbox.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on Terms and conditions check box.", "Clicked on TandC checkbox");
			Thread.sleep(1000);

			//Click on Submit Button
			bStatus = GapNavigation.clickOnpageButton("Submit");
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on Submit button.",
						"Unable to click on the Submit button.. due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on Submit button", "Clicked on Submit button");

			//Verify the Thank You Page
			bStatus = GapPageObject.verifyTextOnSubmitPage(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Trying to reach the ThankYou page.",
						"Could not reach the Thank You Page" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Trying to reach the ThankYou page.", "Thank You page is reached.");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults("Fail", "Something happened with the testcase", "Failed");
		}
	}
}