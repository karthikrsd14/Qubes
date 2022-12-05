package com.ideassion.lab.stepDefinition;

import java.io.IOException;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.en.Then;

public class Varprocess_NegativeFlow extends BaseClass {

	 @Then("Give invaild datas in mandatroy details")
	 public void enter_invaild_datas() {
		 initObject();
		 negative.without_mandatory_fields();
	 }
	@Then("Upload all the Document CSV")
	public void CSV() throws IOException, InterruptedException {
		varprocess.csv();
	}
}
