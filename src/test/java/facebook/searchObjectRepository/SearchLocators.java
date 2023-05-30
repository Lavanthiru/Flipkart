package facebook.searchObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.facebook.commonaction.CommonFunction;

public class SearchLocators {

	CommonFunction s = CommonFunction.getInstance();
	public SearchLocators() {
		PageFactory.initElements(s.driver, this);
	
	}
	

	@FindBy(name="firstname")
	private WebElement fname;
	
	@FindBy(name="lastname")
	private WebElement lname;
	
	@FindBy (xpath="//input[@name='reg_email__']")
	private WebElement mobnum;
	
	public WebElement getFname() {
		return fname;
}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMobnum() {
		return mobnum;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	@FindBy (xpath="//input[@name='reg_passwd__']")
	private WebElement pwd;
	
	@FindBy (id="day")
	private WebElement day;
	
	@FindBy (id="month")
	private WebElement month;
	
	@FindBy (id="year")
	private WebElement year;
	
	@FindBy (xpath="//label[text()='Male']")
	private WebElement gender;
}
