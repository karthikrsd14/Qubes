package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass; 

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationEquipmentSupplier extends BaseClass {
	@Given("Click on master tab")
	public void click_on_master_tab() {
		initObject();
		masterpagenew.click_masterTab_button();
	}

	@When("Click on supplier and manufacturer tab")
	public void click_on_supplier_and_manufacturer_tab() {
		masterpagenew.click_supplier_manufacturer_tab();
	}

	@Then("Click on new button")
	public void click_on_new_button() {
		masterpagenew.clickon_newbutton();
	}
	@Then("Enter the Equipment supplier name text box in new data")
	public void enter_the_equipment_supplier_name_text_box_in_new_data_as() {
		masterpagenew.equipment_supplier_nametextbox();
	}

	@Then("Click on Generated code")
	public void click_on_generated_code() {
		masterpagenew.generated_codeButton();
	}

	@Then("Enter the all mandatoryfiled in data")
	public void enter_the_all_mandatoryfiled_in_data() {
		masterpagenew.enter_card_allDetails();

	}

	@Then("Click on save and submit button")
	public void click_on_save_and_submit_button() {
		masterpagenew.save_and_submit();

	}

	@Then("Click on Ok button in conformation")
	public void click_Ok_button() {
		masterpagenew.conformation_tab();

	}

	@And("Click on the create successfully Ok button")
	public void successfully_ok_button() {
		masterpagenew.create_successfully_button();
	}
	@Given("Click on action button")
	public void click_action_button() {
		masterpagenew.action_button_perform();
	}
	@When("Click on save submit button")
	public void final_save_submit() {
		masterpagenew.final_save();
	}
	@Then("Click on suppilercode hyperlink and verfied")
	public void verifed_data() throws InterruptedException {
		masterpagenew.hyperlink_perform();
	}

	@And("Download on Excel and Pdf")
	public void downlod_pdf_excel() {
		masterpagenew.pdf_download();
		masterpagenew.xlsx_download();
	}

	@Then("Verfied the download file")
	public void verified_download_location() {
		masterpagenew.download_verified();
	}
	@When("Click on active button")
	public void active_check() throws InterruptedException {
		masterpagenew.active_tab();
	}

	@Then("Edit all the datas")
	public void update_datas() {
		masterpagenew.modified_card_allDetails();
	}
	@Then("click on action button")
	public void click_action() {
		masterpagenew.action_button_perform();
	}
	@When("Verfied the Equipment Supplier Details tabs")
	public void verified_datas() {
		masterpagenew.Equipment_Supplier_Details();
	}

}
