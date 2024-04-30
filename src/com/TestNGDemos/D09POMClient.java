package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D09POMClient {
	WebDriver driver;
	PracticeTestLogin p1;
	
  @Test
  public void login() {
	  p1 = new PracticeTestLogin(driver);
	  p1.addUserName("student");
	  p1.addPassword("Password123");
	  p1.clickLogin();
	  p1.showmessage();
  }
  @AfterMethod
  public void logout() {
	  p1.Logout();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  
	 
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
