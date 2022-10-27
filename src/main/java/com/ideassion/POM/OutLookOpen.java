package com.ideassion.POM; 
import java.util.ArrayList; 
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.inputdatas.Inputdata;
import com.ideassion.lab.base.BaseClass;

public class OutLookOpen extends BaseClass{
	public static List<String> list;
	public static String op;
	WebDriver driver;
	public  OutLookOpen(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='OTP']")
	private WebElement OTP_inputbox;

	@FindBy(xpath ="(//a[contains(text(),'Sign in')])[1]")
	private WebElement singin_tab;

	@FindBy(xpath ="//input[contains(@name,'loginfmt')]")
	private WebElement emailId_inputBox;

	@FindBy(xpath = "//input[contains(@id,'idSIButton9')]")
	private WebElement next_Button;

	@FindBy(xpath ="//input[contains(@name,'passwd')]")
	private WebElement password_inputBox;

	@FindBy(xpath = "//input[contains(@id,'idSIButton9')]")
	private WebElement yes_button;

	@FindBy(xpath = "(//span[contains(text(),'info@thelipl.in')])[1]")
	private WebElement OTP_option_click;

	@FindBy(xpath = "//div[contains(@class,'BodyFragment')]")
	private WebElement all_datas_click;

	@FindBy(xpath = "//span[text()='Other']")
	private WebElement Other;


	public void open_newtab() {
		try {
			((JavascriptExecutor) (driver)).executeScript("window.open();","");
			Set<String> window=	driver.getWindowHandles();
			list=new ArrayList<String>(window);
			driver.switchTo().window(list.get(1));

		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void enter_outlookurl( ) {
		driver.get(Inputdata.Url());
		clickOnElement(singin_tab);
	}
	public void login() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		sendkeysText(emailId_inputBox, Inputdata.Username());
		clickOnElement(next_Button);
		sendkeysText(password_inputBox, Inputdata.Password());
		clickOnElement(yes_button);
		clickonJavascript(yes_button);
		clickonJavascript(Other);
		clickOnElement(OTP_option_click);
	}

	public  String get_OTP() {
		try {
			String data=all_datas_click.getText();
			String [] str=data.split(":");
			String op1=str[1];
			String da=op1.trim();
			String ab[]=da.split("G");
			op=ab[0].trim();
			logger.info("get OTP name :"+op);
			return op;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

	public void enter_OTP(){
		try {
		driver.switchTo().window(list.get(0));
		sendkeysText(OTP_inputbox,op);
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		driver.switchTo().window(list.get(1));
//		Actions a = new Actions(driver);
//		a.contextClick(OTP_option_click).build().perform();
//       a.sendKeys(Keys.ENTER).build().perform();
//		a.sendKeys(Keys.ENTER).build().perform();
		driver.close();
		driver.switchTo().window(list.get(0));
	}
		catch(Exception e) {
		logger.info("Don't switch the window");	
		}
		}

}
