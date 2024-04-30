package com.TestNGDemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeAndAfter_Test {
	WebDriver driver;
	
  @BeforeTest
  public void openBrowser()
  {
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest()
  
  {
    driver.close();
	  System.out.println("After Test");
  }
  public class D02MultipleTests {
	  @Test(priority=3)
	  public void openMyntra() {
		  driver.get("https://www.myntra.com/");
		  System.out.println("Title: "+driver.getTitle());
		  driver.close();
	}
	  @Test(priority=5)
	  public void openBewakoof() {
		  driver.get("https://www.bewakoof.com/");
		  System.out.println("Title: "+driver.getTitle());
		  driver.close();  
	  }
	  @Test(priority=2)
	  public void openMeeshow() {
		  driver.get("https://www.meesho.com/");
		  System.out.println("Title: "+ driver.getTitle());
		  driver.close();
	  }
		
	  @Test(priority=1)
	  public void openNykaa() {
		  driver.get("https://www.nykaa.com/");
		  System.out.println("Title: "+ driver.getTitle());
		  driver.close();
	  }

	  @Test(priority=4)
	  public void openZepto() {
		  driver.get("https://www.zeptonow.com/");
		  System.out.println("Title: "+driver.getTitle());
		  driver.close();
	  }
	  
  
  
  
  
  
  
}}
