package com.ideassion.POM; 
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class MasterManufacturerDeatils extends BaseClass{
public static String name;
	WebDriver driver;
	public MasterManufacturerDeatils(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//label[@for='manufacturerTab']")
	private WebElement manufacturer_details_tab;

	@FindBy(xpath = "(//button[contains(text(),'New')])[2]")
	private WebElement New_button;

	@FindBy (xpath = "(//input[@type='text'])[1]")
	private WebElement manufacuturer_category;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement manufacturer_name;

	@FindBy(xpath = "//button[contains(text(),'Generate Code')]")
	private WebElement generatecode_button;

	@FindBy(xpath = "//input[contains(@name,'contactPerson')]")
	private WebElement contact_personName_inputBox;

	@FindBy(xpath = "(//div[contains(@class,'card ng-tns')])[1]")
	private WebElement alldata_inputboxs;

	@FindBy(xpath = "//input[contains(@name,'emailPrimary')]")
	private WebElement primary_email;

	@FindBy(xpath = "//input[contains(@name,'email1')]")
	private WebElement secondary_email1;

	@FindBy(xpath = "//input[contains(@name,'email2')]")
	private WebElement secondary_email2;

	@FindBy(xpath = "//input[contains(@name,'address')]")
	private WebElement address;

	@FindBy(xpath = "//input[contains(@type,'number')]")
	private  WebElement faxnumber;

	@FindBy(xpath = "(//input[contains(@type,'text')])[5]")
	private WebElement contact_number_landline;

	@FindBy(xpath = "(//input[contains(@type,'text')])[6]")
	private WebElement contact_number_mobile;

	@FindBy(xpath = "//button[contains(text(),'Save & Submit')]")
	private WebElement add_manufacturer_save_submit;

	@FindBy(xpath = "//div[@class='swal2-header']")
	private WebElement are_you_sure_tab;

	@FindBy(xpath = "//button[text()='Ok']")
	private WebElement add_manufacturer_ok_button;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement successfully_created_ok_button;

	@FindBy(xpath = "(//button[@type='button'])[11]")
	private WebElement manufacturer_action_tab;

	@FindBy(xpath = "//span[contains(text(),'Save & Submit')]")
	private WebElement edit_manufacturer_save_submit;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement edit_after_yes_button;

	@FindBy(xpath = "//span[text()='Verify']")
	private WebElement manufacturer_verified_button;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement active_tab;

	@FindBy(xpath = "//div[contains(@aria-selected,'false')]")
	private WebElement No_tab;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement manufactuere_tab;

	@FindBy(xpath = "//span[contains(text(),' 3SM PTE LTD')]")
	private WebElement select_option;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement documents;
	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[3]")
	private WebElement PDF_download_tab;

	@FindBy(xpath = "(//a[contains(@class,'float-right ng-tns')])[4]")
	private WebElement XLSX_download_tab;

	public void click_manufacturer_details_tab() {
		scrollBy_300();
		scrollBy_300();
		highLightElement(manufacturer_details_tab);
		clickOnElement(manufacturer_details_tab);
	}
	public void click_newtab() {
		try {
		removeHighLightElement(manufacturer_details_tab);
		clickOnElement(New_button);
	}
		catch(Exception e) {
		}
		}
	public void enter_category_type() {
		sendkeysText(manufacuturer_category, CategoryType());
		manufacuturer_category.sendKeys(Keys.ENTER);
	}
	public void enter_manufacturer_name() {
		sendkeysText(manufacturer_name,SupplierName() );
		name=manufacturer_name.getAttribute("value");
	}
	public void click_generatecode_button() {
		clickOnElement(generatecode_button);
	}

	public void enter_card_allDetails() {

		if(alldata_inputboxs.isDisplayed()) {
			logger.info("present the all datas input boxs "+ alldata_inputboxs.getText());
		}
		else {
			getDriver.get(Thread.currentThread().getId()).close();
		}
		try {
			sendkeysText(contact_personName_inputBox, Contactperson());
			Thread.sleep(1000);
			sendkeysText(primary_email, EmailIDprimary());
			Thread.sleep(1000);
			sendkeysText(contact_number_landline, Landline());
			Thread.sleep(1000);
			sendkeysText(secondary_email1, EmailIdSecondanry1());
			Thread.sleep(1000);
			sendkeysText(contact_number_mobile, ContactNumber());
			Thread.sleep(1000);
			sendkeysText(secondary_email2, EmailIdSecondanry2());
			Thread.sleep(1000);
			sendkeysText(faxnumber, FaxNumber());
			Thread.sleep(1000);
			sendkeysText(address, Address());
			Thread.sleep(3000);
		} catch (Exception e) {

		}

	}
	public void clickon_add_save_submit() {
		clickOnElement(add_manufacturer_save_submit);
	}
	public void clickon_add_okButton() {
		if(are_you_sure_tab.isDisplayed()) {
			clickOnElement(add_manufacturer_ok_button);
			clickOnElement(successfully_created_ok_button);
		}
		else {
			getDriver.get(Thread.currentThread().getId()).close();
		}
	}
	public void clickon_action_tab() {
		clickOnElement(manufacturer_action_tab);
	}
	
	public void click_hyperlink_manufacutrer() {
		try {
			clickOnElement(edit_manufacturer_save_submit);
			clickOnElement(edit_after_yes_button);
			clickOnElement(successfully_created_ok_button);
			Thread.sleep(500);
			driver.findElement(By.xpath("//td[contains(text(),'"+name+"')]//preceding-sibling::td//child::a")).click();
			Thread.sleep(1000);
			clickOnElement(manufacturer_verified_button);
			clickOnElement(successfully_created_ok_button);
		}
		catch(Exception e) {
			logger.info("not perpormed "+e.getMessage());
		}
	}
	public void active_changed() {
		try {
		scrollBy200();
		sendkeysText(active_tab,"NO");
		active_tab.sendKeys(Keys.ENTER);
		clickOnElement(manufactuere_tab);
		clickOnElement(select_option);
		scrollIntoView(documents);
		Thread.sleep(2000);
		//		sendkeysText(documents,"C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\Supplier_Equipment\\Positive_TestData\\TestData.xlsx");
		sendkeysText(documents,"C:\\Users\\LTP-7\\OneDrive\\Desktop\\EQUIPMENT-SUPPLIER-DETAILS.pdf");
	
		Thread.sleep(3000);
	}
		catch(Exception e) {
		}
		}
	public void download_details() {
		scrollBy_300();
		clickOnElement(PDF_download_tab);
		clickOnElement(XLSX_download_tab);
		verfied_PDF_manufacturer_download(PDF_download_tab);
		verfied_XLSX_manufacturer_download(XLSX_download_tab);
	}
	
}
