package com.WebDriverDemosdone;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class D31ScreenShot {

	public static void main(String[] args) throws InterruptedException, IOException{
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 
 driver.get("https://jqueryui.com/");
 
 Actions act = new Actions(driver);
 driver.findElement(By.partialLinkText("Drop")).click();
 driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
 WebElement drag = driver.findElement(By.id("draggable"));
 WebElement drop = driver.findElement(By.id("droppable"));
 act.dragAndDrop(drag, drop).perform();
 File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
  FileUtils.copyFile(file,new File("D\\StarAgile.jpeg"));
  System.out.println("screenshot taken and closed");
  
  
	}

}
