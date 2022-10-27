package com.ideassion.POM;

import java.util.List; 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;
import com.ideassion.lab.base.ConsolePrint;

import junit.framework.Assert;


@SuppressWarnings("deprecation")
public class QubesMasterNewSuppiler extends BaseClass {

	WebDriver driver;

	public QubesMasterNewSuppiler(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(@class,'nav-link ng-tns-c113-1')]")
	private WebElement master_tab;

	@FindBy(xpath = "(//li[contains(@class,'ng-star-inserted')])[12]")
	private WebElement supplier_manufacturer_tab;

	@FindBy(xpath = "(//button[contains(text(),'New')])[1]")
	private WebElement New_Button;

	@FindBy(xpath = "//input[contains(@id,'supplierNameId')]")
	private WebElement Equipment_supplier_name;

	@FindBy(xpath = "//button[contains(text(),'Generate Code')]")
	private WebElement generateCode_button;

	@FindBy(xpath = "//input[contains(@name,'address')]")
	private WebElement address_inputbox;

	@FindBy(xpath = "//input[contains(@name,'contactName')]")
	private WebElement contactPerson_inputbox;

	@FindBy(xpath = "//input[contains(@name,'contactMobile')]")
	private WebElement contactMobile_numberInputbox;

	@FindBy(xpath = "//input[contains(@name,'landline')]")
	private WebElement contactlandline_inputbox;

	@FindBy(xpath = "(//input[contains(@name,'email')])[1]")
	private WebElement primaryEmailID_inputbox;

	@FindBy(xpath = "(//input[contains(@name,'email')])[2]")
	private WebElement secondaryEmailID_1_inputbox;

	@FindBy(xpath = "(//input[contains(@name,'email')])[3]")
	private WebElement secondaryEmailID_2_inputbox;

	@FindBy(xpath = "//input[contains(@name,'contactNoFax')]")
	private WebElement contactNumberFax_inputbox;

	@FindBy(xpath = "//ng-select[contains(@name,'active')]")
	private WebElement activeButton;

	@FindBy(xpath = "//button[contains(text(),'Save & Submit')]")
	private WebElement save_submit_button;

	@FindBy(xpath = "(//div[contains(@style,'opacity: 1;')])[3]")
	private WebElement card_details;

	@FindBy(xpath = "//div[contains(@class,'swal2-header')]")
	private WebElement Are_sure_Tab;

	@FindBy(xpath = "(//button[contains(@type,'button')])[23]")
	private WebElement ok_button;

	@FindBy(xpath = "(//button[contains(@type,'button')])[24]")
	private WebElement cancel_button;

	@FindBy(xpath = "(//button[contains(@type,'button')])[22]")
	private WebElement create_successfully_ok_button;

	@FindBy(xpath = "(//button[contains(@type,'button')])[1]")
	private WebElement action_button;

	@FindBy(xpath = "//div[contains(text(),'Save & Submit')]")
	private WebElement before_verified_save_button;

	@FindBy(xpath = "(//button[contains(@type,'button')])[23]")
	private WebElement before_verified_cancel_button;

	@FindBy(xpath = "(//button[contains(@type,'button')])[22]")
	private WebElement before_verified_ok_button;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement after_verified_ok_button;

	@FindBy(xpath = "(//a[contains(text(),'N0')])[1]")
	private WebElement suppilercode_hyperlink;

	@FindBy(xpath = "//span[contains(text(),'Verify')]")
	private WebElement verified_button;

	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[1]")
	private WebElement PDF_download_tab;

	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[2]")
	private WebElement XLSX_download_tab;
	
	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement active_tab;
	
	@FindBy(xpath = "//span[@ng-reflect-ng-item-label='NO']")
	private WebElement no_button_tab;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement data_passed;
	
	@FindBy(xpath = "//h2[contains(text(),'Are you sure')]")
	private WebElement are_you_sure;
	
	@FindBy(xpath = "//div[contains(text(),'Supplier Name Already exists')]")
	private WebElement Already_exists;
	
	@FindBy(xpath = "(//tr[contains(@class,'ng-tns')])[1]//child::th")
	private List<WebElement> verified_Equipment_Supplier_Details;

	@FindBy(xpath = "(//input[contains(@type,'text')])[3]")
	private WebElement modified_address_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'text')])[4]")
	private WebElement modified_contactPerson_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	private WebElement modified_contactMobile_numberInputbox;

	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")
	private WebElement modified_contactlandline_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'email')])[1]")
	private WebElement modified_primaryEmailID_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'email')])[2]")
	private WebElement modified_secondaryEmailID_1_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'email')])[3]")
	private WebElement modified_secondaryEmailID_2_inputbox;

	@FindBy(xpath = "(//input[contains(@type,'text')])[7]")
	private WebElement modified_contactNumberFax_inputbox;
	
	public void click_masterTab_button() {
		if (driver.getCurrentUrl().toString().contains("loading")) {
			logger.info("Currently User presenting in the QUBES home page ");
		}
		else {
			logger.error("Currently User not to be presenting in the QUBES home page ");
			getDriver.get(Thread.currentThread().getId()).close();
		}
		try {
				highLightElement(master_tab);
				clickOnElement(master_tab);
				ConsolePrint.Consoleprint();
				logger.info("Click on the " + master_tab.getText() + " Successfully");
				removeHighLightElement(master_tab);
			}
		 catch (Exception e) {

		}
	}

	public void click_supplier_manufacturer_tab() {
		removeHighLightElement(master_tab);
		highLightElement(supplier_manufacturer_tab);
		clickOnElement(supplier_manufacturer_tab);
		logger.info("Click on the " + supplier_manufacturer_tab.getText() + " Successfully");
		removeHighLightElement(supplier_manufacturer_tab);
	}

	public void clickon_newbutton() {
		try {
			
			elementDisplayed(New_Button);
			elementEnabled(New_Button);
			highLightElement(New_Button);
			clickOnElement(New_Button);
			logger.info("Successfully click on the NEW buton");
		} catch (Exception e) {
			logger.info(e.getMessage() + "don'tproperly show that page");
		}
	}

	public void equipment_supplier_nametextbox() {
		try {
		removeHighLightElement(New_Button);
		elementDisplayed(Equipment_supplier_name);
		elementEnabled(Equipment_supplier_name);
		sendkeysText(Equipment_supplier_name, SupplierName());
	}catch(Exception e) {
	}
	}

	public void generated_codeButton() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Assert.assertEquals("Generate Code", generateCode_button.getText());
