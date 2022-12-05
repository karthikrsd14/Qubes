package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationManufacturerDetails extends BaseClass {

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

	@Given("Click on the ManufacturerDetails tab in master")
	public void click_on_the_manufacturer_details_tab_in_master() {
manufacturerdetails.click_manufacturer_details_tab();
	}

	@When("Click on new manufacurer button from manufacturer details")
	public void click_on_new_manufacurer_button_from_manufacturer_details() throws InterruptedException {
manufacturerdetails.click_newtab();
Thread.sleep(700);
	}

	@Then("Click on Generate Code button from manufacturer details")
	public void click_on_generate_code_button_from_manufacturer_details() throws InterruptedException {
manufacturerdetails.click_generatecode_button();

Thread.sleep(700);
	}

	@Then("Enter the manufacturer exists Name with out catagory details")
	public void enter_the_manufacturer_exists_name_with_out_catagory_details() {
manufacturerdetails.invaild_name_data();
	}

	@Then("Click on BE catagory model in check box")
	public void click_on_be_catagory_model_in_check_box() {
manufacturerdetails.select_catagory_deyails();
	}

	@Then("Enter the vaild name for manufacturer input box")
	public void enter_the_vaild_name_for_manufacturer_input_box() {
manufacturerdetails.enter_vaild_manufacturer_name();
	}

	@Then("With out data mandatory filed give save and submited")
	public void with_out_data_mandatory_filed_give_save_and_submited() {
manufacturerdetails.without_data_save();
	}

	@Then("Enter the input box contact person name")
	public void enter_the_input_box_contact_person_name() {
manufacturerdetails.enter_contact_person();
	}

	@Then("Enter the input box Email ID primary")
	public void enter_the_input_box_email_id_primary() {
manufacturerdetails.enter_emailid();
	}

	@Then("Enter the input box contact number landline")
	public void enter_the_input_box_contact_number_landline() {
manufacturerdetails.enter_contactnumber_landline();
	}

	@Then("Enter the input box contact number mobile")
	public void enter_the_input_box_contact_number_mobile() {
manufacturerdetails.enter_contactnumber_mobile();
	}

	@Then("Click on save submit button manufacturer details")
	public void click_on_save_submit_button_manufacturer_details() {
manufacturerdetails.click_ok_button();
	}

}
