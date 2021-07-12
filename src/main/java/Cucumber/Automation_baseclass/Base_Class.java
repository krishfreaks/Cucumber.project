package Cucumber.Automation_baseclass;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	public static WebDriver getBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+("\\Drive\\chromedriver.exe"));
				driver = new ChromeDriver();
				
			}
			else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+("\\driver\\firefoxdriver.exe"));
				driver = new FirefoxDriver();
				
			}
			else if (browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+("\\driver\\Edgedriver.exe"));
				driver = new EdgeDriver();
				
				
			}else {
				System.out.println("Invalid Browser");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		return driver;

	}
	public static void getUrl(String value) {
		driver.get(value);

	}	
	  public static void inputOnElement(WebElement element, String value) {
		  element.sendKeys(value);
		

	}	
public static void clickOnElement(WebElement element) {
	element.click();

}
public static void clearOnElement(WebElement element) {
	element.clear();
	

}
public static void dropDown(WebElement element, String Options, String Value) {
	Select s = new Select(element);
	try {
		if (Options.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(Value);
			s.selectByIndex(parseInt);
			
		}
		else if (Options.equalsIgnoreCase("byValue")) {
			s.selectByValue(Value);
			
		}
		else if (Options.equalsIgnoreCase("byVisibleText")) {
			s.selectByVisibleText(Value);
			
		}
		else {
			System.out.println("Invalid Selection");
		}
	} catch (NumberFormatException e) {
		
		e.printStackTrace();
	}
}public static void close(WebDriver element) {
	element.close();
	
}
public static void quit(WebDriver path) {
	path.quit();
	

}public static void navigate_to_element(WebDriver move, String value) {
	
	move.navigate().to(value);

}public static void get(WebDriver move, String path) {
	
driver.get(path);
}
	
public static void sendkeys_on_element(WebElement element, String Value) {
element.sendKeys(Value);
	
}
	public static void alert(String alert) {
		try {
			if (alert.equalsIgnoreCase("accept")) {
				driver.switchTo().alert().accept();
				}
			else if (alert.equalsIgnoreCase("dismiss")) {
				driver.switchTo().alert().dismiss();
				
			}
			else if (alert.equalsIgnoreCase("prompt")) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the text for prompt alert");
				String text = sc.next();
				driver.switchTo().alert().sendKeys(text);
				driver.switchTo().alert().accept();
				driver.close();
				
			}
			else {
				System.out.println("Enter a valid alert");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	public static void navigate_back_element(WebDriver mail, String value) {
		mail.navigate().back();
	}
	public static void navigate_forward_element(WebDriver element, String value) {
		element.navigate().forward();
		
	}
	public static void navigate_refresh_element(WebDriver element, String value) {
		element.navigate().refresh();
		
	}
	
	public static void Actions_onElement(WebElement value) {
		Actions ac = new Actions(driver);
		ac.moveToElement(value).build().perform();

	}
		
	public static void Frame(WebElement value) {
		
		driver.switchTo().frame(value);
			
		}
			
		
			
		
		
			
		
	
		
		
		
		

	}
	


	



	



