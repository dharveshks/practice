package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class book extends Base {
	//fname
	@FindBy(xpath="//input[@id='first_name']")
	public static WebElement fname;
	//lname
	@FindBy(xpath="//input[@id='last_name']")
	public static WebElement lname;
	//address
	@FindBy(xpath="//textarea[@id='address']")
	public static WebElement addrs;
	//cc
	@FindBy(xpath="//input[@id='cc_num']")
	public static WebElement cc;
	//cctype
	@FindBy(xpath="//select[@id='cc_type']//option[@value='VISA']")
	public static WebElement cctype;
	//expirymonth
	@FindBy(xpath="//select[@id='cc_exp_month']//option[@value='2']")
	public static WebElement month;
	//expiryyear
	@FindBy(xpath="//select[@id='cc_exp_year']//option[@value='2022']")
	public static WebElement year;
	//ccv
	@FindBy(xpath="//input[@id='cc_cvv']")
	public static WebElement ccv;
	//submit
	@FindBy(xpath="//input[@id='book_now']")
	public static WebElement submit;
	public book(WebDriver Adriver) {
		Base.driver=Adriver;
		PageFactory.initElements(driver, this);

	}
	
}