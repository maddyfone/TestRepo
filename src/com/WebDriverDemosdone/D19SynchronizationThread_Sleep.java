package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D19SynchronizationThread_Sleep {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
WebDriver driver = new ChromeDriver(op);
driver.manage().window().maximize();

driver.get("https://www.redbus.in/");
//source
driver.findElement(By.id("src")).sendKeys("kolh");
Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();


//Target
driver.findElement(By.id("dest")).sendKeys("bang");
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();


//Calendar
driver.findElement(By.xpath("//*[@id=\"onwardcal\"]/div/i")).click();

//Date
driver.findElement(By.xpath("//*[@id=\"/html[1]/body[1]/section[1]/div[2]/div[3]/div[1]/div[1]/section[1]/div[1]/div[3]/div[1]/div[2]/div[3]/span[4]/div[3]/span[1]")).click();

//SearchBus
driver.findElement(By.id("Search Button")).click();
Thread.sleep(5000);
System.out.println(driver.findElement(By.xpath("//*[@id=\"result-section\"]/div[1]/div/div[2]/div/div[1]/div")).getText());


driver.close();



	}

}
