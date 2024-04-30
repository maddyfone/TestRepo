package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11CreateLoginData {
	String fPath ="D:\\MadhaviSeleniumDemos\\Excelfiles\\LoginData.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int index = 0 ; 
	
  @Test(dataProvider = "getLoginGetails")
  public void writeToLoginFile(String un,String ps, String rs) {
	  row = sheet.createRow(index);
	  
	  cell = row.createCell(0);
	  cell.setCellValue(un);
	  
	  cell = row.createCell(1);
	  cell.setCellValue(ps);
	  
	  cell = row.createCell(2);
	  cell.setCellValue(rs);
	  
	  index++;
	  
  } 

  @DataProvider
  public Object[][] getLoginGetails() {
    return new Object[][] {
      new Object[] { "UserName", "password","Result"},
      new Object[] { "Admin", "Admin123","NotRun"},
      new Object[] {"Khanna","Khanna123","NotRun"},
      new Object[] {"Admin","Admin123","NotRun"},
      new Object[] {"Vikhyath","Vikyath123","NotRun"},
    };
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("LoginData");
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
