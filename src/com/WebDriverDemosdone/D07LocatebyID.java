package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocatebyID extends D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailID = driver.findElement(By.id("email"));
		emailID.sendKeys("test@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Test123");
//WebElement loginbtn = driver.findElement(By.id("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy"));
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();

	}

}
