package com.selenium.practice.SeleniumTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPagePractice
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://the-internet.herokuapp.com/login");
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.id("username")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.name("password")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.className("subheader")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.tagName("h2")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.linkText("Elemental Selenium")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.partialLinkText("Sauce")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.xpath("//img[@alt='Fork me on GitHub']")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.cssSelector("button[type='submit']")));
		Thread.sleep(3000);	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		
	}
	
	public static void highlight(WebDriver driver, WebElement element)
	{
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].style.border='3px solid red';", element);
	}
}
