package com.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("user is in login page")
	public void user_is_in_login_page() {
		System.out.println("Step 1: user is on the login page");
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	
	  @When("user enters the valid username and password") public void
	  user_enters_the_valid_username_and_password() {
	  System.out.println("Step2: user enters UserName and Password");
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123"); }
	 

	@And("user click on signIn button")
	public void user_click_on_sign_in_button() {
		System.out.println("Step3: User click on sigInButon");
	   driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user should login successfully")
	public void user_should_login_successfully() {
		System.out.println("Step4: User is on Home Page");
	   driver.close();
	   
	}
}
