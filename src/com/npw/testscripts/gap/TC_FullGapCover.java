package com.npw.testscripts.gap;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;

import org.testng.annotations.Test;

import com.npw.lib.GAP.SeleniumDriverUtil;
import com.npw.lib.RA.RA;
import com.npw.locators.LocatorsGap;
//import com.npw.LocatorsGap.NavigationMenu.LocatorsGapGap;
import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Messages;
import com.om.framework.lib.Utilities;
import com.om.framework.reporting.Reporting;

public class TC_FullGapCover extends BaseTest{
	
	
	//package com.npw.testscripts.ra;


		private static boolean bStatus;

//		private static Map<String,String> objRADtls;
//		private static String TestData_path_RA= "TestData\\RA_TestData.xls";
//		private static String sheetName="RA_Sheet";
//		private static String TestCaseName="TC_01_CreateRAApplication";


		@Test
		public static void createApp() throws HeadlessException, IOException, AWTException{
			
			//Initialize testcase for reporting purpose
//			Reporting.Functionality = "RA";
//			Reporting.Testcasename = TestCaseName;
			String pageUrl = "https://new-public-web-qa.nonprod.digitalplatform.oldmutual.co.za/personal/solutions/health/gap-cover/intro";
//
//			//Read data from excelsheet 
//			objRADtls = Utilities.readTestData(TestData_path_RA,sheetName, TestCaseName);

			bStatus = SeleniumDriverUtil.navigateTo(pageUrl);
			if(!bStatus)
			{
				Reporting.logResults("Fail", "Navigate to Gap.", "Failed to Navigate to Gap... due to " + Messages.errorMsg);
				return;
			}
			Reporting.logResults("Pass", "Navigate to Gap", "Navigated to Gap");
			
//			bStatus = SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.personalMenuItem());
//			if(!bStatus)
//			{
//				Reporting.logResults("Fail", "wait for Personal Menu Item.", "Failed to wait for Personal Menu Item.. due to " + Messages.errorMsg);
//				return;
//			}
//			Reporting.logResults("Pass", "Wait for Personal Menu Item", "Waited for Personal Menu Item");
//			
//			//Personal Main Page ------------------------------------------------------------------------------------------------------------------------------------------
//			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.personalWelcomeHeader());
//			Reporting.logResults("Pass", "Scroll to Personal Welcome Header", "Scrolled to Personal Welcome Header");
//			
//			bStatus = SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.personalInsureHeader());
//			if(!bStatus)
//			{
//				Reporting.logResults("Fail", "Click Personal Insure Header.", "Failed to Click Personal Insure Header... due to " + Messages.errorMsg);
//				return;
//			}
//			Reporting.logResults("Pass", "Click Personal Insure Header", "Clicked Personal Insure Header");
//			
//			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_BuyNowButton()))
//			{
//				Reporting.logResults("Fail", "click Personal GAP Buy Now Butto.", "Failed to click Personal GAP Buy Now Button... due to " + Messages.errorMsg);
//				return;
//			}
//			Reporting.logResults("Pass", "click Personal GAP Buy Now Butto", "clicked Personal GAP Buy Now Butto");
//			
			//Gap Application Info Page ------------------------------------------------------------------------------------------------------------------------------------------
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Application_Header()))
			{
				Reporting.logResults("Fail", "wait for GAP Application Header.", "Failed to wait for GAP Application Header... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Application Header", "waited for GAP Application Header");
	                
	        if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
	        
			//Gap Great Decision Page ------------------------------------------------------------------------------------------------------------------------------------------
			SeleniumDriverUtil.pause(1000);
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Application_Header()))
			{
				Reporting.logResults("Fail", "wait for GAP Application Header.", "Failed to wait for GAP Application Header... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP Application Header", "waited for GAP Application Header");
	                
	        SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_Application_Header());
	        Reporting.logResults("Pass", "Scroll to Application Header", "Scrolled to Application Header");
	                
	        if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_FirstName_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details First Name Input.", "Failed to click GAP Personal Details First Name Input... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "click GAP Personal Details First Name Input", "clicked GAP Personal Details First Name Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_FirstName_Input_Field(), "FFirstName"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details FirstName Input Field.", "Failed to enter text at GAP Personal Details FirstName Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details FirstName Input Field", "entered text at GAP Personal Details FirstName Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Surname_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Surname Input.", "Failed to click GAP Personal Details Surname Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Surname Input", "clicked GAP Personal Details Surname Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Surname_Input_Field(), "SSurname"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details Surname Input Field.", "Failed to enter text at GAP Personal Details Surname Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details Surname Input Field", "entered text at GAP Personal Details Surname Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Cellphone_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Cellphone Number Input.", "Failed to click GAP Personal Details Cellphone Number Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Cellphone Number Input", "clicked GAP Personal Details Cellphone Number Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Cellphone_Input_Field(), "00744254418"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details Cellphone Number Input Field.", "Failed to enter text at GAP Personal Details Cellphone Number Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details Cellphone Number Input Field", "entered text at GAP Personal Details Cellphone Number Input Field");
	                
	        if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Email_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Email Input.", "Failed to click GAP Personal Details Email Input... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "click GAP Personal Details Email Input", "clicked GAP Personal Details Email Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Email_Input_Field(), "Ttest@test.com"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details Email Input Field.", "Failed to enter text at GAP Personal Details Email Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details Email Input Field", "entered text at GAP Personal Details Email Input Field");
	                
	        if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
	                
	        //pause(2000);
	        //Gap Start Date Page ------------------------------------------------------------------------------------------------------------------------------------------        
			SeleniumDriverUtil.pause(1000);
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
			
			//Gap Personal Details Page ------------------------------------------------------------------------------------------------------------------------------------------
			SeleniumDriverUtil.pause(1000);
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Header());
			Reporting.logResults("Pass", "Scroll to Personal Details Header", "Scrolled to Personal Details Header");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_DropDown());
	        Reporting.logResults("Pass", "Scroll to Application Header", "Scrolled to Application Header");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_DropDown()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Title Dropdown.", "Failed to click GAP Personal Details Title Dropdown... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Title Dropdown", "clicked GAP Personal Details Title Dropdown");
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_Option("Mrs")))
			{
				Reporting.logResults("Fail", "wait for GAP Personal Details Title Option.", "Failed to wait for GAP Personal Details Title Option... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Personal Details Title Option", "waited for GAP Personal Details Title Option");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_Option("Mrs")))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Title Option.", "Failed to click GAP Personal Details Title Option... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Title Option", "clicked GAP Personal Details Title Option");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Initials_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Initials Input.", "Failed to click GAP Personal Details Initials Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Initials Input", "clicked GAP Personal Details Initials Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Initials_Input_Field(), "TTT"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details Initials Input Field.", "Failed to enter text at GAP Personal Details Initials Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details Initials Input Field", "entered text at GAP Personal Details Initials Input Field");
			
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_ID_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details RSA ID Number Input.", "Failed to click GAP Personal Details RSA ID Number Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details RSA ID Number Input", "clicked GAP Personal Details RSA ID Number Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_ID_Input_Field(), "99806094800084"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details RSA ID Number Input Field.", "Failed to enter text at GAP Personal Details RSA ID Number Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details RSA ID Number Input Field", "entered text at GAP Personal Details RSA ID Number Input Field");
	                
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_PersonalDetails_ID_Input_Field());
			Reporting.logResults("Pass", "Scroll to Personal Details ID Input Field", "Scrolled to Personal Details ID Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_DOB_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Details Date of Birth Input.", "Failed to click GAP Personal Details Date of Birth Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Personal Details Date of Birth Input", "clicked GAP Personal Details Date of Birth Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_DOB_Input_Field(), "009/06/1998"))
			{
				Reporting.logResults("Fail", "enter text at GAP Personal Details Date of Birth Input Field.", "Failed to enter text at GAP Personal Details Date of Birth Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Personal Details Date of Birth Input Field", "entered text at GAP Personal Details Date of Birth Input Field");
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
			
			//Gap Residential Address Page ------------------------------------------------------------------------------------------------------------------------------------------
			SeleniumDriverUtil.pause(1000);
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_Header()))
			{
				Reporting.logResults("Fail", "wait for GAP Residential Address Header.", "Failed to wait for GAP Residential Address Header... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Residential Address Header", "waited for GAP Residential Address Header");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_Header());
			Reporting.logResults("Pass", "Scroll to Residential Address Header", "Scrolled to Residential Address Header");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_StreetName_Input()))
			{
				Reporting.logResults("Fail", "click GAP Residential Address Street Name Input.", "Failed to click GAP Residential Address Street Name Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Residential Address Street Name Input", "clicked GAP Residential Address Street Name Input");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_Header());
			Reporting.logResults("Pass", "Scroll to Residential Address Header", "Scrolled to Residential Address Header");
			
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_StreetName_Input_Field(), "BBronx"))
			{
				Reporting.logResults("Fail", "enter text at GAP Residential Address Street Name Input Field.", "Failed to enter text at GAP Residential Address Street Name Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Residential Address Street Name Input Field", "entered text at GAP Residential Address Street Name Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_Suburb_Input()))
			{
				Reporting.logResults("Fail", "click GAP Residential Address Suburb Input.", "Failed to click GAP Residential Address Suburb Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Residential Address Suburb Input", "clicked GAP Residential Address Suburb Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_Suburb_Input_Field(), "RRetreat"))
			{
				Reporting.logResults("Fail", "enter text at GAP Residential Address Suburb Input Field.", "Failed to enter text at GAP Residential Address Suburb Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Residential Address Suburb Input Field", "entered text at GAP Residential Address Suburb Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_City_Input()))
			{
				Reporting.logResults("Fail", "click GAP Residential Address City Input.", "Failed to click GAP Residential Address City Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Residential Address City Input", "clicked GAP Residential Address City Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_City_Input_Field(), "CCapeTown"))
			{
				Reporting.logResults("Fail", "enter text at GAP Residential Address City Input Field.", "Failed to enter text at GAP Residential Address City Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Residential Address City Input Field", "entered text at GAP Residential Address City Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_PostalCode_Input()))
			{
				Reporting.logResults("Fail", "click GAP Residential Address Postal Code Input.", "Failed to click GAP Residential Address Postal Code Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Residential Address Postal Code Input", "clicked GAP Residential Address Postal Code Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_ResidentialAddress_PostalCode_Input_Field(), "77801"))
			{
				Reporting.logResults("Fail", "enter text at GAP Residential Address Postal Code Input Field.", "Failed to enter text at GAP Residential Address Postal Code Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Residential Address Postal Code Input Field", "entered text at GAP Residential Address Postal Code Input Field");
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
			
			//Gap Dependant Details Page ------------------------------------------------------------------------------------------------------------------------------------------
			SeleniumDriverUtil.pause(1000);
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_DependantDetails_PleaseNote_Header()))
			{
				Reporting.logResults("Fail", "wait for GAP Dependant Details Please Note Header.", "Failed to wait for GAP Dependant Details Please Note Headern... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Dependant Details Please Note Header", "waited for GAP Dependant Details Please Note Header");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_DependantDetails_PleaseNote_Header());
			Reporting.logResults("Pass", "Scroll to Please Note Header", "Scrolled to Please Note Header");
			
			if(!SeleniumDriverUtil.clickElementByXpathShadowDOM("//strong[contains(text(),'Would you like to add any dependants')]//..//..//..//div//om-toggle-switch","div > label > span"))
			{
				Reporting.logResults("Fail", "click Dependant Details Slider in Shadow-root.", "Failed to click Dependant Details Slider in Shadow-root... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click Dependant Details Slider in Shadow-root", "clicked Dependant Details Slider in Shadow-root");
			
			//Add Dependants:
			String DependantType = "";
			for(int i=1;i<7;i++) {
				
			if(i==1){DependantType = "Spouse";}else {DependantType="Child";}
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_DependantDetails_Dependant1_Header(i)))
			{
				Reporting.logResults("Fail", "wait for GAP Dependant Details Dependant Header.", "Failed to wait for GAP Dependant Details Dependant Header... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP Dependant Details Dependant Header", "waited for GAP Dependant Details Dependant Header");
				
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_DependantDetails_Dependant1_Header(i));
			Reporting.logResults("Pass", "Scroll to GAP Dependant Details Dependant Header", "Scrolled to GAP Dependant Details Dependant Header");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_DependantDetails_Relationship_Dropdown()))
			{
				Reporting.logResults("Fail", "click DependantDetails_Relationship_Dropdown.", "Failed to click DependantDetails_Relationship_Dropdown... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click DependantDetails_Relationship_Dropdown", "clicked DependantDetails_Relationship_Dropdown");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_Option(DependantType)))
			{
				Reporting.logResults("Fail", "click DependantDetails_Relationship_DropdownOption.", "Failed to click DependantDetails_Relationship_DropdownOption... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click DependantDetails_Relationship_DropdownOption", "clicked DependantDetails_Relationship_DropdownOption");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_FirstName_Input()))
			{
				Reporting.logResults("Fail", "click GAP Personal Dependant First Name Input.", "Failed to click GAP Dependant Details First Name Input... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "click GAP Dependant Details First Name Input", "clicked GAP Dependant Details First Name Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_FirstName_Input_Field(), "DDependant"+DependantType+"FirstName"))
			{
				Reporting.logResults("Fail", "enter text at GAP Dependant Details FirstName Input Field.", "Failed to enter text at GAP Personal Details FirstName Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Dependant Details FirstName Input Field", "entered text at GAP Dependant Details FirstName Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Surname_Input()))
			{
				Reporting.logResults("Fail", "click GAP Dependant Details Surname Input.", "Failed to click GAP Dependant Details Surname Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Dependant Details Surname Input", "clicked GAP Dependant Details Surname Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Surname_Input_Field(), "DDependant"+DependantType+"Surname"))
			{
				Reporting.logResults("Fail", "enter text at GAP Dependant Details Surname Input Field.", "Failed to enter text at GAP Personal Details Surname Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Dependant Details Surname Input Field", "entered text at GAP Dependant Details Surname Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_DOB_Input()))
			{
				Reporting.logResults("Fail", "click GAP Dependant Details Date of Birth Input.", "Failed to click GAP Dependant Details Date of Birth Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Dependant Details Date of Birth Input", "clicked GAP Dependant Details Date of Birth Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_PersonalDetails_DOB_Input_Field(), "009/06/1998"))
			{
				Reporting.logResults("Fail", "enter text at GAP Dependant Details Date of Birth Input Field.", "Failed to enter text at GAP Dependant Details Date of Birth Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP Dependant Details Date of Birth Input Field", "entered text at GAP Dependant Details Date of Birth Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_DependantDetails_SaveDependent_Button()))
			{
				Reporting.logResults("Fail", "click GAP Dependant Details SaveDependent_Button.", "Failed to click GAP Dependant Details SaveDependent_Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Dependant Details SaveDependent_Button", "clicked GAP Dependant Details SaveDependent_Button");
			
			if(i<6) {
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_DependantDetails_AddDependent_Button()))
			{
				Reporting.logResults("Fail", "click GAP Dependant Details AddDependent_Button.", "Failed to click GAP Dependant Details AddDependent_Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Dependant Details AddDependent_Button", "clicked GAP Dependant Details AddDependent_Button");
			}}
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "wait for GAP Continue Button.", "Failed to wait for GAP Continue Button... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP Continue Button", "waited for GAP Continue Button");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_Continue_Button()))
			{
				Reporting.logResults("Fail", "click GAP Continue Button.", "Failed to click GAP Continue Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Continue Button", "clicked GAP Continue Button");
			
			//Medical Aid Page ------------------------------------------------------------------------------------------------------------------------------------------
			SeleniumDriverUtil.pause(2000);
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_YourMedicalAid_Header()))
			{
				Reporting.logResults("Fail", "wait for GAP YourMedicalAid_Header.", "Failed to wait for GAP YourMedicalAid_Header... due to " + Messages.errorMsg);
			}
	        Reporting.logResults("Pass", "wait for GAP YourMedicalAid_Header", "waited for GAP YourMedicalAid_Header");
	        
	        SeleniumDriverUtil.pause(2000);
	        
	        SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidProvider_Input());
			Reporting.logResults("Pass", "Scroll to GAP MedicalAid YourMedicalAid_Header", "Scrolled to GAP MedicalAid YourMedicalAid_Header");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidProvider_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalAidProvider Input.", "Failed to click GAP MedicalAid MedicalAidProvider Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalAidProvider Input", "clicked GAP MedicalAid MedicalAidProvider Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidProvider_Input_Field(), "MMedicalAidProvider"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalAidProvider Input Field.", "Failed to enter text at GAP MedicalAid MedicalAidProvider Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalAidProvider Input Field", "entered text at GAP MedicalAid MedicalAidProvider Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidNumber_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalAidNumber Input.", "Failed to click GAP MedicalAid MedicalAidNumber Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalAidNumber Input", "clicked GAP MedicalAid MedicalAidNumber Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidNumber_Input_Field(), "1123456T"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalAidNumber Input Field.", "Failed to enter text at GAP MedicalAid MedicalAidNumber Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalAidNumber Input Field", "entered text at GAP MedicalAid MedicalAidNumber Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidPlan_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalAidPlan Input.", "Failed to click GAP MedicalAid MedicalAidPlan Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalAidPlan Input", "clicked GAP MedicalAid MedicalAidPlan Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalAidPlan_Input_Field(), "MMedicalAidPlan"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalAidPlan Input Field.", "Failed to enter text at GAP MedicalAid MedicalAidPlan Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalAidPlan Input Field", "entered text at GAP MedicalAid MedicalAidPlan Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_StartDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid StartDate Input.", "Failed to click GAP MedicalAid StartDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid StartDate Input", "clicked GAP MedicalAid StartDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_StartDate_Input_Field(), "009/06/2009"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid StartDate Input Field.", "Failed to enter text at GAP MedicalAid StartDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid StartDate Input Field", "entered text at GAP MedicalAid StartDate Input Field");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_Header());
			Reporting.logResults("Pass", "Scroll to GAP MedicalAid MedicalCoverBefore Header", "Scrolled to GAP MedicalAid MedicalCoverBefore_Header");
			
			if(!SeleniumDriverUtil.clickElementByXpathShadowDOM("//*[@id=\"app\"]/om-page-bg-color/div/div[2]/div/om-application-page/div/div/om-layout-with-sidebar/div/section/div/om-gap-dependent-details/div/div[2]/div[3]/div/div[1]/om-toggle-switch","div > label > span"))
			{
				Reporting.logResults("Fail", "click Medical Aid Cover Before Slider in Shadow-root.", "Failed to click Medical Aid Cover Before Slider in Shadow-root... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click Medical Aid Cover Before Slider in Shadow-root", "clicked Medical Aid Cover Before Slider in Shadow-root");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_Provider_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCoverBefore_Provider Input.", "Failed to click GAP MedicalAid MedicalCoverBefore_Provider Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCoverBefore_Provider Input", "clicked GAP MedicalAid StartDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_Provider_Input_Field(), "PPreviousProvider"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalCoverBefore_Provider Input Field.", "Failed to enter text at GAP MedicalAid MedicalCoverBefore_Provider Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalCoverBefore_Provider Input Field", "entered text at GAP MedicalAid MedicalCoverBefore_Provider Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_StartDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCoverBefore_StartDate Input.", "Failed to click GAP MedicalAid MedicalCoverBefore_StartDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCoverBefore_StartDate Input", "clicked GAP MedicalAid MedicalCoverBefore_StartDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_StartDate_Input_Field(), "009/06/2004"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalCoverBefore_StartDate Input Field.", "Failed to enter text at GAP MedicalAid MedicalCoverBefore_StartDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalCoverBefore_StartDate Input Field", "entered text at GAP MedicalAid MedicalCoverBefore_StartDate Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_EndDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCoverBefore_EndDate Input.", "Failed to click GAP MedicalAid MedicalCoverBefore_EndDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCoverBefore_EndDate Input", "clicked GAP MedicalAid MedicalCoverBefore_EndDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCoverBefore_EndDate_Input_Field(), "009/06/2008"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalCoverBefore_EndDate Input Field.", "Failed to enter text at GAP MedicalAid MedicalCoverBefore_EndDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalCoverBefore_EndDate Input Field", "entered text at GAP MedicalAid MedicalCoverBefore_EndDate Input Field");
			
			if(!SeleniumDriverUtil.clickElementByXpathShadowDOM("//*[@id=\"app\"]/om-page-bg-color/div/div[2]/div/om-application-page/div/div/om-layout-with-sidebar/div/section/div/om-gap-dependent-details/div/div[2]/div[3]/div/div[3]/om-toggle-switch","div > label > span"))
			{
				Reporting.logResults("Fail", "click GAP Cover Before Slider in Shadow-root.", "Failed to click GAP Cover Before Slider in Shadow-root... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP Cover Before Slider in Shadow-root", "clicked GAP Cover Before Slider in Shadow-root");
			
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_Header());
			Reporting.logResults("Pass", "Scroll to GAP MedicalAid GAPCoverBefore Header", "Scrolled to GAP MedicalAid GAPCoverBefore_Header");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_Provider_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid GAPCoverBefore_Provider Input.", "Failed to click GAP MedicalAid GAPCoverBefore_Provider Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid GAPCoverBefore_Provider Input", "clicked GAP GAPCoverBefore_Provider Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_Provider_Input_Field(), "PPreviousGAPProvider"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid GAPCoverBefore_Provider Input Field.", "Failed to enter text at GAP MedicalAid GAPCoverBefore_Provider Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid GAPCoverBefore_Provider Input Field", "entered text at GAP MedicalAid GAPCoverBefore_Provider Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_StartDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid GAPCoverBefore_StartDate Input.", "Failed to click GAP MedicalAid GAPCoverBefore_StartDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid GAPCoverBefore_StartDate Input", "clicked GAP MedicalAid GAPCoverBefore_StartDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_StartDate_Input_Field(), "009/06/2004"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid GAPCoverBefore_StartDate Input Field.", "Failed to enter text at GAP MedicalAid GAPCoverBefore_StartDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid GAPCoverBefore_StartDate Input Field", "entered text at GAP MedicalAid GAPCoverBefore_StartDate Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_EndDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid GAPCoverBefore_EndDate Input.", "Failed to click GAP MedicalAid GAPCoverBefore_EndDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid GAPCoverBefore_EndDate Input", "clicked GAP MedicalAid GAPCoverBefore_EndDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_GAPCoverBefore_EndDate_Input_Field(), "009/06/2008"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid GAPCoverBefore_EndDate Input Field.", "Failed to enter text at GAP MedicalAid GAPCoverBefore_EndDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid GAPCoverBefore_EndDate Input Field", "entered text at GAP MedicalAid GAPCoverBefore_EndDate Input Field");
			
			//Medical Condition:
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCondition_Header());
			Reporting.logResults("Pass", "Scroll to GAP MedicalAid Medical Condition Header", "Scrolled to GAP MedicalAid Medical Condition Header");
			
			if(!SeleniumDriverUtil.clickElementByXpathShadowDOM("//*[@id=\"app\"]/om-page-bg-color/div/div[2]/div/om-application-page/div/div/om-layout-with-sidebar/div/section/div/om-gap-dependent-details/div/div[2]/div[3]/div/om-toggle-switch","div > label > span"))
			{
				Reporting.logResults("Fail", "click Medical Condition Slider in Shadow-root.", "Failed to click Medical Condtion Slider in Shadow-root... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click Medical Condition Slider in Shadow-root", "clicked Medical Condition Slider in Shadow-root");
			
			for(int i =1;i<11;i++) {
			SeleniumDriverUtil.scrollToElement(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalConditionDependant_DropDown());
			Reporting.logResults("Pass", "Scroll to GAP MedicalAid MedicalConditionDependant_DropDown", "Scrolled to GAP MedicalAid MedicalConditionDependant_DropDown");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalConditionDependant_DropDown()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondition Dependant Dropdown.", "Failed to click GAP MedicalAid MedicalCondition Dependant Dropdown... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondition Dependant Dropdown", "clicked GAP Personal Details Title Dropdown");
			
			if(!SeleniumDriverUtil.waitForElementByXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_Option("Spouse")))
			{
				Reporting.logResults("Fail", "wait for GAP MedicalAid MedicalCondition Dependant Option.", "Failed to wait for GAP MedicalAid MedicalCondition Dependant Option... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "wait for GAP MedicalAid MedicalCondition Dependant Option", "waited for GAP MedicalAid MedicalCondition Dependant Option");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_PersonalDetails_Title_Option("Spouse")))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondition Dependant Option.", "Failed to click GAP MedicalAid MedicalCondition Dependant Option... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondition Dependant Option", "clicked GAP MedicalAid MedicalCondition Dependant Option");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCondtion_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondtion Input.", "Failed to click GAP MedicalAid MedicalCondtion Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondtion Input", "clicked GAP MedicalAid MedicalCondtion Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCondtion_Input_Field(), "KKungFlu"+i))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalCondtion Input Field.", "Failed to enter text at GAP MedicalAid MedicalCondtion Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalCondtion Input Field", "entered text at GAP MedicalAid MedicalCondtion Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalConditionDate_Input()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondtionDate Input.", "Failed to click GAP MedicalAid MedicalCondtionDate Input... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondtionDate Input", "clicked GAP MedicalAid MedicalCondtionDate Input");
			
			if(!SeleniumDriverUtil.enterTextByXpathUsingActions(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalConditionDate_Input_Field(), "009/06/2009"))
			{
				Reporting.logResults("Fail", "enter text at GAP MedicalAid MedicalCondtionDate Input Field.", "Failed to enter text at GAP MedicalAid MedicalCondtionDate Input Field... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "enter text at GAP MedicalAid MedicalCondtionDate Input Field", "entered text at GAP MedicalAid MedicalCondtionDate Input Field");
			
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCondition_Save_Button()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondition_Save_Button.", "Failed to click GAP MedicalAid MedicalCondition_Save_Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondition_Save_Button", "clicked GAP MedicalAid MedicalCondition_Save_Button");
			
			if(i<10) {
			if(!SeleniumDriverUtil.clickElementbyXpath(LocatorsGap.NavigationMenu.GAP_MedicalAid_MedicalCondition_Add_Button()))
			{
				Reporting.logResults("Fail", "click GAP MedicalAid MedicalCondition_Add_Button.", "Failed to click GAP MedicalAid MedicalCondition_Add_Button... due to " + Messages.errorMsg);
			}
			Reporting.logResults("Pass", "click GAP MedicalAid MedicalCondition_Add_Button", "clicked GAP MedicalAid MedicalCondition_Add_Button");
			
			}}

			if (bStatus) {
				Reporting.logResults("Pass", "Create RA application", "Succesfully created RA Application with reference num: "+RA.sRAReferenceNum);
				return;
			}
			else {
				Reporting.logResults("Fail", "Create RA application", "Unable to create RA application.. due to.."+Messages.errorMsg);
				return;
			}
		}
	}




