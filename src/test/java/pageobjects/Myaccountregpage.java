package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountregpage extends Baseclass
{
	public Myaccountregpage(WebDriver driver)
	{
		super(driver);
	
	}
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement firstnameclk;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement lastnameclk;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement emailclk;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement passwordclk;
	
	@FindBy(xpath="//input[@id='input-newsletter-no']")
	WebElement subscribeclk;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement privacybtnclk;
	
	@FindBy(xpath="//button[normalize-space()='Continue']")
	WebElement confirmbtnclk;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgconfirm;
	
	public void firstnameclk() 
	{
		firstnameclk.sendKeys("chaitu");
	}
	
	public void lastnameclk() 
	{
		lastnameclk.sendKeys("p");
	}
	
	public void emailclk() 
	{
		emailclk.sendKeys("chaitup207@gmail.com");
	}
	
	public void passwordclk() 
	{
		passwordclk.sendKeys("Pctsss@2");
	}
	
	public void subscribeclk() 
	{
		subscribeclk.click();
	}
	
	public void privacybtnclk() 
	{
		privacybtnclk.click();
	}
	
	public void confirmbtnclk() 
	{
		confirmbtnclk.click();	
	}
	public String msgconfirm() 
	
	{
		try {
				return(msgconfirm.getText());
		}
		
		catch(Exception e)
		{
			return(e.getMessage());
		}
	}
	

}
