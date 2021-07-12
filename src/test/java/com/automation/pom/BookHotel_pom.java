package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotel_pom {
	
	public static WebDriver driver;
	
	@FindBy(id = "first_name")
	private WebElement f_name;
	
	@FindBy(id = "last_name")
	private WebElement l_name;
	
	@FindBy(id = "address")
	private WebElement address;
	
	@FindBy(id = "cc_num")
	private WebElement cc_no;
	
	@FindBy(id = "cc_type")
	private WebElement cc_type;
	
	@FindBy(id = "cc_exp_month")
	private WebElement cc_expmonth;
	
	@FindBy(id = "cc_exp_year")
	private WebElement cc_expyear;
	
	@FindBy(id = "cc_cvv")
	private WebElement cvv;
	
	@FindBy(id = "book_now")
	private WebElement book;

	public BookHotel_pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getF_name() {
		return f_name;
	}

	public WebElement getL_name() {
		return l_name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCc_no() {
		return cc_no;
	}

	public WebElement getCc_type() {
		return cc_type;
	}

	public WebElement getCc_expmonth() {
		return cc_expmonth;
	}

	public WebElement getCc_expyear() {
		return cc_expyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getBook() {
		return book;
	}
	
	
	
	

}
