package com.stepdefinition.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.adactin.propertry.Page_Object_Manager;
import com.automation.pom.SearchHotel_pom;
import com.runner.org.Runner;

import Cucumber.Automation_baseclass.Base_Class;
import cucumber.api.java.en.*;

public class SearchHotel_stepdefinition extends Base_Class{
	
	public static WebDriver driver = Runner.driver;
	
	Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	@When("^User selects location$")
	public void user_selects_location() throws Throwable {
	dropDown(pom.getsetsearch().getLocate(), "byValue", "Melbourne");    
	}

	@When("^User selects hotels$")
	public void user_selects_hotels() throws Throwable {
		dropDown(pom.getsetsearch().getHotel(), "byVisibleText", "Hotel Creek");
	    }

	@When("^User selects roomtype$")
	public void user_selects_roomtype() throws Throwable {
		dropDown(pom.getsetsearch().getRoomtype(), "byValue", "Standard");
	    }

	@When("^User selects no of rooms$")
	public void user_selects_no_of_rooms() throws Throwable {
		dropDown(pom.getsetsearch().getRoomno(), "byValue", "2");
	    }

	@When("^User clear check in date$")
	public void user_clear_check_in_date() throws Throwable {
		clearOnElement(pom.getsetsearch().getDatepickin());
	    }

	@When("^User enters check in date$")
	public void user_enters_check_in_date() throws Throwable {
		inputOnElement(pom.getsetsearch().getDatepickin(), "29/06/2021");
	    }

	@When("^User clear check out date$")
	public void user_clear_check_out_date() throws Throwable {
	 clearOnElement(pom.getsetsearch().getDatepickout());   
	}

	@When("^User enters check out date$")
	public void user_enters_check_out_date() throws Throwable {
	inputOnElement(pom.getsetsearch().getDatepickout(), "31/06/2021");    
	}

	@When("^User selects adults per room$")
	public void user_selects_adults_per_room() throws Throwable {
	dropDown(pom.getsetsearch().getAdultroom(), "byValue", "2");    
	}

	@When("^User selects children per room$")
	public void user_selects_children_per_room() throws Throwable {
		dropDown(pom.getsetsearch().getChildroom(), "byValue", "2");
	    }

	@Then("^User validate search button$")
	public void user_validate_search_button() throws Throwable {
	clickOnElement(pom.getsetsearch().getSearch());    
	}

}
