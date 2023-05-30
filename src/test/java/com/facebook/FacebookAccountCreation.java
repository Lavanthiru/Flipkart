package com.facebook;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import com.facebook.commonaction.CommonFunction;

import facebook.searchObjectRepository.SearchLocators;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAccountCreation{
	
	public static WebDriver driver;
	CommonFunction s = CommonFunction.getInstance();
	SearchLocators sch = new SearchLocators();
	
	@Given("launch the browser and url {string}")
	public void launch_the_browser_and_url(String url) {
		s.browserLaunch();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-popups");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("the user is on the Facebook sign-up page")
	public void the_user_is_on_the_facebook_sign_up_page() {
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	}

	@When("the user enter Firstname {string}")
	public void the_user_enter_firstname(String FirstName) {
		WebElement fname = driver.findElement(By.name("firstname"));
	   s.insertText(fname, FirstName);
	}

	@When("the user enter Lastname {string}")
	public void the_user_enter_lastname(String LastName) {
		WebElement lname = driver.findElement(By.name("lastname"));
	    s.insertText(lname, LastName);
	}

	@When("the user enter Mobile number {string}")
	public void the_user_enter_mobile_number(String mobnum) {
		WebElement mnum = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mnum.sendKeys(String.valueOf(mobnum));
	}

	@When("the user enter Password {string}")
	public void the_user_enter_password(String password) {
		WebElement pwd = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		s.insertText(pwd , password);
	}

	@When("the user select the DOB")
	public void the_user_select_the_dob() throws InterruptedException {
	   WebElement day = driver.findElement(By.id("day"));
	    Select d = new Select(day);
	    d.selectByValue("12");
	    Thread.sleep(60);

	    
	    WebElement month = driver.findElement(By.id("month"));
	    Select m = new Select(month);
	    m.selectByValue("5");
	    Thread.sleep(60);
	    
	    WebElement year = driver.findElement(By.id("year"));
	    Select y = new Select(year);
	    y.selectByValue("1996");
	    Thread.sleep(60);
	    
	}

	@When("the user select the Gender")
	public void the_user_select_the_gender() throws Throwable {
	    WebElement gender = driver.findElement(By.xpath("//label[text()='Male']"));
	    s.button(gender);
	    Thread.sleep(60);
	    TakesScreenshot ts = (TakesScreenshot)driver;
	    File src= ts.getScreenshotAs(OutputType.FILE);
	    File des = new File ("C:\\Users\\S\\eclipse-workspace\\Cucumber_Project\\src\\test\\resources\\fac.png");
	    FileUtils.copyFile(src, des);
	    }

	@When("the user clicks the sign-up button")
	public void the_user_clicks_the_sign_up_button() {
	    WebElement Sg = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	    s.button(Sg);
	}

	@When("the user's account should be created successfully")
	public void the_user_s_account_should_be_created_successfully() {
	    s.browserClose();
	}
	}