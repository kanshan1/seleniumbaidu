package dlx;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class noberone {
	static WebDriver web;
	static String url;
	@Test
	public static void openweb(){
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/Banksys_ssh";
	}
	@Test
	public void login(){
		web.get(url);
		web.findElement(By.name("userNO")).sendKeys("1545635499810");
		web.findElement(By.name("password")).sendKeys("123456");
		web.findElement(By.id("loginValidate_0")).click();
	}
	@Test
	@Parameters("data1")
	public void input(String data1){
		web.switchTo().frame("leftFrame");
		web.findElement(By.xpath("/html/body/p[2]/a")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("mainFrame");
		web.findElement(By.id("smoneyValidate_money")).sendKeys(data1);
		web.findElement(By.id("smoneyValidate_0")).click();
	}
	@Test
	public void massage(){
		web.switchTo().defaultContent();
		web.switchTo().frame("leftFrame");
		web.findElement(By.xpath("/html/body/p[4]/a/img")).click();
		web.switchTo().defaultContent();
		web.switchTo().frame("mainFrame");
		WebElement text = web.findElement(By.xpath("/html/body/center/table"));
		String a = text.getText();
		System.out.println(a);
	}
}
