package com.WebDriverDemosdone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16HandlingCheckbox {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

 WebElement chkBox  = driver.findElement(By.cssSelector("input[name^=\"chk_alt\"]"));

 System.out.println("before\n");
System.out.println("Selected: "+ chkBox.isSelected());
System.out.println("Visible: "+ chkBox.isDisplayed());
System.out.println("Enabled:" + chkBox.isEnabled());

if(chkBox.isSelected() == false);
chkBox.click();

System.out.println("after\n");
System.out.println("selected: " + chkBox.isSelected());
System.out.println("Visible: "+ chkBox.isDisplayed());
System.out.println("Enabled: " + chkBox);

driver.close();	}

}
