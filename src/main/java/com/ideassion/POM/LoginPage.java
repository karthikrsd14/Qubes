package com.ideassion.POM;

import org.openqa.selenium.WebDriver;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class LoginPage  extends BaseClass{

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//input[contains(@placeholder,'Email address ')]")
	private WebElement email_address_inputbox;

	@FindBy(xpath="//button[contains(@class,'btn btn-success')]")
	private WebElement send_OTP_button;

	@FindBy(xpath="//button[contains(text(),'Sign')]")
	private WebElement sign_in_button;

	@FindBy(xpath ="(//a)[1]")
	private WebElement test_Environment;
	
	@FindBy(xpath="(//div[contains(@class,'card')])[2]")
	private WebElement Test;
	
	@FindBy(xpath="//div[contains(text(),'User name is not found')]")
	private WebElement Displyed;
	
	@FindBy(xpath="//p[contains(text(),'User Name is Not Found!')]")
	private WebElement Sapce;
	
	
	
	
	public void enter_username(String username) throws InterruptedException {
		sendkeysText(email_address_inputbox,username);
		highLightElement(email_address_inputbox);
		logger.info("Lanch the Qubes Login url :"+username+"Successfully");
		removeHighLightElement(email_address_inputbox);
		clickOnElement(send_OTP_button);
		Thread.sleep(1000);
	}
	public void click_OTP_button() {
		try {
			
		
		String data=email_address_inputbox.getAttribute("value");
		logger.info(" inValid Username :"+data.length());
		
		if(data.length()==0||( Displyed.isDisplayed())) {
			logger.info("Browser is Cloed Because inValid Username : "+data+Displyed.getText());
			Thread.sleep(1000);
			getDriver.get(Thread.currentThread().getId()).quit();
		}
		else {
			logger.info("Valid Username :");
		}
		
		
	
		logger.info("Login page Click the OTP button successfully");
	}
		catch(Exception e) {
			logger.info(e.getMessage());
			getDriver.get(Thread.currentThread().getId()).quit();
		}
		}
	
	public void clickon_signin() {
		clickOnElement(sign_in_button);
		
	}
	public void enterUrl(String url) {
		driver.get(url);
	}
	public void clickon_testEnvironment() {
		highLightElement(Test);
		if(test_Environment.isDisplayed()) {
			logger.info("is displyed on the "+test_Environment.getText());
			
		}
		else {
			getDriver.get(Thread.currentThread().getId()).close();
		}
		clickOnElement(test_Environment);
	}
	
}
