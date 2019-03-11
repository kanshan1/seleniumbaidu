package dlx;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dz1 {
	static WebDriver web;
	static String url;
	@BeforeClass
	public static void a(){
		//进入网页
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/shop1/";
		web.get(url);
	}
	@Test
	public void b(){
		//选择商品类型查找
		Select s = new Select(web.findElement(By.name("select_type")));
		s.deselectByIndex(3);
		web.findElement(By.name("Submit")).click();
	}
	@Test
	public void c(){
		//商品名查找
		web.navigate().back();
		web.findElement(By.name("select_p_name")).sendKeys("华硕");
		web.findElement(By.name("Submit")).click();
		Alert alert = web.switchTo().alert();
		alert.accept();
	}
	@Test
	public void d(){
		//商品类型和商品名精确查找
		WebElement select = web.findElement(By.name("select_type"));
		Select s = new Select(select);
		s.deselectByIndex(3);
		web.findElement(By.name("select_p_name")).sendKeys("华硕");
		web.findElement(By.name("Submit")).click();
	}
	@AfterClass
	public void f(){
		//关闭网页
		web.close();
	}
}
