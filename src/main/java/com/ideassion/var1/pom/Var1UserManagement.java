package com.ideassion.var1.pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class Var1UserManagement extends BaseClass {
public static String BE_NUM;
public static String BE_NUM_OM;
	WebDriver driver;
	
	public Var1UserManagement(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//span[contains(text(),'VAR-Process ')]")
	private WebElement var_process_tab;
	
	@FindBy(xpath = "(//span[contains(text(),'VAR-Process ')]//following::a)[1]")
	private WebElement VAR1_clinic_tab;
	
	@FindBy(xpath = "(//span[contains(text(),'VAR-Process ')])[2]")
	private WebElement var_process_tab_statemanager;
	
	@FindBy(xpath = "((//span[contains(text(),'VAR-Process ')])[2]//following::a)[1]")
	private WebElement var_process_var1_statemanager;
	
	@FindBy(xpath = "(//a[contains(@class,'nav-link ng-tns')])[1]")
	private WebElement Equipment_Management;
	
	@FindBy(xpath = "((//a[contains(@class,'nav-link ng-tns')])[1]//following::a)[1]")
	private WebElement BE_Registration;
	
	@FindBy(xpath = "(//a[contains(text(),'PRK')])[1]")
	private WebElement BE_Number_text;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Search here')]")
	private WebElement search_input_box;
	
	@FindBy(xpath = "//label[contains(@title,'Omission Equipment')]/..")
	private WebElement varProcess_Var1_vas2_omission;
	
	@FindBy(xpath = "//input[contains(@placeholder,'Enter BE Number')]")
	private WebElement VAR1_VS2_omission_BE_number_inputbox;
	
	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement var1_vs2_omission_search_button;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement var1_clinic_new_Button;
	
	public void var_process_perform() {
		clickOnElement(var_process_tab);
		clickOnElement(VAR1_clinic_tab);
		
	}
	public void statemanger_perform() {
		clickOnElement(var_process_tab_statemanager);
		clickOnElement(var_process_var1_statemanager);
		BE_NUM=BE_Number_text.getText();
	}
	public void BE_Registration() {
		clickOnElement(Equipment_Management);
		clickOnElement(BE_Registration);
		sendkeysText(search_input_box, BE_NUM);
	}
	public void var1_vs2_omssion() {
		clickOnElement(varProcess_Var1_vas2_omission);
		clickOnElement(var1_clinic_new_Button);
//		sendkeysText(VAR1_VS2_omission_BE_number_inputbox,)
		
	}
	
	
}
