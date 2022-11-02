package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationMOHclinicUser extends BaseClass{

	@Then("Click on VAR Process from the MOH user tab")
	public void performvar_process_tab() {
		initObject();
		usermanagement.var_process_perform();
	}
    @When("Click on VAR1 Clinic from the MOH user tab")
    public void perform() {
    	varprocess.enter_all_MOH_clicnic_mandatory_datas();
    }
    @Then("Click on statemanager varprocess")
    public void statemanager() {
    	usermanagement.statemanger_perform();
    }
}
