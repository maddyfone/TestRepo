package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class A02RedBusAssignment {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		
WebDriver driver = new ChromeDriver(op);
driver.manage().window().maximize();

	//source
driver.get("https://www.redbus.in/");
driver.findElement(By.id("srs")).sendKeys("kolh");
driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();

//Target
driver.findElement(By.id("dest")).sendKeys("Ban");
driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();

//calender
driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/text[1]")).click();

//date
driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/div/text[1]"));

//Search Buses
driver.findElement(By.id("search_button")).click();

System.out.println(driver.findElement(By.xpath("//*[@id=\"result-section\"]/div[1]/div/div[2]/div/div[1]/div")).getText());



}}