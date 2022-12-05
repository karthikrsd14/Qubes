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
	public void click_on_new_button() throws InterruptedException {
		masterpagenew.clickon_newbutton();
		Thread.sleep(1000);
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
	@Then("Click on Generated code without values")
	public void validate_datas() throws InterruptedException {
		masterpagenew.Negative_flow_supplier();;
	}

	@Then("Click on exitisting data")
	public void click_on_exitisting_data() throws InterruptedException {

		masterpagenew.exit_data();
	}

	@Then("Click on the new datas master tab")
	public void click_on_the_new_datas() {

		masterpagenew.newdatas();
	}

	@Then("Empty datas are give the validations")
	public void empty_datas_are_give_the_validations() throws InterruptedException {

		masterpagenew.with_outdata();
	}

	@Then("Enter Address only")
	public void enter_address_only() throws InterruptedException {
		masterpagenew.address_data();

	}

	@Then("Enter the datas in Contact and address")
	public void enter_the_datas_in_contact_and_address() throws InterruptedException {
		masterpagenew.contact_person();;

	}

	@Then("Enter also contact number")
	public void enter_also_contact_number() throws InterruptedException {

		masterpagenew.contact_number();
	}

	@Then("Enter all the datas vaildations")
	public void enter_all_the_datas_vaildations() throws InterruptedException {
		masterpagenew.email();

	}
	@When("perform neagtive flows")
	public void validation() {
		masterpagenew.edit_tabs1_negative();
	}
	@Then("edit2 with out address equipment details")
	public void validation1() {
		masterpagenew.edit_tabs2_negative();
	}
	@Then("edit3 with out Mobile no equipment details")
	public void validation2() {
		masterpagenew.edit_tabs3_negative();
	}
	@Then("edit4 with out Email id equipment details")
	public void validation4() {
		masterpagenew.edit_tabs4_negative();
	}
	@Then("edit5 Contact person details")
	public void validation5() {
		masterpagenew.edit_tabs5_negative();
	}
	@Then("edit6 equipment save and submit details")
	public void validation6() {
		masterpagenew.edit_tabs6_negative();
	}

}
