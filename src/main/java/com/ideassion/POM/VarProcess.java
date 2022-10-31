package com.ideassion.POM;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.ideassion.lab.base.BaseClass;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class VarProcess extends BaseClass {
	WebDriver driver;
	public static String refernce = "WPL000013";
	public static String refernce1 = "WPL000016";
	public static String refernce2;
	public static String omission_ref_no;
	public static String BE_Number1;
	public static String BE_Number2;
	public static String BE_Number1_1;
	public static String BE_Number1_2;
	public static String BE_Number1_3;

	public VarProcess(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//li[contains(@class,'nav-item pcoded-hasmenu ng-tns')])[5]")
	private WebElement VarProcess_tab;

	@FindBy(xpath = "((//li[contains(@class,'nav-item pcoded-hasmenu ng-tns')])[5]//a)[2]")
	private WebElement var1_clinic;

	@FindBy(xpath = "((//li[contains(@class,'nav-item pcoded-hasmenu ng-tns')])[5]//a)[3]")
	private WebElement varProcess_Var1;

	@FindBy(xpath = "//label[contains(@title,'Omission Equipment')]/..")
	private WebElement varProcess_Var1_vas2_omission;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement var1_clinic_new_Button;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement var1_clinic_district;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement var1_clinic_Clinic;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement var1_clinic_BEcategory;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement var1_clinic_KewPaNo;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement var1_clinic_Manufacturer;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement var1_clinic_Model;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement var1_clinic_Serial_no;

	@FindBy(xpath = "(//input[@type='date'])[2]")
	private WebElement var1_clinic_Purchase_date;

	@FindBy(xpath = "//input[@name='file1']")
	private WebElement var1_clinic_SupportingDocument;

	@FindBy(xpath = "//button[contains(text(),'Save & Submit')]")
	private WebElement va1_clinic_save_submit;

	@FindBy(xpath = "//div[text()='Please Fill all mandatory fields']")
	private WebElement error_msg;

	@FindBy(xpath = "//div[contains(text(),'VAR1-VS1 Form Created Successfully')]")
	private WebElement create_successfully;

	@FindBy(xpath = "//h2[contains(text(),'Ref No : Var1-VS1P3')]")
	private WebElement varprocess_refernce_details;

	@FindBy(xpath = "//button[text()='OK']")
	private WebElement create_successfully_after_ok;

	@FindBy(xpath = "//input[@placeholder='Search here']")
	private WebElement search_tab_var1_vs1;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement var1_vs1_action_tab;

	@FindBy(xpath = "(//input[@type='text'])[7]")
	private WebElement var1_vs1_edit_BEcategory;

	@FindBy(xpath = "//button[contains(text(),'Generate BE Number')]")
	private WebElement var1_vs1_edit_generate_BE_Number;

	@FindBy(xpath = "//input[@name='kewpaCost']")
	private WebElement var1_vs1_edit_KEWPA_Cost;

	@FindBy(xpath = "//input[contains(@name,'file1')]")
	private WebElement var1_vs1_edit_from_var1_file;

	@FindBy(xpath = "//input[contains(@name,'file4')]")
	private WebElement var1_vs1_edit_Form_A04Registration_file;

	@FindBy(xpath = "//input[contains(@name,'file3')]")
	private WebElement var1_vs1_edit_Form_KEWPA_file;

	@FindBy(xpath = "//input[contains(@name,'file2')]")
	private WebElement var1_vs1_edit_Form_EBC1_file;

	@FindBy(xpath = "//input[contains(@name,'file5')]")
	private WebElement var1_vs1_edit_EquipmentPicture_file;

	@FindBy(xpath = "//div[contains(@class,'col-md-2 float-right ng-tns')]")
	private WebElement var1_vs1_Supporting_Doc_MOH;

	@FindBy(xpath = "//button[text()='Draft']")
	private WebElement var1_vs1_edit_Draft;

	@FindBy(xpath = "//div[contains(text(),'Var1-Vs1 Drafted')]")
	private WebElement Var1_Vs1_Drafted_msg;

	@FindBy(xpath = "(//th[contains(text(),'BE Number')]//following::a)[1]")
	private WebElement VAR1_VS1_Additional_Equipment_hyperlink;

	@FindBy(xpath = "((//th[contains(text(),'BE Number')]//following::a)[1]/..//following-sibling::td)[7]//child::button")
	private WebElement VAR1_VS1_Additional_Equipment_action_tab;

	@FindBy(xpath = "//button[contains(text(),'Save & Forward')]")
	private WebElement VAR1_VS1_Additional_Equipment_save_forward;

	@FindBy(xpath = "//h4[contains(text(),' Successfully Generated')]")
	private WebElement VAR1_VS1_BE_Number_Generated;

	@FindBy(xpath = "((//h4[contains(text(),' Successfully Generated')]//following::div)[6]//child::button)[1]")
	private WebElement BE_Registration_Successfully_Generated;

	@FindBy(xpath = "(//th[text()='Status']//following::td)[2]//span")
	private WebElement Forwarded_msg;

	@FindBy(xpath = "(//li[contains(@class,'nav-item pcoded-hasmenu ng-tns')])[3]")
	private WebElement equipment_management;

	@FindBy(xpath = "//a[text()=' BE Registration ']")
	private WebElement BE_registration_tab_equipmanagement;

	@FindBy(xpath = "//input[contains(@placeholder,'Search here')]")
	private WebElement BE_registration_search_inputbox;

	@FindBy(xpath = "//input[contains(@placeholder,'Enter BE Number')]")
	private WebElement VAR1_VS2_omission_BE_number_inputbox;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement action_tab_BEregistration;

	@FindBy(xpath = "//button[text()='Next']")
	private WebElement basic_information_next_button;

	@FindBy(xpath = "(//input[@id='fname'])[1]")
	private WebElement Accessory;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Manufacturer;

	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement Model;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement Serial_Number;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement Part_Number;

	@FindBy(xpath = "//b[text()='Add']")
	private WebElement Add_button;

	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement Edit_BE_Registration_suppliername;

	@FindBy(xpath = "//input[@name='file3']")
	private WebElement Edit_BE_Numberplate_pic;

	@FindBy(xpath = "//input[@name='file7']")
	private WebElement Edit_BE_VAR_document;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement Edit_BE_Yes_Tab;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement VAR1_VS1Edit_manufacturer;

	@FindBy(xpath = "(//input[@type='text'])[12]")
	private WebElement VAR1_VS1Edit_model;

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement check_box;

	@FindBy(xpath = "//input[@type='date']")
	private WebElement date;

	@FindBy(xpath = "(//td[text()='Air Compressor']//following-sibling::td)[5]//child::input")
	private WebElement Acces_maping_manufacturer;

	@FindBy(xpath = "(//td[text()='Air Compressor']//following-sibling::td)[6]//child::input")
	private WebElement Acces_maping_model;

	@FindBy(xpath = "(//td[text()='Air Compressor']//following-sibling::td)[7]//child::input")
	private WebElement Acces_maping_serialNo;

	@FindBy(xpath = "(//td[text()='Air Compressor']//following-sibling::td)[8]//child::input")
	private WebElement Acces_maping_Jkkp;

	@FindBy(xpath = "((//input[@type='checkbox'])[1]//following::input)[2]")
	private WebElement first_index_model;

	@FindBy(xpath = "((//input[@type='checkbox'])[1]//following::input)[1]")
	private WebElement first_index_manufacturer;

	@FindBy(xpath = "((//input[@type='checkbox'])[1]//following::input)[3]")
	private WebElement first_index_serial_no;

	@FindBy(xpath = "(//input[@type='text'])[9]")
	private WebElement Otherinfom_BESerialno;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Otherinfom_BEFlag;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement Otherinfom_BERemark;

	@FindBy(xpath = "(//input[@type='text'])[6]")
	private WebElement Otherinfom_BERevNO;

	@FindBy(xpath = "(//input[@type='text'])[8]")
	private WebElement Otherinfom_Xray_tube;

	@FindBy(xpath = "(//input[@type='text'])[10]")
	private WebElement Otherinfom_MeterReading;

	@FindBy(xpath = "(//input[@type='text'])[11]")
	private WebElement Otherinfom_BER_Docment;

	@FindBy(xpath = "//button[contains(text(),'Search')]")
	private WebElement var1_vs2_omission_search_button;

	@FindBy(xpath = "//input[@type='file']")
	private WebElement var1_vs2_omission_supporting_document;

	@FindBy(xpath = "//h2[contains(text(),'Ref No : Var1-VS')]")
	private WebElement var1_vs2_omission_get_ref;

	@FindBy(id = "tab2")
	private WebElement VAR1_VS2_Additional_Equipment;

	@FindBy(xpath = "(//label[contains(text(),'BER')]//preceding::input[@id='gridRadios1'])[2]")
	private WebElement BER_tab_var1_vs2;

	@FindBy(xpath = "//input[contains(@name,'startStopService')]")
	private WebElement SNF_from;

	@FindBy(xpath = "//button[contains(text(),'Verify')]")
	private WebElement Verified_button_var1_vs2;

	@FindBy(id = "tab3")
	private WebElement VAR1_VS3_Equipment_Transfer;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement VS3_clinic_name;

	@FindBy(id = "tab4")
	private WebElement VAR1_VS4_Equipment_Transfer;

	@FindBy(id = "myfile")
	private WebElement VAR1_VS4_supporting_Document;
	
	
	
	
	
	
	
	public void click_on_varprocess_tab() {
		scrollIntoView(VarProcess_tab);
		highLightElement(VarProcess_tab);
		clickOnElement(VarProcess_tab);
		removeHighLightElement(VarProcess_tab);
	}

	public void click_var1Clinic() {
		highLightElement(var1_clinic);
		clickOnElement(var1_clinic);
		removeHighLightElement(var1_clinic);
	}

	public void click_var1Clinic_newbutton() {
		clickOnElement(var1_clinic_new_Button);
	}

	public void enter_all_mandatory_datas() {
		try {
			sendkeysText(var1_clinic_district, District());
			var1_clinic_district.sendKeys(Keys.ENTER);
			sendkeysText(var1_clinic_Clinic, Clinic());
			var1_clinic_Clinic.sendKeys(Keys.ENTER);
			sendkeysText(var1_clinic_BEcategory,BECategory());
			var1_clinic_BEcategory.sendKeys(Keys.ENTER);
//			var1_clinic_Purchase_date.sendKeys("12/10/2022");
//			JavascriptExecutor js = ((JavascriptExecutor) (driver));
//			Date d = new Date();
//			SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
//			String ab = sm.format(d);
//			js.executeScript("arguments[0].setAttribute('ng-reflect-model','2022-10-27');", var1_clinic_Purchase_date);
			scrollIntoView(var1_clinic_Model);
			sendkeysText(var1_clinic_KewPaNo, "123");
			sendkeysText(var1_clinic_Manufacturer, Manufacturer());
			var1_clinic_Manufacturer.sendKeys(Keys.ENTER);
			sendkeysText(var1_clinic_Model, Model());
			scrollBy200();
			var1_clinic_Model.sendKeys(Keys.ENTER);
			sendkeysText(var1_clinic_Serial_no, "123");
			Thread.sleep(1500);
			sendkeysText(var1_clinic_SupportingDocument,
					"C:\\Users\\LTP-7\\OneDrive\\Desktop\\EQUIPMENT-SUPPLIER-DETAILS.pdf");
			Thread.sleep(3000);

		} catch (Exception e) {
			logger.info("not properformed perpoerly in var process 1 clinic");
		}
	}

	public void save_submit() {
		scrollIntoView(va1_clinic_save_submit);
		clickonJavascript(va1_clinic_save_submit);
		updateNumber(varprocess_refernce_details);
		String day = varprocess_refernce_details.getText();
		String ab[] = day.split(":");
		logger.info(ab[1]);
		if (create_successfully.isDisplayed()) {
			clickOnElement(create_successfully_after_ok);
		} else {
			logger.error("Not enter the all mandatory fild var1 clinic:");
			getDriver.get(Thread.currentThread().getId()).close();
		}
	}

	public void Click_on_VarProcess_var1_tab() {
		highLightElement(varProcess_Var1);
		clickOnElement(varProcess_Var1);
		removeHighLightElement(varProcess_Var1);
	}

	public void VAR1_VS1_Additional_Equipment() {
		refernce = RefernceNumber();
		sendkeysText(search_tab_var1_vs1, refernce);
	}

	public void VAR1_VS1_new_Additional_Equipment() {
		refernce1 = RefernceNumber();
		sendkeysText(search_tab_var1_vs1, refernce1);
	}

	public void VAR1_VS1_new_update_Additional_Equipment() {
		refernce2 = RefernceNumber();
		sendkeysText(search_tab_var1_vs1, refernce2);
	}

	public void action_tab_perform() {
		clickOnElement(var1_vs1_action_tab);
		clickOnElement(var1_vs1_edit_generate_BE_Number);
	}

	public void action_update_tab_perform() {
		clickOnElement(var1_vs1_action_tab);
		sendkeysText(var1_vs1_edit_BEcategory, "Chairs, Examination/Treatment, Dentistry");
		var1_vs1_edit_BEcategory.sendKeys(Keys.ENTER);
		clickOnElement(var1_vs1_edit_generate_BE_Number);
	}

	public void datas_perform() {
		scrollIntoView(var1_vs1_edit_KEWPA_Cost);
		sendkeysText(var1_vs1_edit_KEWPA_Cost, "987");
		sendkeysText(var1_vs1_edit_EquipmentPicture_file,
				"C:\\Users\\LTP-7\\OneDrive\\Pictures\\Screenshots\\Screenshot (2).png");
		sendkeysText(var1_vs1_edit_Form_A04Registration_file,
				"C:\\Users\\LTP-7\\OneDrive\\Desktop\\EQUIPMENT-SUPPLIER-DETAILS.pdf");
		sendkeysText(var1_vs1_edit_Form_EBC1_file, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
		sendkeysText(var1_vs1_edit_Form_KEWPA_file, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\Karthik R.xlsx");
		sendkeysText(var1_vs1_edit_from_var1_file, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\acces modifer.txt");
		scrollIntoView(var1_vs1_edit_Draft);
	}

	public void ok_draft() {
		clickOnElement(var1_vs1_edit_Draft);

		if (Var1_Vs1_Drafted_msg.isDisplayed()) {
			clickOnElement(create_successfully_after_ok);
		} else {
			logger.error("not to be displyed:" + var1_vs1_edit_Draft);
		}
	}

	public void update_BEnumber1() {
		BE_Number1 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		logger.info("Get Hyper link BE Number 1: " + BE_Number1);
	}

	public void update_BEnumber1_1() {
		BE_Number1_1 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		logger.info("Get Hyper link BE Number 1_1: " + BE_Number1_1);
	}

	public void update_BEnumber1_2() {
		BE_Number1_2 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		logger.info("Get Hyper link BE Number 1_2: " + BE_Number1_2);
	}

	public void update_BEnumber1_3() {
		BE_Number1_3 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		logger.info("Get Hyper link BE Number 1_3: " + BE_Number1_3);
	}

	public void after_draft_action_perform() {

		updateHyperlink(VAR1_VS1_Additional_Equipment_hyperlink);
		clickOnElement(VAR1_VS1_Additional_Equipment_action_tab);
		scrollIntoView(VAR1_VS1_Additional_Equipment_save_forward);
		clickOnElement(VAR1_VS1_Additional_Equipment_save_forward);
	}

	public void update_BEnumber2() {
		BE_Number2 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		logger.info("Get Hyper link BE Number 2: " + BE_Number2);
	}

	public void after_draft_newdata_action_perform() {
		BE_Number2 = VAR1_VS1_Additional_Equipment_hyperlink.getText();
		updateHyperlink(VAR1_VS1_Additional_Equipment_hyperlink);
		clickOnElement(VAR1_VS1_Additional_Equipment_action_tab);
		scrollIntoView(VAR1_VS1_Additional_Equipment_save_forward);
		clickOnElement(VAR1_VS1Edit_manufacturer);
		VAR1_VS1Edit_manufacturer.sendKeys(Keys.ARROW_DOWN);
		VAR1_VS1Edit_manufacturer.sendKeys(Keys.ARROW_DOWN);
		VAR1_VS1Edit_manufacturer.sendKeys(Keys.ENTER);
		clickOnElement(VAR1_VS1Edit_model);
		VAR1_VS1Edit_model.sendKeys(Keys.ARROW_DOWN);
		VAR1_VS1Edit_model.sendKeys(Keys.ARROW_DOWN);
		VAR1_VS1Edit_model.sendKeys(Keys.ENTER);

		clickOnElement(VAR1_VS1_Additional_Equipment_save_forward);
	}

	public void begenerate_successfully() {
		try {
			if (VAR1_VS1_BE_Number_Generated.isDisplayed()) {
				logger.info(VAR1_VS1_BE_Number_Generated.getText() + "Is Displayed");
				clickOnElement(BE_Registration_Successfully_Generated);
			}
		} catch (Exception e) {
			logger.error("not to be get element");
		}
	}

	public void forward_verfied() {
		Assert.assertEquals("Forwarded", Forwarded_msg.getText());
		logger.info("It's show in the :" + Forwarded_msg);
	}

	public void click_Equipmanagement_tab() {
		clickOnElement(equipment_management);
	}

	public void click_BERegestration_under_equipment() {
		clickOnElement(BE_registration_tab_equipmanagement);

	}

	public void enter_data_beregistration() throws InterruptedException {
		Thread.sleep(1000);
		sendkeysText(BE_registration_search_inputbox, BE_Number1);
	}

	public void enter_data_beregistration1_1() throws InterruptedException {
		Thread.sleep(1000);
		sendkeysText(BE_registration_search_inputbox, BE_Number1_1);
	}

	public void enter_data_beregistration1_2() throws InterruptedException {
		Thread.sleep(1000);
		sendkeysText(BE_registration_search_inputbox, BE_Number1_2);
	}

	public void enter_data_beregistration1_3() throws InterruptedException {
		Thread.sleep(1000);
		sendkeysText(BE_registration_search_inputbox, BE_Number1_3);
	}

	public void enter_data_beregistration2() throws InterruptedException {
		Thread.sleep(1000);
		sendkeysText(BE_registration_search_inputbox, BE_Number2);
	}

	public void edit_BE_registraton() {
		clickOnElement(action_tab_BEregistration);
		clickOnElement(basic_information_next_button);

	}

	public void standrard_components() {
		sendkeysText(Accessory, "ideassion");
		clickOnElement(Manufacturer);
		// driver.findElement(By.xpath("//span[contains(text(),' BIOMEDICAL LIFE
		// SYSTEM')]")).click();
		Manufacturer.sendKeys(Keys.ARROW_DOWN);
		Manufacturer.sendKeys(Keys.ARROW_DOWN);
		Manufacturer.sendKeys(Keys.ENTER);
		// sendkeysText(Manufacturer, "CHATTANOGA");
		// sendkeysText(Model, "PRESSUER BIOFEEDBACK");
		Model.click();

		// driver.findElement(By.xpath("//span[contains(text(),' BIOMED 2000
		// XL')]")).click();
		Model.sendKeys(Keys.ARROW_DOWN);
		Model.sendKeys(Keys.ARROW_DOWN);
		Model.sendKeys(Keys.ENTER);
		sendkeysText(Serial_Number, "123467");
		sendkeysText(Part_Number, "7654321");
		clickOnElement(Add_button);
	}

	public void clinic_information_details() {
		clickOnElement(basic_information_next_button);
		clickonJavascript(basic_information_next_button);
		clickonJavascript(basic_information_next_button);
		clickonJavascript(basic_information_next_button);

	}

	public void clinic_update_information_details() {
		clickOnElement(basic_information_next_button);
		clickOnElement(check_box);
		clickOnElement(first_index_manufacturer);
		first_index_manufacturer.sendKeys(Keys.ARROW_DOWN);
		first_index_manufacturer.sendKeys(Keys.ARROW_DOWN);
		first_index_manufacturer.sendKeys(Keys.ENTER);
		clickOnElement(first_index_model);
		first_index_model.sendKeys(Keys.ARROW_DOWN);
		first_index_model.sendKeys(Keys.ENTER);
		sendkeysText(first_index_serial_no, "12345");
		scrollIntoView(date);
		sendkeysText(date, "10202022");
		clickOnElement(Acces_maping_manufacturer);
		Acces_maping_manufacturer.sendKeys(Keys.ARROW_DOWN);
		Acces_maping_manufacturer.sendKeys(Keys.ARROW_DOWN);
		Acces_maping_manufacturer.sendKeys(Keys.ARROW_DOWN);
		Acces_maping_manufacturer.sendKeys(Keys.ENTER);
		clickOnElement(Acces_maping_model);
		Acces_maping_model.sendKeys(Keys.ARROW_DOWN);
		Acces_maping_model.sendKeys(Keys.ENTER);
		sendkeysText(Acces_maping_serialNo, "12345");
		sendkeysText(Acces_maping_Jkkp, "654321");
		clickonJavascript(basic_information_next_button);
		clickonJavascript(basic_information_next_button);
		clickonJavascript(basic_information_next_button);
	}

	public void other_information() {
		clickOnElement(Edit_BE_Registration_suppliername);
		Edit_BE_Registration_suppliername.sendKeys(Keys.ARROW_DOWN);
		Edit_BE_Registration_suppliername.sendKeys(Keys.ARROW_DOWN);
		Edit_BE_Registration_suppliername.sendKeys(Keys.ENTER);
		clickonJavascript(basic_information_next_button);
	}

	public void supporting_document() throws InterruptedException {
		sendkeysText(Edit_BE_Numberplate_pic, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
		sendkeysText(Edit_BE_VAR_document, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\Karthik R.xlsx");
		clickOnElement(va1_clinic_save_submit);
		clickonJavascript(Edit_BE_Yes_Tab);
		Thread.sleep(1000);
		clickonJavascript(create_successfully_after_ok);
	}
	public void click_on_var1_vs2_omission() {
		clickOnElement(VarProcess_tab);
		clickOnElement(var1_clinic);
		clickOnElement(varProcess_Var1_vas2_omission);
	}

	public void enter_BEnumber_omissionpage() {
		clickonJavascript(var1_clinic_new_Button);
		sendkeysText(VAR1_VS2_omission_BE_number_inputbox, BE_Number1);
		clickOnElement(var1_vs2_omission_search_button);
	}
	public void enter_BEnumber_DER_omissionpage() {
		clickonJavascript(var1_clinic_new_Button);
		sendkeysText(VAR1_VS2_omission_BE_number_inputbox, BE_Number1_1);
		clickOnElement(var1_vs2_omission_search_button);
		clickOnElement(BER_tab_var1_vs2);

	}

	public void click_on_search_tab() {

		sendkeysText(var1_vs2_omission_supporting_document,
				"C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
	}

	public void save_submit_var1_omission() {
		clickonJavascript(va1_clinic_save_submit);
		String data = var1_vs2_omission_get_ref.getText();
		String op[] = data.split(":");
		omission_ref_no = op[1].toString().trim();
		logger.info("Get Refernce no: " + omission_ref_no);
		clickOnElement(create_successfully_after_ok);
	}

	public void click_var1_vs2_omissoin_edit() throws InterruptedException {
		clickonJavascript(VarProcess_tab);
		clickonJavascript(varProcess_Var1);
		clickOnElement(VAR1_VS2_Additional_Equipment);
		sendkeysText(search_tab_var1_vs1, BE_Number1_1);
		Thread.sleep(1500);
		search_tab_var1_vs1.sendKeys(Keys.ENTER);
		clickOnElement(VAR1_VS1_Additional_Equipment_hyperlink);
		clickonJavascript(VAR1_VS1_Additional_Equipment_save_forward);
		clickonJavascript(create_successfully_after_ok);
		sendkeysText(search_tab_var1_vs1, BE_Number1_1);
		clickOnElement(VAR1_VS1_Additional_Equipment_hyperlink);
		Thread.sleep(8000);
		sendkeysText(SNF_from, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
		clickonJavascript(Verified_button_var1_vs2);
		clickonJavascript(create_successfully_after_ok);
	}
	public void click_var1_vs2_data_omissoin_edit() throws InterruptedException {
		clickonJavascript(VarProcess_tab);
		clickonJavascript(varProcess_Var1);
		clickOnElement(VAR1_VS2_Additional_Equipment);
		sendkeysText(search_tab_var1_vs1, BE_Number1);
		Thread.sleep(1500);
		search_tab_var1_vs1.sendKeys(Keys.ENTER);
		clickOnElement(VAR1_VS1_Additional_Equipment_hyperlink);
		clickonJavascript(VAR1_VS1_Additional_Equipment_save_forward);
		clickonJavascript(create_successfully_after_ok);
		sendkeysText(search_tab_var1_vs1, BE_Number1);
		clickonJavascript(VAR1_VS1_Additional_Equipment_hyperlink);
		Thread.sleep(8000);
		sendkeysText(SNF_from, "C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
		clickonJavascript(Verified_button_var1_vs2);
		clickonJavascript(create_successfully_after_ok);
	}

	public void enter_var1_vs3_tab() {
		
		clickonJavascript(varProcess_Var1);
		clickonJavascript(VAR1_VS3_Equipment_Transfer);
		clickOnElement(var1_clinic_new_Button);
		sendkeysText(VAR1_VS2_omission_BE_number_inputbox,"JHR008405");
		clickOnElement(var1_vs2_omission_search_button);
		String clinic = VS3_clinic_name.getText();
		WebElement present_clinic = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
		present_clinic.click();
		List<WebElement> AllClinic = driver.findElements(By.xpath(
				"//div[contains(@class,'ng-dropdown-panel-items scroll-host')]//child::div[contains(@class,'ng-option')]"));
		for (int i = 0; i < AllClinic.size(); i++) {
			String data = AllClinic.get(i).getText();
			if (!data.equals(clinic)) {
				logger.info(clinic + ": Present Clinic name VS3 and " + "Print the Clinic name: " + data);
				present_clinic.sendKeys(Keys.ARROW_DOWN);
				present_clinic.sendKeys(Keys.ARROW_DOWN);
				present_clinic.sendKeys(Keys.ENTER);
				sendkeysText(var1_clinic_SupportingDocument,
						"‪C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
				clickonJavascript(va1_clinic_save_submit);
				clickonJavascript(create_successfully_after_ok);

			WebElement eye_button=	driver.findElement(By.xpath("//td[text()='"+"JHR008405"+"']//preceding-sibling::td//child::button"));
				
				sendkeysText(BE_registration_search_inputbox, "JHR008405");
				BE_registration_search_inputbox.sendKeys(Keys.ENTER);
				clickonJavascript(eye_button);
				clickonJavascript(va1_clinic_save_submit);
				clickonJavascript(create_successfully_after_ok);
				clickonJavascript(eye_button);
				clickonJavascript(Verified_button_var1_vs2);
				clickonJavascript(create_successfully_after_ok);
				
				clickonJavascript(VAR1_VS4_Equipment_Transfer);
				sendkeysText(BE_registration_search_inputbox, "JHR008405");
				BE_registration_search_inputbox.sendKeys(Keys.ENTER);
				clickonJavascript(eye_button);
				VAR1_VS4_supporting_Document.sendKeys("C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\BE-Number.pdf");
				clickonJavascript(va1_clinic_save_submit);
				clickonJavascript(create_successfully_after_ok);
				clickonJavascript(eye_button);
				clickonJavascript(Verified_button_var1_vs2);
				clickonJavascript(create_successfully_after_ok);
			}
		}
	}
}

//Var1-VS2P320220019
