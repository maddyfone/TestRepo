package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		WebElement emailId = driver.findElement(By.name("email"));
		// Read the control whose name is "email" and store it in the emailId Object
		emailId.sendKeys("madavi.vkaranam@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
	}

}