//		clickOnElement(generateCode_button);
		clickonJavascript(generateCode_button);
		
		if(card_details.isDisplayed()) {
			logger.info(card_details.getText()+"Is Displyed properly");
		}
		else if(Already_exists.isDisplayed()) {
			getDriver.get(Thread.currentThread().getId()).close();
		}
		else {
			
		}
	}
		
		

	public void enter_card_allDetails() {
		try {
			
			sendkeysText(address_inputbox, Address());
			Thread.sleep(1000);
			sendkeysText(contactPerson_inputbox, Contactperson());
			Thread.sleep(1000);
			sendkeysText(contactMobile_numberInputbox, ContactNumber());
			Thread.sleep(1000);
			sendkeysText(contactlandline_inputbox, Landline());
			Thread.sleep(1000);
			sendkeysText(primaryEmailID_inputbox, EmailIDprimary());
			Thread.sleep(1000);
			sendkeysText(secondaryEmailID_1_inputbox, EmailIdSecondanry1());
			Thread.sleep(1000);
			sendkeysText(secondaryEmailID_2_inputbox, EmailIdSecondanry2());
			Thread.sleep(1000);
			sendkeysText(contactNumberFax_inputbox, FaxNumber());

			Thread.sleep(2000);
		} catch (Exception e) {

		}

	}
	public void active_tab() throws InterruptedException {
		
		before_verified_save_button.click();
		clickOnElement(before_verified_ok_button);
	}

	public void save_and_submit() {
		highLightElement_and_removed(save_submit_button);
		clickOnElement(save_submit_button);
	}

	public void conformation_tab() {
		elementDisplayed(Are_sure_Tab);
		elementDisplayed(ok_button);
		elementDisplayed(cancel_button);
		clickOnElement(ok_button);
//		ok_button.click();
	}

	public void create_successfully_button() {
		clickOnElement(create_successfully_ok_button);
	}

	public void action_button_perform() {
		clickOnElement(action_button);
	}

	public void final_save() {
		before_verified_save_button.click();
		clickOnElement(before_verified_ok_button);
			 clickOnElement(after_verified_ok_button);
		
	}
	

	public void hyperlink_perform() throws InterruptedException {
		highLightElement(suppilercode_hyperlink);
		clickonJavascript(suppilercode_hyperlink);
		Thread.sleep(1000);
		
	}
	public void pdf_download() {
		clickonJavascript(verified_button);
		clickOnElement(after_verified_ok_button);
		clickOnElement(PDF_download_tab);
	}
	public void xlsx_download() {
		clickOnElement(XLSX_download_tab);
	}
	public void download_verified() {
		verfied_PDF_Equipment_download(PDF_download_tab);
		verfied_XLSX_Equipment_download(XLSX_download_tab);
	}
	
	public void modified_card_allDetails() {
		try {
			
			sendkeysText(modified_address_inputbox, Modified_Address());
			Thread.sleep(1000);
			sendkeysText(modified_contactPerson_inputbox, Modified_Contactperson());
			Thread.sleep(1000);
			sendkeysText(modified_contactMobile_numberInputbox, Modified_ContactNumber());
			Thread.sleep(1000);
			sendkeysText(modified_contactlandline_inputbox, Modified_Landline());
			Thread.sleep(1000);
			sendkeysText(modified_primaryEmailID_inputbox, Modified_EmailIDprimary());
			Thread.sleep(1000);
			sendkeysText(modified_secondaryEmailID_1_inputbox, Modified_EmailIdSecondanry1());
			Thread.sleep(1000);
			sendkeysText(modified_secondaryEmailID_2_inputbox, Modified_EmailIdSecondanry2());
			Thread.sleep(1000);
			sendkeysText(modified_contactNumberFax_inputbox, Modified_FaxNumber());
			clickOnElement(active_tab);
			clickOnElement(no_button_tab);
			Thread.sleep(3000);
			sendkeysText(data_passed,"C:\\Users\\LTP-7\\OneDrive\\Desktop\\EQUIPMENT-SUPPLIER-DETAILS.pdf");
			Thread.sleep(1000);
			scrollBy200();
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}
	public void Equipment_Supplier_Details() {
		for(int i=0;i<verified_Equipment_Supplier_Details.size();i++) {
			String data=verified_Equipment_Supplier_Details.get(i).getText();
			if(data.equals("Equipment Supplier Code")||data.equals("Equipment Supplier Name")||data.equals("Status")
			||data.equals("Address")||data.equals("Active")||data.equals("Action")){
		     logger.info("Properly show the valid data "+data);
			}
			else {
				logger.error("Not show the xpath "+verified_Equipment_Supplier_Details);
				getDriver.get(Thread.currentThread().getId()).close();
			}
		}
	}
	
	}


