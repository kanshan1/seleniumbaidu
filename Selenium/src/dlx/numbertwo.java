package dlx;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class numbertwo {
	@Test
	public void fun(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "http://localhost:8080/Banksys_ssh";
		/*
		 * 1.进入网址
		 * 2.登录
		 * 3.取款
		 * 4.打印交易信息
		 * 5.打印错误提示
		 * */
		web.get(url);
		web.findElement(By.name("userNO")).sendKeys("1545635499810");
		web.findElement(By.name("password")).sendKeys("123456");
		web.findElement(By.id("loginValidate_0")).click();
		web.switchTo().frame("leftFrame");
		web.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("mainFrame");
		web.findElement(By.id("fmoneyValidate_money")).sendKeys("10000");
		web.findElement(By.id("fmoneyValidate_0")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("leftFrame");
		web.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("mainFrame");
		WebElement text = web.findElement(By.xpath("/html/body/center/table"));
		String a = text.getText();
		System.out.println(a);
		web.switchTo().defaultContent();
		web.switchTo().frame("leftFrame");
		web.findElement(By.xpath("/html/body/p[3]/a/img")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("mainFrame");
		web.findElement(By.id("fmoneyValidate_money")).sendKeys("10000");
		web.findElement(By.id("fmoneyValidate_0")).click();
		WebElement text2 = web.findElement(By.xpath("/html/body/center"));
		String b = text2.getText();
		System.out.println(b);
	}
}
