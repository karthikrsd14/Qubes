package com.ideassion.POM;

import java.util.List; 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

/**
 * @author karthik R
 * @category manufacturer and model
 *
 */
public class ManufacturerModel extends BaseClass {
	WebDriver driver;

	public ManufacturerModel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//label[@for='manufacturerSubTabMain2']")
	private WebElement manufacturer_model_tab;

	@FindBy(xpath = "(//input[@placeholder='Search here'])[3]")
	private WebElement manufacturer_modeltab_search_box;

	@FindBy(xpath = "(//button[contains(text(),'New')])[3]")
	private WebElement New_tab;

	@FindBy(xpath = "//input[@type='text']")
	private WebElement category_searchbox;

	@FindBy(xpath = "(//div[contains(@class,'card ng-tns')])[3]")
	private WebElement Manufacturer_Model_dropdown_details;

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement BE_category_inputbox;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	private WebElement BE_manufacturer_inputbox;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	private WebElement BE_modelnumber_inputbox;

	@FindBy(xpath = "//span[contains(text(),'Save & Submit ')]")
	private WebElement add_manufacturer_save_submit;

	@FindBy(xpath = "//h2[contains(text(),'Do You Want To Create?')]")
	private WebElement are_you_sure_tab;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	private WebElement create_yes_button;

	@FindBy(xpath = "//button[contains(text(),'OK')]")
	private WebElement Created_Successfully_OK;

	@FindBy(xpath = "//span[@type='button']")
	private WebElement model_count_button;

	@FindBy(xpath = "//span[text()='Save']")
	private WebElement edit_save_button;

	@FindBy(xpath = "//button[text()='Yes']")
	private WebElement Update_yes_button;

	@FindBy(xpath = "//button[contains(@class,'btn btn-primary ng-tns')]")
	private WebElement verfied_tab;

	@FindBy(xpath = "((//button[text()='New'])[3]//preceding-sibling::a)[1]")
	private WebElement pdf;

	@FindBy(xpath = "((//button[text()='New'])[3]//preceding-sibling::a)[2]")
	private WebElement xlsx;
	
	@FindBy(xpath = "//th[text()='BE Model Number']//following::tr//td//a")
	private List<WebElement> Hyperlinks_all_datas;

	public void click_manufacturertab() {
		scrollBy_300();
		scrollBy_300();
		clickOnElement(manufacturer_model_tab);
	}

	public void newtab_click() {
		logger.info("New button color :" + New_tab.getCssValue("color"));
		clickOnElement(New_tab);
	}

	public void Manufacturer_Model_enter() {
		try {
			sendkeysText(category_searchbox, "BE category");
			category_searchbox.sendKeys(Keys.ENTER);
			elementDisplayed(Manufacturer_Model_dropdown_details);
		} catch (Exception e) {
		}
	}

	public void add_all_BE_details() {
		try {
			sendkeysText(BE_category_inputbox, "Handpieces, Dental");
			BE_category_inputbox.sendKeys(Keys.ENTER);
			sendkeysText(BE_manufacturer_inputbox, SupplierName());
			BE_manufacturer_inputbox.sendKeys(Keys.ENTER);
			sendkeysText(BE_modelnumber_inputbox,"manufacturer data");

		} catch (Exception e) {
		}
	}

	public void save_submit_details() {
		try {
			clickonJavascript(add_manufacturer_save_submit);
			elementDisplayed(are_you_sure_tab);
			clickonJavascript(create_yes_button);
			Thread.sleep(1000);
			clickOnElement(Created_Successfully_OK);
		} catch (Exception e) {
		}

	}

	public void search_inputbox_validate() {
		try {
			Thread.sleep(2000);
			sendkeysText(manufacturer_modeltab_search_box, SupplierName());
			Thread.sleep(500);
			clickOnElement(model_count_button);
			WebElement action = driver
					.findElement(By.xpath("(//a[text()='" + SupplierName() + "']//following::td)[3]//child::i"));
			action.click();
			clickOnElement(edit_save_button);
			clickOnElement(Update_yes_button);
			clickOnElement(Created_Successfully_OK);
		} catch (Exception e) {
		}
	}

	public void verfication_manufacturer_model() {
		try {
			Thread.sleep(2000);
			manufacturer_modeltab_search_box.clear();
			sendkeysText(manufacturer_modeltab_search_box, SupplierName());
			Thread.sleep(1500);
			manufacturer_modeltab_search_box.sendKeys(Keys.ENTER);
			
		}
		catch (Exception e) {
			
		}
		}
	public void verified() {
		try {
			clickOnElement(model_count_button);
			WebElement hyperlink = driver.findElement(By.xpath("//a[contains(text(),'" + SupplierName() + "')]"));
			Thread.sleep(500);
			scrollIntoView(hyperlink);
//		int a= Hyperlinks_all_datas.size();
//		int b=a-1;
	WebElement link=	driver.findElement(By.linkText(SupplierName()));
	link.click();
		scrollIntoView(verfied_tab);
		if(verfied_tab.isEnabled()) {
				verfied_tab.click();
				logger.info("is present :"+verfied_tab.getText());
				clickOnElement(Created_Successfully_OK);
			}
			else {
				logger.info("is Not present:"+verfied_tab);
			}
			
			clickonJavascript(Created_Successfully_OK);
		} catch (Exception e) {
		}

	}

	public void download() {
		clickOnElement(pdf);
		clickOnElement(xlsx);
	}

}
