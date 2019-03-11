package dlx;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lx12_17 {
	@Test
	public void Dl(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "https://www.126.com/";
		web.get(url);
		WebElement input = web.findElement(By.name("email"));
		input.sendKeys("11111111");
		web.findElement(By.name("password")).sendKeys("tianna");
		web.findElement(By.id("dologin")).click();
	}
}
