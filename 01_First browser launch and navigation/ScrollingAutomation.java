package com.selenium.practice.SeleniumTraining;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class ScrollingAutomation
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/infinite_scroll");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		for(int i=0; i<10;i++)
		{
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			Thread.sleep(2000);
		}
		driver.quit();
	}
}
