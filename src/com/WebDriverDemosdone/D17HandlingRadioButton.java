package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingRadioButton {

	public static void main(String[] args) {
   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
  
   WebElement genderF = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
   System.out.println("before/n");
   System.out.println("Visible: "+ genderF.isDisplayed());
   System.out.println("Enabled: "+ genderF.isEnabled());
   System.out.println("Selected: "+genderF.isSelected());
   
   genderF.click();
   
   System.out.println("after/n");
   System.out.println("Visible: "+ genderF.isDisplayed());
   System.out.println("Enabled: "+ genderF.isEnabled());
   System.out.println("Selected: "+ genderF.isSelected());
   
   
   
   
   
	}

}
