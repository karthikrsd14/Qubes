package com.ideassion.var1.pom;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class Var1UserManagementGmail_Login extends BaseClass {

	WebDriver driver;
	
	public Var1UserManagementGmail_Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//a[contains(@class,'nav-link ng-tns')])[5]")
	private WebElement var_process;
	
	@FindBy(xpath = "//a[@class='nav-link' and @ng-reflect-router-link='/master/varone']")
	private WebElement var1_tab;
	
	@FindBy(xpath ="//a[contains(text(),'Sign in')]")
	private WebElement sign_in;
	
	@FindBy(id = "identifierId")
	private WebElement username;
	
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement Next_button;
	
	@FindBy(xpath = "//input[@name='Passwd']")
	private WebElement password;
	
	@FindBy(xpath = "(//span[contains(text(),'info')])[2]")
	private WebElement info_otp;
	
	@FindBy(xpath = "//div[contains(text(),'OTP Nombor')]")
	private List<WebElement> otp_text;
	
	
	public void click_varprocess() {
		
		clickonJavascript(var_process);
		clickonJavascript(var1_tab);
	}
	public void New_tab_open(){
		((JavascriptExecutor)(driver)).executeScript("window.open();","");
		Set<String> window= driver.getWindowHandles();
		List<String> it=new ArrayList<String>(window);
		driver.switchTo().window(it.get(1));
		
	}
	public void login_gmail_get_otp() {
		try {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		sign_in.click();
		sendkeysText(username,"qasupport@thelipl.in");
		clickOnElement(Next_button);
		sendkeysText(password, "Idea@1234");
		clickOnElement(Next_button);
		Thread.sleep(2000);
		clickOnElement(info_otp);
		
		int lastNo=otp_text.size();
		String data=otp_text.get(lastNo-1).getText();
		String op[]=data.split(":");
		String OTP=op[1].trim();
		logger.info(OTP);
		}
		catch (Exception e) {
		logger.info("Not get some error in email login otp get");
		}
		
		
		
	}
}
