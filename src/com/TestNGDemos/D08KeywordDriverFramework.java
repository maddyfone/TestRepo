package com.TestNGDemos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D08KeywordDriverFramework {
	WebDriver driver;
	String fpath = "D:\\MadhaviSeleniumDemos\\MyAutomationProject\\src\\com\\TestNGDemos\\MyData.Properties";
	File file;
	FileInputStream fis;
	Properties prop;
  @Test
  public void login() {
	  driver.findElement(By.xpath(prop.getProperty("usernametextboxxpath"))).sendKeys("Maddy");
	  driver.findElement(By.xpath(prop.getProperty("passwordtextboxname"))).sendKeys("Maddy123");
	  driver.findElement(By.cssSelector(prop.getProperty("loginbuttoncssselector"))).click();
  }
  @AfterMethod
  public void afterMethod() {
	  System.out.println(driver.findElement(By.id("errormsgid")).getText());
  }

  @BeforeTest
  public void beforeTest() throws IOException{
	  file = new File(fpath);
	  fis = new FileInputStream(file);
	  prop = new Properties();
	  prop.load(fis);  ///this will load all the properties
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getProperty("url"));
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
