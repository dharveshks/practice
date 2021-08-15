package com.adactin.runner;



import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.adactin.helper.configuration_Reader;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

import com.Adactin.Base;
import com.adactin.helper.FileReaderManager;




@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//features",glue="com.adactin.stepdefinition",
monochrome = true ,
dryRun= false,
strict=false,   
tags=("@SmokeTest,@SanityTest")
//plugin=
//{"html:Report/HTML_Report" ,
//   "pretty" ,
//   "json:Report/CucumberJSON_Report.json",
//   "com.cucumber.listener.ExtentCucumberFormatter:Report2/ExtentReport.html"
//   
//}
)

public class Test_Runner {
	
	public static WebDriver driver;

	
	@BeforeClass
	public static void set_Up() throws IOException 
	{
//		String browser=FileReaderManager.getInstance().getinstanceCR().get_Browser();
//				driver = Base.chl("chrm");
		
	   
	   driver= Base.chl("chrm");

	}
	
	
	
//	@AfterClass
//	public static  void tear_Down() 
//	{
//		driver.close();
//		
//
//	}

}
