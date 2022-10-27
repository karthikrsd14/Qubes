package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationVarprocess extends BaseClass{
	@Given("Click on VAR Process tab")
	public void click_on_var_process_tab() {
		initObject();
		varprocess.click_on_varprocess_tab();
	}

	@When("Click on VAR1 Clinic tab")
	public void click_on_var1_clinic_tab() {

		varprocess.click_var1Clinic();
	}

	@Then("Click on New button in varprocess1")
	public void click_on_new_button_in_varprocess1() {
		varprocess.click_var1Clinic_newbutton();

	}

	@Then("Enter the Varprocess1 All mandatroy details")
	public void enter_the_varprocess1_all_mandatroy_details() {
		varprocess.enter_all_mandatory_datas();
	}

	@Then("Var process1 Clinic Save and submit")
	public void var_process1_clinic_save_and_submit() {
		varprocess.save_submit();

	}
	@Given("Click on varprocess in var1")
	public void click_on_varprocess_in_var1() {
		varprocess.Click_on_VarProcess_var1_tab();
	}

	@When("Search the VAR1 VS1 Additional Equipment")
	public void search_the_var1_vs1_additional_equipment() {
		varprocess.VAR1_VS1_Additional_Equipment();

	}
	@When("Search the VAR1 VS1 Additional New datas Equipment")
	public void search_the_var1additional_equipment() {
		varprocess.VAR1_VS1_new_Additional_Equipment();

	}
	@When("Search the VAR1 VS1 Additional New updtes value datas Equipment")
	public void search_the_var1additional_equipment_values() {
		varprocess.VAR1_VS1_new_update_Additional_Equipment();;
	}
	
	@Then("Click on generate the BE number")
	public void click_on_generate_the_be_number() {
		varprocess.action_tab_perform();

	}
	@Then("Click on generate the updated BE number")
	public void click_on_generate_the_be_update_number() {
		varprocess.action_update_tab_perform();;

	}
	
	@And("Upload all file mandatory")
	public void upload_file() {
		varprocess.datas_perform();
	}

	@Then("Enter the all datas and Draft")
	public void enter_the_all_datas_and_draft() {
		varprocess.ok_draft();
	}


	@Then("Perform action tab in var1 vs1")
	public void perform_action_tab_in_var1_vs1() {
		varprocess.update_BEnumber1();
		varprocess.after_draft_action_perform();

	}
	 @And("Perform action tab new update in var1 vs1")
	 public void perform_update() {
		 varprocess.update_BEnumber2();
		 varprocess.after_draft_newdata_action_perform();
	 }

	@Then("Click on Save and forward")
	public void click_on_save_and_forward() {

		varprocess.begenerate_successfully();
	}
	@Then("Verification in forwarded status")
	public void verfied_forward() {
		varprocess.forward_verfied();
	}
	@Given("Click on the equipment management tab")
	public void click_on_the_equipment_management_tab() {
	   
	   varprocess.click_Equipmanagement_tab();
	}

	@When("Click on BE registration tab")
	public void click_on_be_registration_tab() {
	   varprocess.click_BERegestration_under_equipment();
	   
	}

	@Then("Enter the data from the search box")
	public void enter_the_data_from_the_search_box() throws InterruptedException {
	   varprocess.enter_data_beregistration();
	   
	}
	 @Then("Enter the data BE number1 search box")
	 public void enter_BE_number1_1() throws InterruptedException {
		 varprocess.enter_data_beregistration1_1();
	 }
	 @Then("Enter the BE number for seach box number12")
	 public void enter_BE_Number1_2() throws InterruptedException {
		 varprocess.enter_data_beregistration1_2();
	 }
	 @Then("Enter the vaild BE number in search box")
	 public void enter_BE_Number1_3() throws InterruptedException {
		 varprocess.enter_data_beregistration1_3();
	 }
	 @Then("Enter the BE number in active data from seach box")
	 public void enter_BE_Number2() throws InterruptedException {
		 varprocess.enter_data_beregistration2();
	 }
	 
	 
	@Then("Basic information tab are the next button click")
	public void next_tab_click() {
		varprocess.edit_BE_registraton();
		
	}

	@Then("Enter the datas for all manditory fild standrads components")
	public void enter_the_datas_for_all_manditory_fild_standrads_components() {
	   varprocess.standrard_components();
	   
	}

	@Then("Enter the clinic information details")
	public void enter_the_clinic_information_details() {
	   varprocess.clinic_information_details();
	   
	}
	@Then("Enter the clinic information update new details")
	public void enter_vaild_datas() {
		varprocess.clinic_update_information_details();
	}

	@Then("Click next button form finacial tab")
	public void click_next_button_form_finacial_tab() {
	   
	   
	}

	@Then("Enter the all other information details")
	public void enter_the_all_other_information_details() {
	   
		varprocess.other_information();
	}

	@Then("Add the supporting documents and save and submit")
	public void add_the_supporting_documents_and_save_and_submit() throws InterruptedException {
	   
	   varprocess.supporting_document();
	}

	@Given("Click on VAR1-VS2 Omission process tab")
	public void click_on_var1_vs2_omission_process_tab() {
	    
	   varprocess.click_on_var1_vs2_omission();
	}

	@When("Clinic on New tab under Omission page")
	public void clinic_on_new_tab_under_omission_page() {
	    varprocess.enter_BEnumber_omissionpage();
	   
	}

	@Then("Enter the BE number from Omission page tab")
	public void enter_the_be_number_from_omission_page_tab() {
	    
	  
	}

	@Then("Choose in the Supporting Document KEWPA15")
	public void choose_in_the_supporting_document_kewpa15() {
	    
		varprocess.click_on_search_tab();
	}

	@Then("Click on Save and submit button Omission page tab")
	public void click_on_save_and_submit_button_omission_page_tab() {
	    
	   varprocess.save_submit_var1_omission();
	}
	 @Then("Check the validations VAR1_VS2")
	 public void var1_vs2_BER_model() {
		 varprocess.click_on_var1_vs2_omission();
		 varprocess.enter_BEnumber_DER_omissionpage();
		 varprocess.click_on_search_tab();
		 varprocess.save_submit_var1_omission();
	 }
	 @Then("Click on VAR1_VS2_Omission Of Equipment tab")
	 public void omission_equipment_data() throws InterruptedException {
		 
		 varprocess.click_var1_vs2_omissoin_edit();
	 }
	 @And("Perform action tab replace data1")
	 public void replace_data1() {
		 varprocess.update_BEnumber1_1();
		 varprocess.after_draft_action_perform();
	 }
	 @And("Perform action tab in var1 process BE Number12")
	 public void replace_data_2() {
		 varprocess.update_BEnumber1_2();
		 varprocess.after_draft_action_perform();
	 }
	 @And("Perform action tab in var1 perform by the BE number123")
	 public void replace_data3() {
		 varprocess.update_BEnumber1_2();
		 varprocess.after_draft_action_perform();
	 }
	 @Given("Click on VAR1_VS3 tab")
	 public void check_VAR1_VS3() throws InterruptedException {
		 varprocess.click_var1_vs2_omissoin_edit();
		 varprocess.enter_var1_vs3_tab() ;
	 }
	
}
