package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {
	public static WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	public static WebElement uname;
	@FindBy(xpath="//input[@id='password']")
	public static WebElement Pass;
	@FindBy(xpath="//input[@id='login']")
	public static WebElement Clk;
	
	public Login(WebDriver Adriver) {
		Login.driver=Adriver;
		PageFactory.initElements(driver, this);
		
	}
}