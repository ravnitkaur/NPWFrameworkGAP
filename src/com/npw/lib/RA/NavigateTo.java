package com.npw.lib.RA;
import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.Map;
import org.openqa.selenium.By;

import com.npw.locators.LocatorsRA;
import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Elements;
import com.om.framework.lib.Messages;
import com.om.framework.lib.UserActions;
import com.om.framework.lib.Wait;
import com.om.framework.pageObjects.GapPageObject;
import com.om.framework.reporting.Reporting;


public class NavigateTo extends BaseTest
{
	private static boolean bStatus;
	private static int iRAwait=25;

	public static boolean appMenu(String sAppMenuItem)
	{
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sAppMenuItem)), 15);
		bStatus=Elements.clickElement(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sAppMenuItem)));
		 
		return bStatus;
	}

	public static boolean hoverAndClickHeaderMenu(String sHeader, String sChildHeader, String sAppname) throws HeadlessException, IOException, AWTException
	{

		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)), iRAwait);
		bStatus=Elements.clickElement(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)));
		if(!bStatus) return bStatus;
		
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sChildHeader)), iRAwait);
		if(!bStatus) return bStatus;
		bStatus=UserActions.mouseOver(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sChildHeader)));
		if(!bStatus) return bStatus;
		
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sAppname)), 15);
		bStatus=Elements.clickElement(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sAppname)));
		if (bStatus==false) {
			Reporting.logResults("Fail", "Go to Application landing page from header menu", "Not able to navigate to "+sAppname+" from "+sChildHeader+" due to "+Messages.errorMsg+" ");
			return bStatus;
		}
		return bStatus;
	}
	
	public static boolean hoverAndClickHeaderMenu(Map<String,String> objMenuNames) throws HeadlessException, IOException, AWTException
	{
		 return hoverAndClickHeaderMenu(objMenuNames.get("HeaderMenu"),objMenuNames.get("SubHeaderMenu"), objMenuNames.get("AppName"));
	}
	
	
	public static boolean hoverAndClickHeaderMenu(String sHeader, String sChildHeader) throws HeadlessException, IOException, AWTException
	{	
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)), iRAwait);
		if(!bStatus) return bStatus;
		bStatus=Elements.clickElement(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)));
		if(!bStatus) return bStatus;
	
		
		
		
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sChildHeader)), iRAwait);
		if(!bStatus) return bStatus;
		bStatus=UserActions.mouseOver(By.xpath(LocatorsRA.NavigationMenu.subHeaderHover(sChildHeader)));
		if(!bStatus) return bStatus;
		
		
		if (bStatus==false) {
			Reporting.logResults("Fail", "Go to Application landing page from header menu", "Not able to navigate to "+sChildHeader+" from "+sHeader+" due to "+Messages.errorMsg+" ");
			return bStatus;
		}
		
		return bStatus;
	}
	
	public static boolean hoverAndClickHeaderMenu(String sHeader) throws HeadlessException, IOException, AWTException
	{

		
		bStatus=Wait.waitForElementVisibility(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)), iRAwait);
		bStatus=Elements.clickElement(By.xpath(LocatorsRA.NavigationMenu.getHeaderMenu(sHeader)));
		if(!bStatus) return bStatus;
		
		if (bStatus==false) {
			Reporting.logResults("Fail", "Go to Application landing page from header menu", "Not able to navigate to "+sHeader+" due to "+Messages.errorMsg+" ");
			return bStatus;
		}
		
		return bStatus;
	}

}