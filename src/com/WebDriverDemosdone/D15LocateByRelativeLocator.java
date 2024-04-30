package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class D15LocateByRelativeLocator {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();

driver.manage().window().maximize();
driver.get("https://www.facebook.com/");

driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("test@gmail.com");

	}

}
