package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	public static WebElement ref;

	
	public void Browser(String Browser, String url) {
		switch (Browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			break;

		default:
			System.out.println("invalid browser");
			break;
		}

	}

	public WebElement locator(String locator, String value) {

		switch (locator) {
		case "id":
			 ref = driver.findElement(By.id(value));
			break;
		case "name":
			 ref =driver.findElement(By.name(value));
			break;
		case "xpath":
			 ref =driver.findElement(By.xpath(value));
			break;
		default:
			System.out.println("invalid locator");
		}
		return ref;
		
	}

	
}
