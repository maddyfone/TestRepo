package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D10writeToExcel {
	String fPath = "D:\\MadhaviSeleniumDemos\\Excelfiles\\MyFirstExcel.xlsx";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	 
  @Test
  public void writeToExcel() {
	  row = sheet.createRow(0);
	  cell= row.createCell(0);
	  
	  cell.setCellValue("Kanna");
	  
	  //row = sheet.createRow(0);
	  cell= row.createCell(1);
	  
	  cell.setCellValue("Khanna");
	  
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException {
	  file = new File(fPath);
	  fos = new FileOutputStream(file);
	  wb = new XSSFWorkbook();
	  sheet = wb.createSheet("TestSheet");
	 
}

  @AfterTest
  public void afterTest() throws IOException {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
