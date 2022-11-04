package com.ideassion.lab.stepDefinition;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.Then;

public class Varprocess_NegativeFlow extends BaseClass {

	 @Then("Give invaild datas in mandatroy details")
	 public void enter_invaild_datas() {
		 initObject();
		 negative.without_mandatory_fields();
	 }
}
