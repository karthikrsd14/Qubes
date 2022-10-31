package com.ideassion.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.ideassion.lab.stepDefinition", monochrome = true, features = {
		"src/test/resources/Feature/Equipmentsuppliertest.feature",
		"src/test/resources/Feature/ManufacturerDetails.feature", "src/test/resources/Feature/NClinic.feature",
		"src/test/resources/Feature/VarProcess.feature", "src/test/resources/Feature/VarProcess1.feature",
		"src/test/resources/Feature/VarProcess2.feature" }, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class Equipment_Supplier_DetailsTestRunner {

}
