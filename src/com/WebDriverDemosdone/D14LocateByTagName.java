package com.WebDriverDemosdone;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D14LocateByTagName {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

driver.get("https://www.google.co.in");

List<WebElement>links = driver.findElements(By.tagName("a"));
System.out.println("Total links:  "+links.size());

//System.out.println(links.get(0).getText()); //Return text on 1st Link
//System.out.println(links.get(1).getText()); //Return test on 2nd Link


//for(int i=0,i < links.size(), i++);

//System.out.println(links.get(i).getTagName());

for(WebElement l :links)

System.out.println(l.getText());



driver.close();
}}
