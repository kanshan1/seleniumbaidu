package day01;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class OpenL {
	
	@Test
	public void open() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./tools/chromedriver.exe");
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		String url="https://www.baidu.com";
		driver.get(url);//打开网址
//		WebElement input = driver.findElement(By.name("wd"));
//		input.sendKeys("活着");
//		WebElement button = driver.findElement(By.id("su"));
//		button.click();
//		driver.findElement(By.linkText("hao123")).click();
//		driver.findElement(By.partialLinkText("用户名登录")).click();
		driver.findElement(By.xpath("//*[@id=\"imgView\"]/a/img")).click();
		driver.findElement(By.className("s_ipt")).click();
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);
//		driver.manage().window().maximize();//窗口最大化
//		driver.navigate().refresh();//刷新页面
//		Dimension dimension = new Dimension(500,700);
//		driver.manage().window().setSize(dimension);
		
//		url = "https://hao.360.cn/?360win10set";
//		driver.navigate().to(url);//第二种打开网址
//		driver.navigate().back();//后退
//		String title = driver.getTitle();
//		String url_ = driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(url_);
//		Thread.sleep(1000);
//		driver.navigate().forward();//前进
//		title = driver.getTitle();
//		url_ = driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(url_);
	}
	
}
