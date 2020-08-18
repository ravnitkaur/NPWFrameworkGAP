package com.npw.testscripts.gap;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Elements;
import com.om.framework.lib.UserActions;
import com.om.framework.lib.Verify;
import com.om.framework.pageObjects.GapPageObject;

public class TC_01_BranchLocator extends BaseTest
{
	private static boolean bStatus;
	private static String sBrachXpath = "//div[@class='province' and contains(@style,'block')]//b";
	
	
	@Test
	public static void testBranches()
	{
		try
		{
			
			//bStatus = GapPageObject.clickOnAdvancedButton("Advanced");
	      
	      
			//UserActions.click(By.xpath("//div[@class='nav-wrapper' and @id='details-button']"));
			//Thread.sleep(2000);
			//UserActions.click(By.xpath("*//[@id='proceed-link']"));
			
			//Read the JSON
			JSONParser parser = new JSONParser();
			FileReader reader = new FileReader("TestData/branchProvinces.json");
	     
			Object obj = parser.parse(reader);
			JSONObject jsonObject =  (JSONObject) obj;
			
	        
			//Get the list of provinces.. Loop through provinces..
			
			
			//Select province..
			
			
			

			//Get the Expected data of respective province from JOSN.... Province hard coded has to be replaced with the loop variable
			JSONArray branches = (JSONArray) jsonObject.get("Western Cape"); 
			
			//Branch count in JOSN
			int iExpBranchCount = branches.size();
			
			//Branch count in application
			int iActualBranchCount = Elements.getXpathCount(By.xpath(sBrachXpath));
			
			//verify the number of branches displayed as expected
			if(iExpBranchCount == iActualBranchCount)
				System.out.println("Branches count matched. Total number of expected branches in Western Cape are :"+iExpBranchCount +"\n" + " and Actual number of branches displayed in application are:"+iActualBranchCount);
			else
				System.out.println("Branches count mismatched. Total number of expected branches in Western Cape are :"+iExpBranchCount +"\n" + " and Actual number of branches displayed in application are:"+iActualBranchCount);
				
			
			//Loop through all the branches in the selected province
			for (Object o : branches)
			{
				JSONObject prov = (JSONObject) o;

				String branchName = (String) prov.get("Branch Name");
				System.out.println(branchName);
				
				//branchName = "Atlantis";
				//Verify the branch is present
				bStatus = Verify.verifyElementVisible(By.xpath(sBrachXpath+"[text()='"+branchName+"']"));
				if(!bStatus)
				{
					System.out.println(branchName+ "Not displayed in the application");
					continue;
				}

				String address = (String) prov.get("Branch Physical Address");
				System.out.println(address);
				
				//get the address
				String sAppLicationAddress = "";
				String sAddressRowXpath = "//div[@class='province' and contains(@style,'block')]//b[text()='"+branchName+"']/ancestor::tr//td[1]//div";
				int iRowsOfAddress = Elements.getXpathCount(By.xpath(sAddressRowXpath));
				for(int i=1;i<=iRowsOfAddress;i++)
				{
					String sText = Elements.getText(By.xpath(sAddressRowXpath+"["+i+"]"));
					
					//String sText = Elements.getValue(By.xpath(sAddressRowXpath+"["+i+"]"));
					sAppLicationAddress = sAppLicationAddress + " " +sText;
				}
				
				
				//If address is not matching
				if(!sAppLicationAddress.equalsIgnoreCase(address))
				{
					System.out.println("Address is not matching for the branch :"+branchName + "... Json address is:"+address +".. Application address is:"+sAppLicationAddress);
				}
			

				String opening = (String) prov.get("Opening time Weekdays");
				System.out.println(opening);
				
				String closing = (String) prov.get("Closing time Weekdays");
				System.out.println(closing);
				
			}

		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}

	}

}
