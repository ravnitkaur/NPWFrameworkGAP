package com.om.framework.pageObjects;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.npw.lib.GAP.GapNavigation;
import com.npw.locators.LocatorsGap;
import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Elements;
import com.om.framework.lib.Messages;
import com.om.framework.lib.Utilities;
import com.om.framework.lib.Wait;
import com.om.framework.reporting.Reporting;

public class GapPageObject {
	private static boolean bStatus;
	private static Map<String, String> objMap;

	public static String readValueDefaultIfNull(String val)
	{
		if(val == null)
			return "";
		else
			return val;
	}
	// can have a parameter to skip the continue button action
	public static boolean greateDecisionStep(Map<String, String> objMap)
			throws InterruptedException, HeadlessException, IOException, AWTException {

		// enter first name
		bStatus = GapNavigation.textInputfield("First Name(s)", readValueDefaultIfNull(objMap.get("FirstName")));
		if (!bStatus)
			return bStatus;
		// enter surname
		bStatus = GapNavigation.textInputfield("Surname", readValueDefaultIfNull(objMap.get("Surname")));
		if (!bStatus)
			return bStatus;
		// enter contact number
		if(objMap.get("phoneToBeCreatedRandomly").equalsIgnoreCase("true"))
		{
			bStatus = GapNavigation.textInputfield("Cellphone Number", generateRandomCellPhoneNumber(objMap));
		}
		else
		{
			bStatus = GapNavigation.textInputfield("Cellphone Number", readValueDefaultIfNull(objMap.get("Cellphone")));
		}
		if (!bStatus)
			return bStatus;
		// enter email address
		bStatus = GapNavigation.textInputfield("Email Address", readValueDefaultIfNull(objMap.get("Email")));
		if (!bStatus)
			return bStatus;			
		//}
		return bStatus;
	}

	// Common function to click on CONTINUE button
	public static boolean clickOnNextButton(String buttonName, Map<String, String> objMap) throws HeadlessException, IOException, AWTException {
		String getText = GapNavigation.verifyText(objMap.get("headerTagToBeVerified-EachPage"), objMap.get("TextToBeVerified-EachPage"));
		if (getText.contains(objMap.get("TextToBeVerified-EachPage"))) {
			bStatus = GapNavigation.clickOnpageButton(buttonName);
			Reporting.logResults("Pass", "Trying to click on button with name: " +buttonName, "Clicked on button");
		} else {
			Reporting.logResults("Fail", "Trying to click on button with name: " +buttonName, "Could not click on button: " + buttonName + Messages.errorMsg);
		}
		if (!bStatus)
			return bStatus;
		return bStatus;
	}

	public static boolean verifyMenutext() throws HeadlessException, IOException, AWTException {
		String getText = GapNavigation.verifyMenuItemText("Health");
		if (!(getText == ("Health")))
			return bStatus;
		return bStatus;
	}

