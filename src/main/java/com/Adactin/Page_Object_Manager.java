package com.Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.book;
import com.Adactin.Login;
import com.Adactin.Logout;
import com.Adactin.Search;
import com.Adactin.slthotel;

public class Page_Object_Manager {
	public WebDriver driver;
	 private Login log;
	 private Search sch;
	 private slthotel htl;
	 private book bk;
	 private Logout lout;
	 public Page_Object_Manager(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
	public Login get_Instance_login() {
		 log=new Login(driver);
		 return log;
	 }
      public Search get_Instance_search() {
    	  sch=new  Search(driver);
    	  return sch;
      }
      public slthotel get_Instance_Hotel() {
    	  htl=new slthotel(driver);
    	  return htl;
      }
      public book get_instance_Bok() {
    	  bk=new book(driver);
    	  return bk;
      }
      public Logout get_instance_lgout() {
    	  lout=new Logout(driver);
    	  return lout;
      }
      
}

