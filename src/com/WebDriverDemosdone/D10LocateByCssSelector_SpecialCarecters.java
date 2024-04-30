package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocateByCssSelector_SpecialCarecters {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.facebook.com");

WebElement emailID = driver.findElement(By.cssSelector("input[aria-label=\"Email address or phone number\"]"));
emailID.sendKeys("Test@gmail.com");
WebElement password = driver.findElement(By.cssSelector("input[placeholder=\"Password\"]"));
emailID.sendKeys("123456");
WebElement loginBtn = driver.findElement(By.cssSelector("button[value=\"1\"]"));
loginBtn.click();


	}

}
