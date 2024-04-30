package com.WebDriverDemosdone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D27NavigateMethods {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//driver.get("https://www.google.co.in/");

driver.navigate().to("https://www.google.co.in/");

driver.findElement(By.partialLinkText("Gm")).click();

driver.navigate().back();   //come to previous page
driver.navigate().forward();




	}

}
