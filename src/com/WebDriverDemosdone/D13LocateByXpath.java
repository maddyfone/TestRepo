package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D13LocateByXpath {

	public static void main(String[] args) {
    WebDriver  driver = new ChromeDriver();
     
    driver.get("https://www.facebook.com/");
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input")).sendKeys("test@gmail.com");
   driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]")).sendKeys("12345");
   
   
     
 

	}
}
