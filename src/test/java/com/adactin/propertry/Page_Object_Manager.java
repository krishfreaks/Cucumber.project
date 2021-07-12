package com.adactin.propertry;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automation.pom.BookHotel_pom;
import com.automation.pom.SearchHotel_pom;
import com.automation.pom.SelectHotel_pom;
import com.automation.pom.loginPage_pom;

public class Page_Object_Manager {

	public static WebDriver driver;
	private loginPage_pom login;
	private SearchHotel_pom search;
	private SelectHotel_pom select;
	private BookHotel_pom book;
		
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver2, this);
	}
	
	public loginPage_pom getSetupLogin() {
		login = new loginPage_pom(driver);
		return login;

	}
	
	public SearchHotel_pom getsetsearch() {
		search = new SearchHotel_pom(driver);
		return search;

	}
	
	public SelectHotel_pom getInstanceSelect() {
		select = new SelectHotel_pom(driver);
		return select;
		

	}
	
	public BookHotel_pom getInstanceBook() {
		book = new BookHotel_pom(driver);
		return book;

	}
}






