package com.ideassion.POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class ClinicDetails extends BaseClass {
	WebDriver driver;

	public ClinicDetails(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),' Clinic Details ')]")
	private WebElement clinic_details_tab;

	@FindBy(xpath = "(//div[contains(@class,'card')])[1]")
	private WebElement clinic_reg_details;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement state_inputbox;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement district_inputbox;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement category_inputbox;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement clinictype_inputbox;

	@FindBy(xpath = "//button[contains(text(),'Generate Code')]")
	private WebElement generatecode_button;

	@FindBy(xpath = "//input[contains(@name,'clinicname')]")
	private WebElement clinicName;

	@FindBy(xpath = "//input[contains(@name,'clinicaddress')]")
	private WebElement clinicAddress;

	@FindBy(xpath = "(//input[contains(@name,'clcontactperson')])[1]")
	private WebElement clinic_contactperson;

	@FindBy(xpath = "(//input[contains(@name,'clcontactperson')])[2]")
	private WebElement clinic_contactperson_mobileNO;

	@FindBy(xpath = "(//input[contains(@name,'clcontactperson')])[3]")
	private WebElement clinic_contactperson_emailID;

	@FindBy(xpath = "//input[contains(@name,'latitude')]")
	private WebElement latitude_inputbox;

	@FindBy(xpath = "//input[contains(@name,'longitude')]")
	private WebElement logitude_inputbox;

	@FindBy(xpath = "(//span[contains(text(),'Next>')])[1]")
	private WebElement next_button;
	
	@FindBy(xpath = "//button[contains(text(),'Next>')]")
	private WebElement working_date_nextbutton;
	
	@FindBy(xpath = "(//input[@type='text'])[23]")
	private WebElement alt_contact_person_name;
	
	@FindBy(xpath = "(//input[@type='text'])[24]")
	private WebElement alt_contact_person_mobileNO;
	
	@FindBy(xpath = "(//input[@type='email'])[2]")
	private WebElement alt_contact_person_emailID;
	
	@FindBy(xpath = "//button[contains(text(),'Save & Submit')]")
	private WebElement additonal_save_submit_button;
	
	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement additonal_Ok_button;
	
	@FindBy(xpath = "(//div[@class='card'])[4]")
	private WebElement alt_contact_details;
	
	@FindBy(xpath = "//label[contains(@for,'clinicListTab')]")
	private WebElement clinic_list_tab;
	
	@FindBy(xpath = "(//button[@type='button'])[4]")
	private WebElement action_tab;
	
	@FindBy(xpath = "(//span[contains(text(),'Next>')])[3]")
	private WebElement edit_next_button;
	
	@FindBy(xpath = "//span[contains(text(),'Save & Submit ')]")
	private WebElement edit_save_submit;
	
	@FindBy(xpath = "(//a[contains(text(),'MLK')])[1]")
	private WebElement clinicList_hyperlink;
	
	@FindBy(xpath = "//span[contains(text(),'Verify')]")
	private WebElement verified_button;
	
	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[1]")
	private WebElement PDF_download_tab;

	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[2]")
	private WebElement XLSX_download_tab;
	
	public void clickon_clinictab() {
	
		highLightElement(clinic_details_tab);
		clickOnElement(clinic_details_tab);
		
	}

	public void generate_code_details() {
		try {
		removeHighLightElement(clinic_details_tab);
		if(clinic_reg_details.isDisplayed()) {
		logger.info("Is Displayed on the clinic Register page "+clinic_reg_details.getText());
		sendkeysText(state_inputbox, " Melaka");
		state_inputbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		sendkeysText(district_inputbox," Alor gajah");
		district_inputbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		sendkeysText(category_inputbox," Pergigian");
		category_inputbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		sendkeysText(clinictype_inputbox, " KPKK-KK1");
		clinictype_inputbox.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		clickOnElement(generatecode_button);
		Thread.sleep(3000);
	}
		else {
			logger.info("Don't Displayed on the clinic Register page");
		}
		}
		catch(Exception e){
			
		}
		
	}
	public void enter_clinic_details() throws InterruptedException {
		sendkeysText(clinicName,SupplierName());
		Thread.sleep(2000);
		sendkeysText(clinicAddress, Address());
		Thread.sleep(2000);
		sendkeysText(clinic_contactperson, "Karthik R");
		Thread.sleep(2000);
		sendkeysText(clinic_contactperson_mobileNO, "12345678");
		Thread.sleep(2000);
		sendkeysText(clinic_contactperson_emailID, "idea@gmail.com");
		Thread.sleep(2000);
		sendkeysText(logitude_inputbox,"123456");
		Thread.sleep(2000);
		sendkeysText(latitude_inputbox,"987654321");
		Thread.sleep(2000);
		
	}
	public void working_date_next() {
		clickOnElement(next_button);
		clickOnElement(working_date_nextbutton);
		
	}
	public void additional_contact_details() throws InterruptedException {
		if(alt_contact_details.isDisplayed()) {
			logger.info("present properly in displayed "+alt_contact_details.getText());
			sendkeysText(alt_contact_person_name,"Ideasssion");
			Thread.sleep(2000);
			sendkeysText(alt_contact_person_mobileNO, "1234567");
			Thread.sleep(2000);
			sendkeysText(alt_contact_person_emailID, "idea12@gmail.com");
			Thread.sleep(2000);
			scrollIntoView(additonal_save_submit_button);
			clickOnElement(additonal_save_submit_button);
			Thread.sleep(2000);
			
		}
		else {
			logger.info("Don't displayed properly in displayed");
		}
	}
	public void clinic_list_actionperform() throws InterruptedException {
		clickOnElement(additonal_Ok_button);
		Thread.sleep(2000);
		clickOnElement(additonal_Ok_button);
		Thread.sleep(3000);
		clickOnElement(clinic_list_tab);
		XscrollBy400();
		Thread.sleep(2000);
		clickOnElement(action_tab);
		scrollIntoView(edit_next_button);
		Thread.sleep(2000);
		clickOnElement(edit_next_button);
		scrollBy200();
		Thread.sleep(2000);
		clickOnElement(edit_next_button);
		scrollIntoView(edit_save_submit);
		Thread.sleep(2000);
		clickOnElement(edit_save_submit);
		Thread.sleep(2000);
		clickOnElement(additonal_Ok_button);
	}
	public void hyperlink_performe() {
		try {
			scrollBy_300();
			scrollBy_300();
		clickOnElement(clinicList_hyperlink);
		scrollBy200();
		Thread.sleep(2000);
		scrollIntoView(edit_next_button);
		clickOnElement(edit_next_button);
		scrollBy200();
		Thread.sleep(2000);
		scrollIntoView(edit_next_button);
		clickOnElement(edit_next_button);
		scrollBy200();
		Thread.sleep(2000);
		clickOnElement(verified_button);
		Thread.sleep(2000);
		clickOnElement(additonal_Ok_button);
	}
		catch(Exception e) {
		}
		}
	public void verified_download_option() {
		scrollBy_300();
		clickOnElement(PDF_download_tab);
		clickOnElement(XLSX_download_tab);
//		verfied_download(PDF_download_tab);
//		verfied_download(XLSX_download_tab);
	}
	
}
