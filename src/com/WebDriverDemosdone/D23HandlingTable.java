package com.WebDriverDemosdone;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.network.Header;
import org.openqa.selenium.chrome.ChromeDriver;

public class D23HandlingTable {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

//List<WebElement>headers = driver.findElements(By.tagName("th"));
List<WebElement>headers =  driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));

 for(WebElement h: headers)
	System.out.println(h.getText());

List<WebElement>Rows = driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
System.out.println("Total Rows:"+ Rows.size());


Random rnd = new Random();
//int i = rnd.nextInt(10); //Generate any number from 0 to 9
int i = rnd.nextInt(Rows.size());

System.out.println(i);
System.out.println(Rows.get(i).getText());




driver.close();

		
		}
}
