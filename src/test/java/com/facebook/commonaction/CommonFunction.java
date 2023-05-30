package com.facebook.commonaction;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonFunction {
	public static WebDriver driver;
	
	public static CommonFunction c1 = null;
	
	private CommonFunction() {
		
	}
	
	public static CommonFunction getInstance() {
		
		if(c1==null) {
			c1 = new CommonFunction();
			return c1;
		}
		return c1;
	}
	
	
	public void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
	}
    
	public void browserClose() {
		driver.quit();
		
	}
	
	public void insertText(WebElement element, String value) {
		
		element.sendKeys(value);
		
	}
	
     public void insertText1(WebElement element, String value) {
		
		element.sendKeys(value, Keys.ENTER);
		
	}
    public void button(WebElement element) {
    	
    	element.click();
    }
    
    public void get_text(WebElement element) {
    	element.getText();
    	
    }
    public void alert() {
    		driver.switchTo().alert();
    		
    }
    
    public void windowshandling() {
    	String parent = driver.getWindowHandle();
    	Set<String> child = driver.getWindowHandles();
    	for(String x:child) {
    		if(!parent.equals(x));
    		driver.switchTo().window(x);
    		
    	}
    }
    
    public void dropDown(WebElement element,int i) {
    	Select s = new Select(element);
    	s.selectByIndex(i);
    	
    }
    
    public void dropDown(WebElement element) {
    	Select s = new Select(element);
    	s.selectByValue(null);
    }
    
    public void frames(WebElement element, int i) {
    	driver.switchTo().frame(i);
    	
    }
    public void frames(WebElement element) {
    	driver.switchTo().frame(element);
    	
    }
    
}
