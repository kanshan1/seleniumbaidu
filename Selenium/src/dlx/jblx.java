package dlx;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class jblx {
	@Test
	public void aa() throws IOException, InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/index.html";
		web.get(url);
		WebElement a = web.findElement(By.className("over"));
		//a.sendKeys("caoo");
		Actions ac = new Actions(web);
		//ac.contextClick().perform();//�����Ͻ��һ�
		//ac.contextClick(a).perform();//�������ĵط��һ�
		//ac.doubleClick(a).perform();//˫��
		ac.moveToElement(a).perform();//������ƶ���
		
		
//		web.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		web.findElement(By.className("wait")).click();
//		String a=web.findElement(By.linkText("//*[@id=\"display\"]/div")).getText();
//		System.out.println(a);
		
//		File jietu = ((TakesScreenshot)web).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(jietu, new File("E:/ҳ��/7k7k.jpg"));
		
//		web.findElement(By.linkText("click me")).click();
//		Set<String> L = web.getWindowHandles();
//		for(String tian:L){
//			web.switchTo().window(tian);
//			String title = web.getTitle();
//			System.out.println(title);
//			if("�ٶ�һ�£����֪��".equals(title)){
//				web.findElement(By.id("kw")).sendKeys("��");
//			}
//		}
//		web.findElement(By.id("input1")).sendKeys("�������µ�һ");
//		WebElement a = web.findElement(By.xpath("//*[@id=\"div1\"]"));
//		String b = a.getText();
//		System.out.println(b);
		
//		web.switchTo().frame("frame");
//		web.findElement(By.id("input1")).sendKeys("�������µ�һ");
//		web.switchTo().defaultContent();
//		WebElement a = web.findElement(By.xpath("//*[@id=\"id1\"]"));
//		String b = a.getText();
//		System.out.println(b);
	}
}
