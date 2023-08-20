package batch7testNGproject1.testNGproject1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTestdp extends baseclass {
  @Test(dataProvider = "dp")
  public void f(String email, String password) throws InterruptedException {
	  System.out.println("This is test");
	  
	  HomePOM ob = new HomePOM(driver);
	  
	  ob.enterEmail(email);
	  Thread.sleep(5000);
	  ob.enterPass(password);
	  Thread.sleep(5000);

  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "abc", "a" },
      new Object[] { "def", "b" },
    };
  }
}
