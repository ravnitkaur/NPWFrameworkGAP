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

public class TC_002_KnowYouBetterPage_Validations_InvalidValuesEntered extends BaseTest {

	private static boolean bStatus;
	private static Map<String, String> objMap;
	private static String TestData_path_GAP = "TestData/TestData.xls";
	private static String sheetName = "GAP";
	private static String TestCaseName = "TC_002_KnowYouBetterPage_Validations_InvalidValuesEntered";

	@Test
	public static void getAllValidationsStepTwo()
			throws IOException, HeadlessException, AWTException, InterruptedException {
		Reporting.Functionality = "New Public Web-GAP";
		Reporting.Testcasename = "Get validations from the KNOW YOU BETTER page when invalid values are entered";

		// Get data from Excel sheet
		objMap = Utilities.readTestData((Utilities.getProjectPath() + TestData_path_GAP), sheetName, TestCaseName);
		try {
			Thread.sleep(1000);
			bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
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
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
			bStatus = GapPageObject.getToKnowBetterStep(objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Enter/Fill the details in get To know better page.",
						"Unable to enter the details.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Enter/Fill the details in get To know better page.",
					"Succesfully entered the details in get To know better page.");
			bStatus = GapPageObject.clickOnNextButton("Continue", objMap);
			if (!bStatus) {
				Reporting.logResults("Fail", "Click on CONTINUE button.",
						"Unable to click on the Continue button.. due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Click on CONTINUE button", "Clicked on Continue button");
			// Get all validations
			bStatus = GapPageObject.getAllValidationMessages("KnowYouBetterPage");
			if (!bStatus) {
				Reporting.logResults("Fail", "Get all validations on great decision step.",
						"Unable to get all validations on  great decision step due to" + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Get all validations on great decision step.",
					"All validations successfully matched on GreatDEcision Step");
		} catch (Exception e) {
			e.printStackTrace();
			Reporting.logResults("Fail", "Something happened with the testcase", "Failed");
		}

	}
}
