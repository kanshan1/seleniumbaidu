package jichuceng;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class loginutil {
	public static WebDriver web;
	public static String url;
	@BeforeClass
	public void one() throws MalformedURLException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		
		/*DesiredCapabilities a=DesiredCapabilities.chrome();
		WebDriver driver=new RemoteWebDriver(new URL("http://192.168.66.1:8999/wd/hub"),a);*/	
		web = new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		web.get(url);
	}
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(2000);
		web.close();
	}
}
