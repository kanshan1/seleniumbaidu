package day05;

import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class hh {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();

  @BeforeClass
  public void setUp() throws Exception {
	System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "file:///E:/%E4%B8%8A%E8%AF%BE/%E6%B5%8B%E8%AF%95-%E9%BB%84%E5%A8%9F/%E9%A1%B5%E9%9D%A2/autotest.html";
  }

  @Test
  public void testUntitled() throws Exception {
	  driver.get(baseUrl);
	  
  }

  @AfterClass
  public void tearDown() throws Exception {
    driver.quit();
  }
}
