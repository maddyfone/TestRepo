package com.WebDriverDemosdone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D28Movemouse {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://istqb.in/");
Actions act = new Actions(driver);
//WebElement spMenu = driver.findElement(By.linkText("SPECIALIST"));
//act.moveToElement(spMenu).perform();
act.moveToElement(driver.findElement(By.linkText("SPECIALIST"))).perform();


	}

}
