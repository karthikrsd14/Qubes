package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationManufacturerModeles extends BaseClass{

	@Given("Click on Manufacturer and Model tab")
	public void click_on_manufacturer_and_model_tab() {
	    initObject();
	    manufacturermodels.click_manufacturertab();
	}

	@When("Click on New button manufacturemodel")
	public void click_on_new_button() {
	    
	    manufacturermodels.newtab_click();
	}
    @When("Category manufacturemodel")
    public void add_details() {
    	manufacturermodels.Manufacturer_Model_enter();
	    
    }
    @Then("Search the Manufacturer and Model details")
	public void search_the_manufacturer_and_model_details() {
	    
	    manufacturermodels.add_all_BE_details();
	}
	
    @Then("Save and submit manufacturemodel")
	public void save_submit() {
		manufacturermodels.save_submit_details();
	}

	@Then("update data all manufacturer model details")
	public void verfied_all_manufacturer_model_details() {
		 try {
				manufacturermodels.search_inputbox_validate();
			 }
			 catch (Exception e) {
				logger.info(e.getMessage());
			}
	
	    
	}
	 @Then("Verified all the data in manufacturer")
	 public void verfied() {
		 try {
		 manufacturermodels.verfication_manufacturer_model();
		 manufacturermodels.verified();
		 }
		 catch (Exception e) {
			logger.info(e.getMessage());
		}
	 }
	 @And("Download pdf and xlsx")
	 public void download_validation() {
		manufacturermodels.download(); 
	 }
	 @Then("Click on save and submit button manufacturer model")
	 public void click_on_save_and_submit_button_manufacturer_model() {
	    
	     manufacturermodels.click_save_submit();
	 }

	 @Then("Select verified manufacturer name drop down")
	 public void select_verified_manufacturer_name_drop_down() {
	    
	     
	 }

	 @Then("Click on Catagory BE catagory")
	 public void click_on_catagory_be_catagory() {
	    
	     
	 }

	 @Then("Select the manufacurer details without verified manufacturer name")
	 public void select_the_manufacurer_details_without_verified_manufacturer_name() {
	    
	     
	 }


}
