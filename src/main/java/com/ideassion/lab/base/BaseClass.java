package com.ideassion.lab.base;

import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ideassion.POM.ClinicDetails;
import com.ideassion.POM.LoginPage;
import com.ideassion.POM.MasterManufacturerDeatils;
import com.ideassion.POM.ManufacturerModel;
import com.ideassion.POM.OutLookOpen;
import com.ideassion.POM.QubesMasterNewSuppiler;
import com.ideassion.POM.VarProcess;
import com.ideassion.inputdatas.Inputdata;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends Inputdata {

	/**
	 * @Author name : Karthik R
	 * @Date : 28-September-2022
	 * @Project : Qubes
	 * @category : Base Class
	 **/
	public WebDriver driver;
	public static Logger logger = LogManager.getLogger(BaseClass.class);
	public static HashMap<Long, WebDriver> getDriver;
	public static LoginPage loginpage;
	public static OutLookOpen outlookopen;
	public static QubesMasterNewSuppiler masterpagenew;
	public static MasterManufacturerDeatils manufacturerdetails;
	public static ClinicDetails clinicdetails;
	public static ManufacturerModel manufacturermodels;
	public static VarProcess varprocess;

	public void openBrowser(String browser) {
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("useAutomationExtension", false);
		options.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver(options);
			} else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();

			}
			getDriver = new HashMap<Long, WebDriver>();
			getDriver.put(Thread.currentThread().getId(), driver);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getStackTrace();
			logger.error("Unable to open browser");
		}
	}

	public void initObject() {
		loginpage = new LoginPage(getDriver.get(Thread.currentThread().getId()));
		outlookopen = new OutLookOpen(getDriver.get(Thread.currentThread().getId()));
		masterpagenew = new QubesMasterNewSuppiler(getDriver.get(Thread.currentThread().getId()));
		manufacturerdetails = new MasterManufacturerDeatils(getDriver.get(Thread.currentThread().getId()));
		clinicdetails = new ClinicDetails(getDriver.get(Thread.currentThread().getId()));
		manufacturermodels = new ManufacturerModel(getDriver.get(Thread.currentThread().getId()));
		varprocess = new VarProcess(getDriver.get(Thread.currentThread().getId()));
	}

	public boolean waitForElement(WebElement element) {
		boolean flag = false;
		try {
			WebDriverWait wait = new WebDriverWait(getDriver.get(Thread.currentThread().getId()), 30);
			wait.until(ExpectedConditions.visibilityOf(element));
			flag = true;
			logger.info(element.getText() + " is visible");
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(element + " is not visible");
		}
		return flag;
	}

	public boolean clickOnElement(WebElement element) {
		boolean flag = false;
		try {
			if (waitForElement(element)) {
				highLightElement(element);
				Thread.sleep(1000);
				removeHighLightElement(element);
				element.click();

			}

			flag = true;
			logger.info(element.getText() + " :is Clicked succesfully");
			return flag;
		} catch (Exception e) {

			e.printStackTrace();
			logger.error(element.getText() + " :is not clicked");
		}
		return flag;
	}

	public void verfied_PDF_Equipment_download(WebElement element) {

		File f = new File("C:" + File.separator + "Users" + File.separator + "LTP-7" + File.separator + "Downloads");
		File fileop[] = f.listFiles();
		for (File readData : fileop) {
			String downloadfile = readData.toString();
			if (downloadfile.contains("EQUIPMENT-SUPPLIER-DETAILS")) {
				logger.info("Properly Download the EQUIPMENT-SUPPLIER-DETAILS.pdf");
				break;
			}

		}

	}

	public void verfied_XLSX_Equipment_download(WebElement element) {

		File f = new File("C:" + File.separator + "Users" + File.separator + "LTP-7" + File.separator + "Downloads");
		File fileop[] = f.listFiles();
		for (File readData : fileop) {
			String downloadfile = readData.toString();
			if (downloadfile.contains("EQUIPMENT-SUPPLIER-DETAILS")) {
				logger.info("Properly Download the EQUIPMENT-SUPPLIER-DETAILS.xlsx");
				break;
			}

		}

	}

	public void verfied_PDF_manufacturer_download(WebElement element) {

		File f = new File("C:" + File.separator + "Users" + File.separator + "LTP-7" + File.separator + "Downloads");
		File fileop[] = f.listFiles();
		for (File readData : fileop) {
			String downloadfile = readData.toString();
			if (downloadfile.contains("Manufacturer Details.pdf")) {
				logger.info("Properly Download the Manufacturer Details.pdf");
				break;
			}

		}

	}

	public void verfied_XLSX_manufacturer_download(WebElement element) {

		File f = new File("C:" + File.separator + "Users" + File.separator + "LTP-7" + File.separator + "Downloads");
		File fileop[] = f.listFiles();
		for (File readData : fileop) {
			String downloadfile = readData.toString();
			if (downloadfile.contains("Manufacturer Details.xlsx")) {
				logger.info("Properly Download the Manufacturer Details.xlsx");
				break;
			}

		}

	}

	public boolean sendkeysText(WebElement element, String text) {
		boolean flag = false;
		try {
			if (waitForElement(element)) {
				if (element.isDisplayed()) {
					if (element.isEnabled()) {
						element.clear();
						element.sendKeys(text);
						Thread.sleep(1000);
					}
					flag = true;
					logger.info(text + " :element is entered in succesfully " + element);
					return flag;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(text + "element is not entered in " + element);
		}
		return flag;
	}

	public boolean elementDisplayed(WebElement element) {
		boolean flag = false;
		try {
			waitForElement(element);
			flag = element.isDisplayed();
			Thread.sleep(500);
			logger.info(element.getText() + " is displayed");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(element.getText() + " is not displayed");
		}
		return flag;
	}

	public boolean elementEnabled(WebElement element) {
		boolean flag = false;
		try {
			waitForElement(element);
			flag = element.isEnabled();
			logger.info(element.getText() + " is enabled");
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(element.getText() + " is not enabled");
		}
		return flag;
	}

	public boolean clickCheckbox(WebElement element) {
		boolean flag = false;
		try {
			if (waitForElement(element)) {
				if (!element.isSelected()) {
					element.click();
				} else {
					logger.info(element + " checkbox is already Clicked");
				}
			}
			flag = true;
			logger.info(element + " checkbox is Clicked Succesfully");
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			logger.error(element + " checkbox is not Clicked");
		}
		return flag;
	}

	public static void scrollIntoView(WebElement element) {

		try {
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("arguments[0].scrollIntoView();", element);
			Thread.sleep(1000);

		} catch (Exception Ex) {

		}

	}

	public static void clickonJavascript(WebElement element) {

		try {
			highLightElement(element);
			Thread.sleep(1000);
			removeHighLightElement(element);
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("arguments[0].click();", element);

			logger.info(element.getText() + ": Click on the element");
		} catch (Exception Ex) {

		}

	}

	public static void scrollBy200() {
		try {
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("window.scrollBy(0,200);", "");
			Thread.sleep(1000);
		} catch (Exception Ex) {

		}

	}

	public static void scrollBy_300() {
		try {
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("window.scrollBy(0,-400);", "");
			Thread.sleep(1000);
		} catch (Exception Ex) {

		}

	}

	public static void XscrollBy400() {
		try {
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("window.scrollBy(0,400);", "");
			Thread.sleep(1000);
		} catch (Exception Ex) {

		}

	}

	public static void highLightElement_and_removed(WebElement element) {
		try {

			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId()))).executeScript(
					"arguments[0].setAttribute('style','background: yellow;border: 2px solid red;')", element);

			Thread.sleep(1000);
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId())))
					.executeScript("arguments[0].setAttribute('style','background: ;border: 2px solid ;')", element);
		} catch (Exception Ex) {

		}

	}

	public static void highLightElement(WebElement element) {
		try {

			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId()))).executeScript(
					"arguments[0].setAttribute('style','background: yellow;border: 2px solid red;')", element);
		} catch (Exception Ex) {

		}

	}

	public static void removeHighLightElement(WebElement element) {
		try {
			Thread.sleep(1000);
			((JavascriptExecutor) (getDriver.get(Thread.currentThread().getId()))).executeScript(
					"arguments[0].removeAttribute('style','background: yellow;border: 2px solid red;')", element);

		} catch (Exception Ex) {

		}
	}

	public Object openNewTab() {
		try {
			return ((JavascriptExecutor) (driver)).executeScript("window.open();", "");
		} catch (Exception Ex) {
			return null;
		}
	}

	public static void close() {
		getDriver.get(Thread.currentThread().getId()).close();
	}

}
