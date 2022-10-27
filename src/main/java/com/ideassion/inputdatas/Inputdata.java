package com.ideassion.inputdatas;

import java.io.File;  
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
public class Inputdata{
	public static File f;
	public static FileInputStream fis;
	public static FileOutputStream fos;
	public static Properties prop;
	public static XSSFWorkbook wbook;
	public static XSSFSheet sheet;

	public static void main(String[] args) {
	System.out.println(HyperlinkVAR1());
	}
	
	public static String Username() {
		try {
			f=new File("src/main/resources/Inputdata/Local.properties");
			fis=new FileInputStream(f);
			prop= new Properties();
			prop.load(fis);
			return	prop.getProperty("username");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String CategoryType() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(9).getStringCellValue();
			return suppliername;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}


	}
	public static String Url() {
		try {
			f=new File("src/main/resources/Inputdata/Local.properties");
			fis=new FileInputStream(f);
			prop= new Properties();
			prop.load(fis);
			return	prop.getProperty("url");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Password() {
		try {
			f=new File("src/main/resources/Inputdata/Local.properties");
			fis=new FileInputStream(f);
			prop= new Properties();
			prop.load(fis);
			return	prop.getProperty("password");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	public static String SupplierName() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(3).getCell(0).getStringCellValue();
			return suppliername;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	public static String Address() {
		try {
			update();
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(1).setCellType(CellType.STRING) ;
			String address= sheet.getRow(1).getCell(1).getStringCellValue();
			return address;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Contactperson() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(2).setCellType(CellType.STRING) ;
			String contactperson= sheet.getRow(1).getCell(2).getStringCellValue();
			return contactperson;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String ContactNumber() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(3).setCellType(CellType.STRING) ;
			String contactnumber= sheet.getRow(1).getCell(3).getStringCellValue();
			return contactnumber;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Landline() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(4).setCellType(CellType.STRING) ;
			String landline= sheet.getRow(1).getCell(4).getStringCellValue();
			return landline;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String EmailIDprimary() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailid= sheet.getRow(1).getCell(5).getStringCellValue();
			return emailid.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String EmailIdSecondanry1() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailsecondary1= sheet.getRow(1).getCell(6).getStringCellValue();
			return emailsecondary1.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String EmailIdSecondanry2() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailsecondary2= sheet.getRow(1).getCell(7).getStringCellValue();
			return emailsecondary2.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String FaxNumber() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(8).setCellType(CellType.STRING) ;
			String faxnumber= sheet.getRow(1).getCell(8).getStringCellValue();
			return faxnumber.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String RefernceNumber() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(8).setCellType(CellType.STRING) ;
			String faxnumber= sheet.getRow(4).getCell(2).getStringCellValue();
			return faxnumber.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static void updateNumber(WebElement element) {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String op=element.getText();
			String value[]=	op.split(":");
			String data=value[1].toString().trim();
			sheet.createRow(4).createCell(2).setCellValue(data);

			fos=new FileOutputStream(f);
			wbook.write(fos);
			fos.close();
			
		}
	
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
	public static String HyperlinkVAR1() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(1).getCell(8).setCellType(CellType.STRING) ;
			String faxnumber1= sheet.getRow(5).getCell(2).getStringCellValue();
			String faxnumber=faxnumber1.trim();
			return faxnumber.trim();
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static void updateHyperlink(WebElement element) {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String op=element.getText();
			sheet.createRow(5).createCell(2).setCellValue(op);

			fos=new FileOutputStream(f);
			wbook.write(fos);
			fos.close();
			
		}
	
		catch(Exception e) {
			System.out.println(e.getMessage());
		
		}
	}
	public static void update() {
		try {
			String ip="NewData ";
			String data=SupplierName();
			String[] op=data.split(" ");
			int a=Integer.parseInt(op[1]);
			a++;
			String change=String.valueOf(a);
			data=ip+change;
			sheet.createRow(3).createCell(0).setCellValue(data);
			fos=new FileOutputStream(f);
			wbook.write(fos);
			fos.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	public static String Modified_Address() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(2).getCell(1).setCellType(CellType.STRING) ;
			String address= sheet.getRow(2).getCell(1).getStringCellValue();
			return address.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_Contactperson() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(2).getCell(2).setCellType(CellType.STRING) ;
			String contactperson= sheet.getRow(2).getCell(2).getStringCellValue();
			return contactperson.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_ContactNumber() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(2).getCell(3).setCellType(CellType.STRING) ;
			String contactnumber= sheet.getRow(2).getCell(3).getStringCellValue();
			return contactnumber.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_Landline() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(2).getCell(4).setCellType(CellType.STRING) ;
			String landline= sheet.getRow(2).getCell(4).getStringCellValue();
			return landline.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_EmailIDprimary() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailid= sheet.getRow(2).getCell(5).getStringCellValue();
			return emailid.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_EmailIdSecondanry1() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailsecondary1= sheet.getRow(2).getCell(6).getStringCellValue();
			return emailsecondary1;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_EmailIdSecondanry2() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String emailsecondary2= sheet.getRow(2).getCell(7).getStringCellValue();
			return emailsecondary2.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Modified_FaxNumber() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			sheet.getRow(2).getCell(8).setCellType(CellType.STRING) ;
			String faxnumber= sheet.getRow(2).getCell(8).getStringCellValue();
			return faxnumber.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String District() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(10).getStringCellValue();
			return suppliername.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static String Clinic(){
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(11).getStringCellValue().trim();
			return suppliername;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}


	}
	public static String BECategory() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(12).getStringCellValue();
			return suppliername.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	public static String Manufacturer() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(13).getStringCellValue();
			return suppliername.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}

	}
	public static String Model() {
		try {
			f=new File("src/main/resources/Inputdata/TestData.xlsx");
			fis=new FileInputStream(f);
			wbook=new XSSFWorkbook(fis);
			sheet= wbook.getSheet("TestData");
			String suppliername= sheet.getRow(1).getCell(14).getStringCellValue();
			return suppliername.trim();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			return null;
		}


	}

}
