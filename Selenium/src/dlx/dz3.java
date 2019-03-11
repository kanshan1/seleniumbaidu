package dlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dz3 {
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
		//登录账号密码
		web.findElement(By.name("c_name")).sendKeys("null");
		web.findElement(By.name("c_pass")).sendKeys("123");
		web.findElement(By.className("STYLE1")).click();
	}
	@Test
	public void c(){
		//进入意见反馈
		web.findElement(By.linkText("意见反馈")).click();
	}
	@Test
	public void d(){
		//发表意见
		web.findElement(By.name("c_message")).sendKeys("这台电脑真TM卡");
		web.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
	}
	@AfterClass
	public void e(){
		//关闭网页
		web.close();
	}
}
