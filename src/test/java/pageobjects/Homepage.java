package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Baseclass {
	
	public Homepage(WebDriver driver)
	{
		super(driver);
	}
	
	
	@FindBy(xpath="//span[normalize-space()='My Account']/ancestor::li")
	WebElement myaccountclk;
	
	@FindBy(xpath="//a[normalize-space()='Register']")
	WebElement registerbtnclk;
	
	public void clickmyaccount() 
	{
	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",myaccountclk);
		
	}
	
	public void registeraccount() 
	{
		
		registerbtnclk.click();
	}
	

}
