package com.WebDriverDemosdone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class D21SyncronizationExplicitWait {

	public static void main(String[] args) {
   ChromeOptions op = new ChromeOptions();
   op.addArguments("--Disable-notifications");
   
   WebDriver driver = new ChromeDriver(op);
   driver.manage().window().maximize();
   
   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
   
   
   driver.get("https://www.Redbus.in/");
   
   //source
   driver.findElement(By.id("srs")).sendKeys("kolh");
   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div[2]/main/div[3]/div[1]/div[2]/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();
   
   
   
   
   
 
   		
   
   
	}

}
