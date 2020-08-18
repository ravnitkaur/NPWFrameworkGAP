package com.npw.testscripts.gap;

import java.awt.AWTException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.Test;

import com.om.framework.basetest.BaseTest;
import com.om.framework.lib.Utilities;
import com.om.framework.reporting.Reporting;

public class LinkVerification extends BaseTest {
	private static Map<String, String> objMap;
	private static String TestData_path_GAP = "TestData/TestData.xls";
	private static String sheetName = "Links";
	private static String TestCaseName = "Get all Links";
	
	@Test
	public static void getAllLinks() throws IOException, HeadlessException, AWTException, InterruptedException {
		Reporting.Functionality = "Get All Links";
		Reporting.Testcasename = "GAP Positive Flow Test Case";
//		objMap = Utilities.readTestData((Utilities.getProjectPath() + TestData_path_GAP), sheetName, TestCaseName);
         
         List<String> hrefs = new ArrayList<String>();
         List<WebElement> anchors = driver.findElements(By.tagName("a"));
         for ( WebElement anchor : anchors ) {
             hrefs.add(anchor.getAttribute("href"));
             System.out.println(hrefs);
         }
         for ( String href : hrefs ) {
        	 System.out.println(href);
        	 if(href.contains("new-public"))
        	 {
        		 driver.get(href); 
        		// HttpURLConnection hhtp= new HttpURLConnection();
        	 }
               
             
         }


	}
}
