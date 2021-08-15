package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout extends Base {
	@FindBy(id="logout")
	public static WebElement lout;
	public Logout(WebDriver Adriver) {
		Base.driver=Adriver;
		PageFactory.initElements(driver, this);

	}

}