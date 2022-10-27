package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepDefinationClinicDetails extends BaseClass{


	@Given("Click on clinic tab")
	public void click_on_clinic_tab() {
		initObject();
		clinicdetails.clickon_clinictab();
	}

	@Then("Enter Clinic registration details")
	public void enter_clinic_registration_details() throws InterruptedException {
		clinicdetails.generate_code_details();
		clinicdetails.enter_clinic_details();
	}

	@Then("Enter Working Day and Time For Clinic")
	public void enter_working_day_and_time_for_clinic() {
		clinicdetails.working_date_next();
	}

	@Then("Enter Additional Contact")
	public void enter_additional_contact() throws InterruptedException {
		clinicdetails.additional_contact_details();
	}

	@Then("Click on Clinic list action tabs perform")
	public void click_on_clinic_list_action_tabs_perform() throws InterruptedException {
		clinicdetails.clinic_list_actionperform();
	}
	@Then("verified the hyperlink details")
	public void verified_the_hyperlink_details() {
		clinicdetails.hyperlink_performe();
	}
	 @And("Download verified xlsx and pdf")
	 public void verified_download() {
		 clinicdetails.verified_download_option();
		
	 }
}
