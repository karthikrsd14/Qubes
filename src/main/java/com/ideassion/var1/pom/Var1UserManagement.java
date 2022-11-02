package com.ideassion.var1.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class Var1UserManagement extends BaseClass {

	WebDriver driver;
	
	public Var1UserManagement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(text(),'VAR-Process ')]")
	private WebElement var_process_tab;
	
	@FindBy(xpath = "(//span[contains(text(),'VAR-Process ')]//following::a)[1]")
	private WebElement VAR1_clinic_tab;
	
	@FindBy(xpath = "//span[contains(text(),'VAR-Process ')]")
	private WebElement var_process_tab_statemanager;
	
	@FindBy(xpath = "(//span[contains(text(),'VAR-Process ')]//following::a)[1]")
	private WebElement var_process_var1_statemanager;
	
	public void var_process_perform() {
		clickOnElement(var_process_tab);
		clickOnElement(VAR1_clinic_tab);
		
	}
	public void statemanger_perform() {
		clickOnElement(var_process_tab_statemanager);
		clickOnElement(var_process_var1_statemanager);
	}
	
}
