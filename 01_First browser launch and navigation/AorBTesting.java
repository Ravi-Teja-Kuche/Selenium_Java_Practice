package com.selenium.practice.SeleniumTraining;

import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AorBTesting
{
	public static void main(String[] args) throws Exception
	{
			WebDriver driver = new ChromeDriver();
			driver.get("https://the-internet.herokuapp.com/abtest");
			
			try
			{
				WebElement headerElement = driver.findElement(By.tagName("h3"));
				String headerText = headerElement.getText();
				System.out.println("Rendered Header: " + headerText);
				String control = "A/B Test Control";
				
				if(headerText.equals(control) )
				{
					System.out.println("Element is control and it is "  + headerText);
				}
				else
				{
					System.out.println("Element is variable and it is now " + headerText);
				}
				Thread.sleep(3000);
				driver.quit();
			}
			catch (NoSuchElementException e)
			{
				System.out.println("Element not found");
			}
	}
}
