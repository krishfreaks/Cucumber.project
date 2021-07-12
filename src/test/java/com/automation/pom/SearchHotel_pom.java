package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel_pom {
	
	public static WebDriver driver;
	@FindBy(id = "location")
	private WebElement locate;
	
	@FindBy(id = "hotels")
	private WebElement hotel;
	
	@FindBy(id = "room_type")
	private WebElement roomtype;
	
	@FindBy(id = "room_nos")
	private WebElement roomno;
	
	@FindBy(id = "datepick_in")
	private WebElement datepickin;

	@FindBy(id = "datepick_out")
	private WebElement datepickout;
	
	@FindBy(id = "adult_room")
	private WebElement adultroom;
	
	@FindBy(id = "child_room")
	private WebElement childroom;

	@FindBy(id = "Submit")
	private WebElement search;

	public SearchHotel_pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getLocate() {
		return locate;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getRoomno() {
		return roomno;
	}

	public WebElement getDatepickin() {
		return datepickin;
	}

	public WebElement getDatepickout() {
		return datepickout;
	}

	public WebElement getAdultroom() {
		return adultroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSearch() {
		return search;
	}
	
	
	
}
