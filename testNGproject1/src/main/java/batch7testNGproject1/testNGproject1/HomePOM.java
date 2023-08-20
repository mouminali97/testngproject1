package batch7testNGproject1.testNGproject1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class HomePOM {
	public static WebDriver driver;
	
	@FindBy (xpath = "//*[@id='nav-hamburger-menu']")
	WebElement backtoSchool;
	
	@FindBy (xpath = "//*[text()='Off to College']")
	WebElement offtoCollege;
	
	@FindBy (xpath = "//*[contains(text(),'Connect with')]")
	WebElement fbText;
	
	@FindBy (xpath = "//*[@id='email']")
	WebElement fb_EmailField;
	
	@FindBy (xpath = "//*[@id='pass']")
	WebElement fb_PassField;

	
	public HomePOM(WebDriver driver) {
		HomePOM.driver=driver;
		PageFactory.initElements(driver, this);
		}
	
	
	public void backtoSchoolClick() {
		backtoSchool.click();
	}
	
	public void offtoCollegeClick() {
		offtoCollege.click();
	}
	
	public void getfbText() {
		String Expected_text = "Connect with 88friends and the world around you on Facebook.";
		String Actual_text = fbText.getText();
		
		//Assert.assertEquals(Actual_text, Expected_text); //hard assert
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(Actual_text, Expected_text);
		
		System.out.println("This line is after soft assert");
		
		sa.assertAll();
		
		
	}

	
	public void enterEmail(String email) {
		fb_EmailField.sendKeys(email);
	}
	
	public void enterPass(String pass) {
		fb_PassField.sendKeys(pass);
	}


}
