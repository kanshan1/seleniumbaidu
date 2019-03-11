package dlx;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lx2 {
	@Test
	public void fun(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/autotest.html";
		web.get(url);
		WebElement username = web.findElement(By.name("account"));
		username.sendKeys("jeff");
		WebElement password = web.findElement(By.name("password"));
		password.sendKeys("123456");
		WebElement Diq = web.findElement(By.className("u17"));
		Select Diq1 = new Select(Diq);
		Diq1.selectByIndex(2);
		WebElement sex = web.findElement(By.name("u2"));
		sex.click();
		WebElement Jij = web.findElement(By.id("u1"));
		if(!Jij.isSelected()){
			Jij.click();
		}
		WebElement Jij1 = web.findElement(By.id("u2"));
		if(!Jij1.isSelected()){
			Jij1.click();
		}
		WebElement Jij2 = web.findElement(By.id("u4"));
		if(!Jij2.isSelected()){
			Jij2.click();
		}
		String file = "E:\\×¼¿¼Ö¤ÕÅ±ó.pdf";
		WebElement File = web.findElement(By.name("file"));
		File.sendKeys(file);
		web.findElement(By.className("u16")).click();
		Alert submit = web.switchTo().alert();
		submit.accept();
	}
}
