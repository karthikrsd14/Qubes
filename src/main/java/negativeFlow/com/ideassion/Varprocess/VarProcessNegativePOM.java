package negativeFlow.com.ideassion.Varprocess;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ideassion.lab.base.BaseClass;

public class VarProcessNegativePOM extends BaseClass {
	WebDriver driver;
	public VarProcessNegativePOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	@FindBy(xpath = "//button[contains(text(),'Save & Submit')]")
	private WebElement save_submit_Button;

	@FindBy(xpath = "//div[contains(text(),'Please Fill all mandatory fields')]")
	private WebElement Error_msg_mandatory_fields;
	
	@FindBy(xpath = "//button[text()='OK']")
	private WebElement OK_button;
	
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

	@FindBy(xpath = "//div[text()='Please attach the Document']")
	private WebElement supporting_document_miss_notification;
	

public void without_mandatory_fields() {
	try {
		scrollIntoView(save_submit_Button);
		Thread.sleep(500);
	clickOnElement(save_submit_Button);
	if(elementDisplayed(Error_msg_mandatory_fields)) {
		clickOnElement(OK_button);
		sendkeysText(var1_clinic_district, District());
		var1_clinic_district.sendKeys(Keys.ENTER);
		sendkeysText(var1_clinic_Clinic, Clinic());
		var1_clinic_Clinic.sendKeys(Keys.ENTER);
		sendkeysText(var1_clinic_BEcategory,BECategory());
		var1_clinic_BEcategory.sendKeys(Keys.ENTER);
		scrollIntoView(var1_clinic_Model);
		sendkeysText(var1_clinic_KewPaNo, "123");
		sendkeysText(var1_clinic_Manufacturer, Manufacturer());
		var1_clinic_Manufacturer.sendKeys(Keys.ENTER);
		sendkeysText(var1_clinic_Model, Model());
		scrollBy200();
		var1_clinic_Model.sendKeys(Keys.ENTER);
		sendkeysText(var1_clinic_Serial_no, "123");
		Thread.sleep(9000);
		scrollIntoView(save_submit_Button);
	     clickOnElement(save_submit_Button);
	     
		if(elementDisplayed(supporting_document_miss_notification)) {
			logger.info(supporting_document_miss_notification.getText());
			clickOnElement(OK_button);
			sendkeysText(var1_clinic_SupportingDocument,"C:\\Users\\LTP-7\\OneDrive\\Desktop\\DataSheet\\New Equipment download.pdf");
			sendkeysText(var1_clinic_district,"");
			Thread.sleep(500);
			var1_clinic_district.sendKeys(Keys.ENTER);
			clickOnElement(save_submit_Button);
		
		if(elementDisplayed(Error_msg_mandatory_fields)) {
			clickOnElement(OK_button);
			sendkeysText(var1_clinic_district, District());
			Thread.sleep(500);
			var1_clinic_district.sendKeys(Keys.ENTER);
			sendkeysText(var1_clinic_Clinic, Clinic());
			Thread.sleep(500);
			var1_clinic_Clinic.sendKeys(Keys.ENTER);
             var1_clinic_KewPaNo.clear();
             var1_clinic_KewPaNo.sendKeys("456789");
			scrollIntoView(save_submit_Button);
		     clickOnElement(save_submit_Button);
		
		if(elementDisplayed(Error_msg_mandatory_fields)) {
			clickOnElement(OK_button);
			sendkeysText(var1_clinic_Clinic, Clinic());
			var1_clinic_Clinic.sendKeys(Keys.ENTER);
//			sendkeysText(var1_clinic_KewPaNo, "123");
			scrollIntoView(save_submit_Button);
		     clickOnElement(save_submit_Button);
	
		if(elementDisplayed(Error_msg_mandatory_fields)) {
			clickOnElement(OK_button);
			Thread.sleep(10000);
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));
		  
		for(int i=0;i<checkbox.size();i++) {
			if(checkbox.get(i).isDisplayed()) {
				String xpath=checkbox.get(i).getText();
				String data=driver.findElement(By.xpath("//..")).getText();
				logger.info(data+"Is displyed Element");
				if(checkbox.get(i).isEnabled()) {
					String data1=driver.findElement(By.xpath(checkbox.get(i)+"//..")).getText();
					logger.info(data1+"Is Enbled Element");
					if(checkbox.get(i).isDisplayed()) {
						String data2=driver.findElement(By.xpath(checkbox.get(i)+"//..")).getText();
						logger.info(data2+"Is Selected Element");
					}
					else{
						String data2=driver.findElement(By.xpath(checkbox.get(i)+"//..")).getText();
						logger.info(data2+" Not Is Selected Element");
					}
				}
					else {
						String data1=driver.findElement(By.xpath(checkbox.get(i)+"//..")).getText();
						logger.info(data1+"Is Disabled Element");
					}
				}
					else {
						
					String data2=driver.findElement(By.xpath(checkbox.get(i)+"//..")).getText();
					logger.info(data2+"Is Selected Element");
				}
				}
				}
			}
			
		}
		
	}
	
		
		
	
	}
	}
	catch(Exception e) {
	logger.info("Error throw some invalid datas");
	}

}

}
