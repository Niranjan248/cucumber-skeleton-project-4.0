package com.stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

/*public class StepDefinations {
public WebDriver  driver;
	@Given("the user is on loggin page.")
	public void the_user_is_on_loggin_page() {
	    // Write code here that turns the phrase above into concrete actions
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Desktop\\Selenium Softwares\\Selenium Softwares\\SeleniumDrivers\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 driver.get("http://localhost:8083/TestMeApp/login.htm");
	 
	}

	@When("User enters valid credentials")
	public void user_enters_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("Lalitha");
	  driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("Login")).click();
	}

	@Then("home page should be displayed.s")
	public void home_page_should_be_displayed_s() {
	    // Write code here that turns the phrase above into concrete actions
		String pg = driver.getTitle();
		Assert.assertEquals("Home", pg);
		
}
}*/