package day01;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Lx {
	
	@Test
	public void Lx() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "http://localhost:8080/shop1/index.jsp";
		web.get(url);
	/*	web.findElement(By.name("c_name")).sendKeys("null");
		web.findElement(By.name("c_pass")).sendKeys("123");
		web.findElement(By.className("STYLE1")).click();
		web.findElement(By.linkText("意见反馈")).click();
		web.navigate().back();
		web.findElement(By.name("c_pass")).sendKeys("123");
		web.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		web.findElement(By.linkText("意见反馈")).click();
		web.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[5]/td[2]/textarea")).sendKeys("a");
		web.findElement(By.xpath("/html/body/center[4]/form/table/tbody/tr[7]/td/input[1]")).click();
		Thread.sleep(1000);
		web.findElement(By.cssSelector("body > center:nth-child(11) > table > tbody > tr > td:nth-child(2) > table:nth-child(3) > tbody > tr:nth-child(1) > td:nth-child(2) > p:nth-child(4) > input")).click();
		web.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
	
		Select p=new Select(web.findElement(By.name("pay_fangshi")));
		p.selectByIndex(2);
		
		
		web.findElement(By.name("pay_address")).sendKeys("天堂街");
		web.findElement(By.name("pay_email")).sendKeys("aaa@126.com");
		web.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
		web.findElement(By.name("button")).click();*/
		web.findElement(By.linkText("后台管理")).click();
		web.findElement(By.name("a_name")).sendKeys("admin");
		web.findElement(By.name("a_pass")).sendKeys("admin");
		web.findElement(By.name("submit2")).click();
		web.switchTo().frame(0);
		//web.switchTo().defaultContent();
		web.switchTo().frame("left");
		web.findElement(By.xpath("/html/body/center[2]/table/tbody/tr[2]/td/table/tbody/tr/td/iframe")).click();
		
		web.findElement(By.xpath("/html/body/table/tbody/tr[13]/td/span/a")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("Rigth");
		web.findElement(By.name("t_name")).sendKeys("索尼");
		web.findElement(By.className("STYLE1")).click();
		
		
		
		
		
		
		
		
		
		
		
	}
}
