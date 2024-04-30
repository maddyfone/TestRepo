package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;

public class A05QAReg {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://demoqa.com/automation-practice-form");
    
    driver.findElement(By.id("subjectsInput")).sendKeys("H");
    driver.findElement(By.id("subjectsInput")).click();
    
    
	}

}
