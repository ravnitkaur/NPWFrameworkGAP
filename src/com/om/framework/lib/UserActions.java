package com.om.framework.lib;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.om.framework.basetest.BaseTest;

public class UserActions extends BaseTest 
{

	private static Actions act;
	private static Logger logger=Logger.getLogger("UserActions");


	public static boolean mouseOver(By objLocator)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("The mouse over operation could not be performed on "+objLocator+" due to "+Messages.errorMsg);
			return false;
			
		}
		act = new Actions(driver);
		act.moveToElement(wbElement);
		act.perform();
		logger.info("The mouse over operation on "+objLocator+" has been performed successfully.");
		return true;	
	}


	public static boolean click(By objLocator)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("The object "+objLocator+" cannot be clicked due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.click(wbElement);
		act.perform();
		logger.info("The object "+objLocator+" has been clicked succesfully.");
		return true;
	}


	public static boolean clickAndHold(By objLocator)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("The clickAndHold operation on the element "+objLocator+" could not be performed due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.clickAndHold(wbElement);
		act.perform();
		logger.info("The clickAndHold operation on the element "+objLocator+" has been performed succesfully.");
		return true;
	}

	public static boolean contextClick(By objLocator)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("A context-click at middle of the given element "+objLocator+" could not be performed due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.contextClick(wbElement);
		act.perform();
		logger.info("A context-click at middle of the given element "+objLocator+" has been performed succesfully.");
		return true;
	}


	public static void contextClick()
	{
		act = new Actions(driver);
		act.contextClick();
		act.perform();
		logger.info("A contextClick at the current mouse location has been performed succesfully.");
	}


	public static boolean doubleClick(By objLocator)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("A double-click at middle of the given element on "+objLocator+" could not be performed due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.doubleClick(wbElement);
		act.perform();
		logger.info("A double-click at middle of the given element on "+objLocator+" has been performed succesfully.");
		return true;
	}

	public static boolean dragAndDrop(By objLocatorSource,By objLocatorDestination)
	{
		WebElement wbElementSource = Elements.getWebElement(objLocatorSource);
		WebElement wbElementDestination = Elements.getWebElement(objLocatorDestination);
		if((wbElementSource == null)||(wbElementDestination == null))
		{
			logger.warn("The drag and drop operation from (source) "+objLocatorSource+" to (target) "+objLocatorDestination+" could not be performed due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.dragAndDrop(wbElementSource, wbElementDestination);
		act.perform();
		logger.info("The drag and drop operation from (source) "+objLocatorSource+" to (target) "+objLocatorDestination+" has been performed succesfully.");
		return true;
	}


	public static void keyDown(Keys keyvalue)
	{
		act = new Actions(driver);
		act.keyDown(keyvalue);
		act.perform();
		logger.info("A modifier key press operation has been succesfully performed on "+keyvalue.name());
	}

	public static boolean keyDown(By objLocator,Keys keyvalue)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("A modifier key "+keyvalue.name()+" press operation could not be performed on "+objLocator+" due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.keyDown(wbElement, keyvalue);
		act.perform();
		logger.info("A modifier key "+keyvalue.name()+" press operation performed on "+objLocator);
		return true;
	}


	public static void keyUp(Keys keyvalue)
	{
		act = new Actions(driver);
		act.keyUp(keyvalue);
		act.perform();
		logger.info("A modifier key "+keyvalue.name()+" release operation performed ");
	}


	public static boolean keyUp(By objLocator,Keys keyvalue)
	{
		WebElement wbElement = Elements.getWebElement(objLocator);
		if(wbElement == null)
		{
			logger.warn("A modifier key "+keyvalue.name()+" release operation could not be performed on "+objLocator+" due to "+Messages.errorMsg);
			return false;
		}
		act = new Actions(driver);
		act.keyUp(wbElement, keyvalue);
		act.perform();
		logger.info("A modifier key "+keyvalue.name()+" release operation performed on "+objLocator);
		return true;
	}
	
	/*******************************************************************************
	Function Name 					: sendKeys
	Description						: Sends the keys to the active element
	Parameters						: value
	Usage							: bStatus = sendKeys(value)
	Created By						: Anil Krishna Sai Kosaraju
	Created On						: 
	 ******************************************************************************/
	public static void sendKeys(CharSequence... value)
	{
		act = new Actions(driver);
		act.sendKeys(Keys.chord(value));
		act.perform();
		logger.info("Send keys to the active element has been performed succesfully.");
	}
	
	/*******************************************************************************
	Function Name 					: controlClickElement
	Description						: Clicks control + the given web element
	Parameters						: wbElement
	Usage							: bStatus = controlClickElement(wbElement)
	Created By						: Anil Krishna Sai Kosaraju
	Created On						: 
	 ******************************************************************************/
	public static boolean controlClickElement(WebElement wbElement)
	{
		try
		{
			if(wbElement == null)
			{
				logger.warn("A modifier control key press operation could not be performed on "+wbElement+" due to "+Messages.errorMsg);
				return false;
			}
			//key down
			UserActions.keyDown(Keys.CONTROL);

			act = new Actions(driver);
			act.click(wbElement).build().perform();
			Wait.waitForGivenTimeOut(500);
			
			UserActions.keyUp(Keys.CONTROL);

			logger.info("A modifier control key press operation performed on "+wbElement);
		}
		catch(Exception e)
		{
			logger.warn("A modifier control key press operation could not be performed on "+wbElement+" due to "+Messages.errorMsg);
			return false;
		}
		return true;
	}
}
