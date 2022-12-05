package com.ideassion.lab.stepDefinition;
import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.And;
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
	public void enter_the_valid_username_give_the_input_box(String username) throws InterruptedException {
		loginpage.enter_username(username);	
		if(username.isBlank()) { 
			logger.info(" Invalid username is Empty");
			
		}

	}
	@Then("Vaild data click the Get OTP button")
	public void vaild_data() {
		
	}
	@And("Click on the Signin button")
	public void login() {
		loginpage.clickon_signin();
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
	@Then("Click the Get OTP button")
	public void negativedata() {
		loginpage.click_OTP_button();
	}
	
}
