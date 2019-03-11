package day04;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class sj {
	@Test
	public void fun() throws AWTException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
//		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/dragAndDrop.html";
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/index.html";
		web.get(url);
		Actions ac = new Actions(web);
		//使用键盘各种键
		WebElement a = web.findElement(By.id("user"));
//		a.sendKeys(Keys.CONTROL,"s");
		Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);//按下ctrl
		rb.keyPress(KeyEvent.VK_S);//按下s
		rb.keyRelease(KeyEvent.VK_S);//松开s
		rb.keyRelease(KeyEvent.VK_CONTROL);//松开Ctrl
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ESCAPE);//点击取消
		Thread.sleep(1000);
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		
		//下拉框选择
//		WebElement a = web.findElement(By.id("selectWithMultipleEqualsMultiple"));
//		List<WebElement> option = a.findElements(By.tagName("option"));
//		ac.keyDown(Keys.CONTROL).click(option.get(0)).click(option.get(2)).build().perform();
		
		//将某个东西拖拽到某个上面
//		WebElement a = web.findElement(By.id("drag"));
//		ac.doubleClick(a).perform();
//		WebElement b = web.findElement(By.xpath("/html/body/h1"));
		//ac.dragAndDrop(a, b).perform();
//		ac.dragAndDropBy(a, -184, 3).perform();
//		ac.clickAndHold(a).moveToElement(b).release(a).perform();
	}
}
