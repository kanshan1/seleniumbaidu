package day03;

import java.util.Set;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lj {
	@Test
	public void lianjie() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		WebDriver web = new ChromeDriver();
		String url = "file:///E:/%E9%A1%B5%E9%9D%A2/index.html";
		web.get(url);
		

//		String Z = web.getWindowHandle();
//		int a=0;
//		while(a<5){
//		web.findElement(By.linkText("Open new window")).click();
//		
//		Set<String> w = web.getWindowHandles();//获取当前页面的所有句柄，当前有两个页面
//		//所以用了一个字符串集合起来接收两个句柄
//		for(String handle:w){//随机在句柄集合中，选择一个句柄
//			web.switchTo().window(handle);
//			String title = web.getTitle();
//			System.out.println(title);
//			//通过标题判断，所获取的页面是否是我想要的
//			//如果是我想要的，则对该页面进行操作
//			if("UIAutomation iFrame".equals(title)){
//				web.findElement(By.id("user")).sendKeys("卧槽");
//			}
//		}
//		web.switchTo().window(Z);
//		a++;
//		}
		
		//web.switchTo().frame("aa");//第一种方法进入小页面
		web.switchTo().frame(0);//第二种方式：索引
		Thread.sleep(5000);
		web.findElement(By.id("user")).sendKeys("狗一狗");
		
		web.switchTo().defaultContent();
		Thread.sleep(5000);
		web.findElement(By.id("user")).sendKeys("活到九十九");
	}
}
