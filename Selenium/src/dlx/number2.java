package dlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class number2 {
	static WebDriver web;
	static String url;
	@BeforeClass
	@Test
	public void a(){
		//打开在线考试网页
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/Exam_ssh/";
		web.get(url);
	}
	@Test
	public void b(){
		web.findElement(By.linkText("开始在线考试")).click();
		web.findElement(By.name("stuNumber")).sendKeys("1");
		web.findElement(By.name("stuName")).sendKeys("1");
		web.findElement(By.name("B1")).click();
	}
	@Test
	public void c(){
		WebElement select = web.findElement(By.name("examType"));
		Select s = new Select(select);
		s.selectByIndex(0);
		web.findElement(By.name("start_b")).click();
		web.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[2]")).click();
		web.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[3]")).click();
		web.findElement(By.xpath("/html/body/form/table/tbody/tr[4]/td[2]/div/input[1]")).click();
	}
	@AfterClass
	@Test
	public void d(){
		web.close();
	}
}
