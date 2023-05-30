package in.amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BuyMobile_Stepdefinition {
	public static WebDriver driver;

	@Given("user launch the browser and url")
	public void user_launch_the_browser_and_url() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("disable-popup");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@When("user enter Mobile in the search bar")
	public void user_enter_mobile_in_the_search_bar() {
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	     Search.sendKeys("Apple Mobile");  
	}

	@When("user click the search button")
	public void user_click_the_search_button() {
		WebElement Submit = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Submit.click();
	}

	@Then("user should see search results")
	public void user_should_see_search_results() {
	    
	  WebElement mobile = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Pro Max (1 TB) - Space Black']"));
	  String text = mobile.getText();
	  System.out.println("Mobile Name: "+text);
	}
	@Then("user close the browser")
	public void user_close_the_browser() {
		driver.quit();
	}
}
