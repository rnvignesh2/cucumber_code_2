//package com.StepDefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import com.pom.PomLoginPage;
//import com.pom.PomSearchHotelsPage;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class StepDefinition extends PomSearchHotelsPage{
//
//	StepDefinition s;
//
//	@Given("user should be in the login page with credentials")
//	public void user_should_be_in_the_login_page_with_credentials() {
//
//		WebDriverManager.chromedriver().setup();
//
//		driver = new ChromeDriver();
//
//		driver.get("https://adactinhotelapp.com/index.php");
//
//	}
//
//	@When("user is entering the {string} and {string}")
//	public void user_is_entering_the_username_and_password(String user, String Pass) {
//
//		s = new StepDefinition();
//
//		s.getUser().sendKeys(user);;
//		s.getPass().sendKeys(Pass);;
//
//	}
//
//	@When("clicking login button")
//	public void clicking_login_button() {
//		s.getLogin().click();
//	}
//
//	@Then("verifying the success message")
//	public void verifying_the_success_message() {
//	}
//	
//	@Given("user is on the home page of adactin")
//	public void user_is_on_the_home_page_of_adactin() {
//	    
//	}
//
//	@When("user is entering the {string},{string},{string},{string},{string},{string},{string},{string}")
//	public void user_is_entering_the(String location, String hotels, String roomtype, 
//			String noofrooms, String checkin, String checkout, String adults, String child) {
//	
//		StepDefinition sd = new StepDefinition();
//		
//		Select s=new Select(locationw);
//		s.selectByValue(location);
//		
//		Select s1=new Select(hotelsw);
//		s1.selectByValue(hotels);
//		
//		Select s2=new Select(roomtypew);
//		s2.selectByValue(roomtype);
//		
//		Select s3=new Select(noofroomsw);
//		s3.selectByValue(noofrooms);
//		
//		sd.getCheckin().sendKeys(checkin);
//		
//		sd.getCheckout().sendKeys(checkout);
//		
//		Select s6=new Select(adultsw);
//		s6.selectByValue(adults);
//		
//		Select s7=new Select(childw);
//		s7.selectByValue(child);
//		
//	}
//
//	@When("user is clicking the search button")
//	public void user_is_clicking_the_search_button() {
//		
//		s = new StepDefinition();
//		s.getSubmit().click();
//		
//	   }
//  @When("user is clicking continue in the next page")
//  public void contin() {
//	  s = new StepDefinition();
//	  s.getContin().click();
//  }
//}
