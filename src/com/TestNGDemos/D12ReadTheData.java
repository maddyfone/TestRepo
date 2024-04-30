package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D12ReadTheData {
	String fPath = "D:\\MadhaviSeleniumDemos\\Excelfiles\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	
  @Test
  public void readData() {
	  /*row = sheet.getRow(0);  //Read the 1st Row
	  cell = row.getCell(0);   // Read the 1st cell from 1st row
	  
	  String Data = cell.getStringCellValue();
	  System.out.println();*/
	  int rows = sheet.getPhysicalNumberOfRows();
	  //int cells = sheet.getRow(0).getPhysicalNumberOfCells();
	  
	  
	  for(int i = 0;i < rows;i++)
	  {
		  row = sheet.getRow(i);
		  int cells = row.getPhysicalNumberOfCells();
	  for (int j = 0;j < cells; j++)
	  {
		  cell = row.getCell(j);
		  System.out.println(cell.getStringCellValue());
		  
	  }}
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  file = new File(fPath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  //sheet = wb.getSheet("LoginData");
	  sheet = wb.getSheetAt(0);
  }

  @AfterTest
  public void afterTest() throws IOException {
	  wb.close();
	  fis.close();
  }

}
