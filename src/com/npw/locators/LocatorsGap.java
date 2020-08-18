package com.npw.locators;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;

public class LocatorsGap 
{
	//public static String sXpath = "";
	
	
	public static class NavigationMenu
	{
		public static String getAppMenuItemElement(String sAppMenuItem)
		{
			sXpath = "//div[contains(@class,'container-desktop')]//a[@href='/"+sAppMenuItem+"' or text()='"+sAppMenuItem+"']";
			return sXpath;
		}	
			
		public static String pageButton(String buttonText)
		{
			sXpath = "//span[contains(@class,'om-button-text') and text()='"+buttonText+"']";
			return sXpath;
		}
		
		public static String advancedButton(String buttonText)
		{
			sXpath = "//div[contains(@id,'details-button') and contains(text(),'"+buttonText+"')]";
			return sXpath;
		}
		
		public static String clickUsingID(String id)
		{
			sXpath = "//*[@id='"+id+"']";
			return sXpath;
		}
		
		public static String clickUsingButtonText(String buttonText)
		{
			sXpath = "//*[text()='"+buttonText+"']";
			return sXpath;
		}
		
		public static String inputFieldElements(String searchableText)
		{
			sXpath = "//input[contains(@placeholder, '"+searchableText+"')]";
			return sXpath;
		}
		
		public static String getValidationMessages()
		{
			sXpath = "//span[@class='validation-error-text']";
			return sXpath;
		}	
		
		public static String dropDownParentElements(String labelName)
		{			
			sXpath = "//om-dropdown-field[@label='"+labelName+"']"; 
			return sXpath;
		}
		
		public static String selectValueByText(String value)
		{		
			sXpath = "//ul[@class='dropdown-options-list']//li[text()='"+value+"']";
			return sXpath;
		}
		
		public static String selectValueByNumber(String number)
		{		
			sXpath = "//ul[@class='dropdown-options-list']//li['"+number+"']";
			return sXpath;
		}
		
		public static String verifyHeaderTagTextOnEveryPage(String tagName)
		{
			sXpath = "//"+tagName+"";
			return sXpath;
		}
		
		public static String verifyMenuText(String hovertext)
		{
			sXpath = "//div[contains(@class,'container-desktop')]//li[@class='active']//a[text()='"+hovertext+"']";
			return sXpath;
		}

		public static String startCover()
		{
			sXpath = "//span[contains(@class, 'om-icon-container')]";
			return sXpath;
		}
		public static String postalCode()
		{
			sXpath = "//span[contains(@class, 'om-icon-container')]";
			return sXpath;
		}
		public static String selectGapPlanTab(String planName)
		{
			//sXpath = "//div[contains(@class, 'tabs-container')]//*[text()='"+planName+"']";
			sXpath = "//*[text()='"+planName+"']//ancestor::div[@class='om-product-card-container']//*[text()='BUY NOW']";
			return sXpath;
		}
		public static String selectHeaderName(String headerName)
		{
			sXpath="//div[contains(@class,'container-desktop')]//a[text()='"+headerName+"']";
			return sXpath;
		}
		
		public static String sXpath = "";
		
		
		public static String personalMenuItem() 
		{
			sXpath = "//strong[contains(text(),'Supercharge')]";
			return sXpath;
		}
		
		public static String personalWelcomeHeader() 
		{
			sXpath = "//strong[contains(text(),'Welcome to our world')]";
			return sXpath;
		}
		
		public static String personalInsureHeader() 
		{
			sXpath = "//*[@id=\"app\"]/om-page/div/div/div/div/main/div/section[2]/om-tabs-product-carousel/div/om-section/div/div/div[2]/div/om-tabs/div/div[1]/div[1]/div[3]";
			return sXpath;
		}
		
		public static String GAP_BuyNowButton() 
		{
			sXpath = "//*[@id=\"app\"]/om-page/div/div/div/div/main/div/section[2]/om-tabs-product-carousel/div/om-section/div/div/div[2]/div/om-tabs/div/div[1]/div[2]/div[2]/div/om-carousel-container/div/div[2]/div/ul/li[2]/om-refined-product-card/om-product-card/div/div[2]/div[2]/div[1]/om-button/a/span";
			return sXpath;
		}
		
