package com.ideassion.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(glue = "com.ideassion.lab.stepDefinition",monochrome = true,
features ={"src/test/resources/Feature/NegativeFlow/NegativeScnarioEquipmentsuppliertest.feature",
		"src/test/resources/Feature/NegativeFlow/NegativeFlowManufaturerModel.feature"
		},
tags = "@EndtoEndTestCase_Equipment_supplier",
plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class NegativeFlow_DetailsTest_Runner {
}
