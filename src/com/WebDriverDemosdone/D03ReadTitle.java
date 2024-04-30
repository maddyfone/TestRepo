package com.WebDriverDemosdone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D03ReadTitle {

	public static void main(String[] args) {
		String expTitle = "Google", actTitle;
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		actTitle = driver.getTitle();
		System.out.println("Title is: " + actTitle);

		/*
		 * if(expTitle.equals(actTitle)) {
		 * System.out.println("Title Matching !!! Test Case Pass"); } else {
		 * System.out.println("Title Not Matching!!! Test Case Fail"); }
		 */
		if (actTitle.contains("Google"))
			System.out.println("Title Matching!!! Test Case Pass");
		else
			System.out.println("Title Not Matching !!! Test Case Fail");

		driver.close();
	}

}
