package com.selenium.practice.SeleniumTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumProgram
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://the-internet.herokuapp.com/");
		Thread.sleep(2000);
		System.out.println("The current page is: " + driver.getTitle());
		System.out.println("The current page is: " + driver.getCurrentUrl());	
		Thread.sleep(3000);		
		driver.navigate().to("https://www.cricbuzz.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.quit();
	}
}