		public static String GAP_Application_Header() 
		{
			sXpath = "//h4[contains(text(),'Gap Cover ')]";
			return sXpath;
		}
		
		public static String GAP_PersonalDetails_Header() 
		{
			sXpath = "//h3[contains(text(),'Personal details')]";
			return sXpath;
		}
		
		public static String GAP_PersonalDetails_Title_DropDown() 
		{
			sXpath = "//om-dropdown-field[@label='Title']//div//div//div";
			return sXpath;
		}
		
		public static String GAP_PersonalDetails_Title_Option(String arg1) 
		{
			sXpath = "//li[contains(text(),'"+arg1+"')]";
			return sXpath;
		}
		
		public static String GAP_PersonalDetails_Initials_Input()
	    {
			sXpath = "//input[@placeholder='Initials']";
			return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_Initials_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Initials')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_FirstName_Input()
	    {
			sXpath = "//input[@placeholder='First Name(s)']";
			return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_FirstName_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'First Name(s)')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_Surname_Input()
	    {
			sXpath = "//input[@placeholder='Surname']";
			return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_Surname_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Surname')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_Cellphone_Input()
	    {
			sXpath = "//input[@placeholder='Cellphone Number']";
			return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_Cellphone_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Cellphone Number')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_ID_Input()
	    {
			sXpath = "//input[@placeholder='RSA ID Number']";
			return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_ID_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'RSA ID Number')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_DOB_Input()
	    {
	    	sXpath = "//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_PersonalDetails_DOB_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Date of Birth')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_Continue_Button()
	    {
	    	sXpath = "//span[@class='om-button-text'][contains(text(),'Continue')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_Header() 
	    {
	    	sXpath = "//h3[contains(text(),'Residential Address')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_StreetName_Input()
	    {
			sXpath = "//input[@placeholder='Street Name']";
			return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_StreetName_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Street Name')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_Suburb_Input()
	    {
			sXpath = "//input[@placeholder='Street Name']//..//..//..//om-input-field//div//input[@placeholder='Suburb']";
			return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_Suburb_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Suburb')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_City_Input()
	    {
			sXpath = "//input[@placeholder='City']";
			return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_City_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'City')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_PostalCode_Input()
	    {
			sXpath = "//input[@placeholder='Postal Code']";
			return sXpath;
	    }
	    
	    public static String GAP_ResidentialAddress_PostalCode_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Postal Code')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_DependantDetails_PleaseNote_Header() 
	    {
	    	sXpath= "//h4[contains(text(),'Please note')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_DependantDetails_AddDependant_Slider() 
	    {
	    	sXpath = "//label[@class='om-toggle-switch']";
	    	return sXpath;
	    }
		
	    public static List<By> shadowLocators_Slider()
	    {
	        List<By> locators = new ArrayList<>();
	        locators.add(By.tagName("om-toggle-switch"));
	        locators.add(By.cssSelector("om-toggle-switch-container"));
	        locators.add(By.cssSelector("om-toggle-switch"));
	        locators.add(By.cssSelector("select > option:nth-child(1)"));
	        return locators;
	    }
	    
	    public static String GAP_PersonalDetails_Email_Input()
	    {
			sXpath = "//input[@placeholder='Email Address']";
			return sXpath;
			
	    }
	    
	    public static String GAP_PersonalDetails_Email_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Email Address')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_DependantDetails_Dependant1_Header(int count) 
	    {
	    	sXpath = "//h6[contains(text(),'Dependant "+count+"')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_DependantDetails_Relationship_Dropdown()
	    {
	    	sXpath = "//om-dropdown-field[@label='Relationship to you']//div//div//div";
	        return sXpath;
	    }
	    
	    public static String GAP_DependantDetails_SaveDependent_Button()
	    {
	    	sXpath = "//button//span[contains(text(),'save dependant')]";
	        return sXpath;
	    }
	    
	    public static String GAP_DependantDetails_AddDependent_Button()
	    {
	    	sXpath = "//button//span[contains(text(),'Add Dependant')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_YourMedicalAid_Header()
	    {
			sXpath = "//h4[contains(text(),'Your medical aid details')]";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidProvider_Input()
	    {
			sXpath = "//input[@placeholder='Medical Aid Provider']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidProvider_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Medical Aid Provider')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidNumber_Input()
	    {
			sXpath = "//input[@placeholder='Medical Aid Number']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidNumber_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Medical Aid Number')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidPlan_Input()
	    {
			sXpath = "//input[@placeholder='Medical Aid Plan']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalAidPlan_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Medical Aid Plan')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_StartDate_Input()
	    {
	    	sXpath = "//span[contains(text(),'Medical Aid Start Date')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_StartDate_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Medical Aid Start Date')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_Header()
	    {
			sXpath = "//strong[contains(text(),'Medical Aid cover before')]";
			return sXpath;	
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_Provider_Input()
	    {
			sXpath = "//input[@placeholder='Previous Medical Aid Provider']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_Provider_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Previous Medical Aid Provider')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_StartDate_Input()
	    {
	    	sXpath = "//input[@placeholder='Previous Medical Aid Provider']//..//..//..//om-input-field//div//span[contains(text(),'Medical Aid Start Date')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    	//input[@placeholder='Previous Medical Aid Provider']//..//..//..//om-input-field//div//span[contains(text(),'Medical Aid Start Date')]//..//input[@placeholder='dd/mm/yyyy']
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_StartDate_Input_Field()
	    {
	    	sXpath = "//input[@placeholder='Previous Medical Aid Provider']//..//..//..//om-input-field//div//span[contains(text(),'Medical Aid Start Date')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_EndDate_Input()
	    {
	    	sXpath = "//input[@placeholder='Previous Medical Aid Provider']//..//..//..//om-input-field//div//span[contains(text(),'Medical Aid End Date')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalCoverBefore_EndDate_Input_Field()
	    {
	    	sXpath = "//input[@placeholder='Previous Medical Aid Provider']//..//..//..//om-input-field//div//span[contains(text(),'Medical Aid End Date')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_Header()
	    {
			sXpath = "//strong[contains(text(),'gap cover before')]";
			return sXpath;	
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_Provider_Input()
	    {
			sXpath = "//input[@placeholder='Previous Gap cover Provider']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_Provider_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Previous Gap cover Provider')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_StartDate_Input()
	    {
	    	sXpath = "//input[@placeholder='Previous Gap cover Provider']//..//..//..//om-input-field//div//span[contains(text(),'Gap cover Start Date')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_StartDate_Input_Field()
	    {
	    	sXpath = "//input[@placeholder='Previous Gap cover Provider']//..//..//..//om-input-field//div//span[contains(text(),'Gap cover Start Date')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_EndDate_Input()
	    {
	    	sXpath = "//input[@placeholder='Previous Gap cover Provider']//..//..//..//om-input-field//div//span[contains(text(),'Gap cover End Date')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_GAPCoverBefore_EndDate_Input_Field()
	    {
	    	sXpath = "//input[@placeholder='Previous Gap cover Provider']//..//..//..//om-input-field//div//span[contains(text(),'Gap cover End Date')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalCondition_Header()
	    {
			sXpath = "//strong[contains(text(),'medical condition or symptom')]";
			return sXpath;	
	    }
	    
	    public static String GAP_MedicalAid_MedicalConditionDependant_DropDown() 
		{
			sXpath = "//om-dropdown-field[@label='Select a dependant']//div//div//div";
			return sXpath;
		}
	    
	    public static String GAP_MedicalAid_MedicalCondtion_Input()
	    {
			sXpath = "//input[@placeholder='Medical Condition']";
			return sXpath;
			
	    }
	    
	    public static String GAP_MedicalAid_MedicalCondtion_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Medical Condition')]//..//input";
	    	return sXpath;
	    	
	    }
	    
	    public static String GAP_MedicalAid_MedicalConditionDate_Input()
	    {
	    	sXpath = "//span[contains(text(),'Date Of Diagnosis')]//..//input[@placeholder='dd/mm/yyyy']";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalConditionDate_Input_Field()
	    {
	    	sXpath = "//span[contains(text(),'Date Of Diagnosis')]//..//input";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalCondition_Save_Button()
	    {
	    	sXpath = "//button//span[contains(text(),'save')]";
	    	return sXpath;
	    }
	    
	    public static String GAP_MedicalAid_MedicalCondition_Add_Button()
	    {
	    	sXpath = "//button//span[contains(text(),'Add Condition')]";
	    	return sXpath;
	    }		
		
	}

}
