package dlx;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class number1 {
	static WebDriver web;
	static String url;
	@BeforeClass
	@Test
	public static void aopen(){
		//�����߿�����ҳ
		System.setProperty("webdriver.chrome.driver", "./tools/chromedriver.exe");
		web = new ChromeDriver();
		url = "http://localhost:8080/Exam_ssh/";
		web.get(url);
	}
	@Test
	public void blogin(){
		//�����̨���������˻�������
		web.findElement(By.linkText("�����̨����")).click();
		web.findElement(By.id("name")).sendKeys("admin");
		web.findElement(By.id("pass")).sendKeys("admin");
		web.findElement(By.name("B1")).click();
	}
	@Test
	public void ckaoshitype(){
		//��ӿ������ͣ�1���Ծ����ƣ�2������ʱ��
		web.findElement(By.linkText("�����������")).click();
		web.findElement(By.id("testName")).sendKeys("Python");
		web.findElement(By.id("testTime")).sendKeys("120");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void dtimu(){
		//������⣬1����Ŀ���� 2��ѡ���Ŀ 3 ��ѡ����� 4��ѡ�� 5��ѡ���Ѷ� 6������ 7��ѡ�� 8����
		web.findElement(By.id("title")).sendKeys("������ʹ��������ȷ���ǣ�");
		WebElement select = web.findElement(By.id("score"));
		Select s = new Select(select);
		s.selectByIndex(9);
		WebElement select2 = web.findElement(By.id("level"));
		Select s2 = new Select(select2);
		s.selectByIndex(1);
		WebElement select3 = web.findElement(By.id("note"));
		Select s3 = new Select(select3);
		s.selectByIndex(1);
		web.findElement(By.id("choices")).sendKeys("A.[3:2] : B.[0��1] : C.[����-1] : D.[]");
		web.findElement(By.id("standardAnswer")).sendKeys("A:B:B:C");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void emassage(){
		//��ӡ�������
		WebElement massage = web.findElement(By.className("Xsmall"));
		String text = massage.getText();
		System.out.println(text);
	}
	@Test
	public void fstudent(){
		//���ѧ����1�����֤�� 2������ 3��ѧ�� 4���༶ 5����ַ 6���绰 7��email 8�����֤
		web.findElement(By.linkText("��ӿ�������")).click();
		web.findElement(By.id("id")).sendKeys("362233199808081010");
		web.findElement(By.id("realname")).sendKeys("jeff");
		web.findElement(By.id("stuNumber")).sendKeys("00000001");
		web.findElement(By.id("className")).sendKeys("��������");
		web.findElement(By.id("address")).sendKeys("������");
		web.findElement(By.id("phone")).sendKeys("1008611");
		web.findElement(By.id("email")).sendKeys("2020@qq.com");
		web.findElement(By.id("humanId")).sendKeys("�й��Ϸ�����");
		web.findElement(By.name("submit")).click();
	}
	@Test
	public void gmassage2(){
		//��ӡȫ��ѧ����Ϣ
		WebElement massage2 = web.findElement(By.className("Xsmall"));
		String text2 = massage2.getText();
		System.out.println(text2);
	}
	@AfterClass
	public void h(){
		//�ر�
		web.close();
	}
}
