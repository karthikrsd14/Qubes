package com.ideassion.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Feature/CSV.feature",glue ="com.ideassion.lab.stepDefinition",monochrome = true,
plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class Var1_Testing {

}
