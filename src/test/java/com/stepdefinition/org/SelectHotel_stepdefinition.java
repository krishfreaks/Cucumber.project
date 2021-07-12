package com.stepdefinition.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.propertry.Page_Object_Manager;
import com.automation.pom.SelectHotel_pom;
import com.runner.org.Runner;

import Cucumber.Automation_baseclass.Base_Class;
import cucumber.api.java.en.*;

public class SelectHotel_stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User click on radio button$")
	public void user_click_on_radio_button() throws Throwable {
	    
		clickOnElement(pom.getInstanceSelect().getRadio_btn());
	    }
	

	@Then("^User validate continue button$")
	public void user_validate_continue_button() throws Throwable {
		clickOnElement(pom.getInstanceSelect().getSubmit());
	    }
}
