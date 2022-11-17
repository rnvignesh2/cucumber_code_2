package com.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static WebElement ref;

	public static void browser(String url) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get(url);
		
		driver.manage().window().maximize();
		
		}

	public static void tabs(int no) {
		
		Set<String> w=driver.getWindowHandles();
		
		List<String> li=new ArrayList();
		
		li.addAll(w);
		
		driver.switchTo().window( li.get(no));
		
		
	}

	public static  void iwait() {

		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	
	}

 public static WebElement locatorWeb(String type,String value) {
	 switch(type) {
	 case "id":
		  driver.findElement(By.id(value));
		 break;
	 case "name":
		 ref = driver.findElement(By.name(value));
		 break;
	 case "xpath":
	 ref= driver.findElement(By.xpath(value));
         break;
         default:
        	 System.out.println("invalid locator");
	}
return ref;
	}
	 
 }


