package com.ideassion.inputdatas;

import java.io.File; 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {
	public static File f;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Properties prop;
	public static XSSFWorkbook wbook;
	public static XSSFSheet sheet;
	public static HashMap<Object,Object>fileread;

	public static void main(String[] args) throws InterruptedException, IOException {
		
		check();
//		
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.get("https://outlook.live.com/");
//		driver.findElement(By.xpath("(//a[text()='Sign in'])[1]")).click();
//		driver.findElement(By.xpath("//input[contains(@name,'loginfmt')]")).sendKeys("rkarthik@ideassion.com");
//		driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("Dat64566");
//		driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]")).click();
//		driver.findElement(By.xpath("//input[contains(@id,'idSIButton9')]")).click();
//		driver.findElement(By.xpath("(//span[contains(text(),'info@thelipl.in')])[1]")).click();
//		String data= driver.findElement(By.xpath("//div[contains(@class,'BodyFragment')]")).getText();
//		String op[]=data.split(" ");
//		System.out.println(op[0]);
////		((JavascriptExecutor) (driver)).executeScript("window.open();","");
////		Thread.sleep(3000);
////	Set<String> window=	driver.getWindowHandles();
////	List<String> list=new ArrayList<String>(window);
////		driver.switchTo().window(list.get(1));
////		System.out.println(driver.getCurrentUrl());
////		driver.close();
////		driver.switchTo().window(list.get(0));
////		System.out.println(driver.getCurrentUrl());
	}
	public static void check() throws IOException {
//		try {
			fileread=new HashMap<Object, Object>();
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			
	int row= sheet.getFirstRowNum();
	
		int cell=sheet.getRow(row).getLastCellNum();
		for(int j=0;j<cell;j++) {
			

			int cell1=sheet.getRow(1).getLastCellNum();
			for(int i=0;i<cell1;i++) {
			sheet.getRow(0).getCell(j).setCellType(CellType.STRING);
			sheet.getRow(1).getCell(i).setCellType(CellType.STRING);
				fileread.put(sheet.getRow(0).getCell(0).getStringCellValue(), sheet.getRow(1).getCell(0).getStringCellValue());
				fileread.put(sheet.getRow(0).getCell(1).getStringCellValue(), sheet.getRow(1).getCell(1).getStringCellValue());
//				System.out.println(sheet.getRow(i).getCell(j).getStringCellValue());
				
			}
		}
	
		System.out.println(fileread.get("Address").toString());
	}
			
	}
