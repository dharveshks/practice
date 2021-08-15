package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class slthotel extends Base {
	//radio
	@FindBy(name="radiobutton_0")
	public static WebElement rdio;
	//continue
	@FindBy(xpath="//input[@type='submit']")
	public static WebElement cntinue;
	
	public slthotel(WebDriver Adriver) {
		Base.driver=Adriver;
		PageFactory.initElements(driver, this);

	}
}