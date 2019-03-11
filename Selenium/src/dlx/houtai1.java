package dlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class houtai1 {
	static WebDriver web;
	static String url;
	@BeforeClass
	public static void a(){
		//打开网址
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/shop1/index.jsp";
		web.get(url);
	}
	@Test
	public void b(){
		//进入后台管理
		//登入管理员账号密码
		web.findElement(By.linkText("后台管理")).click();
		web.findElement(By.name("a_name")).sendKeys("admin");
		web.findElement(By.name("a_pass")).sendKeys("a_pass");
		web.findElement(By.name("submit2")).click();
	}
	@Test
	public void c(){
		//添加一个商品主分类
		web.switchTo().frame(0);
		web.switchTo().frame("Left");
		web.findElement(By.linkText("添加商品主分类")).click();
		web.switchTo().frame(0);
		web.switchTo().frame("Right");
		web.findElement(By.name("t_name")).sendKeys("战甲");
		web.findElement(By.xpath("/html/body/center/form/table/tbody/tr[2]/td[3]/input[1]")).click();
	}
	@AfterClass
	public void d(){
		web.close();
	}
}
