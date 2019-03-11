package dlx;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Lx {
	@Test
	public void Lx() throws IOException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
		WebDriver web=new ChromeDriver();
//		String url = "https://www.baidu.com/index.php?tn=06074089_7_pg";
//		web.get(url);
//		WebElement a = web.findElement(By.id("kw"));
//		Actions ac = new Actions(web);
//		ac.contextClick(a).perform();
//		File jietu = ((TakesScreenshot) web).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(jietu, new File("E:/Ò³Ãæ/7k7k.jpg"));
//		WebElement b = web.findElement(By.className("bri"));
//		ac.moveToElement(b).perform();
//		web.findElement(By.name("tj_nuomi")).click();
//		WebElement input = iphone.findElement(By.name("name"));
//		input.sendKeys("jeff");
//		WebElement psw_input = iphone.findElement(By.name("password"));
//		psw_input.sendKeys("123456");
//		WebElement button = iphone.findElement(By.className("input1"));
//		button.click();
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/dragDrop.html";
		web.get(url);
		WebElement a = web.findElement(By.id("drag"));
		Actions ac = new Actions(web);
		WebElement b = web.findElement(By.xpath("/html/body/input"));
		ac.dragAndDrop(a, b).perform();
	}
}
