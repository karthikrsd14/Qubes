package com.ideassion.lab.stepDefinition;
import org.openqa.selenium.OutputType;  
import org.openqa.selenium.TakesScreenshot;

import com.ideassion.lab.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HooksClass extends BaseClass {
	@Before
	public void beforeScenario(Scenario s) {
		System.out.println("-----------before scenario in that Page " + s.getName() + "-----------");
	}

	@After
	public void afterScenario(Scenario s) {
		System.out.println("-----------after scenario  " + s.getName() + "-----------");

	}
	

	@AfterStep
	public void afterStepPass(Scenario s) {
		if (!s.isFailed()) {
			final byte[] scn = ((TakesScreenshot) getDriver.get(Thread.currentThread().getId()))
					.getScreenshotAs(OutputType.BYTES);
			s.attach(scn, "image/png", "image");
		}
	}

	
	
	@AfterStep
	public void AfterStepFail(Scenario s) {
		if (s.isFailed()) {
			final byte[] scn = ((TakesScreenshot) getDriver.get(Thread.currentThread().getId()))
					.getScreenshotAs(OutputType.BYTES);
			s.attach(scn, "image/png", "image");
			getDriver.get(Thread.currentThread().getId()).close();
		}
	}

}
