package com.crm.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

import com.crm.qa.base.TestBase;

public class TestUtils extends TestBase {
	
	public static long page_Load_Timeouts=20;
	
	public static long Implicit_Wait=30;
	
	
/*public void  Switchtofreame() {
		
		driver.switchTo().frame("mainpanel");	
		
	}*/
	
	XSSFWorkbook wb;
	
	XSSFSheet Sheet;
	
	XSSFRow row;
	
	XSSFCell cell;
	
	int SheetNumber;
	
	public static String path="D:\\sopan\\OfflineWebsite\\src\\main\\java\\com\\crm\\qa\\excel\\abc.xlsx";
	
	public TestUtils(String path,String SheetNumber) {
		
		try {
			
			File file=new File(path);
			
			FileInputStream fis=new FileInputStream(file);
			
			wb=new XSSFWorkbook();
		} catch (Exception e) {
	
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
