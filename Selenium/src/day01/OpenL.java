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
		driver.get(url);//����ַ
//		WebElement input = driver.findElement(By.name("wd"));
//		input.sendKeys("����");
//		WebElement button = driver.findElement(By.id("su"));
//		button.click();
//		driver.findElement(By.linkText("hao123")).click();
//		driver.findElement(By.partialLinkText("�û�����¼")).click();
		driver.findElement(By.xpath("//*[@id=\"imgView\"]/a/img")).click();
		driver.findElement(By.className("s_ipt")).click();
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);
//		driver.manage().window().maximize();//�������
//		driver.navigate().refresh();//ˢ��ҳ��
//		Dimension dimension = new Dimension(500,700);
//		driver.manage().window().setSize(dimension);
		
//		url = "https://hao.360.cn/?360win10set";
//		driver.navigate().to(url);//�ڶ��ִ���ַ
//		driver.navigate().back();//����
//		String title = driver.getTitle();
//		String url_ = driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(url_);
//		Thread.sleep(1000);
//		driver.navigate().forward();//ǰ��
//		title = driver.getTitle();
//		url_ = driver.getCurrentUrl();
//		System.out.println(title);
//		System.out.println(url_);
	}
	
}
