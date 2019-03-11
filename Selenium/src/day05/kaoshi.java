package day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class kaoshi {
	static WebDriver web;
	static String url;
	@BeforeClass
	public void one(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url="http://localhost:8080/examsys/login.thtml";
		web.get(url);
	}
	@Test
	public void kaos() throws InterruptedException{
		web.findElement(By.name("username")).sendKeys("hujianming");
		web.findElement(By.name("userpass")).sendKeys("hujianming123");
		WebElement select = web.findElement(By.name("usertype"));
		Select s=new Select(select);
		s.selectByIndex(2);
		Thread.sleep(5000);
		web.findElement(By.className("tm_btn")).click();
		Thread.sleep(3000);
		web.switchTo().frame("main");
		WebElement A=web.findElement(By.xpath("/html/body/div/div[1]/ul/li"));
		String Z=A.getText();
		if("首页".equals(Z)){
			System.out.println(Z);
		}
		else{
			System.out.println("获取首页失败");
		}
		
	}
	@AfterClass
	public void close() throws InterruptedException{
		Thread.sleep(2000);
		web.close();
	}
	
}