	public static boolean getToKnowBetterStep(Map<String, String> objMap)
			throws InterruptedException, HeadlessException, IOException, AWTException {

		bStatus = GapNavigation
				.selectValueFromDropDown(LocatorsGap.NavigationMenu.dropDownParentElements(objMap.get("Title")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation
				.selectValueFromDropDown(LocatorsGap.NavigationMenu.selectValueByText(objMap.get("TitleValue")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("Initials", readValueDefaultIfNull(objMap.get("Initials")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.scrollToInputElement("RSA ID Number");
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("RSA ID Number", readValueDefaultIfNull(objMap.get("RSAID")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("dd/mm/yyyy", readValueDefaultIfNull(objMap.get("DOB")));
		if (!bStatus)
			return bStatus;
		return bStatus;
	}

	public static boolean whereDoYouLiveStep(Map<String, String> objMap)
			throws InterruptedException, HeadlessException, IOException, AWTException {
		
		bStatus = GapNavigation.textInputfield("Postal address", objMap.get("PostalAddress"));
		if (!bStatus)
			return bStatus;		
//		bStatus = GapNavigation.textInputfield("Apartment/Suite Name and Number", objMap.get("ApartmentNumber"));
//		if (!bStatus)
//			return bStatus;
//		bStatus = GapNavigation.textInputfield("Street Name", readValueDefaultIfNull(objMap.get("StreetName")));
//		if (!bStatus)
//			return bStatus;
		bStatus = GapNavigation.textInputfield("Suburb", readValueDefaultIfNull(objMap.get("Suburb")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("City", readValueDefaultIfNull(objMap.get("City")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.scrollToInputElement("Postal Code");
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("Postal Code", readValueDefaultIfNull(objMap.get("PostalCode")));
		if (!bStatus)
			return bStatus;
		return bStatus;
	}

	public static boolean medicalAidDetails(Map<String, String> objMap)
			throws InterruptedException, HeadlessException, IOException, AWTException {
		bStatus = GapNavigation.textInputfield("Medical Aid Provider", readValueDefaultIfNull(objMap.get("MedicalAidProvider")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("Medical Aid Number", readValueDefaultIfNull(objMap.get("MedicalAidNumber")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("Medical Aid Plan", readValueDefaultIfNull(objMap.get("MedicalAidPlan")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("dd/mm/yyyy", readValueDefaultIfNull(objMap.get("MedicalAidStartDate")));
		if (!bStatus)
			return bStatus;
		return bStatus;
	}

	public static boolean paymentDetails(Map<String, String> objMap)
			throws InterruptedException, HeadlessException, IOException, AWTException {
		bStatus = GapNavigation
				.selectValueFromDropDown(LocatorsGap.NavigationMenu.dropDownParentElements("Debit Order Date"));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.selectValueFromDropDown(LocatorsGap.NavigationMenu.selectValueByNumber("1"));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.selectValueFromDropDown(LocatorsGap.NavigationMenu.dropDownParentElements("Bank Name"));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.selectValueFromDropDown(LocatorsGap.NavigationMenu.selectValueByNumber("1"));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.scrollToInputElement("Account Number");
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.textInputfield("Account Number", readValueDefaultIfNull(objMap.get("AccountNumber")));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.scrollToViewElement("Account Type");
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.selectValueFromDropDown(LocatorsGap.NavigationMenu.dropDownParentElements("Account Type"));
		if (!bStatus)
			return bStatus;
		bStatus = GapNavigation.selectValueFromDropDown(LocatorsGap.NavigationMenu.selectValueByNumber("1"));
		return bStatus;
	}

	public static boolean confirmationPage() throws InterruptedException, HeadlessException, IOException, AWTException {
		bStatus = GapNavigation.clickUsingId("checkbox-1");
		return bStatus;
	}

	public static boolean getAllValidationMessages(String pageName)
			throws InterruptedException, HeadlessException, IOException, AWTException {
		try {
			List<WebElement> getAllValidations = GapNavigation.getallValidationMessages();
			String keyName;
			String keyValue;
			bStatus = false;

			for (int i = 0; i < getAllValidations.size(); i++) {
				keyName = "Validation" + pageName + (i);    
				keyValue = BaseTest.getPropValue(keyName);
				System.out.println("---kayvalue" + keyValue);

				if(keyValue == null)
					continue;

				Reporting.logResults("Pass", "Getting validation: ", "Got validation" + keyValue);
				if (getAllValidations.get(i).getText().equals(keyValue)) {
					Reporting.logResults("Pass", "Comparing stored Validations with the actual ones: ",
							"VALIDATION - " + getAllValidations.get(i).getText() + " MATCHES WITH " + keyValue);
					bStatus = true;
				} else {
					Reporting.logResults("Fail", "Comparing stored Validations with the actual ones: ",
							"Unable to get all validations on  great decision step due to" + Messages.appErrorMsg);
					return false;
				}
			}
		} catch (Exception e) {
			bStatus = false;
			Messages.errorMsg = e.getMessage();
		}
		return bStatus;
	}

	public static boolean selectPlan(Map<String, String> objMap) {
		bStatus = GapNavigation.selectPlanTab(objMap.get("planName"));
		if (!bStatus)
			return bStatus;
		return bStatus;
	}

	public static String generateRandomCellPhoneNumber(Map<String, String> objMap) throws HeadlessException, IOException, AWTException {
		try
		{
			String cellNumber = objMap.get("Cellphone");                             // Get cellPhone Number from Excel
			int randomGeneratedNumber = Utilities.generateRandNumber(1000, 5000);   //Generate random number
			String randomNumberToString= String.valueOf(randomGeneratedNumber);
			System.out.println("Random number is: " + randomNumberToString);
			String finalRandomCellphoneNumber = cellNumber + randomGeneratedNumber;           
			System.out.println("Final number is: " + finalRandomCellphoneNumber);
			Reporting.logResults("Pass", "Creating a random Phone number: " ,"Created a random Phone number");
			return finalRandomCellphoneNumber;
		}
		catch(Exception e)
		{
			Reporting.logResults("Fail", "Creating a random Phone number" , "Could not create a random Phone number");
			Messages.errorMsg = e.getMessage();
			e.printStackTrace();			
		}
		return null;
	}
	
	public static boolean verifyTextOnSubmitPage(Map<String, String> objMap) throws HeadlessException, IOException, AWTException
	{
		String getText = GapNavigation.verifyText(objMap.get("headerTagToBeVerified-ThankYouPage"),objMap.get("TextToBeVerified-ThankYouPage"));
		System.out.println(getText);
		if (getText.contains(objMap.get("TextToBeVerified-ThankYouPage")))
		{
			Reporting.logResults("Pass", "Got the text: " +getText, "Clicked on button");
			return bStatus=true;
		} else {
			Reporting.logResults("Fail", "Got the text: " , "Could not click on button: "  + Messages.errorMsg);
			return bStatus=false;		
		}
	}
	
	public static boolean clickOnAdvancedButton(String buttonName) throws HeadlessException, IOException, AWTException {
		//String getText = GapNavigation.verifyText(objMap.get("headerTagToBeVerified-EachPage"), objMap.get("TextToBeVerified-EachPage"));
		//if (getText.contains(objMap.get("TextToBeVerified-EachPage"))) {
			//bStatus = GapNavigation.clickOnAdvancedBrowserButton(buttonName);
			bStatus = GapNavigation.clickOnpageButton(buttonName);
			Reporting.logResults("Pass", "Trying to click on button with name: " +buttonName, "Clicked on button");
		//} else {
			Reporting.logResults("Fail", "Trying to click on button with name: " +buttonName, "Could not click on button: " + buttonName + Messages.errorMsg);
		//}
		if (!bStatus)
			return bStatus;
		return bStatus;
	}
	
}
