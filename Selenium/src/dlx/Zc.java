package dlx;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zc {
	@Test
	public void Zc(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver Zhuce = new ChromeDriver();
		String url = "http://localhost:8080/mobile_mysql/index.jsp";
		Zhuce.get(url);
		Zhuce.findElement(By.linkText("注册")).click();
		WebElement name = Zhuce.findElement(By.name("name"));
		name.sendKeys("tom");
		WebElement password = Zhuce.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement passwordone = Zhuce.findElement(By.name("passwordOne"));
		passwordone.sendKeys("123456");
		WebElement reallyName = Zhuce.findElement(By.name("reallyName"));
		reallyName.sendKeys("丁香花开");
		WebElement age = Zhuce.findElement(By.name("age"));
		age.sendKeys("7");
		WebElement profession = Zhuce.findElement(By.name("profession"));
		profession.sendKeys("造物主");
		WebElement email = Zhuce.findElement(By.name("email"));
		email.sendKeys("2450169510@qq.com");
		WebElement question = Zhuce.findElement(By.name("question"));
		question.sendKeys("回首已是春分");
		WebElement result = Zhuce.findElement(By.name("result"));
		result.sendKeys("丁香花开");
		WebElement Tj = Zhuce.findElement(By.className("input1"));
		Tj.click();
	}
}
