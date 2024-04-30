package com.WebDriverDemosdone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class D22Synchronization_FluentWait {

	public static void main(String[] args) {
ChromeOptions op = new ChromeOptions();
op.addArguments("--Disable-notification");

WebDriver driver = new ChromeDriver(op);
driver.manage().window().maximize();

FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);

driver.get("https://www.rebus.in/");
driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

//source
driver.findElement(By.id("srs")).sendKeys("kolh");
wait.withTimeout(Duration.ofSeconds(10));
wait.ignoring(NoSuchElementException.class);
wait.pollingEvery(Duration.ofMillis(1));
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='autoSuggestContainer']/div/div[1]/div/div[1]/ul/li[1]/div/text"))).click();


	}
	
	}


