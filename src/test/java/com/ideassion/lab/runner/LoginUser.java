package com.ideassion.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.ideassion.lab.stepDefinition", monochrome = true, features = {
   	"src/test/resources/Feature/LoginMOH.feature"
		 }, plugin = {
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
public class LoginUser {

}
