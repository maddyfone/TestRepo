package com.WebDriverDemosdone;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D30DragAndDrop {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://jqueryui.com/droppable/");
Actions act = new Actions(driver);

driver.findElement(By.partialLinkText("Drop")).click();
//driver.switchTo().frame(0);
driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"content\"]/iframe")));


WebElement drag = driver.findElement(By.id("draggable"));
WebElement drop = driver.findElement(By.id("droppable"));
act.dragAndDrop(drag, drop).perform();

	}

}
