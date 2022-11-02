package com.ideassion.lab.stepDefinition;
import com.ideassion.lab.base.BaseClass; 

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class StepDefinationQUBESLogin extends BaseClass {
	@Given("Lanch the browser in as {string}")
	public void lanch_the_browser_in_as(String browser) {
	 openBrowser(browser);  
	 initObject();
	 logger.info("Browser Opened Sucessfully :" +browser);
	}
	@When("Enter the QUBES url as {string}")
	public void enter_the_qubes_url(String url) {
	 loginpage.enterUrl(url);
	 logger.info("Browser Opened Sucessfully :" + url);
	}
	
	@When("Enter the valid Username give the input box as {string}")
	public void enter_the_valid_username_give_the_input_box(String username) {
		loginpage.enter_username(username);	
		if(username.equals("rkarthik@ideassion.com")) {
			logger.info(" valid username :"+username);
		}
		else {
			logger.info("Invaild username :"+username);
		
		Assert.assertEquals(username,"rkarthik@ideassion.com");
		
	}
	}
	@Then("Perform varprocess all details")
	public void login() {
		usermanagement.New_tab_open();
		usermanagement.login_gmail_get_otp();
	}
	
	
	
	@Then("Click the Get OTP button")
	public void click_the_get_otp_button() {
	   loginpage.click_OTP_button();
	}

	@Then("Verfied the OTP in Outlook")
	public void verfied_the_otp_in_mail() {
		outlookopen.open_newtab();
		outlookopen.enter_outlookurl();
		outlookopen.login();
		outlookopen.get_OTP();
		 logger.info("get OTP "+outlookopen.get_OTP());
	}
	
	@Then("Enter the Valid OTP give the input box")
	public void enter_the_valid_otp_give_the_input_box() {
	   outlookopen.enter_OTP();
		
	}

	@Then("Click on the Test Environment")
	public void click_on_testEnvironment() {
		loginpage.clickon_signin();
		loginpage.clickon_testEnvironment();
		
	}
	
}
