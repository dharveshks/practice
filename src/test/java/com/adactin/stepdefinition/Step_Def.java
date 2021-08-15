package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.FileReaderManager;
import com.Adactin.Page_Object_Manager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.Adactin.Base;
import com.Adactin.book;
import com.Adactin.slthotel;
import com.Adactin.Login;
import com.Adactin.Logout;
import com.Adactin.Search;

public class Step_Def extends Base {
	
	public static WebDriver driver =Test_Runner.driver;
	public static Login loo = new Login(driver);
	public static Search ser =new Search(driver);
	public static slthotel con = new slthotel(driver);
	public static book nm = new book(driver);
	public static Logout ln = new Logout(driver);
	
	
	public static Page_Object_Manager po= new Page_Object_Manager(driver);
	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		
//	  String url = File_Reader_Manager.getInstance().getinstanceCR().get_url();
//	  oii(url);
	  oii("https://adactinhotelapp.com/index.php");
	  
	 
	}

	@When("^User Enter The Username In Username Field$")
	public void user_Enter_The_Username_In_Username_Field() throws Throwable {
		
//		sd(loo.uname, "sRaguram");
		
		sd(Login.uname,"sRaguram");
		
		
//		sd(po.get_Instance_Login().usname,"sRaguram");  
	}
//	@When("^User Enter The \"([^\"]*)\" In Username Field$")
//	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
//		;
//		
//	   sd(po.get_Instance_Login().usname, username);
//	}
//
//
	@When("^User Enter The Password In Password Field$")
	public void user_Enter_The_Password_In_Password_Field() throws Throwable {
		//sd(loo.pass, "noway008");
//		sd(po.get_Instance_Login().pass,"noway008" );
		
		sd(Login.Pass,"noway008");
	  
	}
//	@When("^User Enter The \"([^\"]*)\" In Password Field$")
//	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
//	
//	   sd(po.get_Instance_Login().pass, password);
//	  
//	}
//
//	@Then("^User Click On The Login Button And It Navigates To The Search Hotel$")
//	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel() throws Throwable {
//	   cls(loo.in); 
//	}
//
//	@When("^User Select The Hotel Location$")
//	public void user_Select_The_Hotel_Location() throws Throwable {
//		//selectbyvisibletext(ser.location, "Adelaide");
//		selectbyvisibletext(po.get_instance_Search().location, "Adelaide");
//	   
//	}
//
//	@When("^User Select The Hotel$")
//	public void user_Select_The_Hotel() throws Throwable {
//		selectbyvisibletext(ser.hotel, "Hotel Sunshine");
//	   
//	}
//
//	@When("^User Select The Room Type$")
//	public void user_Select_The_Room_Type() throws Throwable {
//		selectbyvisibletext(ser.room, "Double");
//	   
//	}
//
//	@When("^User Select Number Of Room Required$")
//	public void user_Select_Number_Of_Room_Required() throws Throwable {
//		selectbyvisibletext(ser.noroom, "3 - Three");
//	   
//	}
//
//	@When("^User Select Check In Date$")
//	public void user_Select_Check_In_Date() throws Throwable {
//		sd(ser.check_in, "03/05/1999");
//	   
//	}
//
//	@When("^User Select Check Out Date$")
//	public void user_Select_Check_Out_Date() throws Throwable {
//		sd(ser.check_out, "16/06/2021");
//	  
//	}
//
//	@When("^User Select Adults Per Room$")
//	public void user_Select_Adults_Per_Room() throws Throwable {
//		selectbyvisibletext(ser.adu_room, "3 - Three");
//	   
//	}
//
//	@When("^User Select Children Per Room$")
//	public void user_Select_Children_Per_Room() throws Throwable {
//		selectbyvisibletext(ser.child_room, "3 - Three");
//	   
//	}
//
//	@Then("^User Click On The Search Button And It Navigates To The Select Hotel$")
//	public void user_Click_On_The_Search_Button_And_It_Navigates_To_The_Select_Hotel() throws Throwable {
//	  cls(ser.searchb);  
//	}
//
//	@When("^User Select The Select Radio Button$")
//	public void user_Select_The_Select_Radio_Button() throws Throwable {
//		//cls(con.tick);
//		cls(po.get_instance_Continue().tick);
//	   
//	}
//
//	@Then("^User Click On The Continue Button And It Navigates To Book A Hotel$")
//	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel() throws Throwable {
//	   cls(con.next);
//	}
//
//	@When("^User Enter The First Name$")
//	public void user_Enter_The_First_Name() throws Throwable {
//		sd(nm.first_name, "Ragu");
//	   
//	}
//
//	@When("^User Enter The Last Name$")
//	public void user_Enter_The_Last_Name() throws Throwable {
//		sd(nm.last_name, "ram");
//	    
//	}
//
//	@When("^User Enter The Billing Address$")
//	public void user_Enter_The_Billing_Address() throws Throwable {
//		sd(nm.address, "64/12 chennai");
//	    
//	}
//
//	@When("^User Enter The Credit Card No$")
//	public void user_Enter_The_Credit_Card_No() throws Throwable {
//	     String Credit = File_Reader_Manager.getInstance().getinstanceCR().get_Credit();
//	     sd(nm.card_no, Credit);
//		//sd(nm.card_no, "1234567899876543");
//		
//	    
//	}
//
//	@When("^User Enter The Credit Card Type$")
//	public void user_Enter_The_Credit_Card_Type() throws Throwable {
//		selectbyvisibletext(nm.card_type, "Master Card");
//	   
//	}
//
//	@When("^User Select The Expiry Month In The Expiry Date$")
//	public void user_Select_The_Expiry_Month_In_The_Expiry_Date() throws Throwable {
//		selectbyvisibletext(nm.month, "April");
//	    
//	}
//
//	@When("^User Select The Expiry Year In  The Expiry Date$")
//	public void user_Select_The_Expiry_Year_In_The_Expiry_Date() throws Throwable {
//		selectbyvisibletext(nm.year, "2022");
//	    
//	}
//
//	@When("^User Enter The Cvv Numbe$")
//	public void user_Enter_The_Cvv_Numbe() throws Throwable {
//		//sd(nm.cvv, "267");
//		String cvv = File_Reader_Manager.getInstance().getinstanceCR().get_cvv();
//		sd(nm.cvv, cvv);
//	   
//	}
//
//	@Then("^User Click On The Book Now Button And It Navigates To Booking Confirm$")
//	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirm() throws Throwable {
//	   cls(nm.book);
//	}
//
//	@Then("^User Click On The logout Button$")
//	public void user_Click_On_The_Logout_Button() throws Throwable {
//		cls(ln.out);
//	   
//	}



}

