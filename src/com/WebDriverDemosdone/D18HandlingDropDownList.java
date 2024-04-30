package com.WebDriverDemosdone;

import java.util.List;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D18HandlingDropDownList {

	public static void main(String[] args) {
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

WebElement drpList =driver.findElement(By.id("country"));
Select Countries = new Select(drpList);

System.out.println("Selected country: " + Countries.getFirstSelectedOption().getText());

 List<WebElement>countryList = Countries.getOptions();	
 System.out.println("Total Countries: "+ countryList.size());
 
 /*int i = 0;
  for(WebElement c : countryList)
{
	System.out.println(i + "."+ c.getText());
	i++;
}*/
// Countries.selectByVisibleText("Canada");
 //Countries.selectByValue("37");
   Countries.selectByIndex(35);
 
 System.out.println("Selected Country: "+Countries.getFirstSelectedOption().getText());
	}

}
