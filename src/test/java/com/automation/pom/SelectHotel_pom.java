package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel_pom {

	
	public static WebDriver driver;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radio_btn;
	
	@FindBy(id = "continue")
	private WebElement submit;

	public SelectHotel_pom(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getRadio_btn() {
		return radio_btn;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
