package com.npw.lib.GAP;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.security.Credentials;
import org.openqa.selenium.security.UserAndPassword;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Messages;
import com.om.framework.reporting.Reporting;

public class SeleniumDriverUtil extends BaseTest{
	
	public SeleniumDriverUtil()
    {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\WebDrivers\\chromedriver");
		WebDriver driver = new ChromeDriver();

    }
	
	static int ApplicationWaitTimeout = 20;
	
	public static boolean navigateTo(String pageUrl) throws HeadlessException, IOException, AWTException
    {
        try
        {
            driver.navigate().to(pageUrl);
            return true;
        }
        catch (Exception e)
        {
        	Reporting.logResults("Fail", "Navigating to URL", "Failed To Navigate to URL: " + Messages.errorMsg);
            return false;
        }
    }
	
	public static void pause(int milisecondsToWait) {
        try {
            Thread.sleep(milisecondsToWait);
        } catch (Exception e) {

        }
    }
	
	public static boolean waitForElementByXpath(String elementXpath) throws HeadlessException, IOException, AWTException
    {
        boolean elementFound = false;
        try
        {
            int waitCount = 0;
            
            while (!elementFound && waitCount < ApplicationWaitTimeout)
            {
                try
                {
                    WebDriverWait wait = new WebDriverWait(driver, 1);

                    wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath)));
                    
                    if (wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath))) != null)
                    {
                        elementFound = true;
                        Reporting.logResults("Pass", "Wait for Element By Xpath", "Found element by Xpath: " + elementXpath);
                        //System.out.println(" Found element by Xpath : " + elementXpath);
                        break;
                    }
                }
                catch (Exception e)
                {
                    elementFound = false;
                }
                //Thread.sleep(500);
                waitCount++;
            }
            if (waitCount == ApplicationWaitTimeout)
            {
            	//System.out.println("Reached TimeOut whilst waiting for element by Xpath '" + elementXpath + "'");
            	Reporting.logResults("Fail", "Wait for Element By Xpath", "Reached TimeOut whilst waiting for element by Xpath '" + elementXpath + "'");

                return elementFound;
            }

        }
        catch (Exception e)
        {
        	//System.out.println(" waiting for element by Xpath '" + elementXpath + "' - " + e.getMessage());
        	Reporting.logResults("Fail", "Navigating to URL", "Failed To Navigate to URL: " + Messages.errorMsg);
        	
        }
        return elementFound;
    }
	
	public static boolean scrollToElement(String elementXpath) throws HeadlessException, IOException, AWTException
    {
        try
        {
            WebElement element = driver.findElement(By.xpath(elementXpath));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            //System.out.println("Scrolled to element - " + elementXpath);
            Reporting.logResults("Pass", "Scroll to element", "Scrolled to element: " + elementXpath);
            return true;
        }
        catch (Exception e)
        {
        	//System.out.println("Error scrolling to element - " + elementXpath + " - " + e.getStackTrace());
        	Reporting.logResults("Fail", "Scroll to Element", "Error scrolling to element: " + Messages.errorMsg);
            return false;
        }

    }
	
	public static boolean clickElementbyXpath(String elementXpath) throws HeadlessException, IOException, AWTException
    {
        try
        {

            waitForElementByXpath(elementXpath);
            WebDriverWait wait = new WebDriverWait(driver, ApplicationWaitTimeout);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            WebElement elementToClick = driver.findElement(By.xpath(elementXpath));
            elementToClick.click();
            //System.out.println("Clicked element by Xpath : " + elementXpath);
            Reporting.logResults("Pass", "Click Element By Xpath", "Clicked element by Xpath : " + elementXpath);
            return true;
        }
        catch (Exception e)
        {
        	//System.out.println(" Failed to click on element by Xpath - " + e.getMessage());
        	Reporting.logResults("Fail", "Click Element By Xpath", "Failed to click on element by Xpath: " + Messages.errorMsg);
            return false;
        }
    }
	
	public static boolean clickElementbyXpathUsingActions(String elementXpath) throws HeadlessException, IOException, AWTException
    {
        try
        {

            waitForElementByXpath(elementXpath);
            WebDriverWait wait = new WebDriverWait(driver,ApplicationWaitTimeout);
            wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
            WebElement elementToClick = driver.findElement(By.xpath(elementXpath));
            Actions action = new Actions(driver);
            action.moveToElement(elementToClick);
            action.click(elementToClick);
            action.perform();
            //System.out.println(" Clicked element by Xpath : " + elementXpath);
            Reporting.logResults("Pass", "Click Element By Xpath", "Clicked element by Xpath : " + elementXpath);

            return true;
        }
        catch (Exception e)
        {
        	Reporting.logResults("Fail", "Click Element By Xpath", "Failed to click on element by Xpath: " + Messages.errorMsg);
            return false;
        }
    }
	
	public static boolean enterTextByXpathUsingActions(String elementXpath, String textToEnter) throws HeadlessException, IOException, AWTException
    {
        try
        {
            waitForElementByXpath(elementXpath);
            WebElement elementToTypeIn = driver.findElement(By.xpath(elementXpath));
            //elementToTypeIn.clear;
            Actions typeText = new Actions(driver);
            typeText.moveToElement(elementToTypeIn);
            typeText.click(elementToTypeIn);
            typeText.sendKeys(elementToTypeIn, textToEnter);
            typeText.click(elementToTypeIn);
            typeText.perform();
            //System.out.println("Entered Text of: " + textToEnter + " to: " + elementXpath);
            Reporting.logResults("Pass", "Enter Text By Xpath", "Entered Text of: " + textToEnter + " to: " + elementXpath);

            return true;
        }
        catch (Exception e)
        {
        	//System.out.println(" entering text - " + elementXpath + " - " + e.getMessage());
        	Reporting.logResults("Fail", "Enter Text By Xpath", "Failed to enter text by xpath: " + Messages.errorMsg);
            return false;
        }
    }
	
	public static boolean waitForElementByLocator(By elementLocator) throws HeadlessException, IOException, AWTException
    {
        boolean elementFound = false;
        try
        {
            int waitCount = 0;
            while (!elementFound && waitCount < ApplicationWaitTimeout)
            {
                try
                {
                    WebDriverWait wait = new WebDriverWait(driver, 1);

                    wait.until(ExpectedConditions.presenceOfElementLocated(elementLocator));
                    wait.until(ExpectedConditions.elementToBeClickable(elementLocator));
                    if (wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator)) != null)
                    {
                        elementFound = true;
                        //System.out.println(" Found element by Xpath : " + elementLocator);
                        Reporting.logResults("Pass", "Wait for Element By Locator", "Found element by Xpath : " + elementLocator);
                        break;
                    }
                } catch (Exception e)
                {
                    elementFound = false;
                }
                //Thread.sleep(500);
                waitCount++;
            }
            if (waitCount == ApplicationWaitTimeout)
            {
            	System.out.println("Reached TimeOut whilst waiting for element by Xpath '" + elementLocator + "'");
            	Reporting.logResults("Fail", "Wait for Element By Locator", "Reached TimeOut whilst waiting for element by Xpath: " + Messages.errorMsg);

                return elementFound;
            }

        } catch (Exception e)
        {
        	Reporting.logResults("Fail", "Wait for Element By Locator","Failed waiting for element by Xpath '" + elementLocator + "' - " + Messages.errorMsg);
        }
        return elementFound;
    }
	
	public static WebElement expandRootElement(WebElement element)
    {
        WebElement ele = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", element);
        return ele;
    }
	
	public static boolean clickElementByXpathShadow(List<By> elementLocators)
    //https://www.seleniumeasy.com/selenium-tutorials/accessing-shadow-dom-elements-with-webdriver
    {//you can use xpaths. The issue is that you can't search your xpath inside of a shadow-root of chrome
        try
        {
            elementLocators.forEach(s -> System.out.println("elementLocators: " + s.toString()));
            WebElement root = null;
            WebElement shadowRoot = null;
            int lastLocatorIndex = elementLocators.size() - 1;
            for (int i = 0; i < elementLocators.size(); i++)
            {
                By currentLocator = elementLocators.get(i);
                if (i == 0)
                {//first Element in
                    waitForElementByLocator(currentLocator);
                    root = driver.findElement(currentLocator);
                    shadowRoot = expandRootElement(root);
                } else if (i == lastLocatorIndex)
                {//last element we want to click
//                    System.out.println("-*-");
//                    shadowRoot.findElements(By.cssSelector("*")).forEach(s -> System.out.println("element - Tag:" + s.getTagName()));
//                    System.out.println("-*-");
                    break;
                } else
                {//in between elements
//                    System.out.println("-*-");
//                    shadowRoot.findElements(By.cssSelector("*")).forEach(s -> System.out.println("element - Tag:" + s.getTagName()));
//                    System.out.println("-*-");
                    root = shadowRoot.findElement(currentLocator);
                    shadowRoot = expandRootElement(root);
                }
            }

            WebElement elementToClick = shadowRoot.findElement(elementLocators.get(lastLocatorIndex));
            try
            {
                elementToClick.click(); 
            } catch (Exception e)
            {
                JavascriptExecutor executor = (JavascriptExecutor) driver;
                executor.executeScript("arguments[0].click();", elementToClick);
            }

            //          //<editor-fold defaultstate="collapsed" desc="//Hardcoded V1">
//WebElement root1 = Driver.findElement(By.tagName("print-preview-app"));
//            WebElement shadowRoot1 = expandRootElement(root1);
//
//            WebElement root2 = shadowRoot1.findElement(By.cssSelector("print-preview-header"));
//            WebElement shadowRoot2 = expandRootElement(root2);
//            WebElement mainRoot = shadowRoot2.findElement(By.cssSelector("paper-button"));
//            mainRoot.click();
//</editor-fold>
            System.out.println("Clicking Shadow Element - " + elementLocators.toString());
            return true;
        } catch (Exception e)
        {

        	System.out.println(" Failed to click shadow element - " + e.getMessage());
            return false;
        }
    }
	
	public static boolean clickElementByXpathShadowDOM(String Xpath, String cssSelector) throws HeadlessException, IOException, AWTException 
	{
		try 
		{
			WebElement root1 = driver.findElement(By.xpath(Xpath));
	        WebElement shadow_root4 = expandRootElement(root1);
	        
	        //Used to Enter Text within an Element inside ShadowDOM
	        //WebElement search_term = shadow_root4.findElement(By.cssSelector("div#label#span"));
	        //String js = "arguments[0].setAttribute('value','pdf')";
	        //((JavascriptExecutor) driver).executeScript(js, search_term);

	        WebElement search_button = shadow_root4.findElement(By.cssSelector(cssSelector));
	        search_button.click();
	        
	        Reporting.logResults("Pass", "Click Element within Shadow DOM", "Element Clicked Within Shadow DOM: " + cssSelector);
			
			return true;
		}catch (Exception e) 
		{
			Reporting.logResults("Fail", "Click Element Wihtin Shadow DOM","Failed Element Click Within Shadow DOM '" + cssSelector + "' - " + Messages.errorMsg);
            return false;
		}
	}

}
