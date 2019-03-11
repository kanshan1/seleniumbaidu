package dlx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class dz2 {
	static WebDriver web;
	static String url;
	@BeforeClass
	public static void a(){
		//����ַ
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/shop1/index.jsp";
		web.get(url);
	}
	@Test
	public void b(){
		//��¼�˺�����
		web.findElement(By.name("c_name")).sendKeys("null");
		web.findElement(By.name("c_pass")).sendKeys("123");
		web.findElement(By.className("STYLE1")).click();
	}
	@Test
	public void c(){
		//�����������
		web.findElement(By.linkText("�������")).click();
	}
	@Test
	public void d(){
		//������Ʒ��ȷ�Ϲ���
		web.navigate().back();
		web.findElement(By.name("c_pass")).sendKeys("123");
		web.findElement(By.xpath("/html/body/center[4]/table/tbody/tr/td[1]/table/tbody/tr[1]/td/form/table/tbody/tr[5]/td/input[1]")).click();
		web.findElement(By.xpath("/html/body/center[3]/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td/form/table[2]/tbody/tr[1]/td/font/input[1]")).click();
		Select p=new Select(web.findElement(By.name("pay_fangshi")));
		p.selectByIndex(2);
		web.findElement(By.name("pay_address")).sendKeys("���ý�");
		web.findElement(By.name("pay_email")).sendKeys("aaa@126.com");
		web.findElement(By.xpath("/html/body/center[3]/table/tbody/tr/td[2]/table/tbody/tr[6]/td/form/table/tbody/tr[7]/td/input[1]")).click();
		web.findElement(By.name("button")).click();
	}
	@AfterClass
	public void e(){
		//�ر���ҳ
		web.close();
	}
}
