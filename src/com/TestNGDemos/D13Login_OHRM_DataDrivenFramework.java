package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D13Login_OHRM_DataDrivenFramework {
	String fPath = "D:\\MadhaviSeleniumDemos\\Excelfiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i, j;
	
  @Test(dataProvider = "getLoginDetails")
  public void loginTo(String un, String ps) {
	  System.out.println(un + "\t" + ps);
	  
	  
	  for(i=0;i<5;i++);
	  {
		  
		  row = sheet.getRow(i+1);
		  for(j=0;j<2;j++);
		  {
			  cell = row.getCell(j);
			 
		
		  }
	  }
	  
  }
  @AfterMethod
  public void afterMethod() {
  }
 

  @DataProvider
  public Object[][] getLoginDetails() {
	  String[][]loginData = new String[5][2];
	return loginData;
	
    };
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(fPath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheetAt(0);
  }

  @AfterTest
  public void afterTest() {
  }

}
