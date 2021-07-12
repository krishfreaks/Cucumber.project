package com.stepdefinition.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.propertry.Page_Object_Manager;
import com.automation.pom.BookHotel_pom;
import com.runner.org.Runner;

import Cucumber.Automation_baseclass.Base_Class;
import cucumber.api.java.en.*;

public class BookHotel_stepdefinition extends Base_Class{

	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User enters the firstname$")
	public void user_enters_the_firstname() throws Throwable {
		sendkeys_on_element(pom.getInstanceBook().getF_name(), "Ajay");
		
	    }

	@When("^User enters the lastname$")
	public void user_enters_the_lastname() throws Throwable {
		sendkeys_on_element(pom.getInstanceBook().getL_name(), "Krishnan");
	    }

	@When("^User enters the billing address$")
	public void user_enters_the_billing_address() throws Throwable {
		sendkeys_on_element(pom.getInstanceBook().getAddress(), "Madurai");
	    }

	@When("^User enters the credit card number$")
	public void user_enters_the_credit_card_number() throws Throwable {
	sendkeys_on_element(pom.getInstanceBook().getCc_no(), "3636363664736360");    
	}

	@When("^User selects credit card type$")
	public void user_selects_credit_card_type() throws Throwable {
		dropDown(pom.getInstanceBook().getCc_type(), "byValue", "VISA");
	    }

	@When("^User selects credit card expiry month$")
	public void user_selects_credit_card_expiry_month() throws Throwable {
		dropDown(pom.getInstanceBook().getCc_expmonth(), "byValue", "2");
	    }

	@When("^User selects credit card expiry year$")
	public void user_selects_credit_card_expiry_year() throws Throwable {
		dropDown(pom.getInstanceBook().getCc_expyear(), "byValue", "2022");
	    }

	@When("^User enters CVV number$")
	public void user_enters_CVV_number() throws Throwable {
		sendkeys_on_element(pom.getInstanceBook().getCvv(), "345");
	    }

	@When("^User click booknow button$")
	public void user_click_booknow_button() throws Throwable {
		clickOnElement(pom.getInstanceBook().getBook());
	    }

	@Then("^User validate booknow button$")
	public void user_validate_booknow_button() throws Throwable {
	    }
}
