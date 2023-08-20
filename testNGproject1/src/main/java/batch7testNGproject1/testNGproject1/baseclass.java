package batch7testNGproject1.testNGproject1;

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
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseclass {
	public WebDriver driver;
	//public WebDriver driver;  //for parallel testing remove static
	//changes2
  @BeforeMethod
  @Parameters({"brow"})
  public void beforeTest(String brow) throws InterruptedException, IOException {
	  System.out.println("This is before test, browser opens here");
	  //String browser = "Edge";
	  String browser = brow;
	  
      if(browser.contains("Chrome")) {
	  //Chrome driver
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\chromedriver.exe");
      driver = new ChromeDriver();
      }
      
      else if(browser.contains("Firefox")) {
	  //Firefox driver
      System.setProperty("webdriver.gecko.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\geckodriver.exe");
      driver = new FirefoxDriver();
      }
      
      else {
      //Edge driver
      System.setProperty("webdriver.edge.driver","C:\\Users\\Moumin\\eclipse-workspace\\mavenbatch7\\drivers\\msedgedriver.exe");
      driver = new EdgeDriver();
      }
      
      
     // driver.get("https://www.amazon.com");
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      Thread.sleep(5000);
      //shots();		//takes a screenshot
      //shots_withdate();
      //Thread.sleep(5000);
      
  }
  
  
  
  @AfterMethod
  public void afterTest() {
	  System.out.println("This is after test, close browser here");
	  driver.close();
	  System.out.println("End program");
  }
  
  
  public void shots() throws IOException {
	  File cap = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\Moumin\\eclipse-workspace\\testNGproject1\\pictures\\1.png"));
	   }
  
  public void shots_withargs(String name) throws IOException {
	  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\Moumin\\eclipse-workspace\\testNGproject1\\pictures\\"+name+".png"));
	   }
	   
  public void shots_withdate() throws IOException {
	  Date dt = new Date();
	  String name_dt=  dt.toString().replace(" ", "_").replace(":", "_");
	  File cap=  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(cap, new File("C:\\Users\\Moumin\\eclipse-workspace\\testNGproject1\\pictures\\"+name_dt+".png"));
	   }
}
