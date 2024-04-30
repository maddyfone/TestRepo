package com.TestNGDemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DataDrivenTesting {
	WebDriver driver;
	String expUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",actUrl;
	
  @Test(dataProvider = "getLoginData")
  public void logintoOHRM(String un, String ps) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  actUrl = driver.getCurrentUrl();
	  
	  Assert.assertTrue(actUrl.equals(expUrl));
	  
  }
  @DataProvider
  public Object[][] getLoginData() {
    return new Object[][] {
      new Object[] { "Admin", "Admin123" },
      new Object[] { "Mrunali", "Mrunali123"},
      new Object[] { "Maddy", "Maddy123"}, 
    };
  }
  @AfterMethod()
  public void afterMetod() {
	if(actUrl.equals(expUrl))
		
	{
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")).click();
		driver.findElement(By.partialLinkText("Log")).click();
	}
		
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
