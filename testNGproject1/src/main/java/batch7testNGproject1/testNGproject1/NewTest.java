package batch7testNGproject1.testNGproject1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class NewTest extends baseclass {
	 
  
  
  @Test (priority = 1)
  public void fbtestcase1() throws InterruptedException, IOException {
	  System.out.println("This is test");
	  
	  HomePOM ob = new HomePOM(driver);
	  
	  ob.enterEmail("abc@yahoo.com");
	  Thread.sleep(5000);
	  ob.enterPass("bhhhhhh");
	  //shots_withdate();
	  Thread.sleep(5000);

	  
  }
  
  /*@Test (priority = 2)
  public void fbtestcase2() throws InterruptedException, IOException {
	  System.out.println("This is test 2");
	  
	  HomePOM ob = new HomePOM(driver);
	  
	  ob.enterEmail("xxxx@yahoo.com");
	  Thread.sleep(5000);
	  ob.enterPass("bh");
	  shots_withdate();
	  Thread.sleep(5000);

	  
  }*/
  
  /*@Test
  public void fbText() throws InterruptedException {
	  System.out.println("This is test 1");
	  
	  HomePOM ob = new HomePOM(driver);
	  ob.getfbText();
	  Thread.sleep(5000);
	  
  }*/
  
  
  /*@Test
  public void backToSchool() throws InterruptedException {
	  System.out.println("This is test 1");
	  
	  HomePOM ob = new HomePOM(driver);
	  ob.backtoSchoolClick();
	  Thread.sleep(5000);
	  
  }*/
  
  
 /* @Test
  public void offToCollege() throws InterruptedException {
	  System.out.println("This is test 2");
	  
	  HomePOM ob = new HomePOM(driver);
	  ob.offtoCollegeClick();;
	  Thread.sleep(5000);
	  
  }*/

 


  
  
  

}
