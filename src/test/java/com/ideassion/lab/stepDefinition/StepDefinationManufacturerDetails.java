package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationManufacturerDetails extends BaseClass{

	@Then("Click on the ManufacturerDetails tab")
	public void click_on_the_manufacturer_details_tab() {
		initObject();
		manufacturerdetails.click_manufacturer_details_tab();
	}

	@Then("Click on new manufacurer button")
	public void click_on_new_manufacurer_button() {
	   
	  manufacturerdetails.click_newtab();
	}

	@Then("Enter the Category type")
	public void enter_the_category_type() {
	   
	    manufacturerdetails.enter_category_type();
	}

	@Then("Enter the Manufacturer Name")
	public void enter_the_manufacturer_name() {
	   
	    manufacturerdetails.enter_manufacturer_name();
	}

	@Then("Click on Generated manufacurer code button")
	public void click_on_generated_manufacurer_code_button() {
	   manufacturerdetails.click_generatecode_button();
	}

	@Then("Enter the all mandatoryfiled in data in manufacturer details page")
	public void enter_the_all_mandatoryfiled_in_data_in_manufacturer_details_page() {
	   manufacturerdetails.enter_card_allDetails();
	}

	@Then("Click on save and submit button in manufacturer details page")
	public void click_on_save_and_submit_button_in_manufacturer_details_page() {
	   
	    manufacturerdetails.clickon_add_save_submit();
	}

	@Then("Click on Ok button in conformation in manufacturer details page")
	public void click_on_ok_button_in_conformation_in_manufacturer_details_page() {
	   
	    manufacturerdetails.clickon_add_okButton();
	}
	@Given("Click on action tab")
	public void action_perform() {
		manufacturerdetails.clickon_action_tab();
	}
	 @When("Click on active button in No")
	    public void active_button() {
	    	manufacturerdetails.active_changed();
	    }
    @When("Click on hyperlink")
  public void perform_hyperlink() {
    	manufacturerdetails.click_hyperlink_manufacutrer();
    	manufacturerdetails.download_details();
 
    }
   
	

}
