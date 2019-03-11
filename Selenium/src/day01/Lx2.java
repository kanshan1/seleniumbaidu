package day01;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lx2 {
	@Test
	public void Lx2(){
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "https://www.baidu.com";
		web.get(url);
		url = "https://V2EX.com";
		web.get(url);
		web.manage().window().maximize();
		web.navigate().back();
		String title = web.getTitle();
		System.out.println(title);
		web.navigate().forward();
		title = web.getTitle();
		System.out.println(title);
	}
}
